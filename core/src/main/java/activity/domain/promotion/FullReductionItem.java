package activity.domain.promotion;

import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * 满减促销明细
 */
@Entity
public class FullReductionItem extends AbstractPromotionItem {

    /**
     * 减满设置的金额
     */
    private BigDecimal settingPrice;

    /**
     * 抵扣的金额
     */
    private BigDecimal discountPrice;
}
