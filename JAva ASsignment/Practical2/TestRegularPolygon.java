package Practical2;

public class TestRegularPolygon {
    public static void main(String[] args) {
        
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(4, 15);
        RegularPolygon p3 = new RegularPolygon(20, 47, 6, 9);
        
        System.out.println("Polygon 1");
        p1.print();
        System.out.println("Polygon 2");
        p2.print();
        System.out.println("Polygon 3");
        p3.print();
        System.out.println("21ce047 - Akshit Joshi");
        
    }

}