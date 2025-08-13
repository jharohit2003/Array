package Array;

public class search {
    static int search1(int [] arr , int i , int value){
        if(i>=arr.length){
           return -1;
        }
        int s = search1(arr,i+1,value);
        if(value==arr[i]){
            s=i;
        }
        return s;

    }
    static int search(int [] arr , int i , int value){
        if(i>=arr.length){
           return -1;
        }
        if(value==arr[i]){
            return i;
        }
        return search(arr,i+1,value);
    

    }
     static int count(int [] arr , int i , int value){
        if(i >=arr.length){
            int sum=0;
           return sum;
        }
        int s = count(arr,i+1,value);
        if(value==arr[i]){
            s += 1;
        }
        return s;

    }
    public static void main(String[] args) {
        int [] arr ={10,22,20,44,30,30,30,30,30,30};
        int v =30;
        // System.out.println(search(arr, 0, v));
        // System.out.println(search1(arr,0,v)>=0?"Found":"Not Found");
        System.out.println(count(arr, 0, v));
    }
}
