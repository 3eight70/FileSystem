package com.hits.FileSystem.Repositories;

import com.hits.FileSystem.Models.Entity.File;
import com.hits.FileSystem.Models.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<File, UUID> {
    File findFileByIdAndUser(UUID id, User user);

    List<File> findAllByUser(User user);
}
