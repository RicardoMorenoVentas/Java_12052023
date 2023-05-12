import com.softtek.modelo.Dado;

import java.util.Scanner;

public class MainDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String introducido = "";
        Dado dado = new Dado();
        do {
            System.out.println(dado.vueltaDado());
            System.out.println("¿Desea continuar? S/N");
            introducido = sc.nextLine();
        } while (introducido.charAt(0) != 'N');
    }
}
