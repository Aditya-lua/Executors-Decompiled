package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1rSDK {
    void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK);

    void AFKeystoreWrapper(@NotNull Map<String, Object> map);

    void AFLogger(@NotNull AFh1pSDK aFh1pSDK);

    void AFLogger(@NotNull Map<String, Object> map);

    /* JADX INFO: renamed from: d */
    void mo8882d(@NotNull AFh1pSDK aFh1pSDK);

    /* JADX INFO: renamed from: d */
    void mo8883d(@NotNull Map<String, Object> map);

    void registerClient(@NotNull AFh1pSDK aFh1pSDK);

    void registerClient(@NotNull Map<String, Object> map);

    long unregisterClient();

    void unregisterClient(@NotNull AFh1pSDK aFh1pSDK);

    void unregisterClient(@NotNull Map<String, Object> map);

    void unregisterClient(@NotNull Map<String, Object> map, int i10, int i11);

    void unregisterClient(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK);
}
