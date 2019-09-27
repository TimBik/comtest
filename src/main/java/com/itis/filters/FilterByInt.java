package com.itis.filters;

import com.itis.comparators.PriorityComparator;

import java.util.Collections;
import java.util.List;

public class FilterByInt{

    public List<Integer> filter(List<Integer> list){
        Collections.sort(list, new PriorityComparator());
        return list;
    }
}
