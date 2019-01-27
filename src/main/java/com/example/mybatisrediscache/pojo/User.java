package com.example.mybatisrediscache.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
@ApiModel
public class User implements Serializable {

    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "密码", required = true)
    private String pwd;

    @ApiModelProperty(value = "年龄", required = true)
    private String age;

    @ApiModelProperty(value = "联系方式", required = true)
    private String tel;

}
