/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.gd.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Aninha S.A
 */
@ManagedBean
@ViewScoped
public class TesteAjaxBean {
    private SelectItem[]opciones = new SelectItem[]{
        new SelectItem(1, "opçao 1"),
        new SelectItem(2, "opçao 2"),
        new SelectItem(3, "opçao 3"),
    };    
    private SelectItem[]opcionesTwo = new SelectItem[]{
        new SelectItem(1, "opçao 1"),
        new SelectItem(2, "opçao 2"),
        new SelectItem(3, "opçao 3"),
    };

    public SelectItem[] getOpcionesTwo() {
        return opcionesTwo;
    }
    private String opcionActual;

    public SelectItem[] getOpciones() {
        return opciones;
    }


    public String getOpcionActual() {
        return opcionActual;
    }

    public void setOpcionActual(String opcionActual) {
        this.opcionActual = opcionActual;
    }
    
}
