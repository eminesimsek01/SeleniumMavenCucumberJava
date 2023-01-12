Feature: User contact us with fill form
  Scenario: T10_User can contact us
    When Kullanici tarayici baslatir
    Then Kullanici automationExercise anasayfasina gider
    #Url = https://automationexercise.com/
    Then Kullanici automationExcercise ana sayfanin gorunur old test eder
    Then Kullanici Contact Us butonuna tiklar
    Then Kullanici GET IN TOUCH in gorunur oldugunu test eder
    Then Kullanici name , email , subject ve message bilgilerini girer
      |name   |email          |subject  |message       |
      |Fatih  |fatih@gmail.com|Hiring   |Please hire me|
    Then Kullanici dosya sec butonundan dosya yukler
    Then Kullanici submit butonuna tiklar
    Then Kullanici acilan pencerede OK butonuna tiklar
    Then Kullanici Success! Your details have been submitted successfully mesajini test eder
    Then Kullanici Home butonuna tiklar ve sonrasinda anasayfanin acildigini test eder