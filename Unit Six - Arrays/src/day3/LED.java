package day3;


    public class LED{

        // Constants
        public static final String[] AVAILABLE_COLOURS = {"RED", "GREEN", "BLUE", "YELLOW"};
    
        // Attributes
        private boolean isOn;
        private String colour;
    
        // Constructor
        public LED(String colour) {
            if (isValidColour(colour)) {
                this.colour = colour;
            } else {
                throw new IllegalArgumentException("Invalid colour. Valid colours are: RED, GREEN, BLUE, YELLOW.");
            }
            this.isOn = false;
        }
    
        // Getters
        public boolean isOn() {
            return isOn;
        }
    
        public String getColour() {
            return colour;
        }
    
        // Setters
        public void setOn(boolean isOn) {
            this.isOn = isOn;
        }
    
        public void setColour(String colour) {
            if (isValidColour(colour)) {
                this.colour = colour;
            } else {
                throw new IllegalArgumentException("Invalid colour. Valid colours are: RED, GREEN, BLUE, YELLOW.");
            }
        }
    
        // Method to display the colour of the light if it is on
        public String display() {
            if (isOn) {
                if (colour.equals("RED")) {
                    return "R";
                } else if (colour.equals("GREEN")) {
                    return "G";
                } else if (colour.equals("BLUE")) {
                    return "B";
                } else if (colour.equals("YELLOW")) {
                    return "Y";
                } else {
                    return ""; // This should not happen
                }
            } else {
                return "";
            }
        }
    
        // Helper method to validate the colour
        private boolean isValidColour(String colour) {
            for (String validColour : AVAILABLE_COLOURS) {
                if (validColour.equalsIgnoreCase(colour)) {
                    return true;
                }
            }
            return false;
        }
    
        // Main method for testing
        public static void main(String[] args) {
            LED led = new LED("RED");
            System.out.println("LED is on: " + led.isOn());
            System.out.println("LED colour: " + led.getColour());
            System.out.println("Display: " + led.display());
    
            led.setOn(true);
            System.out.println("LED is on: " + led.isOn());
            System.out.println("Display: " + led.display());
    
            led.setColour("GREEN");
            System.out.println("LED colour: " + led.getColour());
            System.out.println("Display: " + led.display());
        }
    }
    
    
    


