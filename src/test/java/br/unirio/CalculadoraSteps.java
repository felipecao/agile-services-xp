package br.unirio;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import static org.junit.Assert.assertEquals;

public class CalculadoraSteps {

    Integer op1;
    Integer op2;

    @Dado("^que eu quero somar \"([^\"]*)\" e \"([^\"]*)\"$")
    public void que_eu_quero_somar(Integer arg1, Integer arg2) throws Throwable {
        op1 = arg1;
        op2 = arg2;
    }

    @Quando("^eu informo os parametros usando o operador mais$")
    public void eu_informo_os_parametros_usando_o_operador_mais() throws Throwable {
        // do nothing
    }

    @Entao("^o resultado deve ser \"([^\"]*)\"$")
    public void o_resultado_deve_ser(int arg0) throws Throwable {
        assertEquals(arg0, (op1 + op2));
    }
}
