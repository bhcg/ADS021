package br.iesb.projeto.managedbeans;

import br.iesb.projeto.dao.VisitanteDAO;
import br.iesb.projeto.entitybeans.Visitante;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "visitanteMB")
@RequestScoped
public class VisitanteMB implements Serializable {

    private Visitante visitante;
    private VisitanteDAO dao;
    private List<Visitante> lista;

    public VisitanteMB() {
        this.visitante = new Visitante();
        this.dao = new VisitanteDAO();
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public List<Visitante> getLista() {
        if (lista == null) {
            lista = dao.findAll();
        }
        return lista;
    }

    public void setLista(List<Visitante> lista) {
        this.lista = lista;
    }

    public String criar() {
        this.visitante = new Visitante();
        return "/pages/visitante/criar";
    }

    public String editar(Visitante visitante) {
        this.visitante = visitante;
        return "/pages/visitante/criar";
    }

    public String remover(Visitante visitante) {
        dao.remove(visitante);
        return "/pages/visitante/listar?faces-redirect=true";
    }

    public String salvar(Visitante visitante) {
        if (visitante.getId() == null) {
            dao.create(visitante);
        } else {
            dao.edit(visitante);
        }
        return "/pages/visitante/listar?faces-redirect=true";
    }

}
