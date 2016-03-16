package br.com.gd.bean;

import br.com.gd.dao.ModeloDAO;
import br.com.gd.modelo.Modelo;
import br.com.gd.utils.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Aninha S.A
 */
@ManagedBean
@ViewScoped
public class ModeloBean {

    private Modelo modelo = new Modelo();
    private List<Modelo> modelos = new ArrayList<Modelo>();

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<Modelo> getModelos() {
        JPAUtil jpaUtil = new JPAUtil();
        ModeloDAO modeloDao = new ModeloDAO(jpaUtil.getEntityManager());
        modelos = modeloDao.modelos();
        return modelos;
    }
}
