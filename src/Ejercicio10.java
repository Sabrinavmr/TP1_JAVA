import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio10 {
    //10-Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
    //lo volverá a pedir (do while), después muestra ese número por consola

    public static void main(String[]args) {
        int opc;
        do {
        System.out.println("Ingresa un numero mayor o igual que cero:");
        Scanner sc = new Scanner(System.in);

        opc = sc.nextInt();

        }while (opc<0);

        System.out.println("El numero ingresado es: "+opc);
    }
}
