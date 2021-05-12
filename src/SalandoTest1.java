import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SalandoTest1 {

    public static void main(String[] args) {
        System.out.println(solution(""));
    }

    public static int solution(String S) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < S.length(); i++) {
            if (i + 2 > S.length())
                continue;
            System.out.println(S.substring(i, i + 2));
            set.add(Integer.parseInt(S.substring(i, i + 2)));
        }
        Optional<Integer> max = set.stream().max((e1, e2) -> e1.compareTo(e2));
        return max.get();
    }
} 
