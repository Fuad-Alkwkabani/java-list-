package javal_list_days;

import java.util.ArrayList;

import java.util.List;


public class WeekDaysManager {
private List<String> days;

public WeekDaysManager() {
    this.days = new ArrayList<>();
}
public void createDaysList() {
    
    days.add("Lunes");
    days.add("Martes");
    days.add("Miércoles");
    days.add("Jueves");
    days.add("Viernes");
    days.add("Sábado");
    days.add("Domingo");
}



}
