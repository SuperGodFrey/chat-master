package com.master.chat.common.config.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * 基础信息
 *
 * @author: Yang
 * @date: 2023/5/6
 * @version: 1.0.0
 * https://www.panday94.xyz
 * Copyright Ⓒ 2023 曜栋网络科技工作室 Limited All rights reserved.
 */
@Data
public class ExtraInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * oss类型
     */
    private Integer ossType;

    /**
     * 上传大小限制
     */
    private String uploadSize;

    /**
     * oss区域
     */
    private String endpoint;

    /**
     * oss仓库
     */
    private String bucketName;

    /**
     * osskey
     */
    private String ossKeyId;

    /**
     * oss密钥
     */
    private String ossKeySecret;

    /**
     * 短信类型
     */
    private Integer smsType;

    /**
     * 短信区域id
     */
    private String smsRegionId;

    /**
     * 短信应用id (阿里云sms没有)
     */
    private String smsAppId;

    /**
     * 短信key
     */
    private String smsKeyId;

    /**
     * 短信密钥
     */
    private String smsKeySecret;

    /**
     * 短信签名
     */
    private String smsSign;

    /**
     * 注册模版
     */
    private String registerTemplate;

}
