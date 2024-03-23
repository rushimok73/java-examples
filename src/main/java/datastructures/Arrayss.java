package datastructures;

import java.util.Arrays;
import java.util.Comparator;

public class Arrayss {
    public static void main(String[] args) {
        int[] vals = {5, 3, 2, 1, 4};
        Integer[] indices = new Integer[vals.length];

        for(int i = 0; i< vals.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> vals[a] -vals[b]);

        Integer[] sortedVals = new Integer[vals.length];
        for(int i=0; i<vals.length; i++) {
            sortedVals[i] = vals[indices[i]];
        }

        System.out.println(Arrays.toString(sortedVals));
        System.out.println(Arrays.toString(indices));

    }
}
