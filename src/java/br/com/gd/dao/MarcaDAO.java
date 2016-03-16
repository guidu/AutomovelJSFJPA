/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gd.dao;

import br.com.gd.modelo.Marca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Aninha S.A
 */
public class MarcaDAO {
    private EntityManager em;
    public MarcaDAO(EntityManager entityManager){
        this.em = entityManager;
    }
    public List<Marca> listaMarcas(){
        Query q = em.createQuery("select m from Marca m ",Marca.class);
        return q.getResultList();
    }
}
