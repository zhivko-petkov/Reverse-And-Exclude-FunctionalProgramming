package EXERCISE;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(sc.nextLine());
        Predicate<Integer> isN = num -> num % n == 0;
        List<Integer> nums = new ArrayList<>(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        Collections.reverse(nums);
        nums.removeIf(isN);
        nums.forEach(a -> System.out.print(a + " "));



    }
}
