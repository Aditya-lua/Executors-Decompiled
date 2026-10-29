package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.share.SessionReadyListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFj1wSDK {
    boolean AFKeystoreWrapper();

    boolean AFLogger();

    /* JADX INFO: renamed from: R_ */
    void mo8955R_(@NotNull Intent intent);

    /* JADX INFO: renamed from: d */
    void mo8956d();

    /* JADX INFO: renamed from: d */
    void mo8957d(@Nullable SessionReadyListener sessionReadyListener);

    void registerClient();
}
