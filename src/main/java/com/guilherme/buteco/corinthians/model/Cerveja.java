package com.corinthians.buteco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Guilherme
 */

@Entity
@Table(name = "cerveja")
public class Cerveja extends AbstractEntity {
    
    @Column(length = 255)
    private String marca;
    
    @Column(length = 255)
    private String cidade;
    
    @Column(length = 255)
    private String valor;

    @Column(length = 255)
    private String categoria;
    
    @Column(length = 255)
    private String tipo;

    public Cerveja() {
        
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getcidade() {
        return cidade;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public String getvalor() {
        return valor;
    }

    public void setvalor(String valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Cerveja{" + "Marca=" + marca + ",Cidade=" + cidade +",Valor=" + valor + ", categoria=" + categoria + ", tipo=" + tipo + '}';
    }
    
}
