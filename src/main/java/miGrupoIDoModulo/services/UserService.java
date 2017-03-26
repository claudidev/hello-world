package miGrupoIDoModulo.services;

import miGrupoIDoModulo.entidades.User;
import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    User save(User user);

    User update(User user);

    void delete(Long id);
}
