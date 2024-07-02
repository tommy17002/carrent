package syad_tom.car_rent.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "rent")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean completed;
    private Integer car_id;
    private Integer user_id;
    private Date started_at;
    private Date end_at;
    private Integer price;

    @OneToMany
    @JoinColumn(name="car_id")
    @JsonIgnore
    private Car car;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users users;
}
