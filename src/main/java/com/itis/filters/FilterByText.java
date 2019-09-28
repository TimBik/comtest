package com.itis.filters;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class FilterByText {

    public List<String> filter(List<String> list, String filterWord) {
        List<String> filtersList = new ArrayList<>();
        for (String s : list) {
            if (s.intern() == filterWord.intern()) filtersList.add(s);
        }
        return filtersList;
    }
}
