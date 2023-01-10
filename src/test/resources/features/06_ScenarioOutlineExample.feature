Feature: Amazon Search Test
  Scenario Outline:Kullanıcı aratacağı kelimeyi sonuçlarda görmelidir
    Given Kullanıcı amazon sitesine gider
    When Kullanıcı amazonda "" aratır
    Then Kullanıcı arama sonuçlarında "" görmelidir.
    And Ekran görüntüsü alır
    And Browser kapatır

    Examples:
      |  |