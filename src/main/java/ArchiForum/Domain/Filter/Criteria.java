package ArchiForum.Domain.Filter;

import ArchiForum.Domain.Thread;

/**
 * Created by jfahe on 3/14/2017.
 */
public interface Criteria {
    public Iterable<Thread> meetCriteria(Iterable<Thread> threads, String text);
}
