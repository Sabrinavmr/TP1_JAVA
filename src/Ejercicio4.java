
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio4 {
    //4-Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
    //son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona

    public static void main(String[]args){
        //datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //Condicional(buscar el mayor o si son iguales)
        if (num1>num2) {
        System.out.println(num1+" es mayor que "+num2);

        } else if (num2>num1) {
        System.out.println(num2+" es mayor que "+num1);

        }else {
        System.out.println("Ambos numeros son iguales");
        }
    }

}
