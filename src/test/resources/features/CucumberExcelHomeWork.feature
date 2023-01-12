Feature: Login user With Excel
  Scenario: TC_09_Login_User_With_Correct_email_and_password_with_Excel
    When Kullanici tarayiciyi baslatir
    Then Kullanici automation anasayfasina gider
    Then ana sayfanin gorunur old test eder
    Then Kullanici signup - Login butonunu tiklar
    Then Kullanici Login to your ac yazisinin gorunur old test eder
    Then Kullanici dogru email ve sifreyi excel ile girer
    Then Kullanici login buttona tiklar
    Then Kullanici oturum actigini test eder
    Then Kullanici logOut butonuna basar