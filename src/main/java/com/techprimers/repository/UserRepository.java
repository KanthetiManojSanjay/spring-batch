package com.techprimers.repository;

import com.techprimers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kansanja on 26/11/21.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
