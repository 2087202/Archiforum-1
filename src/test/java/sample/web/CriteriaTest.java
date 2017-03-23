package sample.web;

import ArchiForum.Domain.Filter.CriteriaDate;
import ArchiForum.Domain.Filter.CriteriaSubject;
import ArchiForum.Domain.Thread;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by jfahe on 3/16/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class CriteriaTest {

    @Test
    public void test_filter_on_thread_subject_that_contains_word(){
        CriteriaSubject cs = new CriteriaSubject();

        Thread thread = new Thread();
        thread.setThreadID(1);
        thread.setSubject("Testing thread");

        Thread thread2 = new Thread();
        thread2.setThreadID(2);
        thread2.setSubject("abcdef");

        ArrayList<Thread> threads = new ArrayList<Thread>();
        threads.add(thread);
        threads.add(thread2);

        Iterable<Thread> t = threads;
        Iterable<Thread> threadsFiltered = cs.meetCriteria(t, "Test");

        Assert.assertEquals(1, threadsFiltered.spliterator().getExactSizeIfKnown());
        Assert.assertEquals("Testing thread", threadsFiltered.iterator().next().getSubject());
    }

    @Test
    public void test_filter_on_thread_date(){
        CriteriaDate cd = new CriteriaDate();

        Thread thread = new Thread();
        thread.setThreadID(12345);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date date = sdf.parse("14/05/2001");
            thread.setDateTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ArrayList<Thread> threads = new ArrayList<Thread>();
        threads.add(thread);

        Iterable<Thread> t = threads;
        Iterable<Thread> threadsFiltered = cd.meetCriteria(t, "14-05-2001");

        Assert.assertNotNull(threadsFiltered);
    }
}
