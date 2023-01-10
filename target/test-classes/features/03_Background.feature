Feature: Google Arama Test Feature
  Background:Kullanıcı her senaryoda google sitesinde olacaktır.
    Given Kullanıcı google sayfasındadır

  Scenario: Kullanıcı samsung aradığında samsung görmelidr
    When kullanıcı samsung kelimesini arar
    Then Kullanıcı sayfada samsung kelimesi geçtiğini doğrular

  Scenario: Kullanıcı samsung aradığında cucumber görmelidr
    When kullanıcı cucumber kelimesini arar
    Then Kullanıcı sayfada cucumber kelimesi geçtiğini doğrular


  Scenario: Kullanıcı selenyum aradığında selenyum görmelidr
    When kullanıcı selenyum kelimesini arar
    Then Kullanıcı sayfada selenyum kelimesi geçtiğini doğrular
