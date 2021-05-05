package com.knoldus.validator

class EmailValidator {
  // This works for non .com/.net/.org emails
  // def emailIdIsValid(emailId: String): Boolean = if("""^[-a-z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-z0-9]([-a-z0-9]{0,61}[a-z0-9])?\.)*(aero|arpa|asia|biz|cat|com|coop|edu|gov|info|int|jobs|mil|mobi|museum|name|net|org|pro|tel|travel|[a-z][a-z])$""".r.findFirstIn(emailId) == None)false else true

  // condensed acceptable top-level domains
  def emailIdIsValid(emailId: String): Boolean = if("""^[-a-zA-Z0-9!#$%&'*+/=?^_`{|}~]+(\.[-a-zA-Z0-9!#$%&'*+/=?^_`{|}~]+)*@([a-zA-Z0-9]([-a-zA-Z0-9]{0,61}[a-zA-Z0-9])?\.)*(com|net|org)$""".r.findFirstIn(emailId) == None)false else true

}
