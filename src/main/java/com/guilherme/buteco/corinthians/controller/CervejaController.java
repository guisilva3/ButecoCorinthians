package com.corinthians.buteco.controller;

import com.corinthians.buteco.DAO.CervejaDAO;
import com.corinthians.buteco.model.Cerveja;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author cerveja
 */

@Named("Brahma")
@RequestScoped
public class CervejaController extends AbstractController {
    
    private Cerveja cerveja = new Cerveja();
    
    @Inject
    private CervejaDAO cervejaDAO;
    
    public String saveCerveja() {
        cervejaDAO.save(cerveja);
        return "";
    }

    public Cerveja getCerveja() {
        return cerveja;
    }

    public void setCerveja(Livro cerveja) {
        this.cerveja = cerveja;
    }
    
}
