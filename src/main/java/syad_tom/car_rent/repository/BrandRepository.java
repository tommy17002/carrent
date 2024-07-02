package syad_tom.car_rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import syad_tom.car_rent.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}

