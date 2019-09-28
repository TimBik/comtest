package com.itis.filters;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedByComparator<T>{

    public List<T> filter(List<T> list, Comparator comparator){
        /*Collections.sort(list, comparator);
        return list;
        */
        return (List<T>) list.stream().
                sorted(comparator).
                collect(Collectors.toList());

    }
}
