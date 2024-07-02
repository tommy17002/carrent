package syad_tom.car_rent.service;

import syad_tom.car_rent.model.Users;

import java.util.List;

public interface UsersService {
    Users create(Users request);
    List<Users> getAll();
    Users getOne(Integer id);
    Users update(Users request);
    void delete(Integer id);
}