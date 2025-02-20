package com.iot.devicemanagement.repository;

import com.iot.devicemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository //
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
