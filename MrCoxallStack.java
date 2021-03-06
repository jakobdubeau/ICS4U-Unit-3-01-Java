/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*   Class MrCoxallStack.
*/

import java.util.ArrayList;

/**
* Class.
*/
public class MrCoxallStack {

    /**
    * ArrayList.
    */

    private ArrayList<Integer> theStack = new ArrayList<Integer>();

    /**
    * The push function.
    *
    * @param pushNumber int added to stack
    */

    public void push(int pushNumber) {
        theStack.add(pushNumber);
    }

    /**
    * The showStack method.
    */
    public void showStack() {
        System.out.println("The stack list.");
        for (Integer aSingleElement : theStack) {
            System.out.println(aSingleElement);
        }
        System.out.println("End of stack list.\n");
    }
}
