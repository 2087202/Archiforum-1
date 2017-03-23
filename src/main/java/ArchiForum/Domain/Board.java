package ArchiForum.Domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by tmo on 27-2-2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Board {

    @Id
    @GeneratedValue
    public int BoardID;

    private String name;

    private String Description;

    private int NumberOfThreads;

    private String BoardCategory;
}
