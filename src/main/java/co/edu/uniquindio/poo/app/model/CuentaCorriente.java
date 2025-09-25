package co.edu.uniquindio.poo.app.model;

public class CuentaCorriente extends Cuenta{
    private float sobregiroMaximo=0;
    

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiroMaximo) {
        super(saldo, tasaAnual);
        this.sobregiroMaximo = sobregiroMaximo;
    }

    @Override
    public void retirar(float valor) {
        if (valor>0){
            if (valor<=(getSaldo()+sobregiroMaximo)){
                super.retirar(valor);
            }else{
                System.out.println("No hay saldo suficiente");
            }
        }else{
            System.out.println("El valor a retirar debe ser positivo");
        }
    }
    public void consignarSobregiro(float valor){
        if (valor>0){
            if (valor<=sobregiroMaximo){
                sobregiroMaximo=sobregiroMaximo-valor;
                super.consignar(valor);
            }else{
                System.out.println("El valor a consignar supera el sobregiro maximo");
            }
        }else{
            System.out.println("El valor a consignar debe ser positivo");
        }
    }
    public void extractoMensual() {
        super.extractoMensual();
    }
    public float getSobregiroMaximo() {
        return sobregiroMaximo;
    }

    public void setSobregiroMaximo(float sobregiroMaximo) {
        this.sobregiroMaximo = sobregiroMaximo;
    }
    @Override
public String toString() {
    return "Cuenta Corriente\n" +
           "Saldo: " + getSaldo() + "\n" +
           "Tasa Anual: " + getTasaAnual() + "%\n" +
           "Número de Consignaciones: " + getNumeroConsignaciones() + "\n" +
           "Número de Retiros: " + getNumeroRetiros() + "\n" +
           "Sobregiro Máximo: " + getSobregiroMaximo();
}

}