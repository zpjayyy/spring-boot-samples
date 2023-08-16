package com.jay.springbootsamples.repository;

import com.jay.springbootsamples.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
