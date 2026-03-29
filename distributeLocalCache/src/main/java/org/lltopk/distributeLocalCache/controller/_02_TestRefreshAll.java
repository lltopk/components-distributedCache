package org.lltopk.distributeLocalCache.controller;

import lombok.extern.slf4j.Slf4j;
import org.lltopk.distributeLocalCache.cache.CacheFlushPublisher;
import org.lltopk.distributeLocalCache.model.form.UpdateSystemConfigForm;
import org.lltopk.distributeLocalCache.service.ISystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/updateDb")
@Slf4j
public class _02_TestRefreshAll {
    @Autowired
    private CacheFlushPublisher cacheFlushPublisher;;


    @PostMapping(value = "/refreshAll")
    public void publishFlushAllToTopic() {
        cacheFlushPublisher.publishFlushAllToTopic("BizStringCache");
        cacheFlushPublisher.publishFlushAllToTopic("BizListCache");
        cacheFlushPublisher.publishFlushAllToTopic("BizMapCache");
    }
}
