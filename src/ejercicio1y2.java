import java.util.Scanner;
import javax.swing.JOptionPane;

public class ejercicio1y2 {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        //1- Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por
        //consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”
        //2-Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica
        //Scanner y JOptionPane)

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);

    }

    }
