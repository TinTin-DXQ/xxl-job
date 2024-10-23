package com.xxl.job.admin.service.impl;

import com.xxl.job.admin.service.BackupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xqding
 * @description
 * @date 2024/10/23 17:53
 */
@Service
public class BackupServiceImpl implements BackupService {

    @Autowired

    @Override
    public byte[] exportJob() {

        return new byte[0];
    }

    @Override
    public void importJob(MultipartFile file) {

    }
}
