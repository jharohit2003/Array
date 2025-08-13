package Array;

public class Max {
    static int max(int arr[] , int index){
   if(index >= arr.length){
    return Integer.MIN_VALUE;
   }
   int max = max(arr,index+1);// mutable ++ and immutable +1
   if(max <=arr[index]){
    max = arr[index];

   }
   return max;

    }
    static int min(int arr[] , int index){
   if(index >= arr.length){
    int min =Integer.MAX_VALUE;
    return min;
   }
   int min = min(arr,index+1);
   if(min >= arr[index]){
    min = arr[index];

   }
   return min;

    }
    public static void main(String[] args) {
         int arr[] = {90,100,8,50,88,66,200};
         System.out.println("Max is "+ max(arr,0));
         System.out.println("Min is "+ min(arr,0));
    }
}
