Feature: Google Arama Feature
  Background :
    Given Kullanıcı google sayfasındadır

    Scenario : cucumber search
      When Kullanıcı "cucumber" arattığında
      Then Kullanıcı title'da "cucumber" görmelidir.

