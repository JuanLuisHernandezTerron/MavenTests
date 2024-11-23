import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Integer select = 0;
    public static Integer Contador = 0;
    public static ArrayList<Contacto> arrayContactos = new ArrayList<Contacto>();
    public static Scanner lectura = new Scanner (System.in);

    public static void setLectura(Scanner scanner) {
        lectura = scanner; // Permite inyectar un Scanner en los tests
    }
    public static void main(String[] args) {
        while ( select != 4){
            System.out.println("1.Agregar Contacto \n 2.Buscar Contacto \n 3.Eliminar Contacto \n 4.Salir");
            select = lectura.nextInt();
            lectura.nextLine();
            switch (select){
                case 1:
                    addContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    deleteContact();
                    break;
            }

        }
    }
    public static void addContact(){
        System.out.print("Nombre: ");
        String nombre = lectura.nextLine();
        System.out.print("Email: ");
        String email = lectura.nextLine();
        System.out.print("Edad: ");
        Integer edad = lectura.nextInt();
        Contador++;
        Contacto contact = new Contacto(Contador,nombre,email,edad);
        arrayContactos.add(contact);
    }

    public static void searchContact(){
        System.out.print("Nombre: ");
        String nombre = lectura.nextLine();
        System.out.print("Email: ");
        String email = lectura.nextLine();
        System.out.print("Edad: ");
        Integer edad = lectura.nextInt();
        Contador++;
        Contacto contact = new Contacto(Contador,nombre,email,edad);
        arrayContactos.add(contact);
    }

    public static void deleteContact(){
        System.out.print("Introduce el correo electrónico para eliminar el contacto: ");
        String correoDelete = lectura.nextLine();
        arrayContactos.removeIf(contacto -> contacto.getEmail().equals(correoDelete));
    }
}
