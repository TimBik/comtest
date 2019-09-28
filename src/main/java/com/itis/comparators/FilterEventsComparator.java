package com.itis.comparators;

import com.itis.models.Event;
import com.itis.models.Organization;

import java.util.Comparator;
import java.util.Date;
import java.util.Optional;

public class FilterEventsComparator implements Comparator<Event> {
    /*
    String name;
long target;
String description;
Date publication;
Date deadLine;
    private Organization organization;

     */
    @Override
    public int compare(Event o1, Event o2) {
        if(compareName(o1.getName(),o2.getName()) &&
        compareLong(o1.getTarget(),o2.getTarget()) &&
        compareDate(o1.getPublication(),o2.getPublication()) &&
        compareOrganization(o1.getOrganization(),o2.getOrganization())){
            return 0;
        }
        return 1;
    }

    private boolean compareOrganization(Organization organization, Organization organization1) {
        return organization == null || organization1 == null ||
                organization.equals(organization1)? true :false;
    }

    private boolean compareDate(Date publication, Date publication1) {
        return publication == null || publication1 == null ||
                publication.equals(publication1)? true :false;

    }

    private boolean compareLong(long target, long target1) {
        return (Long)target == null || (Long)target1 == null ||
                target == target1 ? true :false;
    }

    private boolean compareName(String name, String name1) {
        return name == null || name1 == null ||
                name.intern() == name1.intern() ? true :false;
    }
}
