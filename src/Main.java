import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hola amigo, vamos a jugar a un juego.");
        System.out.println("Vamos a poner un nombre a tu mascota y luego vamos a interactuar con ella");
        int opcion= 0;

        Perro [] vectorPerros = new Perro [5];

        System.out.println("Hola amigo, vamos a jugar a un juego.");
        System.out.println("Vamos a poner un nombre a tu mascota y luego vamos a interactuar con ella!!");
        System.out.println("********************************************************************************************");
        System.out.println("Introduce el nombre de tu mascota");
        Scanner scn = new Scanner (System.in);
        String nombre = scn.nextLine();
        Perro perro = new Perro(nombre);
        vectorPerros[0] = perro;

        do {
            System.out.println("Estupendo! vamos a interctuar con " + nombre + "!!");
            System.out.println("********************************************************************************************");
            System.out.println("Que quieres hacer con "+ nombre);
            opcion = menu();
            switch (opcion) {

                case 1://CREAMOS PERRO

                    System.out.println(Perro.contadorPerro);

                case 2: // COMER
                case 3: // JUGAR
                case 4:
                case 5:

            }


        } while (opcion != 6);
        System.out.println("Vaya!! vamos a descansar todos, nos vemos pronto!! " );
    }

    public static int menu() {
        System.out.println("1. Crear perro");
        System.out.println("2. Dar de comer al perro");
        System.out.println("3. Jugar con el perro");
        System.out.println("4. Mostrar el nivel de Energia");
        System.out.println("5. Mostrar nivel de Hambre");
        System.out.println("6. Salir");

        Scanner scn = new Scanner (System.in);
        int opcion = scn.nextInt();

        return opcion;
    }


}
