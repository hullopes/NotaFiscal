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
public class NotaFiscal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orcamento orcamento =  new Orcamento(100.0);
        CalculadorDeImposto calculador = new CalculadorDeImposto();
        System.out.println(calculador.realizaCalculo(orcamento, new ICMS()));
        
        System.out.println(calculador.realizaCalculo(orcamento, new ISS()));
    }
    
}
