import java.util.Arrays;

public class prog3 {
    public static void main(String[] args) {
        int[] array = {4,3,2,2,3,1,7,1};
        Arrays.sort(array, 0, array.length);

        System.out.println(Arrays.toString(array));
    }
}
