package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;

import java.util.List;

public class OrangeHRMStepdefs {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
        //Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("kullanici credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {

        //List metoduyla table'ı parçalama
        //List<List<String>>data=table.asLists();
        //for(List<String>satir:data){
        //    for(String hücre:satir){
        //       System.out.println(hücre+" - ");
        //   }
        // System.out.println();
        // }

        //Cell methodu ile table hücrelerine ulaşma
        String username=table.cell(1,0);
        String password=table.cell(1,1);

        System.out.println(username+" "+password);

        System.out.println("table.height() = " + table.height());
        System.out.println("table.width() = " + table.width());
        int rowCount=table.height();
        int colCount=table.width();

       //for(int i=1; i<rowCount; i++){
       //    for(int j=0; j<colCount; j++){
       //        //WebElement işlemleri
       //        table.cell(i,j);
       //
       //    }
       //}

    }
}
