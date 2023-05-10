package com.xzzzf.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("u_dict")
public class Udict {

    private Long dictid;

    private String ustatus;

    private String uvalue;
}
