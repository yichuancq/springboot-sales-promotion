package activity.domain.activity.base;

import activity.domain.activity.enums.ActivityStatusEnum;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * 活动基类
 */
@MappedSuperclass
public class BaseActivity extends AbstractActivity {

    /**
     * 活动状态
     */
    @NotNull
    @Enumerated(EnumType.STRING)
   private ActivityStatusEnum activityStatusEnum;

}
