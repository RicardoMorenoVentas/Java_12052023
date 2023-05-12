import com.softtek.modelo.Area;

public class MainAreas {
    public static void main(String[] args) {
        double radioCirculo = 3.34;

        double baseRectangulo = 23;
        double alturaRectangulo = 12;

        System.out.println(Area.calcularAreaCirculo(radioCirculo));
        System.out.println(Area.calcularAreaRectangulo(baseRectangulo, alturaRectangulo));
    }
}
