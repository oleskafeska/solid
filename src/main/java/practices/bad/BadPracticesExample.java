package practices.bad;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BadPracticesExample {

    public static void main(String[] args) {

        List<Integer> integerList = Collections.singletonList(3);

        List<List<Integer>> collect = Stream.of(1, 2, 3)
                .map(first -> integerList.stream()
                        .filter(first::equals)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        int arraySize = 6;
        int[] array = new int[arraySize];
        // complexity
        array[0] = 2;
        array[1] = 4;
        array[2] = 3;
        array[3] = 4;
        array[4] = 1;
        array[5] = 2;

        // bad naming
        int s = 0;

        for (int index = 0; index <array.length; index++) {
            s +=array[index];
        }

        // magic number + hardcoded
        System.out.println(s / arraySize);

        //------------------------------//
    }

    private static int calculateQuarters(int months) {

        return months / 4;
    }

    private static boolean stupid(int number) {

        if (number == 12) {
            return false;
        } else return true;
    }


}
