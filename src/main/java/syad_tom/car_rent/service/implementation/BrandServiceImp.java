package syad_tom.car_rent.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import syad_tom.car_rent.model.Brand;
import syad_tom.car_rent.repository.BrandRepository;
import syad_tom.car_rent.service.BrandService;

import java.util.List;

public class BrandServiceImp implements BrandService {
    private final BrandRepository brandRepository;
    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand create(Brand req) {
        return brandRepository.save(req);
    }

    @Override
    public Brand getOne(Integer id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public Brand update(Brand req) {
        return brandRepository.save(req);
    }

    @Override
    public void delete(Integer id) {
        brandRepository.deleteById(id);
    }
}
