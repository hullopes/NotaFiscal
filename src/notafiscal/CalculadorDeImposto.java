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
public class CalculadorDeImposto {
    public double realizaCalculo(Orcamento orcamento, Imposto obImposto){
        return obImposto.calcula(orcamento);
    }
}
