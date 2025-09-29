package Model;

import javax.swing.*;

public class CuentaAhorros extends Cuenta {
    protected boolean estaActiva;
    protected float restar;

    public CuentaAhorros(float saldo, int numConsignaciones, int numRetiros, float tasaAnual, float comisionMensual, boolean estaActva, float restar) {
        super(saldo, numConsignaciones, numRetiros, tasaAnual, comisionMensual);
        this.estaActiva = estaActva;
        this.restar=restar;
    }

    public boolean isEstaActva() {
        return estaActiva;
    }

    public void setEstaActva(boolean estaActva) {
        this.estaActiva = estaActva;
    }

    public float getRestar() {
        return restar;
    }

    public void setRestar(float restar) {
        this.restar = restar;
    }

    public boolean esActiva (){
        boolean esActiva=false;
        if (getSaldo()>=100000){
            esActiva=true;
        }else{
            esActiva=false;
        }
        return esActiva;
    }

    //acá va el polimorfismo



    @Override
    public float consignarDinero() {

        if(estaActiva){
            float dinero = Float.parseFloat(JOptionPane.showInputDialog(null, "Cuánto dinero desea consignar: ")) ;
            saldo = dinero + saldo;
        }
        return saldo;

    }

    @Override
    public float retirarDinero() {
        if(estaActiva==true){
            float dinero= Float.parseFloat(JOptionPane.showInputDialog(null,"Cuánto dinero desea retirar: "));

            if (dinero<saldo){
                if(extractoMensual() == 0){
                    saldo= saldo-dinero;
                    comisionMensual += 1;
                }else{
                    saldo= saldo - restar - dinero;
                    comisionMensual += 1;
                }

            }else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }

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
        if(estaActiva){
            if(comisionMensual>=4){
                restar = 1000;
            }
            else{
                restar = 0;
            }
        }
        return restar;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorros{" +
                "esActiva=" + estaActiva +
                ", saldo=" + saldo +
                ", transacciones=" + numConsignaciones + numRetiros +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
