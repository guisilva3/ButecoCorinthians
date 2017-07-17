package com.corinthians.buteco.teste;

import com.corinthians.buteco.util.JPAUtil;
import javax.persistence.EntityManager;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author guilherme
 */
public class ConexaoDBTest {
        private final EntityManager entityManager;

    public ConexaoDBTest() {
        entityManager = JPAUtil.newInstance().getEntityManager();
    }

    @Test
    public void hasValidConnection() {
        Assert.assertNotNull(entityManager);
        Assert.assertTrue(entityManager.isOpen());
    }
    
}
