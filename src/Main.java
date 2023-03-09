public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(2, 1);
        Point p2 = new Point(6, 4);
      //  p2 = new Point(8, 5);
        p2.setX(8);
        p2.setY(5);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        double euclidean = getEuclidean(p1, p2);
        System.out.println(euclidean);


        Time hm = new Time("24:40") ;
        hm.convert();
    }

    private static double getEuclidean(Point p1, Point p2) {
        double a = Math.pow(p1.getX() - p2.getX(), 2);
        double b = Math.pow(p1.getX() - p2.getX(), 2);

        return Math.sqrt(a + b);
    } // SORU 1





}
