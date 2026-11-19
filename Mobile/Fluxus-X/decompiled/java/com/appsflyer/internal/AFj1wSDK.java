package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.share.SessionReadyListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFj1wSDK {
    boolean AFKeystoreWrapper();

    boolean AFLogger();

    void R_(@NotNull Intent intent);

    void d();

    void d(@Nullable SessionReadyListener sessionReadyListener);

    void registerClient();
}
