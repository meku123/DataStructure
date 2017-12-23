package w2l3arrayStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;

/** Class with methods to check whether a string is a palindrome.
 *  @author Koffman & Wolfgang
 **/

public class PalindromeFinder {
    /** String to store in stack. */
    private String inputString;
    /** Stack to hold characters. */
    private Stack<Character> charStack = new Stack<Character>();

    /**
     * Store the argument string in a stack of characters.
     * @param str String of characters to store in the stack
     */
    public PalindromeFinder(String str) {
        inputString = str;
        fillStack();
    }

    /** Method to fill a stack of characters from an input string. */
    private void fillStack() {
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
    }

    /**
     * Method to build a string containing
     * the characters in a stack.
     * @post The stack is empty.
     * @return The string containing the words in the stack
     */
    private String buildReverse() {
        StringBuilder result = new StringBuilder();
        while (!charStack.empty()) {
            // Remove top item from stack and append it to result.
            result.append(charStack.pop());
        }
        return result.toString();
    }

    public boolean isPalindrome() {
        return inputString.equalsIgnoreCase(buildReverse());
    }
    public static void main(String args[]){
    	PalindromeFinder pf1 = new PalindromeFinder("Kayak");
    	System.out.println(pf1.isPalindrome());
    	PalindromeFinder pf2 = new PalindromeFinder("Java");
    	System.out.println(pf2.isPalindrome());
    	
    	HashMap<Integer, Integer> Marks = new HashMap<>();
    	Marks.put(201, 190);
    	Marks.put(210, 199);
    	Marks.put(206, 180);
    	Marks.put(203, 193);
    	Marks.put(null, null);
    	
    	for(Integer value : Marks.values()){
    		System.out.println(value);
    		
    		ArrayList<Object> al = new ArrayList<>();
    		al.add("Java");
    		al.add('a');
    		al.add('b');
    		al.add('a');
    		al.add(10.3);
    		al.add('c');
    		al.add(14);
    		al.add("Java");
    		
    	
    	}

    	
    		}
    	
    }
    

/*</listing>*/


