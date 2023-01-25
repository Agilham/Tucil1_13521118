public class RNG {

    public static double getNumber() {
        int min = 1;
        int max = 13;
        int i = (int)Math.floor(Math.random() * (max - min + 1) + min);
        double num = Double.valueOf(i);
        return num;
    }

    public static NumArr getNumArr() {
        NumArr numArr = new NumArr(4);
        for (int i = 0; i < 4; i++) {
            double num = getNumber();
            numArr.Arr[i] = num;
        }
        return numArr;
    }

}