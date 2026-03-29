package org.lltopk.distributeLocalCache.controller;

import lombok.extern.slf4j.Slf4j;
import org.lltopk.distributeLocalCache.cache.CacheFlushPublisher;
import org.lltopk.distributeLocalCache.model.po.SystemSettingPo;
import org.lltopk.distributeLocalCache.service.ISystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getAgainAfterCacheInvalid")
@Slf4j
public class _01_TestGetAgainAfterCacheInvalid {
    @Autowired
    private ISystemConfigService systemConfigService;

    @PostMapping(value = "/getAgain")
    public SystemSettingPo getSystemConfig(@RequestParam("configKey") String configKey) {
        return systemConfigService.getSystemConfig(configKey);
    }

}
