package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1uSDK {
    void AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull String str, int i10, @NotNull String str2);

    void AFKeystoreWrapper(@Nullable String str, @NotNull String str2);

    void AFLogger(@NotNull String str, @NotNull String str2);

    boolean AFLogger();

    void d();

    void d(@NotNull String str, @NotNull String... strArr);

    boolean i();

    void registerClient();

    void registerClient(@NotNull Throwable th2);

    void unregisterClient();

    void v_(@Nullable String str, @Nullable PackageManager packageManager);
}
