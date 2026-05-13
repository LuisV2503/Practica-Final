import java.util.Scanner;

public class MenuContratos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a Arrendamientos Villalobos");
            System.out.println(
                    "Que desea hacer? \n1. Registrar Contrato\n2. Modificar Contrato \n3. Finalizar Contrato \n4. Buscar Contrato n\5. Volver al Menú");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 2:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 3:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 4:
                    System.out.println("Pagina en mantenimiento");
                    break;
                case 5:
                    continuar = false;
                    int contador = 0;
                    break;

                default: System.out.println(" Elija un numero entre 1 y 5 dependiendo de lo que desee hacer");
                contador = 0;
                contador = contador++;
                if (contador >2) {
                    System.out.println("Deberia considerar tomar un curso de seguimiento de instrucciones");
                }
                    break;
            }
        }
    }
}
