package com.muhammet.dto.request;

import com.muhammet.entity.enums.Cinsiyet;
import com.muhammet.entity.enums.EhliyetTuru;
import com.muhammet.entity.enums.OdemeDurum;
import com.muhammet.entity.enums.OdemeSekli;

public record KiralamaRequestDto(
        Long musteriId,
        String musteriAd,
        String musteriSoyad,
        String tcKimlik,
        String adres,
        String telefon,
        Cinsiyet cinsiyet,
        EhliyetTuru ehliyetTuru,
        Long aracId,
        Long gun,
        OdemeSekli odemeSekli,
        OdemeDurum odemeDurum
) {
}
