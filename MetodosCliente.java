import java.util.LinkedList;
import java.util.Scanner;

public class MetodosCliente {
    Scanner sc = new Scanner(System.in);

    public LinkedList<Cliente> CrearCliente(LinkedList<Cliente> l) {

        boolean ContinuarRegistro = true;
        while (ContinuarRegistro) {
            Cliente o = new Cliente();
            System.out.println("Ingrese el nombre del cliente");
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

            System.out.println("Cliente registrado correctamente");
            ContinuarRegistro = false;
        }

        return l;
    }

    public LinkedList<Cliente> ModificarCliente(LinkedList<Cliente> l, String Cedula) {
        Cliente no = new Cliente();
        for (Cliente o : l) {
            if (o.getCedula().equalsIgnoreCase(Cedula)) {

                no.setNombre(o.getNombre());
                no.setApellido(o.getApellido());
                no.setDireccion(o.getDireccion());
                no.setTelefono(o.getTelefono());
                no.setLicenciaConduccion(o.getLicenciaConduccion());

                boolean Continuar = true;
                while (Continuar) {
                    System.out.println("Ingrese el dato que desea modificar o regrese al Menu Cliente");
                    System.out.println(
                            "1. Para Nombre \n2. Para Apellido \n3. Para telefono \n4. Para Dirección \n5. Para Licencia de Conduccion \n6. Para volver al Menu Cliente");
                    int opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre");
                            no.setNombre(sc.next());
                            System.out.println("Nombre modificado correctamente");
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo apellido");
                            no.setApellido(sc.next());
                            System.out.println("Apellido modificado correctamente");
                            break;
                        case 3:
                            System.out.println("Ingrese el nuevo telefono");
                            no.setTelefono(sc.next());
                            System.out.println("Teléfono modificado correctamente");
                            break;
                        case 4:
                            System.out.println("Ingrese la nueva dirección");
                            no.setDireccion(sc.next());
                            System.out.println("Dirección modificada correctamente");
                            break;
                        case 5:
                            System.out.println("Ingrese la nueva licencia de coducción");
                            no.setDireccion(sc.next());
                            System.out.println("Licencia modificada correctamente");
                            break;
                        case 6:
                            Continuar = false;
                            break;

                        default:
                            System.out.println("Ingrese una opción valida");
                            int contador = 0;
                            contador++;
                            if (contador > 3) {
                                System.out.println(
                                        "Intentelo mas tarde, si el problema persiste ponganse en contacto con soporte");
                                contador = 0;
                                Continuar = false;
                            }
                            break;
                    }
                }
                //Si la cedula ingresada no se encuentra en la lista
            } else {
                System.out.println("--------------------");
                System.out.println("Cedula no encontrada");
                System.out.println("--------------------");
            }
            // agrega el nuevo objeto modificado a la lista en la posicion del anterior
            l.set(l.indexOf(o), no);
        }
        return l;
    }

    
}
