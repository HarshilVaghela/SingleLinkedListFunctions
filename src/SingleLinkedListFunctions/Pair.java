package SingleLinkedListFunctions;
/**
 *
 * @author Harshilkumar Vaghela(3116318);
 * @date September 23,2020(Lab2);
 */

public class Pair<F, S> {

    private F first;
    private S second;

    public Pair(F f, S s) {                  
        first = f;
        second = s;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "("+ first+", "+second+")";
    }
}
