import java.util.Scanner;
import java.util.Arrays;

public class StrArr {
    
    String[] Arr = new String[100];
    int len;

    StrArr(int len) {
        this.len = len;
    }

    public int getLen() {
        return this.len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    // public double getArrElmt(StrArr array, Integer idx) {
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

    public static StrArr addElmt(StrArr array, String x) {
        int n = array.len;
        StrArr newArr = new StrArr(n+1);
        for (int i = 0; i < n; i++)
            newArr.Arr[i] = array.Arr[i];
        newArr.Arr[n] = x;
        return newArr;
    }
    
    public static void printStrArr(StrArr array) {

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