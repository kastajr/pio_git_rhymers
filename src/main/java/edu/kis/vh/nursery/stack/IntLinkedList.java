package edu.kis.vh.nursery.stack;

public final class IntLinkedList implements ListStackInterface{

    private Node last;

    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return 0;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
}