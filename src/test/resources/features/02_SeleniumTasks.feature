Feature:Google search test
  Scenario: Google da bir kelime arandığında ilgili kelimeyi barındıran sonuçlar görüntülenmlidir
    Given Kullanıcı google sayfasındadır
    When Kullanıcı samsung kelimesini arar
    Then Kullanıcı sayfada samsung kelimesi geçtiğini doğrular
