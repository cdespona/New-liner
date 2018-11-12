package cde.cw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitSentenceShould {

    private SplitSentence splitSentence;

    @BeforeEach
    void setUp() {
        splitSentence = new SplitSentence();
    }

    @Test
    void split_an_string_in_the_seventh_position() {
        assertEquals("Hello W\norld", splitSentence.giveMeLines("Hello World", 7));
    }

    @Test
    void split_an_string_in_the_second_position() {
        assertEquals("He\nll\no \nWo\nrl\nd", splitSentence.giveMeLines("Hello World", 2));
    }

    @Test
    void split_an_string_by_a_number_which_is_too_high() {
        assertEquals("Hello World", splitSentence.giveMeLines("Hello World", 30));

    }
}
