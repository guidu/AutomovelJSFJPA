package br.com.gd.bean;

import br.com.gd.dao.AutomovelDAO;
import br.com.gd.modelo.Automovel;
import br.com.gd.modelo.Marca;
import br.com.gd.utils.JPAUtil;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Aninha S.A
 */
@ManagedBean
@ViewScoped
public class AutomovelBean {

    private Automovel automovel = new Automovel();
    private Marca marca;

    private List<Automovel> automoveis;
    JPAUtil jpaUtil = new JPAUtil();

    public Automovel getAutomovel() {
        return automovel;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public void grava() {
        FacesMessage msg = new FacesMessage("Gravado com sucesso.");
        System.out.println("modelo: " + automovel.getModelo());
        new AutomovelDAO(jpaUtil.getEntityManager()).gravar(automovel);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        System.out.println("Veio no manager bean");
        automovel = new Automovel();
    }

    public List<Automovel> getAutomoveis() {
        if (automoveis == null) {
            automoveis = new AutomovelDAO(jpaUtil.getEntityManager()).automoveis();
        }
        return automoveis;
    }
    public void removerAutomovel(Automovel automovel){
        FacesMessage msg = new FacesMessage("Excluído com sucesso.");
        new AutomovelDAO(jpaUtil.getEntityManager()).excluir(automovel);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
