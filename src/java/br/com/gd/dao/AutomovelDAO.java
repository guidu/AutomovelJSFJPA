/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gd.dao;

import br.com.gd.modelo.Automovel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Aninha S.A
 */
public class AutomovelDAO {
    private EntityManager em;
    public AutomovelDAO(EntityManager entityManager){
        this.em = entityManager;
    }
    public void gravar(Automovel automovel){
        em.getTransaction().begin();
        em.persist(automovel);
        em.getTransaction().commit();
        em.close();
    }
    public List<Automovel> automoveis(){
        TypedQuery<Automovel> q = em.createQuery("select a from Automovel a ",Automovel.class);
        List<Automovel> listaAutomoveis = q.getResultList();
        em.close();
        return listaAutomoveis;
    }
    public void excluir(Automovel automovel){
        em.getTransaction().begin();
        Automovel automovelRemove = em.find(Automovel.class, automovel.getId());
        em.remove(automovelRemove);
        em.getTransaction().commit();
        em.close();
    }
}
