package co.edu.uniquindio.poo.app.model;

public abstract class Cuenta {
    private  float saldo;
    private int numeroConsignaciones=0;
    private int numeroRetiros=0;
    private float tasaAnual;
    private float comisionMensual=0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float valor){
        if (valor>0){
            saldo= saldo+valor;
            numeroConsignaciones++;
        }else{
            System.out.println("El valor a consignar debe ser positivo");
        }
    }

    public void retirar(float valor){
        if (valor>0){
            if (valor<=getSaldo()){
                saldo= saldo-valor;
                numeroRetiros++;
            }else{
                System.out.println("No hay saldo suficiente");
            }
        }else{
            System.out.println("El valor a retirar debe ser positivo");
        }
    }

    public void actualizarSaldo(){
        float tasaMensual = (tasaAnual/100)/12;
        float interesMensual = saldo * tasaMensual;
        saldo= saldo + interesMensual;
        saldo=saldo-comisionMensual;
    }

    public void extractoMensual(){
        comisionMensual=numeroRetiros*1000;
        actualizarSaldo();
        numeroRetiros=0;
        numeroConsignaciones=0;
        comisionMensual=0;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
        
}
