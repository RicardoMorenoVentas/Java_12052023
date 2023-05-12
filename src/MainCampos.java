import com.softtek.modelo.Campos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainCampos {
    public static void main(String[] args) {
        Campos campo = new Campos(23);
        campo.incrementar_x();
        System.out.println(campo.getX());
    }
}