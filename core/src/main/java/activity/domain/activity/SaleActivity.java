package activity.domain.activity;

import activity.domain.goods.Goods;
import activity.domain.goods.GoodsType;
import activity.domain.promotion.SalePromotion;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 销售活动
 */
@Entity
public class SaleActivity extends BaseActivity {

    /**
     * 活动开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime activityStartTime;
    /**
     * 活动结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime getActivityEndTime;
    /**
     * 促销关联多商品
     */
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Goods> goodsList;
    /**
     * 促销关联的商品类别
     */
    @ManyToMany(fetch = FetchType.LAZY)
    private List<GoodsType> goodsTypeList;

    /**
     * 一个活动对应多个促销类型
     */
    @OneToMany(fetch = FetchType.LAZY)
    private List<SalePromotion> salePromotionList;

}
