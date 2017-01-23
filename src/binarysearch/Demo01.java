package binarysearch;

/**
 * Created by zhangmiaojie on 2017/1/22.
 *
 */
public class Demo01 {
    public static int[] arr = {1, 45, 76, 90, 200, 222, 435, 2323};

    public static void main(String[] args) {
        int i = binary01(arr, 435);
        System.out.println(i);
    }

    public static int binary01(int[] arr, int v) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid;
        int count = 0;
        while (lo <= hi) {
            count++;
            mid = (lo + hi) / 2;
            if (arr[mid] == v) {
                System.out.println("执行次数：" + count);
                return mid;
            } else if (arr[mid] < v) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        System.out.println("执行次数：" + count);
        return -1;
    }
}
