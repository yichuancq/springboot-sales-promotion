package activity.domain.coupon;

import activity.domain.base.BaseEntity;
import activity.domain.coupon.enums.UseStatus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 优惠券历史记录
 */
@Entity
public class CouponHistory extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "coupon_history_id")
    private Long id;
    /**
     * 优惠券
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "coupon_id", referencedColumnName = "coupon_id")
    private Coupon coupon;
    /**
     * 使用状态：0->未使用；1->已使用；2->已过期'
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private UseStatus useStatus;
    /**
     * 优惠券码
     */
    private String couponCode;
    /**
     * 领取人昵称
     */
    private String memberNickName;
    /**
     * '获取类型：0->后台赠送；1->主动获取'
     */
    private String getType;
    /**
     * 会员id
     */
    private Long memberId;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 备注
     */
    private String memo;
}
