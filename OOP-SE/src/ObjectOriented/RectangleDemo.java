package ObjectOriented;
public class RectangleDemo {
    public static void main(String [] args){
        //Class Instantiation
        Rectangle r1 = new Rectangle ();
        Rectangle r2 = new Rectangle (5.0);
        Rectangle r3 = new Rectangle (5.0,6.0);  
        
        r1.displayArea();
//        double area = r1.display_Area();
//        System.out.println(area);
        r1.display_Area();
        r2.displayArea();
        r2.display_Area();
        r3.displayArea();
        r3.display_Area();
    }
}
