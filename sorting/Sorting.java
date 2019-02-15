import java.util.List;
import java.util.ArrayList;

public class Sorting {
    public static void printList(List<?> list) {
        String result = "[";
        for(Object element: list) {
            result += element + ", ";
        }

        result = result.substring(0, result.length() - 2) + "]";
        System.out.println(result);
    }
}