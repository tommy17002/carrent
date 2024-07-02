package syad_tom.car_rent.service;

import syad_tom.car_rent.model.Brand;

import java.util.List;

public interface BrandService {
    List<BrandService> getAll();
    BrandService create(BrandService req);
    BrandService getOne(Integer id);
    BrandService update(BrandService req);
    void delete(Integer id);
}
