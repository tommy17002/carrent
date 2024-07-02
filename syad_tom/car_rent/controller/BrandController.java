package syad_tom.car_rent.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import syad_tom.car_rent.model.Brand;
import syad_tom.car_rent.service.BrandService;

import java.util.List;

@RestController
@RequestMapping("/brands")
@RequiredArgsConstructor
public class BrandController {
    private final BrandService brandService;

    @PostMapping
    public Brand create(@RequestBody Brand req) {
        return brandService.create(req);
    }

    @GetMapping
    public List<Brand> getAll() {
        return brandService.getAll();
    }
}

