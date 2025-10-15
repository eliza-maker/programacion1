package Model;

public abstract class Cuenta {
    protected float saldo = 0;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual = 0;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, int numConsignaciones, int numRetiros, float tasaAnual, float comisionMensual) {
        this.saldo = saldo;
        this.numConsignaciones = numConsignaciones;
        this.numRetiros = numRetiros;
        this.tasaAnual = tasaAnual;        this.comisionMensual= comisionMensual;

    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConsignaciones() {
        return numConsignaciones;
    }

    public void setNumConsignaciones(int numConsignaciones) {
        this.numConsignaciones = numConsignaciones;
    }

    public int getNumRetiros() {
        return numRetiros;
    }

    public void setNumRetiros(int numRetiros) {
        this.numRetiros = numRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    //Aquí van los métodos abstractos

    public abstract float consignarDinero();

    public abstract float retirarDinero();

    public abstract float interesMensual();

    public abstract float extractoMensual();

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numConsignaciones=" + numConsignaciones +
                ", numRetiros=" + numRetiros +
                ", tasaAnual=" + tasaAnual +
                ", comisionMensual=" + comisionMensual +
                '}';
    }
}
