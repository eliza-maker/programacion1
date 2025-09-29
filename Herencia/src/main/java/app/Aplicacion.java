package app;

import Model.CuentaAhorros;
import Model.CuentaCorriente;

import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        String[] opciones = {"Cuenta de Ahorros", "Cuenta Corriente"};
        String tipoCuenta = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el tipo de cuenta:",
                "Banco UQ",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        switch (tipoCuenta) {
            case "Cuenta de Ahorros" -> {
                CuentaAhorros cuenta = new CuentaAhorros(0, 0, 0, 0.02f, 0, true, 0);
                cuenta.consignarDinero();
                cuenta.retirarDinero();
                JOptionPane.showMessageDialog(null, cuenta.toString());
            }
            case "Cuenta Corriente" -> {
                CuentaCorriente cuenta = new CuentaCorriente(0, 0, 0, 0.02f, 0, 0);
                cuenta.consignarDinero();
                cuenta.retirarDinero();
                cuenta.mostrarMensaje();
            }
            default -> JOptionPane.showMessageDialog(null, "Tipo de cuenta no válido");
        }
    }
}
