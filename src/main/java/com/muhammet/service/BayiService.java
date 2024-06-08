package com.muhammet.service;

import com.muhammet.repository.BayiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BayiService {
    private final BayiRepository repository;
}
