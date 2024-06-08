package com.muhammet.entity;

import com.muhammet.entity.enums.Musaitlik;
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
@Table(name = "tblarac")
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long bayiId;
    String marka;
    String model;
    String plaka;
    String renk;
    Integer tescilTarihi;
    String aciklama;
    Musaitlik musaitlik;
    Double fiyat;
}
