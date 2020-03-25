package activity.domain.promotion;

import activity.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 满减促销明细parent
 */
@MappedSuperclass
public abstract class AbstractPromotionItem extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name = "promotion_item_id")
    private Long id;

    private  String name;
}
