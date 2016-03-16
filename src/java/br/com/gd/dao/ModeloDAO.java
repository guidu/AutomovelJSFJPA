/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gd.dao;

import br.com.gd.modelo.Modelo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Aninha S.A
 */
public class ModeloDAO {
    private final EntityManager em;
    public ModeloDAO(EntityManager entityManager){
        this.em = entityManager;
    }
    public List<Modelo>modelos(){
        Query q = em.createQuery("select m from Modelo m",Modelo.class);
        List<Modelo> modelos = q.getResultList();
        em.getTransaction().begin();
        em.close();
        return modelos;
    }
}
