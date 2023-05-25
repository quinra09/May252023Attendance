//main class of code
package cheche.may25attendance;

/**
 *
 * @author Cheche
 */
public class Main {
    public static void main(String [] args) {
        //Execution for (a)
        ToyotaVIOS vehicle1 = new ToyotaVIOS(); //creating object
        vehicle1.setSpeed(180);
        vehicle1.setColor("RED");
        vehicle1.setPrice(25000);
        vehicle1.setTireType("All-Season Tires");
        System.out.println("Speed in km/h: " + vehicle1.getSpeed());
        System.out.println("Color: " + vehicle1.getColor());
        System.out.println("Price in $: " + vehicle1.getPrice());
        System.out.println("Tire Type: "+ vehicle1.getTireType());
        vehicle1.drive(); //calling drive() method
        vehicle1.STOP(); // calling STOP() method
        System.out.println("");
        
        //Execution for (b)
        U2SpyPlane vehicle2 = new U2SpyPlane(); //creating object
        vehicle2.setSpeed(1500);
        vehicle2.setColor("WHITE");
        vehicle2.setPrice(100000000);
        vehicle2.setWingsSpan(32.8);
        System.out.println("Speed in km/h: " + vehicle2.getSpeed());
        System.out.println("Color: " + vehicle2.getColor());
        System.out.println("Price in $: " + vehicle2.getPrice());
        System.out.println("Wings Span: " + vehicle2.getWingsSpan());
        vehicle2.fly(); //calling fly() method
        vehicle2.STOP(); //calling STOP() method
        System.out.println("");
        
        //Execution for (c)
        FandangoYacht vehicle3 = new FandangoYacht(); //creating object
        vehicle3.setSpeed(56);
        vehicle3.setColor("White");
        vehicle3.setPrice(560000);
        vehicle3.setMainSailColor("RED");
        System.out.println("Speed in km/h: " + vehicle3.getSpeed());
        System.out.println("Color: " + vehicle3.getColor());
        System.out.println("Price in $: " + vehicle3.getPrice());
        System.out.println("Main Sail Color: " + vehicle3.getMainSailColor());
        vehicle3.floaT(); //calling floaT() method
        vehicle3.STOP(); // calling STOP() method
        System.out.println("");
    }
    
}
