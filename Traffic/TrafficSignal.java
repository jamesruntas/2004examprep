package Traffic;

/** 
 * This class models a simple green-yellow-red traffic signal (also known as a traffic 
 * light or stop light). At any time, exactly one of the signal's three lights is on. 
 */ 
public class TrafficSignal { 
    public static final int GREEN = 0; // Green signal light 
    public static final int YELLOW = 1; // Yellow signal light 
    public static final int RED = 2; // Red signal light 
    /* Records which light is currently on (GREEN, YELLOW, or RED). */ 
    private int light; 
    
    /** 
    * Constructs a new TrafficSignal in which the specified light is on. 
    * @param light The light that is initially on.
    * @throws IllegalArgumentException if light is not GREEN, YELLOW, or RED. 
    */ 
    public TrafficSignal(int light) {
        if(light<GREEN || light>RED){
            throw new IllegalArgumentException();
        }

        this.light = light;
    } 
 
 
    /** 
    * Advance this traffic signal to the next light in the sequence: GREEN to 
    * YELLOW, YELLOW to RED, and RED to GREEN. 
    */ 
    public void advance() {
        if(isRedLight()){
            light = GREEN;
        }
        else{
            light++;
        }
    } 
 
    /** 
    * Is the light green? 
    * @return true if this traffic signal is GREEN and false otherwise. 
    */ 
    public boolean isGreenLight() {
        return this.light==GREEN;
    } 
 
    /** 
    * Is the light yellow? 
    * @return true if this traffic signal is YELLOW and false otherwise. 
    */ 
    public boolean isYellowLight() {
        return this.light==YELLOW;
    } 
 
    /** 
    * Is the light red? 
    * @return true if this traffic signal is RED and false otherwise. 
    */ 
    public boolean isRedLight() {
        return this.light==RED;
    } 
 
    /** 
    * Returns the current TrafficSignal status 
    * @return A string representation of this TrafficSignal, indicating which 
    * light is currently on, in the form, "xxxx light" (where xxxx is one of 
    * "green", "yellow" or "red". 
    */ 
    public String toString() {
        if(isGreenLight()){
            return "green light";
        }
        else if (isRedLight()){
            return "red light";
        }
        else{
            return "yellow light";
        }
    } 


} 
