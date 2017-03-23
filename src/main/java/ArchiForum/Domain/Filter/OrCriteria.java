package ArchiForum.Domain.Filter;

import ArchiForum.Domain.Thread;

import java.util.List;

/**
 * Created by jfahe on 3/17/2017.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public Iterable<Thread> meetCriteria(Iterable<Thread> threads, String text) {

        List<Thread> firstCriteriaItems = (List<Thread>) criteria.meetCriteria(threads, text);
        List<Thread> otherCriteriaItems = (List<Thread>) otherCriteria.meetCriteria(threads, text);

        for (Thread thread : threads){
            if(!firstCriteriaItems.contains(thread)){
                firstCriteriaItems.add(thread);
            }
        }

        return firstCriteriaItems;
    }
}
