package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Parser {
    private final HashSet<Character> separators;
    private final List<Integer> nums;

    Parser() {
        separators = new HashSet<>(Arrays.asList(',', ':'));
        nums = new ArrayList<>();
    }

    public void parse(String inputString) {
        char[] inputArray = inputString.toCharArray();
        int index = 0;
        while (index < inputArray.length) {
            char curChar = inputArray[index];
            if (curChar >= '1' && curChar <= '9') { //Character.isDisit()
                index = parseNumber(curChar, index, inputArray);
                index++;
                continue;
            }
            if (separators.contains(curChar)) {
                index++;
                continue;
            }
            if (curChar == '/') {
                index = addSeparator(index, inputArray);
                continue;
            }
        }
    }

    private int parseNumber(char curChar, int index, char[] inputArray) {
        String numStr = "";
        numStr += curChar;
        index++;
        while (index < inputArray.length && inputArray[index] >= '1' && inputArray[index] <= '9') {
            numStr += inputArray[index];
            index++;
        }
        nums.add(Integer.parseInt(numStr));
        return index;
    }

    public List<Integer> getNums() {
        return nums;
    }

    private int addSeparator(int index, char[] inputArray) {
        index++;
        //add exception
        if (inputArray[index] == '/') {
            index++;
        }
        //add exception
        char separator = inputArray[index];
        index++;

        if (inputArray[index] == '\\') {
            //add exception
            index++;
        }
        if (inputArray[index] == 'n') {
            //add exception
            separators.add(separator);
            index++;
        }
        return index;
    }
}
