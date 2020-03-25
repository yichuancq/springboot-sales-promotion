package activity.domain.activity;

import activity.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 活动抽象类
 */
@MappedSuperclass
public abstract class AbstractActivity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "activity_id")
    private Long id;
    /**
     * 活动名称
     */
    private String  activityName;
}
