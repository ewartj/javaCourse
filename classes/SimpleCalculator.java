public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        // write your code here
        this.firstNumber = firstNumber;
    }
    public double getFirstNumber() {
        // write your code here
        return this.firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        // write your code here
        this.secondNumber = secondNumber;
    }
    public double getSecondNumber() {
        // write your code here
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return  this.getFirstNumber() + this.getSecondNumber();
    }
    public double getSubtractionResult(){
        return  this.getFirstNumber() - this.getSecondNumber();
    }
    public double getMultiplicationResult(){
        return  this.getFirstNumber() * this.getSecondNumber();
    }
    public double getDivisionResult(){
        if (this.getSecondNumber() == 0) {
            return 0;
        }else {
            return this.getFirstNumber() / this.getSecondNumber();
        }
    }
}