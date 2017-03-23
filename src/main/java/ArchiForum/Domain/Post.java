package ArchiForum.Domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by tmo on 27-2-2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue
    private int PostID;

    private String Message;

    private Date DateTime;

    @ManyToOne
    @JoinColumn(name = "ThreadID")
    private Thread thread;
}
