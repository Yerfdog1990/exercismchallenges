package Challenge3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 8 };
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);
        System.out.println("The bird's count last week: " + Arrays.toString(birdWatcher.getLastWeek()));
        System.out.println("Number of birds that visited today: " +birdWatcher.getToday());
        System.out.println("Increment today's count: " +birdWatcher.incrementTodaysCount());
        System.out.println("There was a day with no visiting birds? " +birdWatcher.hasDayWithoutBirds());
        System.out.println("Visiting birds for the first four of days: " +birdWatcher.getCountForFirstDays(4));
        System.out.println("Number of busy days: " +birdWatcher.getBusyDays());
    }
}
