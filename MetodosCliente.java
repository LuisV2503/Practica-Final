import java.util.LinkedList;
import java.util.Scanner;

public class MetodosCliente {
    Scanner sc = new Scanner(System.in);

    public LinkedList<Cliente> CrearCliente(LinkedList<Cliente> l, Scanner sc) {

        boolean ContinuarRegistro = true;
        while (ContinuarRegistro) {
            Cliente o = new Cliente();
            System.out.println("Ingrese el nombre dle cliente");
            o.setNombre(sc.next());
            System.out.println("Ingrese el apellido del cliente");
            o.setApellido(sc.next());
            System.out.println("Ingrese la cedula del cliente");
            o.setCedula(sc.next());
            System.out.println("Ingrese el numero telefonico del cliente");
            o.setTelefono(sc.next());
            System.out.println("Ingrese la direccion del cliente");
            o.setDireccion(sc.next());
            System.out.println("Ingrese el numero de la licencia de conducir del cliente");
            o.setLicenciaConduccion(sc.next());

            l.add(o);

            System.out.println("Desea registrar un nuevo cliente? \n1. SI \n2. NO");
        }

        return l;
    }
}
