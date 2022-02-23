package com.example.awsproject.web.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDtoTest {

    @DisplayName("롬복 기능 테스트")
    @Test
    public void lombokTest() {
        //given
        String name = "test";
        int amount = 100;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertEquals(dto.getName(), name);
        assertEquals(dto.getAmount(), amount);
    }

}