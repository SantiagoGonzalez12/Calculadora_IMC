package com.Calculadora_IMC.imc.main;

import com.Calculadora_IMC.imc.controller.IMCController;
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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Establecer el look and feel del sistema operativo
        } catch (Exception ex) {
            
        }
        
        // Ejecutar la creación de la interfaz gráfica
        SwingUtilities.invokeLater(() -> {
            CalculadoraView vista = new CalculadoraView(); // Crear la vista de la calculadora
            IMCController controlador = new IMCController(vista); // Crear el controlador y pasarle la vista
            
            controlador.iniciar(); // Iniciar la aplicación mostrando la ventana de la calculadora
        });
    }
    
}
