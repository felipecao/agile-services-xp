package br.unirio.felipecao.services.areasNegocio.endpoint.wsobjects;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 4/7/13
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class ServicoDadosRequest {
    private String usuario;

    public ServicoDadosRequest() {
    }

    public ServicoDadosRequest(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
