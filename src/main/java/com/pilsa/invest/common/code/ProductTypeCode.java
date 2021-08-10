package com.pilsa.invest.common.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The enum Product type code.
 *
 * @author pilsa_home1
 * @since 2021 -07-11 오전 2:27
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ProductTypeCode implements EnumCode{

    REALTY("01", "부동산담보"),
    REALTY_PF("02", "부동산PF"),
    CREDIT("03", "신용");

    private String key;
    private String value;
}
