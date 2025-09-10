public class Sum_Non0 {
    
    public static void main(String[] args) {
        
        int n=11,a,b;
        // int i=1;
        // int a = i;
        // int b = n-i;
        // int[] arr ={};

        for( int i=1; i<=n ; i++){
            a=i;
            b=n-i;
            if(a!=0 && b!=0 ){
                if(a+b == n){
                    System.out.println(a + " " + b);
                }
            }
            
        }
    }
}
