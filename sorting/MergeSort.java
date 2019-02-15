import java.util.List;
import java.util.ArrayList;


class MergeSort {

    public static void mergeSort(List<Integer> list) {
        System.out.print("Splitting: ");
        Sorting.printList(list);
        int midPoint;
        List<Integer> leftHalf;
        List<Integer> rightHalf;


        if(list.size() > 1) {
            
            midPoint = list.size() / 2;
            leftHalf = new ArrayList(list.subList(0, midPoint));
            rightHalf = new ArrayList(list.subList(midPoint, list.size()));

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < leftHalf.size() && j < rightHalf.size()) {
                if(leftHalf.get(i) < rightHalf.get(j)) {
                    list.set(k, leftHalf.get(i));
                    i += 1;
                } else {
                    list.set(k, rightHalf.get(j));
                    j += 1;
                }
                k += 1;
            }

            while(i < leftHalf.size()) {
                list.set(k, leftHalf.get(i));
                i += 1;
                k += 1;
            }

            while(j < rightHalf.size()) {
                list.set(k, rightHalf.get(j));
                j += 1;
                k += 1;
            }

            System.out.println("Merging: ");
            Sorting.printList(list);
        }
    }


    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(9);
        test.add(7);
        test.add(2);
        test.add(11);
        test.add(4);
        test.add(5);
        test.add(8);
        Sorting.printList(test);
        mergeSort(test);
    }
}