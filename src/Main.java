import java.util.Scanner;
import javax.swing.JOptionPane;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String nombre;
        //1- Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por
        //consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”
        //2-Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (aplica
        //Scanner y JOptionPane)

        //nombre = JOptionPane.showInputDialog("Ingrese su nombre");

        //JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);

        //--------------------------------------------------------//


        //3-Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
        //multiplicación, división y módulo (resto de la división).
        //int num1;  //= 20;
        //int num2;  //= 40;
        //int suma;
        //int resta;
        //int mult;
        //double division;
        //int modulo;

        //datos por teclado
        //System.out.println("Ingrese dos numeros:");
        //num1 = sc.nextInt();
        //num2 = sc.nextInt();

        //JOptionPane.showMessageDialog(null,"Los numeros ingresados fueron: "+num1+" y "+num2);

        //operaciones
        //mult = num1 * num2;
        //suma = num1 + num2;
        //resta = num1 - num2;
        //division = num1/num2;
        //modulo = num1 % num2;


        //mensaje por consola
        //System.out.println("Suma:"+suma);
        //System.out.println("Resta:"+resta);
        //System.out.println("Multiplicacion:"+mult);
        //System.out.println("Division:"+division);
        //System.out.println("Modulo:"+modulo);

        //--------------------------------------------------------//

        //4-Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
        //son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.


        //datos por teclado

        //System.out.println("Ingrese dos numeros:");
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();

        //Condicional(buscar el mayor o si son iguales)
        //if (num1>num2) {
            //System.out.println(num1+" es mayor que "+num2);

        //} else if (num2>num1) {
            //System.out.println(num2+" es mayor que "+num1);

        //}else {
            //System.out.println("Ambos numeros son iguales");
        //}

        //------------------------------------------------------//

        //5-Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
        //debemos indicarlo.


        //datos por teclado
        //System.out.println("Ingrese un numero:");
        //int num = sc.nextInt();


        //condicional(si es divisible o no)
        //if (num % 2 == 0) {
            //mostrar mensaje por pantalla
            //System.out.println("El numero es divisible por 2");
        //}else {
            //mostrar mensaje por pantalla
           //System.out.println("El numero no es divisible por 2");
       //}

        //------------------------------------------------------//

        //6-Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
        //el precio final con IVA. El IVA sera una constante que sera del 21%.

        //ingresa datos por teclado
        //System.out.println("Ingrese el precio del producto:");
        //double precio = sc.nextDouble();

        //Calculo
        //double precioIva = precio * 1.21;

        //mensaje por consola
        //System.out.println("Precio normal: $"+precio);
        //System.out.println("Precio con Iva: $"+precioIva);

        //------------------------------------------------------//

        //7-Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while

        //declaramos el dato
        //int num = 1;

        //while: si la cond es true entra al while
        //while (num >= 1 && num<=100) {

            //System.out.println(num++);

        //}

        //------------------------------------------------------//

        //8-Haz el mismo ejercicio anterior con un bucle for

        //for (int i = 1; i <=100 ; i++) {
            //System.out.println(i);
        //}

        //------------------------------------------------------//

        // 9-Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
        //desees


        //for (int i = 1; i <=100 ; i++) {
            //if (i%2==0){
                //System.out.println(i);
            //} else if (i%3==0) {
                //System.out.println(i);

            //}

        //------------------------------------------------------//

        //10-Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
        //lo volverá a pedir (do while), después muestra ese número por consola.

        //int opc;
        //do {
            //System.out.println("Ingresa un numero mayor o igual que cero:");

            //opc = sc.nextInt();

        //}while (opc<0);

        //System.out.println("El numero ingresado es: "+opc);

        //------------------------------------------------------//

        //11-Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
        //pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la
        //contraseña y mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
        //salida (3 intentos y si acierta sale, aunque le queden intentos).

        //String password = "pepito";
        //int contador = 0;
        //int intentos = 3;
        //String auxpassword = null;


        //do {


              // JOptionPane.showMessageDialog(null,"Ingrese contraseña:");
              //auxpassword = JOptionPane.showInputDialog("Ingrese contraseña");
               //contador = intentos -1;


      //} while ((auxpassword==password) | (contador==intentos));

      //JOptionPane.showMessageDialog(null,"Acceso Correcto");




        //String contraseñaCorrecta = "secreto123"; // Contraseña predefinida
        //int intentos = 3;
        //Scanner scanner = new Scanner(System.in);

        //while (intentos > 0) {
            //System.out.print("Introduce la contraseña: ");
            //String contraseñaIngresada = scanner.nextLine();

            //if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                //System.out.println("Acceso Correcto");
                //break; // Sale del bucle si la contraseña es correcta
            //} else {
                //intentos--;
                //if (intentos > 0) {
                    //System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
                //} else {
                    //System.out.println("Has agotado tus intentos. Acceso denegado.");
                //}
            //}
        //}

        //------------------------------------------------------//

        // 12- Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
        //(siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
        //ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.

        //int dia;
        //do {
            //System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
            //while (!sc.hasNextInt()) {
                //System.out.println("Entrada inválida. Por favor, ingrese un número.");
                //sc.next();
            //}
            //dia = sc.nextInt();
        //} while (dia < 1 || dia > 7);

        //switch (dia) {
            //case 1:
                //System.out.println("Lunes: Día laboral");
                //break;
            //case 2:
                //System.out.println("Martes: Día laboral");
                //break;
            //case 3:
                //System.out.println("Miércoles: Día laboral");
                //break;
            //case 4:
                //System.out.println("Jueves: Día laboral");
                //break;
            //case 5:
                //System.out.println("Viernes: Día laboral");
                //break;
            //case 6:
                //System.out.println("Sábado: No es día laboral");
                //break;
            //case 7:
                //System.out.println("Domingo: No es día laboral");
                //break;
            //default:
                //System.out.println("Día inválido");
                //break;
        //}






    }

}