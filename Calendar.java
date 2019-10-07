//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
//        информацию о выходных и праздничных днях.

package by.epam.jb29.task12;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holiday;

    public Calendar(int year) {
        this.year = year;
        this.holiday = new ArrayList<>();

        addWeekend(year);
    }

    public ArrayList<Holiday> getHoliday() {
        return holiday;
    }

    class Holiday {
        private LocalDate holidayDate;
        private String nameOfHoliday;

        public Holiday(LocalDate holiday, String nameOfHoliday) {
            this.holidayDate = holiday;
            this.nameOfHoliday = nameOfHoliday;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        @Override
        public String toString() {
            return "Выходные и праздничные дни {" + holidayDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " - " + nameOfHoliday + '}';
        }
    }

    public void addWeekend(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        while (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {

            date = date.plusDays(1);
        }
        while (date.getYear() == year) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                holiday.add(new Holiday(date, "Суббота"));
                date = date.plusDays(1);
            } else if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                holiday.add(new Holiday(date, "Воскресенье"));
                date = date.plusDays(6);
            } else { date = date.plusDays(1); }
        }
    }


    public void addHoliday(LocalDate holidayDate, String nameOfHoliday)
    {
        holiday.add(new Holiday(holidayDate, nameOfHoliday));
    }

    public void show() {
        for (Holiday holiday : holiday) {
            System.out.println(holiday);
        }
        System.out.println();
    }
}

