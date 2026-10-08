package com.Calculadora_IMC.imc.controller;

import com.Calculadora_IMC.imc.model.CalculadoraIMC;
import com.Calculadora_IMC.imc.view.CalculadoraView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Santiago González
 */
public class IMCController implements ActionListener {
    private final CalculadoraIMC calculadora = new CalculadoraIMC(); // Instancia de la clase CalculadoraIMC para realizar los cálculos
    private final CalculadoraView vista; // Instancia de la clase CalculadoraView para interactuar con la interfaz gráfica

    // Constructor del controlador que recibe la vista como parámetro
    public IMCController(CalculadoraView vista) {
        this.vista = vista;
        this.vista.btnCalcular.addActionListener(this);
    }

    // Inicia la aplicación
    public void iniciar() {
        vista.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        vista.setVisible(true); // Hacer visible la ventana
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCalcular) {
            
            // Obtener los valores de peso y altura desde la vista
            String textoPeso = vista.txtPeso.getText();
            String textoAltura = vista.txtAltura.getText();

            try {
                // Reemplazar comas por puntos para manejar decimales correctamente
                double peso = Double.parseDouble(textoPeso.replace(",", "."));
                double altura = Double.parseDouble(textoAltura.replace(",", "."));
                
                double imc = calculadora.calcular(peso, altura); // Calcular el IMC usando la clase CalculadoraIMC
                String clasificacion = calculadora.clasificar(imc); // Obtener la clasificación del IMC usando la clase CalculadoraIMC

                vista.lblResultado.setText(String.format("Tu IMC es: %.2f", imc)); // El %f se usa para formatear el número a dos decimales
                vista.lblClasificacion.setText("Clasificación: " + clasificacion);

                // Cambiar el color del texto según la clasificación
                Color color = new Color(0, 153, 0); // Verde por defecto para "Peso Normal"
                if (clasificacion.equals("Bajo Peso") || clasificacion.equals("Sobrepeso")) {
                    color = Color.ORANGE;
                } else if (clasificacion.equals("Obesidad")) {
                    color = Color.RED;
                }

                // Aplicar el color al texto
                vista.lblClasificacion.setForeground(color);
                vista.lblResultado.setForeground(color);

            } catch (NumberFormatException ex) {
                // Manejar el error de formato de número mostrando el mensaje de error en rojo
                vista.lblResultado.setText("");
                vista.lblClasificacion.setForeground(Color.RED);
                vista.lblClasificacion.setText("Error: Datos inválidos");
                return; 
            }
        }
    }
}