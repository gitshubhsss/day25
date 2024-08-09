public class lastOccureShradda {

    public static int lastOccurance(int arr[],int tar,int index){
        if(index==arr.length){
            return -1;
        }
        int lastIndex=lastOccurance(arr, tar, index+1);
        if(lastIndex==-1 && arr[index]==tar){
            return index;
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,3,10,2,5,3};
        int index=0;
        int tar=5;

        System.out.println(lastOccurance(arr,tar,index));
    }
}
