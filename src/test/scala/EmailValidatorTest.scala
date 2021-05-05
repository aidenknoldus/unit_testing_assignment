
import com.knoldus.validator.EmailValidator
import org.scalatest.FunSuite

class EmailTest extends FunSuite {
  test("email validator should return true with names undercase") {
      val emailValidator = new EmailValidator
      assert(emailValidator.emailIdIsValid("aiden@gmail.com") == true)
  }

  test("email validator should return true with names in uppercase") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("AIDEN@GMAIL.com") == true)
  }

  test("email validator should return true with names in numbers") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("123@123.com") == true)
  }

  test("email validator should return true with names in alphanumberic (upper and lower case)") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("aI123@gMa123.com") == true)
  }

  test("email validator should return false without an @ symbol") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("aiden.com") == false)
  }

  test("email validator should return false with two @ symbols") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("aid@en@gmail.com") == false)
  }

  test("email validator should return false with an invalid top-level domain") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("aiden@gmail.ca") == false)
  }

  test("email validator should return false without a recipient name") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("@gmail.ca") == false)
  }

  test("email validator should return false without a domain name") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("aiden@.ca") == false)
  }

  test("email validator should return false without a top-level domain") {
    val emailValidator = new EmailValidator
    assert(emailValidator.emailIdIsValid("aiden@gmail") == false)
  }
}
