package com.master.chat.llm.spark.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 讯飞星火请求头信息
 *
 * @author: Yang
 * @date: 2024/05/30
 * @version: 1.1.7
 * https://www.panday94.xyz
 * Copyright Ⓒ 2023 曜栋网络科技工作室 Limited All rights reserved.
 */
@Data
public class ChatHeader implements Serializable {
    private static final long serialVersionUID = -1426143090218924505L;

    /**
     * 应用appid，从开放平台控制台创建的应用中获取<br/>
     * 必传
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * 每个用户的id，用于区分不同用户<br/>
     * 非必传，最大长度32
     */
    private String uid = "12345";

}
