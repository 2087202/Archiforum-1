package ArchiForum.Repository;

import ArchiForum.Domain.Board;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by tmo on 27-2-2017.
 */
public interface BoardRepository extends CrudRepository<Board,Long> {
}
