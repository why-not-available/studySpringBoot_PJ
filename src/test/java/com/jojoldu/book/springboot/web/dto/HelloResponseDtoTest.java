package com.jojoldu.book.springboot.web.dto;

import org.junit.jupiter.api.Test;
//import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {

    @Test
//  롬복 기능 테스트
    public void lombokTest(){

//      given
        String name = "test";
        int amount = 1000;

//      when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

//      then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
