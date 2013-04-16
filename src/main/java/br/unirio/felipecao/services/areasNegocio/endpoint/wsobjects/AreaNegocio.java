package br.unirio.felipecao.services.areasNegocio.endpoint.wsobjects;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 4/7/13
 * Time: 14:42
 * To change this template use File | Settings | File Templates.
 */
public class AreaNegocio {
    private String id;
    private String nome;

    public AreaNegocio() {
    }

    public AreaNegocio(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
