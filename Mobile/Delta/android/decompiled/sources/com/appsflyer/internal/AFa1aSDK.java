package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFa1aSDK {
    void AFLogger(boolean z10);

    @Nullable
    Map<String, Object> d();

    boolean registerClient();

    void unregisterClient();
}
