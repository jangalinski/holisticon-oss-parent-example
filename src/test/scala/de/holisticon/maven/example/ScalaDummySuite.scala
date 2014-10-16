package de.holisticon.maven.example

import java.util


class ScalaDummySuite extends org.scalatest.FunSuite {

  test("pop is invoked on a non-empty stack") {

    val stack = new util.Stack[Int]
    stack.push(1)
    stack.push(2)
    val oldSize = stack.size
    val result = stack.pop()
    assert(result === 2)
    assert(stack.size === oldSize - 1)
  }

}
