import java.util.List;
import java.util.ArrayList;

public class Holiday {
    private String date;
    private String name;
    private static List<Holiday> holidays = new ArrayList<>();
    private static List<String> dates = new ArrayList<>();

    public Holiday() {}

    public Holiday(String date, String name) {
        if(dates.contains(date)) {
            return;
        }
        this.date = date;
        this.name = name;
        holidays.add(this);
    }

    public void setDate(String date) {
        if(dates.contains(date)) {
            return;
        }
        this.date = date;
    }

    public void setName(String name) {
        if(name.length() == 0) {
            return;
        }
        this.name = name;
    }

    public List<Holiday> getAllHolidays() {
        return holidays;
    }

    public String getHolidayByDate(String date) {
        Holiday holidayFromDate = holidays.stream().filter(h -> h.date == date).findAny().orElse(null);
        if(holidayFromDate == null) {
            return "";
        }
        return holidayFromDate.name;
    }    
}
