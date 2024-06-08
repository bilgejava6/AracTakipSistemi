package com.muhammet.repository;

import com.muhammet.entity.Kiralama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KiralamaRepository  extends JpaRepository<Kiralama,Long> {
}
