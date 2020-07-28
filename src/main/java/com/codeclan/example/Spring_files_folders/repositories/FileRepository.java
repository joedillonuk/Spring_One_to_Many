package com.codeclan.example.Spring_files_folders.repositories;

import com.codeclan.example.Spring_files_folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
