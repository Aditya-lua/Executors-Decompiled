package com.appsflyer.internal;

import com.appsflyer.share.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFj1cSDK {
    @NotNull
    Map<String, Object> AFLogger();

    void registerClient(@NotNull PluginInfo pluginInfo);

    @NotNull
    String unregisterClient();
}
