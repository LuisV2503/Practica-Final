import java.util.LinkedList;
import java.util.Scanner;

public class MenuCliente {

    Scanner sc = new Scanner(System.in);

    public void MenuClientes() {

        boolean continuar = true;
        MetodosCliente m = new MetodosCliente();
        LinkedList<Cliente> l = new LinkedList<>();

        while (continuar) {
            System.out.println(
                    "Que desea hacer? \n1. Registrar Cliente\n2. Modificar Cliente \n3. Modificar Cliente \n4. Buscar Cliente \n5. Volver al Menú Principal");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    m.CrearCliente(l);
                    break;
                case 2:
                    System.out.println("Ingrese la Cédula del cliente que desea modificar");
                    String Cedula = sc.next();
                    m.ModificarCliente(l, Cedula);
                    break;
                case 3:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 4:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println(" Elija un numero entre 1 y 5 dependiendo de lo que desee hacer");
                    int contador = 0;
                    contador++;
                    if (contador > 3) {
                        System.out.println(
                                "Intentelo mas tarde, si el problema persiste ponganse en contacto con soporte");
                        continuar = false;
                    }
                    break;
            }
        }
    }
}