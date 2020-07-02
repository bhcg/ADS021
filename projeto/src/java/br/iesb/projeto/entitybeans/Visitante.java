
package br.iesb.projeto.entitybeans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "visitantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visitante.findAll", query = "SELECT v FROM Visitantes v")
    , @NamedQuery(name = "Visitante.findById", query = "SELECT v FROM Visitantes v WHERE v.id = :id")
    , @NamedQuery(name = "Visitante.findByCondominio", query = "SELECT v FROM Visitantes v WHERE v.condominio = :condominio")
    , @NamedQuery(name = "Visitante.findByUnidade", query = "SELECT v FROM Visitantes v WHERE v.unidade = :unidade")
    , @NamedQuery(name = "Visitante.findByVisitante", query = "SELECT v FROM Visitantes v WHERE v.visitante = :visitante")
    , @NamedQuery(name = "Visitante.findByRg", query = "SELECT v FROM Visitantes v WHERE v.rg = :rg")
    , @NamedQuery(name = "Visitante.findByDataDeEntrada", query = "SELECT v FROM Visitantes v WHERE v.DataDeEntrada = :DataDeEntrada")})
public class Visitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "condominio")
    private String condominio;
    @Basic(optional = false)
    @Column(name = "unidade")
    private int unidade;
    @Basic(optional = false)
    @Column(name = "visitante")
    private String visitante;
    @Basic(optional = false)
    @Column(name = "rg")
    private int rg;
    @Basic(optional = false)
    @Column(name = "DataDeEntrada")
    private String DataDeEntrada;
    

    public Visitante() {
    }

    public Visitante(Integer id) {
        this.id = id;
    }

    public Visitante(Integer id, String condominio, int nome, String visitante, int rg, String datadeentrega) {
        this.id = id;
        this.condominio = condominio;
        this.unidade = unidade;
        this.visitante = visitante;
        this.rg = rg;
        this.DataDeEntrada = DataDeEntrada;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getDataDeEntrada() {
        return DataDeEntrada;
    }

    public void setDataDeEntrada(String DataDeEntrada) {
        this.DataDeEntrada = DataDeEntrada;
    }

   


    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.iesb.projeto.entitybeans.Visitante[ id=" + id + " ]";
    }
    
}
