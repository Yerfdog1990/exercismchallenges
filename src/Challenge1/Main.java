package Challenge1;

public class Main {
    //Main method
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Expected time in oven: " +lasagna.expectedMinutesInOven()+ " minutes.");
        System.out.println("Time remaining in oven: "+lasagna.remainingMinutesInOven(30));
        System.out.println("Preparation time: " +lasagna.preparationTimeInMinutes(2));
        System.out.println("Total cooking time: " +lasagna.totalTimeInMinutes(3, 20));

    }
}

