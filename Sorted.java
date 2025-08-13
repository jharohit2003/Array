package Array;

public class Sorted {
    static boolean isSorted (int arr [] , int i){
        // base case
     if(i>=arr.length-1){
         return true;
     }
     // negative case
     if( arr[i+1]<arr[i]){
        return false;
     }
     return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr [] ={10,20,30,40,50};

        System.out.println(isSorted(arr, 0)?"sorted":"not sorted");
    }
}
