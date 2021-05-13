package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationTest {
    // for the given number of milliseconds return the number of hours, minutes, and seconds, ignoring any fractional
    // seconds (no need to round)
    // e.g. 8628679 -> '2 hours, 23 minutes, 48 seconds'
    // 24010092 -> '6 hours, 40 minutes, 10 seconds'
    // 363000 -> '0 hours, 6 minutes, 3 seconds'
    String duration(int ms) {
        return "";
    }

    @Test
    void examples() {
        assertEquals("2 hours, 23 minutes, 48 seconds", duration(8628679));
        assertEquals("6 hours, 40 minutes, 10 seconds", duration(24010092));
        assertEquals("0 hours, 6 minutes, 3 seconds", duration(363000));
    }
}
