package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.ListStackInterface;

public class DefaultCountingOutRhymer {
    private ListStackInterface stack;

    public DefaultCountingOutRhymer(ListStackInterface stack) {
        this.stack = stack;
    }
    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}