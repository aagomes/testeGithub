
package br.edu.ifsul.ejb;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
@Stateless
public class BeanHora implements Serializable {
    
    @EJB
    private BeanContador beanContador;
    
    public BeanHora(){
        System.out.println("Usou o construtor do BeanHora");
    }
    
    public String getDataHoraServidor(){
        beanContador.incrementaContador();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        return sdf.format(Calendar.getInstance().getTime());
    }
    
    @PostConstruct
    public void iniciar(){
        System.out.println("Usou o método iniciar");
    }
    
    @PreDestroy
    public void destruir(){
        System.out.println("Usou o método destruir");
    }

    public BeanContador getBeanContador() {
        return beanContador;
    }

    public void setBeanContador(BeanContador beanContador) {
        this.beanContador = beanContador;
    }

}
