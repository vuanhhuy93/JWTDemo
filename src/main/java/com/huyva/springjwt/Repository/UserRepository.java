package com.huyva.springjwt.Repository;

import com.huyva.springjwt.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findUserByUsername(String username);
}
