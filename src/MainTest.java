import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @Test
    void annoData() {
        String result = testing.annoData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("2023", result);
    }

    @Test
    void meseData() {
        String result = testing.meseData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("MARCH", result);
    }

    @Test
    void giornoData() {
        String result = testing.giornoData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("1", result);
    }

    @Test
    void giornoSettimanaData() {
        String result = testing.giornoSettimanaData(OffsetDateTime.parse("2023-03-01T13:00:00Z"));
        assertEquals("WEDNESDAY", result);
    }
}