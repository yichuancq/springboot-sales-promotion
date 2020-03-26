package activity.domain.coupon.base;

import activity.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractCoupon extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "coupon_id")
    private Long id;
    /**
     * 优惠码
     */
    private String couponCode;

    /**
     * 名称
     */
    private String name;
    /**
     * 数量
     */
    private BigDecimal count;
    /**
     * 金额
     */
    private BigDecimal couponMoney;

    /**
     * 开始使用时间
     */
    private LocalDateTime startTime;
    /**
     * 结束使用时间
     */
    private LocalDateTime endTime;

    /**
     * 可以领取的日期
     */
    private LocalDateTime enableTime;
}
