package ArchiForum.Repository;

import org.springframework.data.repository.CrudRepository;
import ArchiForum.Domain.Thread;

/**
 * Created by tmo on 27-2-2017.
 */
public interface ThreadRepository extends CrudRepository<Thread,Long> {
}
