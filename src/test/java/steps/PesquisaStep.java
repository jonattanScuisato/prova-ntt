package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PesquisaPage;

public class PesquisaStep {

    PesquisaPage pesquisaPage = new PesquisaPage();

    @Given("que esteja na tela do google")
    public void que_esteja_no_google() {
        pesquisaPage.imgGoogle.isDisplayed();
    }

    @And("pesquiso sobre a nttdata")
    public void presquisar_nttdata() throws InterruptedException {
        pesquisaPage.pesquisarNtt();
    }

    @When("abro o site da nttdata")
    public void site_ntt() {
        pesquisaPage.abrirSiteNtt();

    }

    @Then("pesquiso sobre vagas de engenharia de dados")
    public void pesquisar_vaga_engenheiro_de_dados() throws InterruptedException {
        pesquisaPage.pesquisarVaga();

    }
}
