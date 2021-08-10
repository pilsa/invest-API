package com.pilsa.invest.common.web.vo.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The type Error response.
 * 애러를 응답할때 사용한다.
 *
 * @author pilsa_home1
 * @since 2021 -07-14 오후 7:10
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ErrorResponse {

    private String success;
    private Errors errors;

    /**
     * The type Errors.
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Builder
    public static class Errors {
        private String code;
        private String message;
    }

}
