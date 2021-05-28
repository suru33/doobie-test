package com.suru

import doobie.syntax.SqlInterpolator.SingleFragment
import doobie.util.fragment.Fragment
import doobie.util.pos.Pos

final class SqlInterpolator(private val sc: StringContext) extends AnyVal {

  private def mkFragment(parts: List[SingleFragment[_]], token: Boolean, pos: Pos): Fragment = {
    val last = if (token) Fragment(" ", Nil, None) else Fragment.empty

    sc.parts.toList
      .map(sql => SingleFragment(Fragment(sql, Nil, Some(pos))))
      .zipAll(parts, SingleFragment.empty, SingleFragment(last))
      .flatMap { case (a, b) => List(a.fr, b.fr) }
      .combineAll
  }

  /**
   * Interpolator for a statement fragment that can contain interpolated values. When inserted
   * into the final SQL statement this fragment will be followed by a space. This is normally
   * what you want, and it makes it easier to concatenate fragments because you don't need to
   * think about intervening whitespace. If you do not want this behavior, use `fr0`.
   */
  def fr(a: SingleFragment[_]*)(implicit pos: Pos) = mkFragment(a.toList, true, pos)

  /** Alternative name for the `fr0` interpolator. */
  def sql(a: SingleFragment[_]*)(implicit pos: Pos) = mkFragment(a.toList, false, pos)

  /**
   * Interpolator for a statement fragment that can contain interpolated values. Unlike `fr` no
   * attempt is made to be helpful with respect to whitespace.
   */
  def fr0(a: SingleFragment[_]*)(implicit pos: Pos) = mkFragment(a.toList, false, pos)

}

object IP {

}