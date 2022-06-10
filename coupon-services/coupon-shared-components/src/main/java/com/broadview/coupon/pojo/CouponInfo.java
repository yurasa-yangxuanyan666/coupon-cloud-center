package com.broadview.coupon.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponInfo {
    private long id;
    private long templateId;
    private long userId;
    private long shopId;
    private Integer status;
    private TemplateInfo template;
}
