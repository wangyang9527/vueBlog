package com.csii.shiro;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AccountProFile implements Serializable {

    private Long id;

    private String username;

    private String avatar;

    private String email;

}
