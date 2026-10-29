package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFh1sSDK {
    void AFLogger();

    /* JADX INFO: renamed from: D_ */
    void mo8890D_(@NotNull Intent intent, @NotNull AFa1qSDK aFa1qSDK);

    /* JADX INFO: renamed from: d */
    void mo8891d();

    /* JADX INFO: renamed from: d */
    void mo8892d(@NotNull AFh1pSDK aFh1pSDK);

    void registerClient(@NotNull AFh1pSDK aFh1pSDK);

    boolean registerClient();

    void unregisterClient(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0);

    void unregisterClient(@NotNull AFh1pSDK aFh1pSDK);

    boolean unregisterClient();
}
