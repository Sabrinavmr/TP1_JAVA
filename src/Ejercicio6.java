import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio6 {
    //6-Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
    //el precio final con IVA. El IVA sera una constante que sera del 21%.

    public static void main(String[]args){

        //ingresa datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();

        //Calculo
        double precioIva = precio * 1.21;

        //mensaje por consola
        System.out.println("Precio normal: $"+precio);
        System.out.println("Precio con Iva: $"+precioIva);

    }



}
