
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //3-Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
        //multiplicación, división y módulo (resto de la división).
        int num1;  //= 20;
        int num2;  //= 40;
        int suma;
        int resta;
        int mult;
        double division;
        int modulo;

        //datos por teclado
        System.out.println("Ingrese dos numeros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        JOptionPane.showMessageDialog(null,"Los numeros ingresados fueron: "+num1+" y "+num2);

        //operaciones
        mult = num1 * num2;
        suma = num1 + num2;
        resta = num1 - num2;
        division = num1/num2;
        modulo = num1 % num2;


        //mensaje por consola
        System.out.println("Suma:"+suma);
        System.out.println("Resta:"+resta);
        System.out.println("Multiplicacion:"+mult);
        System.out.println("Division:"+division);
        System.out.println("Modulo:"+modulo);


    }
}
