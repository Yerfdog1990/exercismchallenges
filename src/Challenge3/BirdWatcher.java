package Challenge3;

public class BirdWatcher implements Instructions{
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    //Method to check what the counts were last week
    @Override
    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }
    //Method to check how many birds visited today
    @Override
    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }
    //Method to perform increment of today's count
    @Override
    public int incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
        return birdsPerDay[birdsPerDay.length-1];
    }
    //Method to check if there was a day with no visiting birds
    @Override
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if(count == 0){
                return true;
            }
        }
        return false;
    }
    //Method to calculate the number of visiting birds for the first number of days
    @Override
    public int getCountForFirstDays(int sumOfBirds) {
        if(sumOfBirds > birdsPerDay.length) {
            throw new IllegalArgumentException("Argument cannot be greater than number of days.");
        }
        int sum = 0;
        for (int i = 0; i < sumOfBirds; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }
    //Method to calculate the number of busy days
    @Override
    public int getBusyDays() {
        int busyDaysCount = 0;
        for (int count : birdsPerDay) {
            if(count >= 5){
                busyDaysCount++;
            }
        }
        return busyDaysCount;
    }
}
