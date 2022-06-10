Feature: OS Automotions girisi
@1
  Scenario: OR1 giris yapar

    Given kullanici "automationUrl" anasayfasinda
    And kullanici user sign in linkine tiklar
    And kullanici user Create and account bölümüne email adresi girer
    And kullanici Create an Account butonuna basar
    And kullanici user kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici user Register butonuna basar
    Then kullanici hesap olustugunu dogrular