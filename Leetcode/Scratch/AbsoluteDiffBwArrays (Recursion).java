public class AbsoluteDiffBwArrays {

    // Recursion: 3 step process:
        // 1. write Iterative way
        // 2. write dispatcher func - does 2 things: solves problem for "minimal dataset" + base case
        //                                           calls iterative func to handle non-minimal dataset
        // 3. replace iterative func call with dispatch func call to make it recursive
    public static int sumOfAbsoluteDiff(int[] a, int[] b, int size){
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += Math.abs(a[i] - b[i]);
        }
        return sum;
    }

    public static int dispatch(int[] a, int[] b, int size) {
        if(size == 0) {
            return 0;
        }
        int lastElementSum = Math.abs(a[size-1] - b[size-1]);
        int sum = lastElementSum + dispatch(a,b, size -1);
        return sum;
    }

    public static void main(String args[]) {
        int[] a = {15, -4, 56, 10, -23};
        int[] b = {14, -9, 56, 14, -23};
        System.out.println(dispatch(a,b,a.length));
    }
}
