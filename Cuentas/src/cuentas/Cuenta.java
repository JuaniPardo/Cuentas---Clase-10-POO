package cuentas;
public class Cuenta {
    private double saldo; // PRIMITIVA INSTANCIA
    private Titular titular;  //REFERENCIA INSTANCIA

    //#####CREO EL CONSTRUCTOR DEL SALDO INICIAL#######
    public Cuenta(double saldoInicial, Titular titular) {
        setSaldo(saldoInicial);
        setTitular(titular);
    }

    //######SETTERS Y GETTERS##########
    public void setSaldo(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }
    private void setTitular(Titular titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public Titular getTitular() {
        return titular;
    }

    //#####METODO ABONAR#######
    public void abonar(double monto) {
        saldo += monto;
    }

    //######METODO PARA EXTRAER DINERO DE LA CUENTA
    public void extraccion(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.printf("\nSaldo insuficiente para extraer $%.2f en la cuenta de %s\n", monto, this.titular.getNombre() + " " + this.titular.getApellido());
        }
    }
}
