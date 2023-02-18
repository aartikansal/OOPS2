public class Fan {

    //State
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    //creation---constructor
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;

    }
    //PRINT THE STATE
    public String toString(){
       return String.format( "make - %s, radius- %f, color- %s, isOn- %b,speed-%d,",
               make, radius, color, isOn, speed);
    }

}
