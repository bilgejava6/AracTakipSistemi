package com.muhammet.dto.request;

import com.muhammet.entity.enums.Cinsiyet;
import com.muhammet.entity.enums.EhliyetTuru;
import com.muhammet.entity.enums.OdemeDurum;
import com.muhammet.entity.enums.OdemeSekli;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KiralamaEklemeRequestDto {
    /**
     * Eğer müşteri kayıtlı ise, müşteri listesinden
     * seçilerek id bilgisi iletilir. Ayrıca müşteri bilgileri
     * çekilmez.
     */

    Long musteriId;
    String musteriAd;
    String musteriSoyad;
    String tcKimlik;
    String adres;
    String telefon;
    Cinsiyet cinsiyet;
    EhliyetTuru ehliyetTuru;

    @NotNull
    Long aracId;
    @NotNull
    @Min(value = 1)
    @Max(value = 180)
    Long gun;
    OdemeSekli odemeSekli;
    OdemeDurum odemeDurum;

}
