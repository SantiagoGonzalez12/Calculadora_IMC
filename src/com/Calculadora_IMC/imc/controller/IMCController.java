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
    private final CalculadoraIMC modelo;
    private final CalculadoraView vista;

    public IMCController(CalculadoraIMC modelo, CalculadoraView vista) {
        this.modelo = modelo;
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
            try {
                double peso = Double.parseDouble(vista.txtPeso.getText().replace(",", "."));
                double altura = Double.parseDouble(vista.txtAltura.getText().replace(",", "."));

                double imc = modelo.calcular(peso, altura);
                String clasificacion = modelo.clasificar(imc);

                vista.lblError.setText("");
                vista.lblValorIMC.setText(String.format("%.2f", imc));
                vista.lblValorClasificacion.setText(clasificacion);

                Color color = Color.GREEN;
                if (clasificacion.equals("Bajo Peso") || clasificacion.equals("Sobrepeso")) {
                    color = Color.ORANGE;
                } else if (clasificacion.equals("Obesidad")) {
                    color = Color.RED;
                }
                
                vista.lblValorClasificacion.setForeground(color);
                vista.lblValorIMC.setForeground(color);

            } catch (NumberFormatException ex) {
                vista.lblValorIMC.setText("");
                vista.lblValorClasificacion.setText("");
                vista.lblError.setText("Error: Introduce solo números válidos");
            }
        }
    }
}