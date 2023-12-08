package com.Nonanashi.demo.dtos;

import io.micrometer.common.lang.NonNull;

public record UserRecordDto(@NonNull String emailUser,@NonNull String passwordUser ) {
    
}
