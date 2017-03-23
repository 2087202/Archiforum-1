package ArchiForum.Domain.Filter;

import ArchiForum.Domain.Thread;

/**
 * Created by jfahe on 3/17/2017.
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public Iterable<Thread> meetCriteria(Iterable<Thread> threads, String text) {
        Iterable<Thread> firstCriterialItems = criteria.meetCriteria(threads, text);
        return otherCriteria.meetCriteria(firstCriterialItems, text);
    }
}
