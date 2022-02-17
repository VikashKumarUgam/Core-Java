public class AreaCalculator {
    public static double area(double radius){
        return (radius < 0) ? -1.0 : (Math.PI * radius * radius);
    }
    public static double area(double x, double y){
        if (x < 0.0 || y < 0.0)
            return -1;
        else
            return x * y;
    }
}
