package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1bSDK {
    public final WeakReference<Context> AFKeystoreWrapper;
    public String unregisterClient;

    public AFj1bSDK(@NonNull Context context) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
    }
}
