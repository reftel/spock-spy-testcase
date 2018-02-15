package com.reftel.magnus.spockspytestcase

import spock.lang.Specification

class CallerTest extends Specification {
  def "should not call expensive method - class"() {
    given:
      Dao dao = new DaoImpl()
      DaoImpl daoSpy = Spy(dao)
      0 * daoSpy.expensive()
      Caller caller = new Caller()

    when: // Expected to fail - Caller actually does call Dao.expensive
      caller.doStuff(daoSpy)

    then:
      true
  }

  def "should not call expensive method - def"() {
    given:
      Dao dao = new DaoImpl()
      def daoSpy = Spy(dao)
      0 * daoSpy.expensive()
      Caller caller = new Caller()

    when: // Expected to fail - Caller actually does call Dao.expensive
      caller.doStuff(daoSpy)

    then:
      true
  }

  def "should not call expensive method - interface"() {
    given:
      Dao dao = new DaoImpl()
      Dao daoSpy = Spy(dao)
      0 * daoSpy.expensive()
      Caller caller = new Caller()

    when: // Expected to fail - Caller actually does call Dao.expensive
      caller.doStuff(daoSpy)

    then:
      true
  }
}
