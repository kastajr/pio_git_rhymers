package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 12;
    public static final int INT2 = -1;
    public static final int INT3 = 11;
    public static final int INT4 = -1;
    public static final int INT5 = -1;
    private int[] numbers = new int[INT1];

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
