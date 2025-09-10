import java.util.HashMap;

public class Roman_Int {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String str="VIII";
        int res =0;
        for(int i=0;i<str.length();i++){
            int curr = map.get(str.charAt(i));

            int next;

            if(i+1 < str.length()){
                next = map.get(str.charAt(i+1));
            }
            else
               next=0;

            if(curr<next){
                res-=curr;
            }
            else{
                res+=curr;
            }

        }
        System.out.println(res);
    }
}
