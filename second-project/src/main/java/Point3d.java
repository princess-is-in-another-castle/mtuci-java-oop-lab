import java.text.DecimalFormat;

/**
 * Трёхмерный класс точки
 **/
public class Point3d {
    /**
     * координата X
     **/
    private double xCoord;
    /**
     * координата Y
     **/
    private double yCoord;
    /**
     * координата Z
     */
    private double zCoord;

    /**
     * Конструктор инициализации
     **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /**
     * Конструктом задаёт по умолчанию нулевые значения, если не передаю никакие аргументы.
     */
    public Point3d() {
        this(0, 0, 0);
    }

    /**
     * Возвращение координаты X
     **/
    public double getX() {
        return xCoord;
    }

    /**
     * Возвращение координаты Y
     **/
    public double getY() {
        return yCoord;
    }

    /**
     * Возвращение координаты Z
     */
    public double getZ() {
        return zCoord;
    }

    /**
     * Установка значения координаты X.
     **/
    public void setX(double val) {
        xCoord = val;
    }

    /**
     * Установка значения координаты Y.
     **/
    public void setY(double val) {
        yCoord = val;
    }

    /**
     * Установка значения координаты Z.
     */
    public void setZ(double val) {
        zCoord = val;
    }

    /**
     * Сравнивает объект с другим.
     *
     * @param object
     * @return
     */
    public boolean isEqual(Point3d object) {
        return this.getX() == object.getX() &&
                this.getY() == object.getY() &&
                this.getZ() == object.getZ();
    }

    /**
     * Высчитывает растояние между двумя точками и возвращает дистанцию.
     *
     * @param object
     * @return
     */
    public double distanceTo(Point3d object) {
        double distance = Math.sqrt(Math.pow(xCoord - object.getX(), 2) +
                Math.pow(yCoord - object.getY(), 2) +
                Math.pow(zCoord - object.getZ(), 2));
        return roundNumbers(distance);
    }

    /**
     * Округляет Double числа до двух знаков после точки.
     *
     * @param number
     * @return
     */
    public static double roundNumbers(double number) {
        DecimalFormat df = new DecimalFormat("##.##");
        String finalValue = df.format(number).replace(',', '.');
        return Double.parseDouble(finalValue);
    }

}
