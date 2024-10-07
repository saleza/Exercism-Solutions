public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int producedCarsPerHour = 221;
        double productionRatePerHour = 0;
        double calcul = speed * producedCarsPerHour;
        if (speed < 5) {
            productionRatePerHour = calcul;
        }
        else if (speed > 4 && speed < 9) {
            productionRatePerHour = calcul * 0.9;
        }
        else if (speed == 9) {
            productionRatePerHour = calcul * 0.8;
        }
        else if (speed == 10) {
            productionRatePerHour = calcul * 0.77;
        }
        return productionRatePerHour;
    }

    public int workingItemsPerMinute(int speed) {
        double producedCarsPerHour = 221;
        double carsProducedPerMinute = 0;
        if (speed < 5){
            carsProducedPerMinute = ((producedCarsPerHour / 60) * speed);
        }
        else if (speed > 4 && speed < 9) {
            carsProducedPerMinute = ((producedCarsPerHour / 60) * speed) * 0.9;
        }
        else if (speed == 9){
            carsProducedPerMinute = ((producedCarsPerHour / 60) * speed) * 0.8;
        }
        else if (speed == 10){
            carsProducedPerMinute = ((producedCarsPerHour / 60) * speed) * 0.77;
        }
        int value = (int)carsProducedPerMinute;
        return value;
    }
}
