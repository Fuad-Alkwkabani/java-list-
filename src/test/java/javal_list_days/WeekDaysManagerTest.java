package javal_list_days;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class WeekDaysManagerTest {

    private WeekDaysManager manager;

    @BeforeEach
    void setUp() {
        manager = new WeekDaysManager();
        manager.createDaysList(); // Iniciar la lista de días
    }

    @Test
    void testCreateDaysList() {
        manager.createDaysList();
        assertEquals(7, manager.getDaysCount(), "La lista debe contener 7 días");
    }

    @Test
    void testGetDaysList() {
        List<String> days = manager.getDaylist();
        assertEquals(7, days.size(), "La lista debe contener 7 días después de la creación");
        assertTrue(days.contains("Lunes"), "La lista debe contener 'Lunes'");
    }

    @Test
    void testGetDaysCount() {
        assertEquals(7, manager.getDaysCount(), "El conteo de días debe ser 7");
        manager.clearDaysList();
        assertEquals(0, manager.getDaysCount(), "El conteo debe ser 0 después de vaciar la lista");
    }

    @Test
    void testRemoveDay() {
        assertTrue(manager.removeDay("Domingo"), "Debe poder eliminar 'Domingo'");
        assertFalse(manager.getDaylist().contains("Domingo"), "'Domingo' no debe estar en la lista después de eliminarlo");
        assertFalse(manager.removeDay("Funday"), "Eliminar un día inexistente debe devolver false");
    }

    @Test
    void testGetDay() {
        assertEquals("Lunes", manager.getDay(0), "El primer día debe ser 'Lunes'");
        assertNull(manager.getDay(10), "Un índice fuera de rango debe retornar null");
    }

    @Test
    void testDayExists() {
        assertTrue(manager.dayExists("Lunes"), "'Lunes' debe existir en la lista");
        assertFalse(manager.dayExists("Funday"), "'Funday' no debe existir en la lista");
    }

    @Test
    void testSortDaysAlphabetically() {
        manager.sortDaysAlphabetically();
        assertEquals("Domingo", manager.getDaylist().get(0), "'Domingo' debe ser el primer día después de ordenar");
        assertEquals("Viernes", manager.getDaylist().get(6), "'Viernes' debe ser el último día después de ordenar");
    }

    @Test
    void testClearDaysList() {
        manager.clearDaysList();
        assertEquals(0, manager.getDaysCount(), "El conteo de días debe ser 0 después de vaciar la lista");
    }
}


