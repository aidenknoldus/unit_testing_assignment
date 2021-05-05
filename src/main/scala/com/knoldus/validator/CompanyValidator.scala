package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val db = new CompanyReadDto();
    val emailValidator = new EmailValidator()
    println(db.getCompanyByName(company.name))
    db.getCompanyByName(company.name).isEmpty && emailValidator.emailIdIsValid(company.emailId)
  }
}
