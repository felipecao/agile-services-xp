package br.unirio.felipecao.services.areasNegocio.dao;

import br.unirio.felipecao.services.areasNegocio.endpoint.wsobjects.AreaNegocio;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: felipe
 * Date: 4/7/13
 * Time: 14:46
 * To change this template use File | Settings | File Templates.
 */
public interface IAreaNegocioDao {
    List<AreaNegocio> findAll();
}
