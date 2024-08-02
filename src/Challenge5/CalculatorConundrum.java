package Challenge5;

public class CalculatorConundrum implements Instructions{
    @Override
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        int result;
        switch(operation){
            case "+":
               result = operand1 + operand2;
               break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                try{
                    result = operand1 / operand2;
                }catch (ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                break;
            default:
                throw new IllegalOperationException("Operation '" +operation+ "' does not exist.");
        }
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}
