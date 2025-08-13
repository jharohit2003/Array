package Array;

public class Traverse {
    // copy the refernce of the array
    static void traverse(int a[],int n){
        if(n<=-1){
            return;
        }
        traverse(a ,n-1);
        System.out.println(a[n]);
    }
    static void traverse1(int a[],int i){
        if(i>=a.length){
            return;
        }
        System.out.println(a[i]);
        traverse(a ,i+1);
        
    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50}; //reference
        traverse(arr ,arr.length-1);
    }
}
