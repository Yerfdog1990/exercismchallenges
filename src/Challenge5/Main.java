package Challenge5;

public class Main {
    public static void main(String[] args) {
        CalculatorConundrum CalculatorConundrum = new CalculatorConundrum();
        try{
            System.out.println(CalculatorConundrum.calculate(10, 1, "+"));
            System.out.println(CalculatorConundrum.calculate(10, 2, "*"));
            System.out.println(CalculatorConundrum.calculate(10, 5, "/"));
            System.out.println(CalculatorConundrum.calculate(10, 6, "-"));
        }catch (IllegalOperationException e){
            System.err.println(e.getMessage());
        }
        try{
            CalculatorConundrum.calculate(15, 0, "/");
        }catch (IllegalOperationException e){
            System.err.println(e.getMessage());
        }
        try{
            CalculatorConundrum.calculate(10, 2, null);
        }catch (IllegalArgumentException | IllegalOperationException e){
            System.err.println(e.getMessage());
        }
        try{
            CalculatorConundrum.calculate(20, 5, "");
        }catch (IllegalArgumentException | IllegalOperationException e){
            System.err.println(e.getMessage());
        }
    }
}
