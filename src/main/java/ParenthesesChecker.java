import java.util.Stack;

public class ParenthesesChecker {

    /*
    - Whenever you come across an opening brace, you always add it to the stack because there could be its corresponding
    closing brace added to the stack after.
    - But if you come across a closing brace, you have to check if the most recent bracket in the stack is its corresponding
    opening  brace.
    - when a match is found, the opening brace can be popped off, if not the loop keeps going.
     */

    public static boolean checkParentheses(String testString) {
        Stack<Character> myStack = new Stack<>();

        // looping through each character of the testString
        for(int i = 0; i < testString.length(); i++) {

            // any character that is equal to '(' should be pushed at the end of the stack
            if(testString.charAt(i) == '(') {
                myStack.push(testString.charAt(i));
            } else {
                if (myStack.isEmpty()) {  // checking if stack is empty. if so, will be no corresponding opening brackets for when testString.charAt(i) == ')".
                    return false;
                } else {
                    char popItOff = myStack.pop();
                if(testString.charAt(i) == ')' && popItOff != '(') {    // if the current character is ')' and there is no a matching '(', can='t pop it off, so returns false
                    return false;
                }

            }

            }

        }
        // '(' are popped off when there is its corresponding ')'.
        // once all this is done, if the stack is empty, we can return true. if not, return false.
        if (myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
