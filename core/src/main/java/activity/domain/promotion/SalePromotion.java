package activity.domain.promotion;

import activity.domain.promotion.enums.SalePromotionType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 促销管理
 * 促销类型一般包括：满减、满赠、满折、加价购、特价、套餐、预售、秒杀等
 */
@Entity
public class SalePromotion extends AbstractPromotion {

    @NotNull
    @Enumerated(EnumType.STRING)
    private SalePromotionType salePromotionType;

    /**
     * 促销方式详情
     */
    @Column(name = "sale_promotion_item_id")
    private AbstractPromotionItem abstractPromotionItem;

    /**
     * 获取促销方式
     */
    public AbstractPromotionItem getPromotionItem() {
        /**
         * 满减
         */
        if (salePromotionType.name().equals(SalePromotionType.FULL_DISCOUNT)) {
            return new FullReductionItem();
        }
        return abstractPromotionItem;
    }
}
