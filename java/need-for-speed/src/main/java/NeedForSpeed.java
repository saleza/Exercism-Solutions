class NeedForSpeed {
    private int speed;
    private int battery = 100;
    private int batteryDrain;
    private int distance;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryDrain > this.battery;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery > 0) {
        this.distance += this.speed;
        this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < this.distance && !car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= this.distance;
    }
}
