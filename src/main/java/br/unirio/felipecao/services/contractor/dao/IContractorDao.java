package br.unirio.felipecao.services.contractor.dao;

import br.unirio.felipecao.services.entity.Contractor;

import java.util.List;
import java.util.Set;

public interface IContractorDao {
    List<Contractor> findAll();
}
