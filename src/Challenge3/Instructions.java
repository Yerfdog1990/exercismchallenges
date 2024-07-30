package Challenge3;
/*
Instructions
You're an avid bird watcher who keeps track of how many birds have visited your garden in the last seven days.
You have six tasks, all dealing with the numbers of birds that visited your garden.
1. Check what the counts were last week
    -For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek() method that returns last week's counts:
2. Check how many birds visited today
    -Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are ordered by day, with the first element being the count of the oldest day, and the last element being today's count.
3. Increment today's count
    -Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:
4. Check if there was a day with no visiting birds
    -Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited the garden; otherwise, return false:
5. Calculate the number of visiting birds for the first number of days
    -Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden from the start of the week, but limit the count to the specified number of days from the beginning of the week.
6. Calculate the number of busy days
    -Some days are busier than others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() method to return the number of busy days:
 */
public interface Instructions {
    //Method to check what the counts were last week
    int[] getLastWeek();
    //Method to check how many birds visited today
    int getToday();
    //Method to perform increment of today's count
    int incrementTodaysCount();
    //Method to check if there was a day with no visiting birds
    boolean hasDayWithoutBirds();
    //Method to calculate the number of visiting birds for the first number of days
    int getCountForFirstDays(int sumOfBirds);
    //Method to calculate the number of busy days
    int getBusyDays();
}
