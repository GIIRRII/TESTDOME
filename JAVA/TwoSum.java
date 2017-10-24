import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        if(list == null||list.length < 2) 
            return null;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<list.length;i++){
            int target = sum-list[i];
            if(map.get(target)!=null){
                return new int[]{i,map.get(target)};
                
            }
            map.put(list[i], i);
            
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}