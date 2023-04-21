package cuentasTest;

import cuentas.Cuenta;
import cuentas.Titular;

public class Test {
    public static void main(String[] args) {

        //INSTANCIO 2 TITULARES
        Titular t1 = new Titular();
        Titular t2 = new Titular();

        //#######INSTANCIO 2 CUENTAS#######
        Cuenta cuenta1 = new Cuenta(1000,t1);
        Cuenta cuenta2 = new Cuenta(-500,t2);

        //SETEO 2 TITULARES
        t1.setNombre("Aurora");
        t2.setNombre("Diego");
        t1.setApellido("Esquivel");
        t2.setApellido("Aguilar");
        t1.setId(284);
        t2.setId(271);

        //Muestro los saldos
        System.out.println("ESTADO INICIAL\n----------------\n");
        System.out.printf("Cuenta 1 - Titular: %s - Saldo: $%.2f\n", cuenta1.getTitular().getNombre() + " " + cuenta1.getTitular().getApellido(), cuenta1.getSaldo());
        System.out.printf("Cuenta 2 - Titular: %s - Saldo: $%.2f\n", cuenta2.getTitular().getNombre() + " " + cuenta2.getTitular().getApellido(), cuenta2.getSaldo());

        //Sumo un monto a las cuentas
        cuenta1.abonar(200);
        cuenta2.abonar(2300);

        //Muestro los nuevos saldos
        System.out.println("\nESTADO 2\n----------------\n");
        System.out.printf("Cuenta 1 - Titular: %s - Saldo: $%.2f\n", cuenta1.getTitular().getNombre() + " " + cuenta1.getTitular().getApellido(), cuenta1.getSaldo());
        System.out.printf("Cuenta 2 - Titular: %s - Saldo: $%.2f\n", cuenta2.getTitular().getNombre() + " " + cuenta2.getTitular().getApellido(), cuenta2.getSaldo());

        //Hago extracciones
        cuenta1.extraccion(1500);
        cuenta2.extraccion(2000);

        //Muestro los nuevos Saldos
        System.out.println("\nESTADO 2\n----------------\n");
        System.out.printf("Cuenta 1 - Titular: %s - Saldo: $%.2f\n", cuenta1.getTitular().getNombre() + " " + cuenta1.getTitular().getApellido(), cuenta1.getSaldo());
        System.out.printf("Cuenta 2 - Titular: %s - Saldo: $%.2f\n", cuenta2.getTitular().getNombre() + " " + cuenta2.getTitular().getApellido(), cuenta2.getSaldo());
    }
}
