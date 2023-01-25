import java.util.Scanner;
import java.util.Arrays;

public class NumArr {
    
    double[] Arr = new double[100];
    int len;

    NumArr(int len) {
        this.len = len;
    }

    public int getLen() {
        return this.len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public static void printNumArr(NumArr array) {

        System.out.print("[");
        for (int i = 0; i < array.len; i++) {
            System.out.print(array.Arr[i]);
            if (i < array.len-1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }

}