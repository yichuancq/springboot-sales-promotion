package activity.domain.promotion;

import activity.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 促销
 */
@MappedSuperclass
public abstract class AbstractPromotion extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "sale_promotion_id")
    private Long id;
    private String name;
}
