public class Triangle {
    private static final double side_a = 3, side_b = 4, y = 60;

    public static void main(String[] args) {
        double area = side_a * side_b * Math.sin(y) / 2.0;
        System.out.println("Area is" + area);
    }
}
