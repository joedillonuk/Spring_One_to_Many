package com.codeclan.example.Spring_files_folders.repositories;

import com.codeclan.example.Spring_files_folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
