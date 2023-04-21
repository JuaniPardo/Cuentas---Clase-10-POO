# Proyecto: Cuentas

## Descripción
Este proyecto en Java consiste en la creación de una clase llamada "Cuenta" que tiene las siguientes funcionalidades:

- Una variable privada de tipo double llamada "saldo".
- Un método "setSaldo" que valida y setea el saldo inicial de la cuenta. Si el saldo es menor que 0, se inicializa en 0.
- Un método "abonar" que suma un monto a la cuenta.
- Un método "extraccion" que permite retirar dinero de la cuenta siempre y cuando el saldo sea mayor que 0. Si el saldo es insuficiente, muestra un mensaje indicando que no se puede realizar la extracción.
- Cada cuenta tiene un titular con nombre, apellido y ID.

Se ha creado una clase "Titular" que almacena la información del titular y se ha incluido en la clase "Cuenta".

Se ha creado una clase de prueba llamada "Test" que utiliza objetos de tipo "Cuenta" para manejar información diferente para cada cuenta.

## Uso
Para utilizar este proyecto, simplemente compile el archivo "Cuenta.java",  "Test.java" y "Titular.java. A continuación, se mostrarán las cuentas creadas y se realizarán algunas operaciones básicas, como abonar y extraer dinero.

## Autor
Este proyecto fue creado por Juani Pardo.
