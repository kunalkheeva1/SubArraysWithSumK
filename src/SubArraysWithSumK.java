import java.util.HashMap;

public class SubArraysWithSumK {

    public static int subArrayWithSumK(int[] arr, int n, int k){
        //map stores sums
        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0, sum =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            //if finds k, then count ++
            if(sum ==k){
                count++;
            }
            // if map contains sum -k then add the frequency of sum-k  in the count
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
        //else just put sums in the map, and add one to the value over and over wrt to the repetition
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }



    public static void main(String[] args) {

    }

}
