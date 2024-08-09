public class LastOccure {

    public static int LastOccure(int arr[],int tar,int index){
        if(index<0){
            return -1;
        }
        int lastIndex=LastOccure(arr, tar, index-1);
        if(arr[index]==tar){
            lastIndex=index;
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int index=arr.length-1;
        int tar=5;
        //expected out put is 7
        System.out.println(LastOccure(arr,tar,index));

    }
}
