package syad_tom.car_rent.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer brand_id;
    private Boolean available;
    private Integer price;

    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnore
    private Rent rent;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;
}

