
import javax.swing.*; 
// Importa la librería javax.swing para usar componentes de GUI (Graphical User Interface).

class Numeros {// es la encargada de definir la clse llamda números
    int numer;// es la que declara una variable llamada número
    int i, neg = 0, par = 0;// son variables enteras: i,  neg (inicializada en 0) y par (inicializada en 0).

    public void entrada() {// define un método de entrada
        for (i = 0; i < 5; i++) {// bucle for que se ejecuta  veces
            numer = ingresarDatos("digite 1 numero");// hace un llamado al metodo "ingresarDatos" con el mensaje (digite un numero)
            if (numer % 2 == 0) {// comprueba si el numero par es divisible por 2
                par++;// es la que se encarga de incrementar la variable "par"
            }

            if (numer < 0) {// permite comprobar si el número es negativo
                neg++;// se encarga de incrementar la variable "neg" si el numero 1 es negativo
            }
        }

        JOptionPane.showMessageDialog(null, "el numero de numeros pares es: " + par + "\n"
                                      + " y el numero de numeros negativos es: " + neg);  //// Muestra un cuadro de diálogo con el número de números pares y negativos.
    }
   
    public static int ingresarDatos(String mensaje){
   
     String cadena; // Declara una variable String llamada cadena.
        int valor; // Declara una variable entera llamada valor.
        cadena = JOptionPane.showInputDialog(null, mensaje); // Muestra un cuadro de diálogo para ingresar datos y asigna la entrada del usuario a cadena.
        valor = Integer.parseInt(cadena); // Convierte la cadena ingresada a un entero y la asigna a valor.
        return valor; // Retorna el valor convertido.
  }
}


