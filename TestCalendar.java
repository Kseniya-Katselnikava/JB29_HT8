//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

package by.epam.jb29.task12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestCalendar {
    public static void main(String[] args) {
         int year = 2019;
         Calendar calendar = new Calendar(year);
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

          calendar.addHoliday(LocalDate.parse("01.01." + year, dtf), "Новый год");
          calendar.addHoliday(LocalDate.parse("07.01." + year, dtf), "Рождество Христово");
          calendar.addHoliday(LocalDate.parse("08.03." + year, dtf), "Женский День");
          calendar.addHoliday(LocalDate.parse("01.05." + year, dtf), "Праздник труда");
          calendar.addHoliday(LocalDate.parse("07.05." + year, dtf), "Радуница");
          calendar.addHoliday(LocalDate.parse("09.05." + year, dtf), "День Победы");
          calendar.addHoliday(LocalDate.parse("03.07." + year, dtf), "День Независимости Республики Беларусь");
          calendar.addHoliday(LocalDate.parse("07.11." + year, dtf), "День Октябрьской Революции");
          calendar.addHoliday(LocalDate.parse("25.12." + year, dtf), "Рождество Христово");

         calendar.show();
       }
 }

