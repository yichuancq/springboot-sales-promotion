package activity.domain.goods;

import activity.domain.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 商品信息
 */
@Entity
public class Goods extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "goods_id")
    private Long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 价格
     */
    private BigDecimal salePrice;
    /**
     * 促销价格
     */
    private BigDecimal discountSalePrice;
    /**
     * 商品类别
     */
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
    private GoodsType goodsType;
}
