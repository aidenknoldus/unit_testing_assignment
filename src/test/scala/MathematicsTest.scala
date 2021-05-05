import com.knoldus.request.MathematicsImpl
import org.scalatest.FunSuite

class MathematicsTest extends FunSuite{

  // divide tests

  test("dividing 4 by 2 should give 2") {
    val math = new MathematicsImpl()
    assert(math.divide(4, 2) == 2)
  }

  test("dividing 0 by 2 should give 0") {
    val math = new MathematicsImpl()
    assert(math.divide(0, 2) == 0)
  }

  test("dividing 3 by 2 should give 1.5"){
    val math = new MathematicsImpl()
    assert(math.divide(3, 2) == 1.5)
  }

  test("dividing 3 by 0 should give infinity"){
    val math = new MathematicsImpl()
    assert(math.divide(3, 0).isInfinite)
  }

  test("dividing 3 by -2 should give -1.5") {
    val math = new MathematicsImpl()
    assert(math.divide(3, -2) == -1.5)
  }

  // Fibonnaci Tests

  test("fibonni of 0 should be 0") {
    val math = new MathematicsImpl()
    assert(math.fibonacci(0) == 0)
  }

  test("fibonni of 1 should be 1") {
    val math = new MathematicsImpl()
    assert(math.fibonacci(1) == 1)
  }

  test("fibonni of 5 should be 5") {
    val math = new MathematicsImpl()
    assert(math.fibonacci(5) == 5)
  }

  test("fibonni of -5 should be 0") {
    val math = new MathematicsImpl()
    assert(math.fibonacci(-5) == 0)
  }

  test("fibonni of 25 should be 75025") {
    val math = new MathematicsImpl()
    assert(math.fibonacci(25) == 75025)
  }
}
