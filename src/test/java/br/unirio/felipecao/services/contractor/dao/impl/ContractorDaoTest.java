package br.unirio.felipecao.services.contractor.dao.impl;

import br.unirio.felipecao.services.contractor.dao.IContractorDao;
import br.unirio.felipecao.services.entity.Contractor;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@DataSet
@SpringApplicationContext({"/META-INF/spring/applicationContext.xml", "testContext.xml"})
public class ContractorDaoTest extends UnitilsJUnit4 {

    @SpringBeanByType
    IContractorDao contractorDao;

    @Test
    public void findAllReturnsOneEntry(){
        List<Contractor> contractors = contractorDao.findAll();

        assertNotNull(contractors);
        assertEquals(1, contractors.size());
        assertEquals("EBX", contractors.get(0).getName());
    }
}
