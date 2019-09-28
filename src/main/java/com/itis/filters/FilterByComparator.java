package com.itis.filters;

import com.itis.models.Event;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByComparator{

    public List<Event> filter(List<Event> list, Comparator<Event> comparator, Event filtersObject) {
        /*List<Event> filtersList = new ArrayList<>();
        for (Event e: list) {
            if(comparator.compare(filtersObject,e) == 0) filtersList.add(e) ; }
        return filtersList;
         */
        return list.stream().
                filter(e -> comparator.compare(filtersObject, e) == 0).
                collect(Collectors.toList());
    }
}
