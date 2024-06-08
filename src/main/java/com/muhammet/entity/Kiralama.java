package com.muhammet.entity;

import com.muhammet.entity.enums.Durum;
import com.muhammet.entity.enums.OdemeDurum;
import com.muhammet.entity.enums.OdemeSekli;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblkiralama")
public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long aracId;
    Long musteriId;
    Long tarih;
    Double birimFiyat;
    Long gun;
    Double toplamFiyat;
    OdemeSekli odemeSekli;
    OdemeDurum odemeDurum;
    Long iadeTarihi;
    Durum durum;
}
