//Code for (b) Create U2SpyPlaneas a subclass of Plane Class
package cheche.may25attendance;

public class U2SpyPlane extends Plane {
    //property wingsSpan
    private double wingsSpan; 

    //getter and setter methods for wingsSpan
    public double getWingsSpan() {
        return wingsSpan;
    }

    public void setWingsSpan(double wingsSpan) {
        this.wingsSpan = wingsSpan;
    }
    
    
    //overriding
    @Override
    void fly() {
        System.out.println("Weeee! The U2 Spy Plane is flying");
    }
}
