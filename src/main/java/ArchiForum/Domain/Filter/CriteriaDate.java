package ArchiForum.Domain.Filter;

import ArchiForum.Domain.Thread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jfahe on 3/15/2017.
 */
public class CriteriaDate implements Criteria {
    @Override
    public Iterable<Thread> meetCriteria(Iterable<Thread> threads, String dateString) {

        List<Thread> threadsFiltered = new ArrayList<Thread>();

        try {
            Date dateCriteria = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);

            for (Thread thread : threads) {
                if (dateCriteria.compareTo(thread.getDateTime()) == 0) ;
                threadsFiltered.add(thread);
            }

        } catch (Exception e) {
            System.out.println("error parsing string to date");
        }
        return threadsFiltered;
    }
}
