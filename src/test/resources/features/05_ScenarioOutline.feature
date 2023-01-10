Feature: Google Arama Feature

  #Scenario Outline DDT(data driven test) yapma yeteneğini bizlere sağlar.Scenario:
  #Testimiz tabloda bulunan satır sayısı (ilk satır hariç ) kadar sırasıyla her bir satırdaki verilerle çalıştırılır.
  Scenario Outline:
    Given Kullanıcı google syfasındadır
    When Kullanıcı "<aranacakKelime>" arattığındadır
    Then Kullanıcı title da "<dogrulanacakKelime>" görmelidir
    Examples:
      | aranacakKelime|dogrulanacakKelime|
      |samsung        |samsung           |
      |cucumber       |cucumber          |
      |selenyum       |selenyum          |


