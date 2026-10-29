package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1vSDK {
    @NotNull
    List<AFc1sSDK> AFKeystoreWrapper();

    boolean AFLogger(@Nullable String str);

    void d();

    @Nullable
    String registerClient(@NotNull AFc1sSDK aFc1sSDK);

    void unregisterClient();
}
