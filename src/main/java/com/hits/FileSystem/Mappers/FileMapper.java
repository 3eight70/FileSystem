package com.hits.FileSystem.Mappers;

import com.hits.FileSystem.Models.Dto.FileDto.FileDto;
import com.hits.FileSystem.Models.Entity.File;
import com.hits.FileSystem.Models.Entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

public class FileMapper {
    public static File multipartFileToFile(MultipartFile file, User user) throws IOException {
        return new File(UUID.randomUUID(),
                LocalDateTime.now(),
                file.getOriginalFilename(),
                file.getContentType(),
                file.getSize(),
                file.getBytes(),
                user
        );
    }

    public static FileDto fileToFileDto(File file) {
        return new FileDto(
                file.getId(),
                file.getName(),
                file.getSize(),
                file.getDownloadTime()
        );
    }
}
