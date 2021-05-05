package com.knoldus.validator

import com.knoldus.models.Employee
import com.knoldus.db.CompanyReadDto

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean = {
    val db = new CompanyReadDto();
    val emailValidator = new EmailValidator()
    db.getCompanyByName(employee.companyName).isDefined && emailValidator.emailIdIsValid(employee.emailId)
  }
}
