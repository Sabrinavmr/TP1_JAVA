import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {

    //5-Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
    //debemos indicarlo

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //datos por teclado
        System.out.println("Ingrese un numero:");
        int num = sc.nextInt();


        //condicional(si es divisible o no)
        if (num % 2 == 0) {
        //mostrar mensaje por pantalla
        System.out.println("El numero es divisible por 2");
        }else {
        //mostrar mensaje por pantalla
        System.out.println("El numero no es divisible por 2");
        }

    }
}
