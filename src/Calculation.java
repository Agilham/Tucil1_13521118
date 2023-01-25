public class Calculation {
    
    // Menghitung Ekspresi
    public static double calc(double ope1, double ope2, String opr) {
        if (opr == "+") {
            return ope1+ope2;
        }
        if (opr == "-") {
            return ope1-ope2;
        }
        if (opr == "*") {
            return ope1*ope2;
        }
        if (opr == "/") {
            if (ope2 != 0) {
                return ope1/ope2;
            }
            else {
                return 0.0d;
            }
        }
        else {
            return 0.0d;
        }
    }
    // Bentuk ((a op b) op c) op d
    public static double form1(NumArr numArr, StrArr oprArr) {
        double a = calc(numArr.Arr[0], numArr.Arr[1], oprArr.Arr[0]);
        double b = calc(a, numArr.Arr[2], oprArr.Arr[1]);
        double res = calc(b, numArr.Arr[3], oprArr.Arr[2]);
        return res;
    }
    // Bentuk (a op (b op c)) op d
    public static double form2(NumArr numArr, StrArr oprArr) {
        double a = calc(numArr.Arr[1], numArr.Arr[2], oprArr.Arr[1]);
        double b = calc(numArr.Arr[0], a, oprArr.Arr[0]);
        double res = calc(b, numArr.Arr[3], oprArr.Arr[2]);
        return res;
    }
    // Bentuk a op ((b op c) op d)
    public static double form3(NumArr numArr, StrArr oprArr) {
        double a = calc(numArr.Arr[1], numArr.Arr[2], oprArr.Arr[1]);
        double b = calc(a, numArr.Arr[3], oprArr.Arr[2]);
        double res = calc(numArr.Arr[0], b, oprArr.Arr[0]);
        return res;
    }
    // Bentuk a op (b op (c op d))
    public static double form4(NumArr numArr, StrArr oprArr) {
        double a = calc(numArr.Arr[2], numArr.Arr[3], oprArr.Arr[2]);
        double b = calc(numArr.Arr[1], a, oprArr.Arr[1]);
        double res = calc(numArr.Arr[0], b, oprArr.Arr[0]);
        return res;
    }
    // Bentuk (a op b) op (c op d)
    public static double form5(NumArr numArr, StrArr oprArr) {
        double a = calc(numArr.Arr[0], numArr.Arr[1], oprArr.Arr[0]);
        double b = calc(numArr.Arr[2], numArr.Arr[3], oprArr.Arr[2]);
        double res = calc(a, b, oprArr.Arr[1]);
        return res;
    }

}