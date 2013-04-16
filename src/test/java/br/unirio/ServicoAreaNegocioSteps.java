package br.unirio;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ServicoAreaNegocioSteps {

    private List<String> areas = new ArrayList<String>();

    @Dado("^que o cadastro das areas de negocio da Petrobras contem as areas \"([^\"]*)\" e \"([^\"]*)\"$")
    public void que_o_cadastro_das_areas_de_negocio_da_Petrobras_contem_as_areas_e(String arg1, String arg2) throws Throwable {
        areas.add(arg1);
        areas.add(arg2);
    }

    @Quando("^eu invocar o servico para recuperar as areas de negocio$")
    public void eu_invocar_o_servico_para_recuperar_as_areas_de_negocio() throws Throwable {
        // do nothing
    }

    @Entao("^o resultado tem tamanho \"([^\"]*)\"$")
    public void o_resultado_tem_tamanho(int arg1) throws Throwable {
        assertEquals(arg1, areas.size());
    }

    @Entao("^contem somente as areas \"([^\"]*)\" e \"([^\"]*)\"$")
    public void contem_somente_as_areas_e(String arg1, String arg2) throws Throwable {
        areas.contains(arg1);
        areas.contains(arg2);
    }
}
