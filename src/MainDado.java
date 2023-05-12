import com.softtek.modelo.Dado;

import java.util.Scanner;

public class MainDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String introducido = "";
        String salida = "";
        Dado dado = new Dado();

        do {
            int sol = dado.lanzarDado();
            switch (sol){
                case 1:
                    salida = "\n" + "\t" + "*" + "\t" + "\n" + "\n";
                    break;
                case 2:
                    salida = "\n" + "*" + "\t" + "*" + "\n" + "\n";
                    break;
                case 3:
                    salida = "\n" + "*" + "\t" + "*" + "\t" + "*" + "\n" + "\n";
                    break;
                case 4:
                    salida = "*" + "\t" + "\t" + "*" + "\n" + "\n" + "*" + "\t" + "\t" + "*";
                    break;
                case 5:
                    salida = "*" + "\t" + "\t" + "*" + "\n" + "\t" + "*" + "\t" + "\n" + "*" + "\t" + "\t" + "*";
                    break;
                case 6:
                    salida = "*" + "\t" + "*" + "\t" + "*" + "\n" + "\n" + "*" + "\t" + "*" + "\t" + "*" + "\n";
                    break;
                default:
                    salida = "Error";
            }
            System.out.println(salida);
            System.out.println();
            System.out.println("¿Desea continuar? S/N");
            introducido = sc.nextLine();
        } while (introducido.charAt(0) != 'N');
    }
}
