package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    public CustomList MockCityList() {
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList();
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should have been zero.");
        City cityToAdd = new City("Edmonton", "AB");
        list.addCity(cityToAdd);

        //check that the count of cities increased by one
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "City was not added to the list.");
    }


    @Test
    public void hasCityTest() {
        CustomList list = MockCityList();
        City city1 = new City("Edmonton", "AB");
        list.add(city1);
        City city2 = new City("Edmonton", "AB");
        City city3 = new City("Calgary", "AB");
        assertTrue(list.hasCity(city2));
        assertFalse(list.hasCity(city3));
    }
}
