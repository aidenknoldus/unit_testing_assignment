import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.FunSuite

class CompanyValidatorTest extends FunSuite{
  test("valid email and valid company should return true") {
    val company = new Company("company1", "knoldus@gmail.com", "Vancouver");
    val companyValidator = new CompanyValidator
    assert(companyValidator.companyIsValid(company) == true)
  }

  test("valid email but existing company should return false") {
    val company = new Company("Knoldus", "knoldus@gmail.com", "Vancouver");
    val companyValidator = new CompanyValidator
    assert(companyValidator.companyIsValid(company) == false)
  }

  test("invalid email but valid company should return false") {
    val company = new Company("company1", "knoldus@gmail.ca", "Vancouver");
    val companyValidator = new CompanyValidator
    assert(companyValidator.companyIsValid(company) == false)
  }

  test("invalid email and invalid company should return false") {
    val company = new Company("Knoldus", "knoldus@gmail.ca", "Vancouver");
    val companyValidator = new CompanyValidator
    assert(companyValidator.companyIsValid(company) == false)
  }
}