package package1;

import java.util.Arrays;

public class JavaClass
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[5];
        arr1 = new int[]{5, 69, 52, 96, 25};
            System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[10];
        arr2[1] = 69;
        arr2[2] = 71;
        arr2[3] = 78;
        arr2[8] = 87;
            System.out.println(Arrays.toString(arr2));
            System.out.println(arr2.length);
            int[] arr3 = new int[10];
            for (int i = 0; i < arr3.length; i++)
            {
                arr3[i] = 1 + (int) (Math.random() * 100);
            }
            System.out.println(Arrays.toString(arr3));

            int max = arr3[0];
            for (int a = 1; a < arr3.length; a++) {
                if (arr3[a] > max) {
                max = arr3[a];
                }
            }
            System.out.println(max);

            int min = arr3[0];
            for (int a = 1; a < arr3.length; a++){
                if (arr3[a] < min){
                    min = arr3[a];
                }
            }
            System.out.println(min);

            int med = arr3[0];
            for ( int a = 1; a < arr3.length; a++){
                med = med + arr3[a];
                }
            med = med / arr3.length;
        System.out.println(med);
            }

    }
