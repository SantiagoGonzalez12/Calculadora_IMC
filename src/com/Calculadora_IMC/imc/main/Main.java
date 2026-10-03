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
            CalculadoraView vista = new CalculadoraView();
            IMCController controlador = new IMCController(vista);
            
            controlador.iniciar();
        });
    }
    
}
