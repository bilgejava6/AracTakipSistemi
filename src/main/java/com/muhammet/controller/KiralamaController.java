package com.muhammet.controller;

import com.muhammet.dto.request.KiralamaEklemeRequestDto;
import com.muhammet.exception.AracTakipException;
import com.muhammet.exception.ErrorType;
import com.muhammet.service.KiralamaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static com.muhammet.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(KIRALAMA)
public class KiralamaController {
    private final KiralamaService kiralamaService;

    @PostMapping(ADD)
    public ResponseEntity<String> kiralama(@RequestBody @Valid KiralamaEklemeRequestDto dto){
       if(Objects.isNull(dto.getMusteriId())){
          if(Objects.isNull(dto.getMusteriAd())|| Objects.isNull(dto.getMusteriSoyad())){
              throw new AracTakipException(ErrorType.CUSTOMER_INVALID_PARAMETER_ERROR);
          }
       }
       kiralamaService.save(dto);
       return  ResponseEntity.ok("İşlem Başarılı");
    }
}
