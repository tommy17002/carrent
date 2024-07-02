package syad_tom.car_rent.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "brand")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
}




