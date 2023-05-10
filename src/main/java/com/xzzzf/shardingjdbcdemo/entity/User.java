package com.xzzzf.shardingjdbcdemo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_user")
public class User {

    private Long userId;

    private String username;

    private String ustatus;
}
