package edu.utfpr;
public class LeftPad {
    public static String leftPad(final String str, final int size, String padStr) {
        if (str == null) {
            return null;
        }

        if (size < 0) {
            return null;
        }

        if (str.length() >= size) {
            return str;
        }

        if (padStr == null || padStr.isEmpty()) {
            padStr = " ";
        }

        int sizePad = size - str.length();
        StringBuilder left = new StringBuilder();

        while (left.length() < sizePad) {
            left.append(padStr);
        }

        left.setLength(sizePad);
        left.append(str);

        return left.toString();
    }
}