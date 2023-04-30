import java.util.*;

public class MapAndReduce {
    public static void main(String[] args) {
        Map map = new HashMap();
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<String> stringList = Arrays.asList("anzar", "shaikh", "khatik");

        /*MAP TO INT METHOD*/
        int sum = intList.stream().mapToInt(i -> i).sum();
        System.out.println(sum);


        /*REDUCE METHOD*/
        /*with integer*/
        Optional<Integer> reduce = intList.stream().reduce((a, b) -> a + b);
        System.out.println(reduce);

        Integer reduce3 = intList.stream().reduce(1, (a, b) -> a + b);
        System.out.println(reduce3);

        Optional<Integer> reduce1 = intList.stream().reduce(Integer::sum);
        System.out.println(AppUtil.isPresent(reduce1) ? reduce1.get() : null);

        /*with string*/
        Optional<String> reduce2 = stringList.stream().reduce((word1, word2) -> word1 + word2);
        System.out.println(reduce2);

        /** in any stream iteration order is no no preserved*/
        /**It is multithreaded thus very fast and sequence is different*/
        /**here sequence dose not matters and sequence is compromised*/
        stringList.parallelStream().forEach(System.out::print);
        System.out.println(" ");


        /** Collection.stream().forEach() -> if collection is synchronized it does not locks the collection*/
        /** Collection.forEach() -> f iteration is happening over the synchronized collection, then it locks the collection and holds it across all the calls.*/
        intList.forEach(System.out::print);
        System.out.println(" ");

        intList.stream().forEach(System.out::print);
    }
}

