public class clumsy {
    public static int clumsy(int n) {
        
        int output=0;
        int i=n;
        int count=0;
        while (i>1) {
            if(count==4){
                count=0;
            }
            if(count==0){
                output=i*i-1;
                i=i-2;
            }

            if(count==1){
                output=output/i;
                i--;
            }

            if(count==2){
                output=output+i;
                i--;
            }
            if(count==3){
                output=output-i;
                i--;
            }
            count++;
            
        }
        return output;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(clumsy(n));
    }
}
