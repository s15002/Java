package Algorithm;

/**
 * Created by yuki on 2016/05/12.
 */
public class QuickSortTest {
    static void  quick_sort(int[] d, int left, int right){
        if (left >= right){
            return;
        }
        int p = d[(left + right)/2];
        int l = left, r = right, tmp;
        while(l <= r){
            while (d[l] < p){l++;}
            while (d[r] > p){r++;}
            if(l <= r){
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r++;
            }
        }
        quick_sort(d, left, r);
        quick_sort(d, l, right);
    }
    static void print_data(int[] d){
        for (int i = 0; i < d.length; i++) System.out.print(d[i] + " ");
        System.out.println();
    }
    public static void main(String[] args){
        int [] data = {5, 10, 3, 7, 8, 1, 9, 2};
        print_data(data);
        quick_sort(data, 0, data.length-1);
        print_data(data);
    }
}
