package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OhlLoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMStepdefs {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {
        //Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("kullanici credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {
        OhlLoginPage lp=new OhlLoginPage(Driver.getDriver());


        //List metoduyla table'ı parçalama
        //List<List<String>>data=table.asLists();
        //for(List<String>satir:data){
        //    for(String hücre:satir){
        //       System.out.println(hücre+" - ");
        //   }
        // System.out.println();
        // }

        //Cell methodu ile table hücrelerine ulaşma
       //String username=table.cell(1,0);
       //String password=table.cell(1,1);

       //System.out.println(username+" "+password);

       //System.out.println("table.height() = " + table.height());
       //System.out.println("table.width() = " + table.width());
       //int rowCount=table.height();
       //int colCount=table.width();

       //for(int i=1; i<rowCount; i++){
       //    for(int j=0; j<colCount; j++){
       //        //WebElement işlemleri
       //        table.cell(i,j);
       //
       //    }
       //}
        List<Map<String,String>>data=table.asMaps(String.class, String.class);
        for(Map<String, String>maps:data){
            String userid=maps.get("admin_id");
            String userPassword=maps.get("admin_pass");

            lp.typePassword(userPassword);
            lp.typeUsername(userid);
            lp.clickLogin();
            System.out.println("maps = " + maps);
        }
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));


    }

    @When("kullanici invalid credentials girer")
    public void kullaniciInvalidCredentialsGirer(DataTable table) {
        OhlLoginPage la=new OhlLoginPage(Driver.getDriver());
        List<List<String>>data=table.asLists();
        for(int row=1; row<table.height(); row++){//Rowları döner
            String username=table.cell(row,0);
            String password=table.cell(row,1);
            String errMessage=table.cell(row,2);

            la.typeUsername(username);
            la.typePassword(password);
            la.clickLogin();
            la.verifyErrMessage(errMessage);
        }
    }
}
