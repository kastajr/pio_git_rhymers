package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    final public static final int INT = -1;
    final public static final int INT1 = 12;
    final public static final int INT2 = -1;
    final public static final int INT3 = 11;
    final public static final int INT4 = -1;
    final public static final int INT5 = -1;
    final private int[] numbers = new int[INT1];

    public int total = INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT2;
    }

    public boolean isFull() {
        return total == INT3;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT4;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT5;
        return numbers[total--];
    }

}
