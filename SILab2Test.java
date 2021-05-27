import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 lab = new SILab2();

    public List<Time> createList(Integer... elems){
        List<Integer> newList = new ArrayList<>(Arrays.asList(elems));
        List<Time> timeList = new ArrayList<>();
        for (int i=0;i<newList.size();i=i+3){
            Time time = new Time(newList.get(i),newList.get(i+1),newList.get(i+2));
            timeList.add(time);
        }
        return timeList;
    }
    @Test
    void everyBranchTest() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(-20,7,6)));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(26,23,24)));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(21,-22,3)));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(22,24,-5)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(55233);
        listInteger.add(86400);
        assertEquals(listInteger,lab.function(createList(15,20,33,24,0,0)));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(24,30,10)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));
    }
    @Test
    void multipleCondition() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(-2,22,1)));
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(25,23,13)));
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(2,-22,1)));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(20,76,10)));
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(55233);
        assertEquals(listInteger,lab.function(createList(15,20,33)));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(1,22,75)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(2,22,-1)));
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        List<Integer> list = new ArrayList<>();
        list.add(86400);
        assertEquals(list,lab.function(createList(24,0,0)));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(24,30,0)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        ex = assertThrows(RuntimeException.class, () -> lab.function(createList(24,0,5)));
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));
    }
}