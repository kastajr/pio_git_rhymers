package edu.kis.vh.nursery.stack;

public interface ListStackInterface {
    public static final int ARRAY_SIZE = 12;
    public static final int EMPTY_VALUE = 0;
    boolean isFull();
    void push(int i);
    int pop();
    boolean isEmpty();
    int top();
}
