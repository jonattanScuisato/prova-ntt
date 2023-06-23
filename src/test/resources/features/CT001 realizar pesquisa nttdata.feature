@Ct001
Feature: Acessar o site da nttdata e pesquisar sobre vagas de engenharia de dados

  Scenario: Visualizar vagas de engenharia de dados
    Given que esteja na tela do google
    And pesquiso sobre a nttdata
    When abro o site da nttdata
    Then pesquiso sobre vagas de engenharia de dados
