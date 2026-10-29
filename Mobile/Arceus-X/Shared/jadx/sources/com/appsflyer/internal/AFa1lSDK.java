package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFa1lSDK {
    /* JADX INFO: renamed from: d */
    void mo8703d(@NotNull Map<String, ? extends Object> map);

    void registerClient();

    @NotNull
    Map<String, Object> unregisterClient();
}
