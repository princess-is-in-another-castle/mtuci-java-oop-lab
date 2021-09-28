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

    public Point3d() {
        // Вызовите конструктор с тремя параметрами и определите источник.
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
     * Сравнивает объект с другим
     *
     * @param object
     * @return
     */
    public boolean isEquals(Point3d object) {
        return this.getX() == object.getX() &&
                this.getY() == object.getY() &&
                this.getZ() == object.getZ();
    }

    /**
     *
     * @param object
     * @return
     */
    public double distanceTo(Point3d object) {
        return Math.sqrt(Math.pow(xCoord - object.getX(), 2) +
                Math.pow(yCoord - object.getY(), 2) +
                Math.pow(zCoord - object.getZ(), 2));
    }
}
