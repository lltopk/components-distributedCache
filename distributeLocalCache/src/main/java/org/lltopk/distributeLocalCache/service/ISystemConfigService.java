package org.lltopk.distributeLocalCache.service;

import org.lltopk.distributeLocalCache.model.form.UpdateSystemConfigForm;
import org.lltopk.distributeLocalCache.model.po.SystemSettingPo;
import org.springframework.web.bind.annotation.RequestBody;

public interface ISystemConfigService {
    Boolean updateSystemConfig(UpdateSystemConfigForm form);

    SystemSettingPo getSystemConfig(String configKey);
}
