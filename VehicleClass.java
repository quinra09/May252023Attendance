//This class is the base class of the code

package cheche.may25attendance;

/**
 *
 * @author Cheche
 */
public class VehicleClass {
    private int speed;
    private String color;
    private int price;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    void STOP() {
        System.out.println("BEEP! The vehicle has stopped moving.");
    }
    
}
