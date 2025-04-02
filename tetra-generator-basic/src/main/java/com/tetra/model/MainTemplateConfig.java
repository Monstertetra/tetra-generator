package com.tetra.model;

import lombok.Data;

/**
 * 静态模板配置
 */
@Data
public class MainTemplateConfig {

    /**
     * 作者
     */
    private String author = "Tetra";

    /**
     * 输出信息
     */
    private String outputText = "输出结果";

    /**
     * 是否循环
     */
    private boolean loop = true;
}
