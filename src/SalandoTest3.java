
import java.util.SortedSet;
import java.util.TreeSet;

public class SalandoTest3 {

    public static void main(String[] args) {
        Integer[] A = {5, 2, 4, 6, 3, 7};

//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 1; i < A.length - 1; i++) {
//            list.add(A[i]);
//        }
//
//        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
//        Integer cost = 0;
//        for (int i = 0; i <list.size() ; i++) {
//            if (i+2 >=list.size())
//                continue;
//            cost = list.get(i) + list.get(i + 2);
//            sortedSet.add(cost);
//        }
//
//        System.out.println( sortedSet.first());

        Integer cost = 0;
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();


        for (int i = 1; i < A.length - 1; i++) {
            for (int j = 2; j < A.length - 1; j++) {
                if (i + j <= A.length - 1)
                    sortedSet.add(A[i] + A[i + j]);
            }

        }
        System.out.println(sortedSet.first());


//        Integer cost = 0;
//
//
//        for (int i = 1; i < A.length - 1; i++) {
//            for (int j = 2; j < A.length - 1; j++) {
//                if (cost == 0)
//                    cost = A[i] + A[i + j];
//                else
//                if (i + j <= A.length-1)
//                    cost = cost > A[i] + A[i + j] ? A[i] + A[i + j] : cost;
//            }
//
//        }
//        return cost;

    }
} 
