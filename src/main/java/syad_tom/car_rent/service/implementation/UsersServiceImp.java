package syad_tom.car_rent.service.implementation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import syad_tom.car_rent.model.Users;
import syad_tom.car_rent.repository.UsersRepository;
import syad_tom.car_rent.service.UsersService;

@Service
@RequiredArgsConstructor
public class UsersServiceImp implements UsersService {
    private final UsersRepository userRepository;

    @Override
    public Users create(Users request) {
        return userRepository.save(request);
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users getOne(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Users update(Users request) {
        // get User
        Users users = this.getOne(request.getId());
        // ganti name
        users.setName(request.getName());
        // ganti balance
//        Balance balance = this.getOne(request.getBalance());
//        return userRepository.save(users);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}


