package Challenge2;

public class AnnalynsInfiltration {
    //Method to check if a fast attack can be made
    public static boolean canFastAttack(boolean knightIsAwake) {
        //A fast attack can be made if the knight is sleeping.
        return !knightIsAwake;
    }
    //Method to check if the group can be spied upon
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //The group can be spied upon if at least one of them is awake.
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    //Method to check if the prisoner can be signalled
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        //The prisoner can be signalled using bird sounds if the prisoner is awake and the archer is sleeping
        return !archerIsAwake && prisonerIsAwake;
    }
    //Method to check if the prisoner can be freed
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        // The prisoner can be freed if the prisoner is awake and the dog is present, regardless of other conditions
        if (petDogIsPresent) {
            return !archerIsAwake;
        } else {
            // Alternatively, if the dog is not present, the prisoner can be freed if the knight and archer are both not awake
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }
}
