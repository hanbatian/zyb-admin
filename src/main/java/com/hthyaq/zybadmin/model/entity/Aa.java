package com.hthyaq.zybadmin.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hk
 * @since 2019-08-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Aa implements Serializable {

    private static final long serialVersionUID = 1L;
    /*@TableId  指定主键,可以在全局的主键策略配置里value配置为0，则此注解可以不用*/
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;


}
