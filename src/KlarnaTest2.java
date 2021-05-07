import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class KlarnaTest2 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        System.out.println(isWritable(4, 2, set));
    }

    public static boolean isWritable(int blockSize, int fileSize, Set<Integer> occupiedSectors) {
        occupiedSectors.add(0);
        occupiedSectors.add(blockSize+1);
        if (fileSize > blockSize)
            return false;
        if (occupiedSectors.size() == 0 && fileSize <= blockSize)
            return true;
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (Integer integer : occupiedSectors) {
            sortedSet.add(integer);
        }

        Integer first = sortedSet.first();
        for (int item : sortedSet) {
            if (item - first > fileSize)
                return true;
            first = item;
        }
        return false;


    }
} 
