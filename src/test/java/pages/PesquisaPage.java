package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PesquisaPage {

    @FindBy(id="APjFqb")
    WebElement cpmPesquisa;


    public void pesquisarNtt(){
        cpmPesquisa.click();
        cpmPesquisa.sendKeys("ntt data");
    }
}
