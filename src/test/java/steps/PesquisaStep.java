package steps;

import io.cucumber.java.en.Given;
import pages.PesquisaPage;

public class PesquisaStep {

    PesquisaPage pesquisaPage = new PesquisaPage();

    @Given("que esteja na tela do google")
    public void que_esteja_no_google(){
            pesquisaPage.pesquisarNtt();
    }
}
