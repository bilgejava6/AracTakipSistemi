package com.muhammet.controller;

import com.muhammet.service.BayiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class BayiController {
    private final BayiService bayiService;
}
