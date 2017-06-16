package ObjectOriented;
public class Rectangle {
    //Attributes*
    double length;
    double width;
    //Constructor*
    Rectangle(){ //no parameter
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
    }        
    Rectangle(double length){
        setLength(length);
        //this.length = length;
        this.width = 0.0;
        System.out.println("Second Constructor Loaded");
    }
    Rectangle(double length,double width){
        this.width = width;
        this.length = length;
        System.out.println("Third Constructor Loaded");
    }
    //Methods
    //getter length
    double getLength(){
        return this.length;
    }
    //getter Width
    double getWidth(){
        return this.width;
    }
    //setter Length
    void setLength(double length){
      this.length = length;   
    }
    //setter Width
    //procedural method displayArea
    void displayArea(){
        double area = this.length * this.width;
        System.out.println(area);
    }
    double display_Area(){
        double area = this.length * this.width;
        return area;
    }
}