package com.xxl.job.admin.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.xxl.job.admin.controller.annotation.PermissionLimit;
import com.xxl.job.admin.service.BackupService;
import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


/**
 * @author xqding
 * @description 备份恢复
 * @date 2024/10/23 17:22
 */
@Controller
@RequestMapping("/backup")
public class BackupController {

    @Autowired
    private BackupService backupService;


    /**
     * 导出任务
     *
     * @return
     */
    @RequestMapping("/export")
    @ResponseBody
    @PermissionLimit(adminuser = true)
    public ReturnT<byte[]> exportJob() {
        return new ReturnT<byte[]>(backupService.exportJob());
    }

    /**
     * 导入任务
     * @param file
     * @return
     */
    @RequestMapping("/import")
    @ResponseBody
    @PermissionLimit(adminuser = true)
    public ReturnT<String> importJob(MultipartFile file) {
        backupService.importJob(file);
        return ReturnT.SUCCESS;
    }
}
