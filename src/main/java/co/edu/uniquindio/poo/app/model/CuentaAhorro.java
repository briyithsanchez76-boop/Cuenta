package co.edu.uniquindio.poo.app.model;

public class CuentaAhorro extends Cuenta{
    private boolean bandera;

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo<10000){
            bandera=false;
        }else{
            bandera=true;
        }
    }

    @Override
    public void consignar(float valor) {
        if (bandera){
            super.consignar(valor);
        }else{
            System.out.println("La cuenta no esta activa, el saldo debe ser mayor a 10000");
        }
    }

    @Override
    public void retirar(float valor) {
        if (bandera){
            super.retirar(valor);
        }else{
            System.out.println("La cuenta no esta activa, el saldo debe ser mayor a 10000");
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
        if (getSaldo()<10000){
            bandera=false;
        }else{
            bandera=true;
        }
    }

    public boolean isActiva() {
        return bandera;
    }

    public void setActiva(boolean bandera) {
        this.bandera = bandera;
    }
    @Override
public String toString() {
    return "Cuenta de Ahorro\n" +
           "Saldo:" + getSaldo() + "\n" +
           "Tasa Anual: " + getTasaAnual() + "%\n" +
           "Número de Consignaciones: " + getNumeroConsignaciones() + "\n" +
           "Número de Retiros: " + getNumeroRetiros() + "\n";
}
 
}
