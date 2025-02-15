import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        Perro[] vectorPerros = new Perro[5];
        Scanner scn = new Scanner(System.in);

        System.out.println("Hola amigo, vamos a jugar a un juego.");
        System.out.println("Vamos a crear a tu mascota y luego vamos a interactuar con ella!!");
        System.out.println("***********************************************************************************************");
        System.out.println("***********************************************************************************************");

        do {

            if (vectorPerros[0] != null) {
                System.out.println("*********************************************************************************************");1
                System.out.println("Que quieres hacer con " + vectorPerros[0].getNombre());
            } else {
                System.out.println("Aun no has creado un perro. Por favor, crea un perro primero.");
            }
            opcion = menu();
            switch (opcion) {
                case 1: // CREAR PERRO
                    System.out.println("*********************************************************************************************");
                    System.out.println("Estupendo! vamos a interactuar con tu mascota!!");
                    System.out.println("Como quieres que se llame tu mascota");
                    String nombre = scn.nextLine();
                    Perro perro = new Perro(nombre);
                    vectorPerros[0] = perro;

                    System.out.println("************************************************************************************************");
                    System.out.println("Tu mascota se llama " + nombre + " que nombre mas bonito!!");
                    System.out.println("************************************************************************************************");
                    System.out.println("Ahora dime que raza es " + nombre);
                    String raza = scn.nextLine();
                    perro.setRaza(raza);
                    System.out.println("************************************************************************************************");
                    System.out.println("Woooooow un " + raza + ", que raza mas bonita!!");
                    break;
                case 2: // COMER
                    if (vectorPerros[0] != null) {
                        vectorPerros[0].comer();
                        System.out.println("*************************************************************************************");
                        System.out.println(vectorPerros[0].toString());
                    } else {
                        System.out.println("Primero debes crear un perro.");
                    }
                    break;
                case 3: // JUGAR
                    if (vectorPerros[0] != null) {
                        vectorPerros[0].jugar();
                        System.out.println("*************************************************************************************");
                        System.out.println(vectorPerros[0].toString());
                    } else {
                        System.out.println("Primero debes crear un perro.");
                    }
                    break;
                case 4: // MOSTRAR NIVEL DE ENERGIA
                    if (vectorPerros[0] != null) {
                        System.out.println("*************************************************************************************");
                        System.out.println("El nivel de energia de tu perro es " + vectorPerros[0].getNivelEnergia());
                    } else {
                        System.out.println("Primero debes crear un perro.");
                    }
                    break;
                case 5: // MOSTRAR NIVEL DE HAMBRE
                    if (vectorPerros[0] != null) {
                        System.out.println("*************************************************************************************");
                        System.out.println("El nivel de hambre de tu perro es: " + vectorPerros[0].getNivelHambre());
                    } else {
                        System.out.println("Primero debes crear un perro.");
                    }
                    break;
                case 6: // SALIR
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion del 1 al 6.");
            }
        } while (opcion != 6);
        System.out.println("Vaya!! vamos a descansar todos, nos vemos pronto!!");
        scn.close();
    }

    public static int menu() {
        System.out.println("1. Crear un perro");
        System.out.println("2. Dar de comer al perro");
        System.out.println("3. Jugar con el perro");
        System.out.println("4. Mostrar el nivel de Energia");
        System.out.println("5. Mostrar nivel de Hambre");
        System.out.println("6. Salir");

        Scanner scn = new Scanner(System.in);
        int opcion = scn.nextInt();
        return opcion;
    }
}
