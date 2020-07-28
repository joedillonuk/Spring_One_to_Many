package com.codeclan.example.Spring_files_folders.components;

import com.codeclan.example.Spring_files_folders.models.File;
import com.codeclan.example.Spring_files_folders.models.Folder;
import com.codeclan.example.Spring_files_folders.models.User;
import com.codeclan.example.Spring_files_folders.repositories.FileRepository;
import com.codeclan.example.Spring_files_folders.repositories.FolderRepository;
import com.codeclan.example.Spring_files_folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("John");
        userRepository.save(user1);

        User user2 = new User("Erica");
        userRepository.save(user2);

        User user3 = new User("Sally");
        userRepository.save(user3);

        Folder folder1 = new Folder("John's Files", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Erica's Files", user2);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Sally's Files", user3);
        folderRepository.save(folder3);

        File file1 = new File("Drawing", ".png", 10, folder1);
        fileRepository.save(file1);

        File file2 = new File("Words", ".doc", 5, folder2);
        fileRepository.save(file2);

        File file3 = new File("Money", ".xls", 20, folder3);
        fileRepository.save(file3);

        File file4 = new File("Print", ".pdf", 13, folder1);
        fileRepository.save(file4);

    }


}
