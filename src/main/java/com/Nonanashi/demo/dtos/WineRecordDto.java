package com.Nonanashi.demo.dtos;

import com.Nonanashi.demo.model.UserModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record WineRecordDto(@NotBlank String name, @NotNull float evaluation, @NotNull UserModel userId ) {
}
