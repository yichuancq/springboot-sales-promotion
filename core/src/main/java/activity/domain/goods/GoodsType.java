package activity.domain.goods;

import activity.domain.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class GoodsType extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "goods_type_id")
    private Long id;
    /**
     * 父编码
     */
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_Id")
    @JsonIgnore
    private GoodsType parent;
    /**
     * 类型名称
     */
    @Column(unique = true)
    private String typeName;
    /**
     * 商品类别
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent", fetch = FetchType.EAGER)
    private List<GoodsType> goodsTypeList;
}
