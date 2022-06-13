package com.broadview.coupon.beans.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponInfo {
    private Long id;
    private Long templateId;
    private Long userId;
    private Long shopId;
    private Integer status;
    private TemplateInfo template;
}
