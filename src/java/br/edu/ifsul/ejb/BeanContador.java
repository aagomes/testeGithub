
package br.edu.ifsul.ejb;

import java.io.Serializable;
import javax.ejb.Singleton;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Singleton
public class BeanContador implements Serializable {
    
    private Integer contador;
    
    public BeanContador(){
        contador = 0;
    }
    public void incrementaContador(){
        contador++;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

}
