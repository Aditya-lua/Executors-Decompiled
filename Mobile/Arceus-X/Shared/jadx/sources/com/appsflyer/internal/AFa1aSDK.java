package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFa1aSDK {
    void AFLogger(boolean z10);

    @Nullable
    /* JADX INFO: renamed from: d */
    Map<String, Object> mo8701d();

    boolean registerClient();

    void unregisterClient();
}
