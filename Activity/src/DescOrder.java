import java.util.*;
public class DescOrder {



    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=sc.nextInt();

        System.out.println("enter the elements to sort");
        int[] array = new int[5];
        for (int i = 0; i < n; i++) {
        array[i]=sc.nextInt();

        }
        System.out.print("Elements of original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);

        System.out.println();
        System.out.println("Elements of array sorted in ascending order : "+ Arrays.toString(array));
    }
    }

