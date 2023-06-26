package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith > numberToGoUntil){
            System.out.println("iterating till the end");
            for (int i = 1; i <= numberToGoUntil; i++){
                System.out.println(i);
            }
        }
        else {
            for (int j = 1; j <=numberToGoUntil; j++){
                if (j==toBreakWith+1){
                    break;
                }
                System.out.println(j);
            }
        }

    }
    public static void main (String [] args) {
        NumberToBreakOn numberToBreakOn = new NumberToBreakOn();
        int first = 5;
        int second = 10;
        numberToBreakOn.printNumbersUntilWithBreakOn(first, second);
    }
}
