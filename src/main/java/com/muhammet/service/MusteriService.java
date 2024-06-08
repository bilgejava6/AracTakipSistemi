package com.muhammet.service;

import com.muhammet.entity.Musteri;
import com.muhammet.entity.enums.Cinsiyet;
import com.muhammet.entity.enums.EhliyetTuru;
import com.muhammet.repository.MusteriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MusteriService {
    private final MusteriRepository repository;

    public Long saveAndGetId(String musteriAd, String musteriSoyad,
                             String adres, Cinsiyet cinsiyet,
                             EhliyetTuru ehliyetTuru,
                             String tcKimlik, String telefon) {

      Musteri musteri =  repository.save(Musteri.builder()
                        .ad(musteriAd)
                        .soyad(musteriSoyad)
                        .adres(adres)
                        .cinsiyet(cinsiyet)
                        .telefon(telefon)
                        .tcKimlik(tcKimlik)
                        .ehliyetTuru(ehliyetTuru)
                .build());
      return musteri.getId();
    }
}
