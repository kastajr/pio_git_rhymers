package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int INDICATOR = -1;
    private static final int DEFAULT = -1;

    private final int[] numbers = new int[ARRAY_SIZE];

    private int total = INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INDICATOR;
    }

    public boolean isFull() {
        return total == ARRAY_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}
