public class ElonsToyCar {
    private int distance; // Distance parcourue
    private int battery = 100; // Charge de la batterie

   public static ElonsToyCar buy() {
        return new ElonsToyCar(); // Appel du constructeur
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        return (this.battery >= 1) ? "Battery at " + this.battery + "%" : "Battery empty";
    }

    public void drive() {
        if (this.battery > 0) {
            this.distance += 20;
            this.battery--;
        }
    }

}
