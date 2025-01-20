package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.WikimediaDatabase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaDatabase, Long> {
}
