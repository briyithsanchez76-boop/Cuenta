package co.edu.uniquindio.poo.app.app;
import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.app.model.CuentaAhorro;
import co.edu.uniquindio.poo.app.model.CuentaCorriente;

public class App {
    public static void main(String[] args) {

        CuentaAhorro ahorro= new CuentaAhorro(50000f, 5f);
        ahorro.consignar(20000f);
        ahorro.retirar(10000f);
        ahorro.extractoMensual();

        CuentaCorriente corriente= new CuentaCorriente(50000f, 5f,20000f);
        corriente.consignar(20000f);
        corriente.retirar(100000f);
        corriente.extractoMensual();

        JOptionPane.showMessageDialog(null, ahorro);
        JOptionPane.showMessageDialog(null, corriente);
    }
     
}
