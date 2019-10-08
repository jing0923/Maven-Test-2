import java.util.Arrays;

public class Array {
    private int[] array;
    private int length;


    public Array(int len, int[] arr){
        this.length = len;
        this.array = arr;
    }

    public  int getInteger(int value){
        for(int i=0;i<this.length;i++)
            if(this.array[i] == value) return i;
        return -1;
    }


    public void printArray(int[] arr){
        System.out.println(Arrays.toString(arr)+"\n");
    }


    public int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int a:arr)
            min = Math.min(a,min);
        return min;
    }

    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int a:arr)
            max = Math.max(a,max);
        return max;
    }

    public int[] reverseArray(int[] arr){
        int[] reverse = new int[arr.length];
        int r = 0;
        for(int i=arr.length-1;i>=0;i--)
            reverse[r++] = arr[i];
        return reverse;
    }

    public int[] sortInDescending(int[] arr){
        if(arr==null || arr.length<=1) return arr;
        int[] res = arr.clone();
        for(int i=0;i<res.length-1;i++)
            for(int j=i+1;j<res.length;j++)
                if(res[i]<res[j]){
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
        return res;
    }
}
