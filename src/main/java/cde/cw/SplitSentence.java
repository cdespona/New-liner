package cde.cw;

import java.util.function.BiFunction;

public class SplitSentence {

    public String giveMeLines(String message, int inCharacters) {
        return ifCannotBeSplitAtAllThenReturn(message, inCharacters,
                this::otherwiseReturnChunks);
    }

    private String ifCannotBeSplitAtAllThenReturn(
            String message,
            int inCharacters,
            BiFunction<String, Integer, String> function)
    {
        return message.length() <= inCharacters
                ? message
                : function.apply(message, inCharacters);
    }

    private String otherwiseReturnChunks(
            String message,
            Integer inCharacters)
    {
        String front = message.substring(0, inCharacters);
        String rear = message.substring(inCharacters);
        String toJoin = rear.length() >= inCharacters
                ? giveMeLines(rear, inCharacters)
                : rear;
        return String.join("\n", front, toJoin);
    }
}
