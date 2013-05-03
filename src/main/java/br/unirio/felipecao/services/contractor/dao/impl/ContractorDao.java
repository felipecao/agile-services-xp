package br.unirio.felipecao.services.contractor.dao.impl;

import br.unirio.felipecao.services.contractor.dao.IContractorDao;
import br.unirio.felipecao.services.entity.Contractor;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ContractorDao implements IContractorDao {

    private SessionFactory sessionFactory;

    @Override
    public List<Contractor> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(Contractor.class).list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
