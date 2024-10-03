public class Lasagna {
    public int expectedMinutesInOven() {
        int expectedMinutes = 40;
        return expectedMinutes;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven){
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
