Proyecto: Cuentas
Este proyecto consiste en crear una aplicación Java que permita gestionar cuentas bancarias. Se utilizará el paradigma de la programación orientada a objetos para crear las clases necesarias y se implementarán métodos para realizar diversas operaciones bancarias, como depositar y extraer dinero de las cuentas.

Estructura básica del proyecto
La estructura básica del proyecto Java seguirá la convención habitual de los proyectos Java y estará compuesta por una carpeta principal del proyecto y otras subcarpetas para organizar los distintos elementos del proyecto.

Clase Cuenta
La clase Cuenta será el objeto central de nuestro proyecto, representando una cuenta bancaria. La clase contendrá una variable privada de tipo double llamada saldo que representa el saldo disponible en la cuenta. Además, se implementarán los siguientes métodos:

setSaldo: Este método establecerá el saldo inicial de la cuenta y verificará que sea mayor que cero. Si el saldo inicial es menor o igual que cero, se inicializará el saldo con el valor predeterminado de cero.

abonar: Este método permitirá sumar un monto determinado al saldo de la cuenta.

getSaldo: Este método devolverá el saldo actual de la cuenta.

extraccion: Este método permitirá retirar dinero de la cuenta mientras el saldo sea mayor a cero. Si se intenta extraer más dinero del que se tiene disponible, se mostrará un mensaje de "Saldo insuficiente".

Clase Titular
La clase Titular representará al titular de la cuenta bancaria y contendrá las siguientes variables privadas: nombre, apellido e id. Además, se implementará el método getDatosTitular que devolverá una cadena de caracteres con los datos completos del titular.

Clase Test
La clase PruebaCuentas contendrá el método main de la aplicación, que se encargará de crear y manejar distintas cuentas bancarias y titulares. En este método se instanciarán varios objetos de tipo Cuenta y Titular para probar el correcto funcionamiento de los métodos implementados en las clases.

Conclusiones
En resumen, el proyecto "Cuentas" es una aplicación Java que permite gestionar cuentas bancarias de diferentes tipos. Se han implementado las clases necesarias y los métodos requeridos para realizar operaciones bancarias básicas, y se ha creado la clase Titular para gestionar los datos del titular de la cuenta.
