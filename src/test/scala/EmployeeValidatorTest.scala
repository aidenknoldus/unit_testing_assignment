import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
import org.scalatest.FunSuite

class EmployeeValidatorTest extends FunSuite {
  test("valid email and valid company should return true") {
    val employee = new Employee("Bob", "Jones", 55, 999, "Boss", "Knoldus", "bjones@gmail.com")
    val emmployeeValidator = new EmployeeValidator
    assert(emmployeeValidator.employeeIsValid(employee) == true)
  }

  test("valid email but invalid company should return false") {
    val employee = new Employee("Bob", "Jones", 55, 999, "Boss", "Company1", "bjones@gmail.com")
    val emmployeeValidator = new EmployeeValidator
    assert(emmployeeValidator.employeeIsValid(employee) == false)
  }

  test("invalid email but valid company should return false") {
    val employee = new Employee("Bob", "Jones", 55, 999, "Boss", "Knoldus", "bjones@gmail.ca")
    val emmployeeValidator = new EmployeeValidator
    assert(emmployeeValidator.employeeIsValid(employee) == false)
  }

  test("invalid email and invalid company should return false") {
    val employee = new Employee("Bob", "Jones", 55, 999, "Boss", "Company1", "bjones@gmail.ca")
    val emmployeeValidator = new EmployeeValidator
    assert(emmployeeValidator.employeeIsValid(employee) == false)
  }
}