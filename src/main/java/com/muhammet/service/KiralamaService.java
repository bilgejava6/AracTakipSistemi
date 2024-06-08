package com.muhammet.service;

import com.muhammet.dto.request.KiralamaEklemeRequestDto;
import com.muhammet.entity.Arac;
import com.muhammet.entity.Kiralama;
import com.muhammet.entity.enums.Durum;
import com.muhammet.exception.AracTakipException;
import com.muhammet.exception.ErrorType;
import com.muhammet.repository.KiralamaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KiralamaService {
    private final KiralamaRepository repository;
    private final MusteriService musteriService;
    private final AracService aracService;
    public void save(KiralamaEklemeRequestDto dto) {
        Long musteriId = dto.getMusteriId();
        if(Objects.isNull(musteriId)){
            // müşteri eklenecek
          musteriId = musteriService.saveAndGetId(dto.getMusteriAd(),
                  dto.getMusteriSoyad(),dto.getAdres(),
                  dto.getCinsiyet(),dto.getEhliyetTuru(),
                  dto.getTcKimlik(), dto.getTelefon());
        }
        // kiralama işlemlerini müşteriId yi kullanarak yapabilirim.
       if(!aracService.existById(dto.getAracId()))
           throw new AracTakipException(ErrorType.CAR_NOT_FOUND_ID_ERROR);
        Double birimFiyat = aracService.getBirimFiyat(dto.getAracId());

       repository.save(Kiralama.builder()
                       .musteriId(musteriId)
                       .aracId(dto.getAracId())
                       .durum(Durum.AKTIF)
                       .gun(dto.getGun())
                       .odemeDurum(dto.getOdemeDurum())
                       .odemeSekli(dto.getOdemeSekli())
                       .tarih(System.currentTimeMillis())
                       .birimFiyat(birimFiyat)
                       .toplamFiyat(birimFiyat*dto.getGun())
               .build());
    }
}
