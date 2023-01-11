Feature: negative_login

  Scenario Outline: negative_login credentials with hooks Class
    Given Kullanici anasayfaya gider
    And Kullanici username "<username>" girer
    And Kullanici password "<password>" girer
    When Kullanici login butonuna tiklar
    And Senaryo fail olur
    And Sayfayi kap
    Examples: customer credentials
      | username | password |
      | Admin    | admin    |