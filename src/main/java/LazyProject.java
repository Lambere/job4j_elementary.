import java.util.stream.Stream;

public class LazyProject {
    public static boolean getXO (String str) {
        int i = 0;
        int j = 0;
        Stream<String> a = Stream.of(str);
        if(a.allMatch(x -> x.equals("x")) ) {
            i++;
        }
        if(a.allMatch(x -> x.equals("o")) ) {
            j++;
        }
        return i == j;
    }
}
