/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notafiscal;

/**
 *
 * @author tatuapu
 */
public class ICMS implements Imposto{
    
    public static final double taxa = 0.1;
    
    public double calcula(Orcamento orcamento){
        return orcamento.getValor()  * taxa;
    }
    
}
