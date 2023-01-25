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

    // public double getArrElmt(NumArr array, Integer idx) {
    //     return this.Arr[idx];
    // }

    // public static void readArr(Array array, int len) {

    //     Scanner scanner = new Scanner(System.in);
    //     array.setLen(len);

    //     System.out.println("\nMasukkan nilai xk:");
    //     String stringElmt = scanner.nextLine();
        
    //     String[] splitElmt = stringElmt.split("\\s+");
    //     double[] doubleElmt = Arrays.stream(splitElmt).mapToDouble(Double::parseDouble).toArray();
    
    //     for (int i = 0; i < len; i++) {
    //         array.Arr[i] = doubleElmt[i];
    //     }
        
    // }

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