package com.muhammet.controller;

import com.muhammet.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class MusteriController {
    private final MusteriService musteriService;
}
