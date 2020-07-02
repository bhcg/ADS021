package br.iesb.projeto.dao;

import br.iesb.projeto.entitybeans.Visitante;
import java.io.Serializable;


public class VisitanteDAO extends AbstractDAO<Visitante> implements Serializable{

    public VisitanteDAO() {
        super(Visitante.class);
    }
    
    
}
