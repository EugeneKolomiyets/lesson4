import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class arr {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,0};
        /*for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]);
        }*/
        System.out.println(Arrays.toString(array));
//        сравнить

        System.out.println();
        boolean[]arr = new boolean[10];
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //коммент ctrl+shift+/ /**/ или ctrl+/
        //Arrays.equals(array1,arr2) ;
//        fill заполнение
         //  short
        //Arrays.asList();
        //System.arraycopy();
        //пузырьковая сортировка
        int[]ar = {5,3,8,4,6};
        System.out.println(ar.length);
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i <= ar.length-2 ; i++) {
                if (ar[i]>ar[i+1]) {
                    int tempInt = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = tempInt;
                    flag = true;
                }
              }
        }while (flag);
        System.out.println(Arrays.toString(ar));
        //сортировка выбором selection sort
        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i <ar.length ; i++) {
            int min = ar[ar.length - 1];
            int minId = ar.length - 1;
            for (int j = ar.length-1; j >= i; j--) {
                if (ar[j] < min) {
                    min = ar[j];
                    minId=j;
                }
            }
           //ctrl+alt+b создать переменную 
            //enum;

            if (ar[i]!=min){

                int tempInt=ar[i];
                ar[i]=min;
                ar[minId]=tempInt;

            }
        }
        System.out.println(Arrays.toString(ar));
        //System.arraycopy(ar?);
        //Arrays.copyOf();
        Integer[] array1 = new Integer[100];
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(array1));

        //Arrays.sort();
        //ctrl - можно провалиться в метод и узнать что там

        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String( "ABC");//создали новый стринг
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
