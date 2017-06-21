package br.edu.ifsul.controle;

import br.edu.ifsul.ejb.BeanHora;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Named(value = "controleBeanHora")
@RequestScoped
public class ControleBeanHora implements Serializable {

    @EJB
    private BeanHora beanHora;
    @Inject
    private ControleUsuario controleUsuario;
    
    public ControleBeanHora(){
        System.out.println("Usou o construtor do ControleBeanHora");
        
    }
    
    public String getUsuario(){
        return controleUsuario.getBeanUsuario().getUsuario() != null ?
                controleUsuario.getBeanUsuario().getUsuario() :
                "Usuário não informado";
    }

    public BeanHora getBeanHora() {
        return beanHora;
    }

    public void setBeanHora(BeanHora beanHora) {
        this.beanHora = beanHora;
    }

    public ControleUsuario getControleUsuario() {
        return controleUsuario;
    }

    public void setControleUsuario(ControleUsuario controleUsuario) {
        this.controleUsuario = controleUsuario;
    }

}
