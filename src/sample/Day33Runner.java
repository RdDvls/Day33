package sample;

/**
 * Created by RdDvls on 9/22/16.
 */
public class Day33Runner {
    public static void main(String[] args) {

    }

    public boolean closeFar(int a, int b, int c) {
        int aDifferenceB = Math.abs(a - b);
        int aDifferenceC = Math.abs(a - c);
        int bDifferenceC = Math.abs(b - c);
        boolean resultCloseFar = false;

        if (aDifferenceB < 2 || aDifferenceC < 2) {
            if (aDifferenceB >= 2 && bDifferenceC >= 2) {
                resultCloseFar = true;
            } else if (aDifferenceC >= 2 && bDifferenceC >= 2) {
                resultCloseFar = true;
            }
        }

        return resultCloseFar;
    }

    public int luckySum(int a, int b, int c) {
        int myA = 0;
        int myB = 0;
        int myC = 0;

        if (a != 13) {
            myA = a;
            if (b != 13) {
                myB = b;
                if (c != 13) {
                    myC = c;
                }
            }
        }
        int resultLuckySum = myA + myB + myC;
        return resultLuckySum;
    }
}
