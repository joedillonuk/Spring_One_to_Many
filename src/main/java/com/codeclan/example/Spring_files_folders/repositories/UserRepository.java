package com.codeclan.example.Spring_files_folders.repositories;

import com.codeclan.example.Spring_files_folders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
