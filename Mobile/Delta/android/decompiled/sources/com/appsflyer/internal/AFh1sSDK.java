package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFh1sSDK {
    void AFLogger();

    void D_(@NotNull Intent intent, @NotNull AFa1qSDK aFa1qSDK);

    void d();

    void d(@NotNull AFh1pSDK aFh1pSDK);

    void registerClient(@NotNull AFh1pSDK aFh1pSDK);

    boolean registerClient();

    void unregisterClient(@NotNull AFf1uSDK aFf1uSDK, @NotNull Function0<Unit> function0);

    void unregisterClient(@NotNull AFh1pSDK aFh1pSDK);

    boolean unregisterClient();
}
