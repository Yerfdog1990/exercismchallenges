package Challenge1;

public class Lasagna {
    //Define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    //Define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;
    }
    //Define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayers) {
        return 2 * numOfLayers;
    }
    //Define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int timeInOven) {
        return preparationTimeInMinutes(numOfLayers) + timeInOven;
    }
}
