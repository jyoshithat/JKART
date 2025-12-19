package com.ecommerce.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.entity.User;
public class UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsername(String username);
    public Optional<User> findByEmail(String email);
    public Boolean existsByUsername(String username);
    public Boolean existsByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.username = ?1 OR u.email = ?2")
    public Optional<User> findByUsernameOrEmail(String username, String email);

}
