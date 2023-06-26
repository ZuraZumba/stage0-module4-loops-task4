package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else {
            int countedSum = 0;
            int skippedSum = 0;

            for (int i = 1; i <= lastInRow; i++) {
                if (i % numberToSkip == 0) {
                    skippedSum += i;
                } else {
                    countedSum += i;
                }
            }

            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
    public static void main (String [] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        int numberToSkip = 5;
        int lastInRow = 10;
        twoRangesSum.printSumOfTwoRanges(numberToSkip, lastInRow);
    }
}
