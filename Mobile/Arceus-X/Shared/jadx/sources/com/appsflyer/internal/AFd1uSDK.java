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

    /* JADX INFO: renamed from: d */
    void mo8786d();

    /* JADX INFO: renamed from: d */
    void mo8787d(@NotNull String str, @NotNull String... strArr);

    /* JADX INFO: renamed from: i */
    boolean mo8788i();

    void registerClient();

    void registerClient(@NotNull Throwable th2);

    void unregisterClient();

    /* JADX INFO: renamed from: v_ */
    void mo8789v_(@Nullable String str, @Nullable PackageManager packageManager);
}
