package Array;
import java.util.Arrays;

public class SearchOccur {
    static int[] count(int [] arr , int i , int val, int cnt){
        if(i>=arr.length){
            int [] res = new int[cnt];
            return res;
        }
         if(arr[i]==val){
            cnt++;
        }
        int [] res = count(arr,i+1,val ,cnt);
           if(arr[i]==val){
            res[cnt-1]=i;
           }
        return res;
    
    }
    
    static int[] searchOccur(int arr[] , int i,int val){
      
      return count(arr, i, val, 0);
    }
    public static void main(String[] args) {
        int arr[] ={10,20,90,10,100,10,77,10,66};
        int result [] =searchOccur(arr,0,10);


        System.out.println(Arrays.toString(result));
    }
}
