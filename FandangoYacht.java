//Code for (c) create FandangoYacht as subclass of Boat
package cheche.may25attendance;

/**
 *
 * @author Cheche
 */
public class FandangoYacht extends Boat{
    //property mainSailColor
    private String mainSailColor;

    //getter and setter methods for mainSailColor
    public String getMainSailColor() {
        return mainSailColor;
    }

    public void setMainSailColor(String mainSailColor) {
        this.mainSailColor = mainSailColor;
    }
    
    //overriding
    @Override
    void floaT() {
        System.out.println("Booong. The Fandango Yacht is floating.");
    }
    
}
