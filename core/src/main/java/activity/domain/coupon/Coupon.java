package activity.domain.coupon;

import activity.domain.coupon.base.AbstractCoupon;
import activity.domain.coupon.enums.CouponType;
import activity.domain.coupon.enums.MemberType;
import activity.domain.coupon.enums.PlatformType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

/**
 * 优惠券
 */
@Entity
public class Coupon extends AbstractCoupon {
    /**
     * 历史记录
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coupon")
    List<CouponHistory> couponHistoryList;
    /**
     * 发行数量
     */
    private BigDecimal publishCount;
    /**
     * 每人限领张数
     */
    private BigDecimal perLimit;
    /**
     * 使用门槛
     */
    private BigDecimal minPoint;
    /**
     * 已使用数量
     */
    private BigDecimal useCount;

    /**
     * 领取数量
     */
    private BigDecimal receiveCount;
    /**
     * 优惠卷类型
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private CouponType couponType;
    /**
     * 使用平台
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private PlatformType platformType;

    /**
     * 可领取的会员类型
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private MemberType memberType;
    /**
     * 备注
     */
    private String memo;

}
