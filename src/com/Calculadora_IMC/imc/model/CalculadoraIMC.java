package com.Calculadora_IMC.imc.model;

/**
 *
 * @author Santiago González
 */
public class CalculadoraIMC {
    public double calcular(double peso, double altura) {
        return peso / (altura * altura); // Fórmula del IMC: peso (kg) / altura^2 (m^2)
    }
    
    public String clasificar(double imc) {
        // Clasificar el IMC según los rangos establecidos
        if (imc < 18.5) {
            return "Bajo Peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso Normal";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}