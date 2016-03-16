package br.com.gd.bean;

import br.com.gd.dao.MarcaDAO;
import br.com.gd.modelo.Marca;
import br.com.gd.utils.JPAUtil;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;


/**
 *
 * @author Aninha S.A
 */
@ManagedBean
@ViewScoped
public class MarcaBean {
    private Marca marca = new Marca();
    private List<Marca>marcas;
    JPAUtil jpaUtil = new JPAUtil();

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public List<Marca> getMarcas(){
        
        MarcaDAO marcaDao = new MarcaDAO(jpaUtil.getEntityManager());
        marcas = marcaDao.listaMarcas();
        return marcas;
    }
}
