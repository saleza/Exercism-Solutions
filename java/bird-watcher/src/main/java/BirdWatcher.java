
class BirdWatcher {
    private final int[] birdsPerDay;
    private int todayCount;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeekCount = new int[] {0, 2, 5, 3, 7, 8, 4};
        return lastWeekCount;
    }

    public int getToday() {
        this.todayCount += this.birdsPerDay[birdsPerDay.length - 1];
        return todayCount;
    }

    public void incrementTodaysCount() {
        this.todayCount++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < 7; i++) {
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }
}
