package by.htp.hw5.task3;
import java.util.ArrayList;
import java.util.List;

import by.htp.hw5.task3.Calendar.Day;
import by.htp.hw5.task3.Calendar.Month;

public class CalendarLogic {

    public static List<Day> getDaysOff(Calendar calendar, String month) {
	ArrayList<Day> result = new ArrayList<Day>();

	for (Month m : calendar.getMonth()) {
	    if (month.equals(m.getTitle())) {
		for (Day day : m.getDays()) {
		    if (day.isDayOff()) {
			result.add(day);
		    }
		}
	    }
	}

	return result;
    }
}
