import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfWeek());
    }
    public String annoData(OffsetDateTime data) {
        return String.valueOf(data.getYear());
    }
    
    public String meseData(OffsetDateTime data) {
        return String.valueOf(data.getMonth());
    }

    public String giornoData(OffsetDateTime data) {
        return String.valueOf(data.getDayOfMonth());
    }

    public String giornoSettimanaData(OffsetDateTime data) {
        return String.valueOf(data.getDayOfWeek());
    }
}
