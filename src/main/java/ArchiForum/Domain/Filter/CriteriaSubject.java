package ArchiForum.Domain.Filter;

import ArchiForum.Domain.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jfahe on 3/14/2017.
 */
public class CriteriaSubject implements Criteria {
    @Override
    public Iterable<Thread> meetCriteria(Iterable<Thread> threads, String subject) {
        List<Thread> threadsFiltered = new ArrayList<Thread>();

        for (Thread thread : threads) {
            if(thread.getSubject().indexOf(subject) > -1){
                threadsFiltered.add(thread);
            }
        }
        return threadsFiltered;
    }
}
