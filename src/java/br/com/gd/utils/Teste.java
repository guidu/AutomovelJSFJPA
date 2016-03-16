/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gd.utils;

import br.com.gd.modelo.Marca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Aninha S.A
 */
public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AutomovelJSFJPAPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select m from Marca m ");
        List<Marca> lista = q.getResultList();
        for(Marca x :lista){
            System.out.println("modelo descricao: "+x.getModelos().size());
        }
        em.close();
    }
}
