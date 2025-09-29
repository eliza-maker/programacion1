package Model;

import javax.swing.*;

public class CuentaCorriente extends Cuenta {
    protected float sobreGiro;

    public CuentaCorriente(float saldo, int numConsignaciones, int numRetiros, float tasaAnual, float comisionMensual, float sobreGiro) {
        super(saldo, numConsignaciones, numRetiros, tasaAnual, comisionMensual);
        this.sobreGiro = sobreGiro;
    }

    public float getSobreGiro() {
        return sobreGiro;
    }

    public void setSobreGiro(float sobreGiro) {
        this.sobreGiro = sobreGiro;
    }

    //acá va el polimorfismo


    public CuentaCorriente(float saldo, int numConsignaciones, int numRetiros, float tasaAnual, float comisionMensual) {
        super(saldo, numConsignaciones, numRetiros, tasaAnual, comisionMensual);
    }

    @Override
    public float consignarDinero() {
        float consignacion=Float.parseFloat(JOptionPane.showInputDialog(null, "Cuanto dinero desea consignar"));
        if(sobreGiro>0){
            saldo = consignacion - sobreGiro;
            if(consignacion - sobreGiro < 0){
                sobreGiro = sobreGiro - consignacion;
                saldo = 0;
            }
        }else{
            saldo += consignacion;
        }
        return sobreGiro;
    }

    @Override
    public float retirarDinero() {
        float retiro= Float.parseFloat(JOptionPane.showInputDialog(null, "Cuanto dinero desea retirar:"));
        if(retiro>saldo){
            sobreGiro= retiro-saldo;
            saldo = 0;
        }else{
            saldo= saldo-retiro;
        }
        return saldo;
    }

    @Override
    public float interesMensual() {
        float resultado = 0;
        return resultado;
    }

    @Override
    public float extractoMensual() {
        float resultado = 0;
        return resultado;
    }

    public void mostrarMensaje(){
        JOptionPane.showMessageDialog(null,"CuentaCorriente{" +
                "sobreGiro=" + sobreGiro +
                ", saldo=" + saldo +
                ", transacciones=" + numConsignaciones + numRetiros +
                ", tasaAnual=" + tasaAnual +
                '}');
    }

}



