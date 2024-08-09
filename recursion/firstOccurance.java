public class firstOccurance {

    public static int firstOccure(int arr[],int tar,int index){
        if(arr.length==index){
           return -1;
        }
        int firstOcc=firstOccure(arr, tar, index+1);
        if(arr[index]==tar){
            firstOcc=index;
        }
        return firstOcc;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int index=0;
        int tar=5;
        System.out.println(firstOccure(arr,tar,index));
        
    }
}
