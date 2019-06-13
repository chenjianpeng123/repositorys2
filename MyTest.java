package day11;


import java.util.Random;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        System.out.println("随机生成数组中的元素为：");
        for (int i = 0; i <arr.length ; i++) {
            int num = r.nextInt(99)+1;
            arr[i]=num;

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2~5之间的一个数字：");
        int num = sc.nextInt();
        System.out.println("符合条件的元素为：");
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%num==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
