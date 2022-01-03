package com.atguigu.gmall.pms.vo;

import com.alibaba.nacos.client.utils.StringUtils;
import com.atguigu.gmall.pms.entity.SpuAttrValueEntity;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import lombok.Data;

import java.util.List;

@Data
public class SpuAttrValueVo extends SpuAttrValueEntity {

    public void setValueSelected(List<Object> valueSelected){
        // 如果接受的集合为空，则不设置
        if (CollectionUtils.isEmpty(valueSelected)){
            return;
        }
        this.setAttrValue(StringUtils.join(valueSelected, ","));
    }

}
