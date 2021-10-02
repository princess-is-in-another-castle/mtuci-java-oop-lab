import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты первой точки через пробел: ");
        Point3d firstPoint = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.print("Введите координаты второй точки через пробел: ");
        Point3d secondPoint = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.print("Введите координаты третьей точки через пробел: ");
        Point3d thirdPoint = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());

        try {
            System.out.println("Площадь треугольника: " + computeArea(firstPoint, secondPoint, thirdPoint));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Высчитывает площадь треугольника.
     * @param firstDot
     * @param secondDot
     * @param thirdDot
     * @return
     * @throws Exception
     */
    public static double computeArea(Point3d firstDot, Point3d secondDot, Point3d thirdDot) throws Exception {
        if (firstDot.isEqual(secondDot) || firstDot.isEqual(thirdDot) || thirdDot.isEqual(secondDot)) {
            throw new Exception("Ошибка: точки одинаковы");
        }
        double firstSide = firstDot.distanceTo(secondDot);
        double secondSide = secondDot.distanceTo(thirdDot);
        double thirdSide = thirdDot.distanceTo(firstDot);

        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) *
                (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        if (area == 0.0) {
            throw new Exception("Ошибка: точки лежат на одной линии");
        }
        return Point3d.roundNumbers(area);
    }

}

