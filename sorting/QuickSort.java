import java.util.List;
import java.util.ArrayList;


public class QuickSort  {

    public static void quickSort(List<Integer> list) {
        quickSortHelper(list, 0, list.size() - 1);
    }

    private static void quickSortHelper(List<Integer> list, int first, int last) {
        if(first < last) {
            int splitPoint = partition(list, first, last);

            quickSortHelper(list, first, splitPoint - 1);
            quickSortHelper(list, splitPoint + 1, last);
        }

    }


    public static int partition(List<Integer> list, int first, int last) {
        int pivotValue = list.get(first);

        int leftMark = first + 1;
        int rightMark = last;

        boolean done = false;

        while(!done) {
            while(leftMark <= rightMark && list.get(leftMark) <= pivotValue) {
                leftMark +=1;
            }

            while(list.get(rightMark) >= pivotValue && rightMark >= leftMark) {
                rightMark -= 1;
            }

            if(rightMark < leftMark) {
                done = true;
            } else {
                int temp = list.get(leftMark);
                list.set(leftMark, list.get(rightMark));
                list.set(rightMark, temp);
            }
        }

        int temp = list.get(first);
        list.set(first, list.get(rightMark));
        list.set(rightMark, temp);
        return rightMark;
    }

    public static void main(String[] args) {
        System.out.println("Performing quicksort...");
        List<Integer> test = new ArrayList() ;

        test.add(564332);
        test.add(5456);
        test.add(5233);
        test.add(512);
        test.add(1223);
        test.add(123);
        test.add(123);
        test.add(6534254);
        test.add(112);
        test.add(45);
        test.add(1234);
        test.add(772);

        Sorting.printList(test);
        quickSort(test);
        Sorting.printList(test);
    }
}