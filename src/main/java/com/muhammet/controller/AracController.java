package com.muhammet.controller;

import com.muhammet.service.AracService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class AracController {
    private final AracService aracService;
}
