package com.muhammet.service;

import com.muhammet.entity.Arac;
import com.muhammet.exception.AracTakipException;
import com.muhammet.exception.ErrorType;
import com.muhammet.repository.AracRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AracService {
    private final AracRepository repository;

    public boolean existById(Long aracId) {
        return repository.existsById(aracId);
    }

    public Double getBirimFiyat(Long aracId){
        Optional<Arac> arac = repository.findById(aracId);
        if (arac.isEmpty())
            throw new AracTakipException(ErrorType.CAR_NOT_FOUND_ID_ERROR);
        return arac.get().getFiyat();
    }
}
