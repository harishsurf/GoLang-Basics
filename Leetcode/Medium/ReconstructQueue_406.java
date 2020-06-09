// https://leetcode.com/problems/queue-reconstruction-by-height/ 

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReconstructQueue {

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1,o2) -> (o1[0] == o2[0]) ? o1[1] - o2[1] : o2[0] - o1[0]);
//        printArray(people);
//        {7,0}
//        {7,1}
//        {6,1}
//        {5,0}
//        {5,2}
//        {4,4}

        // Use list so that the above elements get placed based on their index
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people){
            res.add(cur[1],cur);
        }
        int[][] output = new int[people.length][];
        return res.toArray(output);
    }

    static void printArray(int[][] res){
        for(int i=0; i<res.length ; i++){
            System.out.printf("{%d,%d}", res[i][0],res[i][1]);
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        printArray(reconstructQueue(people));
        //{5,0}
        //{7,0}
        //{5,2}
        //{6,1}
        //{4,4}
        //{7,1}
    }
}
