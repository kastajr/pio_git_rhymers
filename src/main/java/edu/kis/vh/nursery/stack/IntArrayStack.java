package edu.kis.vh.nursery.stack;

public class IntArrayStack implements ListStackInterface {
    private static final int INITIAL_VALUE = 0;
    private final int[] numbers = new int[ARRAY_SIZE];
    private int total = INITIAL_VALUE;

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_VALUE;
    }
    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        return numbers[total--];
    }
}