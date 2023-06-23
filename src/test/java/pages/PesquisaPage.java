package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PesquisaPage {

    @FindBy(id = "APjFqb")
    WebElement cpmPesquisa;

    @FindBy(xpath = "//img[@class='lnXdpd']")
    public WebElement imgGoogle;

    @FindBy(xpath = "(//input[@name='btnK'])[2]")
    WebElement btnPesquisaGoogle;

    @FindBy(id = "sGlobal")
    WebElement cmpPesquisarVaga;

    @FindBy(xpath = "//button[@class='btn-search']")
    WebElement btnPesquisar;

    @FindBy(xpath = "(//div[@class='MjjYud'])[1]")
    WebElement  btnSelecionarLink;

    @FindBy(xpath = "//a[contains(.,'Careers')]")
    WebElement btnCareers;

    @FindBy(xpath = "(//li[@class='navbar-list-item'])[46]")
    WebElement btnJob;

    public void pesquisarNtt() throws InterruptedException {
        cpmPesquisa.click();
        cpmPesquisa.sendKeys("ntt data");
        btnPesquisaGoogle.click();
        Thread.sleep(2000);
    }

    public void abrirSiteNtt(){
        btnSelecionarLink.click();
    }

    public void pesquisarVaga() throws InterruptedException {
        btnCareers.click();
        btnJob.click();
        Thread.sleep(5000);
        cmpPesquisarVaga.click();
        cmpPesquisarVaga.sendKeys("PESSOA ENGENHEIRA DE DADOS");
        btnPesquisar.click();
    }
}
