import java.util.ArrayList;
import java.util.List;

public class pascalTriangle2 {
    
    public static void main(String[] args) {
        
        int rowIndex = 3;
        List <Integer> list = new ArrayList<>();
        long c=1;
        for(int i=0;i<=rowIndex;i++){
            list.add((int)c);
            c = c*(rowIndex-i) / (i+1);
        }
        System.out.println(list);
    }

}
