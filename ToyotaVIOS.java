//Code for (a) Create ToyotaVIOS as a subclass of Car Class
package cheche.may25attendance;

/**
 *
 * @author Cheche
 */
public class ToyotaVIOS extends Car {
    //property tireType
    private String tireType;

    //getter and setter methods for tireType
    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }
  
    //overriding
    @Override
    void drive() {
        System.out.println("Vroom! The Toyota VIOS is moving.");
    }
    
}
