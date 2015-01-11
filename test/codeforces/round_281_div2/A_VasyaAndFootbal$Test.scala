package codeforces.round_281_div2

import main.{StdoutTester, UnitSpec}

class A_VasyaAndFootbal$Test extends UnitSpec {

  val testable = A_VasyaAndFootbal.parseSolveAndPrint _

  "test_1" should "print correct output on test" in {
    StdoutTester {
      "MC\nCSKA\n9\n28 a 3 y\n62 h 25 y\n66 h 42 y\n70 h 25 y\n77 a 4 y\n79 a 25 y\n82 h 42 r\n89 h 16 y\n90 a 13 r"
    } {
      "MC 25 70\nMC 42 82\nCSKA 13 90"
    } {
      testable
    }
  }


}
