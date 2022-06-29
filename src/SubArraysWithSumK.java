import java.util.HashMap;

public class SubArraysWithSumK {

    public static int subArrayWithSumK(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0, sum =0;
        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum ==k){
                count++;
            }
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;

    }



    public static void main(String[] args) {

    }

}
