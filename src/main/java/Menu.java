import java.util.*;
import java.util.Scanner;

public class Menu {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of array elements: \n");
        int len = in.nextInt();

        System.out.println("Please enter the elements one by one: \n");
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
            arr[i] = in.nextInt();

        Array arrobj = new Array(len,arr);

        System.out.println("You entered: ");
        arrobj.printArray(arr);

        int choice = 0;
        do{
        System.out.println("\nPlease select from the following: \n1. Get the index of array and value.\n2. prints out the contents of the array.\n3. Find the minimum number in array.\n" +
                "4. Find the maximum number in array.\n5. Reverse the array.\n6. Sort in descending order\nEnter 0 to exit.\n");

        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter the value that you want to get the index of: ");
                int value = in.nextInt();
                int index = arrobj.getInteger(value);
                if(index == -1) System.out.println("Value not found.");
                else System.out.println("Index: " + index + ", value: " + value + "\n");
                break;
            case 2:
                arrobj.printArray(arr);
                break;
            case 3:
                System.out.println("The minimum value is: " + arrobj.findMin(arr));
                break;
            case 4:
                System.out.println("The maximum value is: " + arrobj.findMax(arr));
                break;
            case 5:
                System.out.println("The reversed array is: " + Arrays.toString(arrobj.reverseArray(arr)));
                break;
            case 6:
                System.out.println("Sorted in descending order: " + Arrays.toString(arrobj.sortInDescending(arr)));
                break;
            case 0: break;
            default:
                System.out.println("Wrong input, please enter again.");
        }
        } while(choice != 0);

    }


}

