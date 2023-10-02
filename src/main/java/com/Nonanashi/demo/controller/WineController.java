package com.Nonanashi.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Nonanashi.demo.dtos.WineRecordDto;
import com.Nonanashi.demo.model.WineModel;
import com.Nonanashi.demo.repositories.WineRepository;



import jakarta.validation.Valid;

public class WineController {
    
    @Autowired
    WineRepository wineRepository;

    @PostMapping("/wine")
    public ResponseEntity<WineModel> saveWine(@RequestBody @Valid WineRecordDto wineRecordDto){
        var wineModel = new WineModel();
        BeanUtils.copyProperties(wineRecordDto, wineModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(wineRepository.save(wineModel));
    }
}
