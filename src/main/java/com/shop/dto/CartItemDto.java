package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

//장바구니
//담을 상품 아이디와 수량
@Getter @Setter
public class CartItemDto {

    @NotNull(message = "상품 아이디는 필수 입력값입니다.")
    private Long itemId;

    @Min(value = 1, message = "최소 1개 이상 담아주세요.")
    private int count;

}
