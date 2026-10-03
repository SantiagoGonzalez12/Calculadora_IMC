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
    private final CalculadoraIMC calculadora = new CalculadoraIMC();
    private final CalculadoraView vista;

    public IMCController(CalculadoraView vista) {
        this.vista = vista;
        this.vista.btnCalcular.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnCalcular) {
            
            String textoPeso = vista.txtPeso.getText();
            String textoAltura = vista.txtAltura.getText();

            try {
                double peso = Double.parseDouble(textoPeso.replace(",", "."));
                double altura = Double.parseDouble(textoAltura.replace(",", "."));

                double imc = calculadora.calcular(peso, altura);
                String clasificacion = calculadora.clasificar(imc);

                vista.lblResultado.setText(String.format("Tu IMC es: %.2f", imc));
                vista.lblClasificacion.setText("Clasificación: " + clasificacion);

                Color color = new Color(0, 153, 0);
                if (clasificacion.equals("Bajo Peso") || clasificacion.equals("Sobrepeso")) {
                    color = Color.ORANGE;
                } else if (clasificacion.equals("Obesidad")) {
                    color = Color.RED;
                }
                
                vista.lblClasificacion.setForeground(color);
                vista.lblResultado.setForeground(color);

            } catch (NumberFormatException ex) {
                vista.lblResultado.setText("");
                vista.lblClasificacion.setForeground(Color.RED);
                vista.lblClasificacion.setText("Error: Datos inválidos");
                return; 
            }
        }
    }
}