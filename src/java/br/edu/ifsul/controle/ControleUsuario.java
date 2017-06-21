
package br.edu.ifsul.controle;

import br.edu.ifsul.ejb.BeanUsuario;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Named(value = "controleUsuario")
@SessionScoped
public class ControleUsuario implements Serializable {
 
    @EJB
    private BeanUsuario beanUsuario;
    
    public ControleUsuario(){
        
    }
    
    public String informarUsuario(){
        return "index";
    }

    public BeanUsuario getBeanUsuario() {
        return beanUsuario;
    }

    public void setBeanUsuario(BeanUsuario beanUsuario) {
        this.beanUsuario = beanUsuario;
    }
}
