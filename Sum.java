package Array;

public class Sum {
    static int sum(int [] arr , int i){
        if(i>=arr.length){
          return 0;
        }
        int sum = sum(arr,i+1);
        sum += arr[i];
        return sum;
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        System.out.println(sum(arr,0));
    }
}
