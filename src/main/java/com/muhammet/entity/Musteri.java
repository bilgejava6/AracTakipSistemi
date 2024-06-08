package com.muhammet.entity;

import com.muhammet.entity.enums.Cinsiyet;
import com.muhammet.entity.enums.EhliyetTuru;
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
@Table(name = "tblmusteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String adres;
    String tcKimlik;
    String telefon;
    Cinsiyet cinsiyet;
    EhliyetTuru ehliyetTuru;
    String not;
}
