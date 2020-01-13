package library.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "specimen")
public class Specimen {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "specimenId")
    private Long specimenId;

    @NotNull
    @Column(name = "titleId")
    private Long titleId;

    @Column(name = "status")
    private String status;
}
