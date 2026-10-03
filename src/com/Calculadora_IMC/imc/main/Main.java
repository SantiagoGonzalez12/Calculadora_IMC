/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Calculadora_IMC.imc.main;

import com.Calculadora_IMC.imc.controller.IMCController;
import com.Calculadora_IMC.imc.model.CalculadoraIMC;
import com.Calculadora_IMC.imc.view.CalculadoraView;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Santiago González
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
        }

        SwingUtilities.invokeLater(() -> {
            CalculadoraIMC modelo = new CalculadoraIMC();
            CalculadoraView vista = new CalculadoraView();
            IMCController controlador = new IMCController(modelo, vista);
            
            controlador.iniciar();
        });
    }
    
}
