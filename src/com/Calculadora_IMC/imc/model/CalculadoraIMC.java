package com.Calculadora_IMC.imc.model;

/**
 *
 * @author Santiago González
 */
public class CalculadoraIMC {
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public String clasificar(double imc) {
        return imc < 18.5 ? "Bajo Peso" :
               imc <= 24.9 ? "Peso Normal" :
               imc <= 29.9 ? "Sobrepeso" : "Obesidad";
    }
}
