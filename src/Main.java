public class Main {

    public static void main(String[] args) {

        StrArr oprArr = new StrArr(4);
        oprArr.Arr[0] = "+";
        oprArr.Arr[1] = "-";
        oprArr.Arr[2] = "*";
        oprArr.Arr[3] = "/";

        // NumArr numArr = RNG.getNumArr();
    
        NumArr numArr = new NumArr(4);
        numArr.Arr[0] = 8.0d;
        numArr.Arr[1] = 8.0d;
        numArr.Arr[2] = 8.0d;
        numArr.Arr[3] = 8.0d;


        Permutation.perm(4, numArr, oprArr, ',');

    }

}