package com.xxl.job.admin.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author xqding
 * @description
 * @date 2024/10/23 17:48
 */
public interface BackupService {

    /**
     * 导出任务到文件
     * @return
     */
    byte[] exportJob();

    /**
     * 导入任务
     * @param file
     */
    void importJob(MultipartFile file);
}
