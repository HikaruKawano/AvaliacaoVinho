package com.Nonanashi.demo.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record WineRecordDto(@NotBlank String name, @NotNull float evaluation ) {
}
