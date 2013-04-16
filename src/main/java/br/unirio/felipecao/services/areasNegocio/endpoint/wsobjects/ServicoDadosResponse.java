package br.unirio.felipecao.services.areasNegocio.endpoint.wsobjects;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 4/7/13
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 */
public class ServicoDadosResponse {
    private String status;
    private AreaNegocio[] areasNegocio;

    public ServicoDadosResponse() {
    }

    public ServicoDadosResponse(String status, AreaNegocio[] areasNegocio) {
        this.status = status;
        this.areasNegocio = areasNegocio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AreaNegocio[] getAreasNegocio() {
        return areasNegocio;
    }

    public void setAreasNegocio(AreaNegocio[] areasNegocio) {
        this.areasNegocio = areasNegocio;
    }
}
