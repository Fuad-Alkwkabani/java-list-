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

public List<String> getDaylist() {
return new ArrayList<>(days);
}

public int getDaysCount(){
    return days.size();
}
public boolean removeDay(String day){
    return days.remove(day);
}

public String getDay(int dayIndex) {
    if (dayIndex >= 0 && dayIndex < days.size()){
        days.get(dayIndex);
    }
    return null;
}
}
