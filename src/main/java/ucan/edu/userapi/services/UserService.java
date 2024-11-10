package ucan.edu.userapi.services;


import ucan.edu.userapi.domain.User;
import ucan.edu.userapi.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
