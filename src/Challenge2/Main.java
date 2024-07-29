package Challenge2;

public class Main {
    public static void main(String[] args) {
        AnnalynsInfiltration infiltration = new AnnalynsInfiltration();
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;

        // Test canFastAttack method
        System.out.println(AnnalynsInfiltration.canFastAttack(knightIsAwake)); // Expected: true

        // Test canSpy method
        System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)); // Expected: true

        // Test canSignalPrisoner method
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake)); // Expected: false

        // Test canFreePrisoner method
        System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)); // Expected: false
    }
}
