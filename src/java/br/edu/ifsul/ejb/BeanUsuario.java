
package br.edu.ifsul.ejb;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 1)
public class BeanUsuario implements Serializable {

    private String usuario;
    
    public BeanUsuario(){
        System.out.println("Usou o construtor do beanUsuario....");
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
