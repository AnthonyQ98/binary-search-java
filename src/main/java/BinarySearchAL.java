import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchAL<T> extends ArrayList<T> {
    int binarySearch(T key, int start, int end) {
        boolean found = false;
        int middle = 0;

        while ((start<=end) && (found==false)) {
            middle=(start+end) / 2;
            if (((Comparable)get(middle)).compareTo(key)==0){
                found=true;
            } else if (((Comparable)get(middle)).compareTo(key)<0) {
                start = middle+1;
            } else {
                end = middle-1;
            }
        }

        if (found == true) {
            return middle;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        BinarySearchAL<Integer> list = new BinarySearchAL<>();
        list.add(2);
        list.add(9);
        list.add(12);
        list.add(1);
        list.add(100);
        list.add(15);
        list.add(99);

        Collections.sort(list);

        System.out.println("Your current list is: " + list.toString());

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to search: ");
        Integer key = scan.nextInt();

        int str;

        str = list.binarySearch(key, 0, list.size());

        if (str == -1) {
            System.out.println("The number was not found");
        } else {
            System.out.println("The number was found");
        }
    }
}
