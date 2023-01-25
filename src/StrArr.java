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