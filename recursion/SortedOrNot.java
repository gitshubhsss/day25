public class SortedOrNot {

    public static boolean isSorted(int arr[], int index) {
        // base case
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            boolean answer = isSorted(arr, index + 1);
            return answer;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,4,5,6,1 };
        int index = 0;

        System.out.println(isSorted(arr, index));

    }
}