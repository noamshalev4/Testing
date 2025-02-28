import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsCounterTest {
    WordsCounter wordsCounter = new WordsCounter();

    @BeforeEach
    void init() {
        wordsCounter.setCount(0);
    }

    @Test
    void singleSentenceEmptyStringTest() {
        wordsCounter.process("");
        assertEquals(0, wordsCounter.getCount());
    }

    @Test
    void singleSentenceHasOneWord() {
        wordsCounter.process("word");
        assertEquals(1, wordsCounter.getCount());

    }

    @Test
    void singleSentenceMultiStringTest() {
        wordsCounter.process("Shaked did not woke up at the time");
        assertEquals(8, wordsCounter.getCount());
    }
}