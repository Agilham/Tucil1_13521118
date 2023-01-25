public class Permutation {
    
    public static void perm(int n, NumArr numArr, StrArr oprArr, char delimiter) {
        StrArr curOpr = new StrArr(3);
        if (n == 1) {
            // NumArr.printNumArr(numArr);
            for (int i = 0; i < oprArr.len; i++) {
                for (int j = 0; j < oprArr.len; j++) {
                    for (int k = 0; k < oprArr.len; k++) {
                        curOpr.Arr[0] = oprArr.Arr[i];
                        curOpr.Arr[1] = oprArr.Arr[j];
                        curOpr.Arr[2] = oprArr.Arr[k];
                        int a = (int) numArr.Arr[0];
                        String op1 = curOpr.Arr[0];
                        int b = (int) numArr.Arr[1];
                        String op2 = curOpr.Arr[1];
                        int c = (int) numArr.Arr[2];
                        String op3 = curOpr.Arr[2];
                        int d = (int) numArr.Arr[3];
                        double res1 = Calculation.form1(numArr, curOpr);
                        if (res1 == 24) {
                            String str1 = "(("+a+op1+b+")"+op2+c+")"+op3+d;
                            System.out.println(str1);
                            // StrArr.addElmt()
                        }
                        double res2 = Calculation.form2(numArr, curOpr);
                        if (res2 == 24) {
                            String str2 = "("+a+op1+"("+b+op2+c+"))"+op3+d;
                            System.out.println(str2);
                        }
                        double res3 = Calculation.form3(numArr, curOpr);
                        if (res3 == 24) {
                            String str2 = a+op1+"(("+b+op2+c+")"+op3+d+")";
                            System.out.println(str2);
                        }
                        double res4 = Calculation.form4(numArr, curOpr);
                        if (res4 == 24) {
                            String str2 = a+op1+"("+b+op2+"("+c+op3+d+"))";
                            System.out.println(str2);
                        }
                        double res5 = Calculation.form5(numArr, curOpr);
                        if (res5 == 24) {
                            String str2 = "("+a+op1+b+")"+op2+"("+c+op3+d+")";
                            System.out.println(str2);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                perm(n - 1, numArr, oprArr, delimiter);
                if (n % 2 == 0) {
                    swap(numArr, i, n - 1);
                } else {
                    swap(numArr, 0, n - 1);
                }
            }
            perm(n - 1, numArr, oprArr, delimiter);
        }
    }

    private static void swap(NumArr array, int a, int b) {
        double tmp = array.Arr[a];
        array.Arr[a] = array.Arr[b];
        array.Arr[b] = tmp;
    }

}
