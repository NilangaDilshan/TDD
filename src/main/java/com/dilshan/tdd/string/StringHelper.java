package com.dilshan.tdd.string;

import org.apache.commons.lang3.StringUtils;

public class StringHelper {
    public String swapLastTwoChars(String ab) {
        if (StringUtils.isBlank(ab))
            return ab;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = ab.length() - 1; i >= 0; i--) {
            stringBuilder.append(ab.charAt(i));
        }
        return stringBuilder.toString();
    }

    public String removeFirstCharacters(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }


}
