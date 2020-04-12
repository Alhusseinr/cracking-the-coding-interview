package Chapter_3_Stacks_and_Queues;

/*
    Question: Describe how tou could use a single array to implement three stacks
    Answer:
        - For stack 1, we will use [0, n/3)
        - For stack 2, we will use [n/3, 2n/3)
        - For stack 3, we will use [2n/3, n)
    below is the code to show this implementation
*/

import java.util.EmptyStackException;

public class FixedMultiStack {
    private int numberOfStack = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStack];
        sizes = new int[numberOfStack];
    }

    // push values into stack
    public void push(int stackNum, int value) throws FullStackException{
        // check if there is space for the next element
        if(isFull(stackNum)){
            throw new FullStackException();
        }
        // Incrementing stack pointer and then updating top value
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum){
        if(isEmpty(stackNum)){
            throw new EmptyStackException();
        }

        return values[indexOfTop(stackNum)];
    }

    public boolean isEmpty(int stackNum){
        return sizes[stackNum] == 0;
    }

    public boolean isFull(int stackNum){
        return sizes[stackNum] == stackCapacity;
    }

    private int indexOfTop(int stackNum){
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    public class FullStackException extends RuntimeException
    {
        // no-argument constructor
        public FullStackException()
        {
            this( "Stack is full" );
        } // end no-argument FullStackException constructor

        // one-argument constructor
        public FullStackException( String exception )
        {
            super( exception );
        } // end one-argument FullStackException constructor
    } // end class FullStackException

}
