import java.util.*;


public class Main {


    static int InputNum(int[] x,int i){
        Scanner IntNum = new Scanner(System.in);
        System.out.print("Enter integer : ");
        x[i] = IntNum.nextInt() ;
        return x[i];
    }

    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);
        System.out.print("Enter number of integers : ");

        int SizeNumber = Number.nextInt();
        int[] arr = new int[SizeNumber];

        for (int j = 0 ;j<SizeNumber;j++){
            arr[j] = InputNum(arr,j);
        }
        Arrays.sort(arr);
        System.out.println("Result");
        for (int k = 0 ;k < SizeNumber;k++){
            System.out.println(arr[k]);
        }


    }
}