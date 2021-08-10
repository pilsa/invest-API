package com.pilsa.invest.biz.service.dto;

import com.pilsa.invest.common.code.SortOptionCode;
import lombok.*;

/**
 * The type Invest condition.
 *
 * @author pilsa_home1
 * @since 2021 -07-11 오전 2:27
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class InvestCondition {

    private SortOptionCode sortOptionCode;      /* 정렬옵션 */

    private String productId;                   /* 상품ID */
    private long memberNum;                     /* 회원번호 */
    private int investAmount;                   /* 투자금액 */

}
