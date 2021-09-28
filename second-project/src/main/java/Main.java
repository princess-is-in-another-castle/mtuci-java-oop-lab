public class Main {
    public static void main(String[] args) {
        Point3d myPoint = new Point3d();//создает точку (0,0)
        Point3d myOtherPoint = new Point3d(5, 3, 1);//создает точку (5,3)
        Point3d aThirdPoint = new Point3d(3, 4, 2);
        System.out.println(myPoint.isEquals(aThirdPoint));
    }
}
