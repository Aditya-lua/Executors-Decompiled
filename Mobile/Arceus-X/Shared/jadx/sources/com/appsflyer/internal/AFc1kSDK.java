package com.appsflyer.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1kSDK {
    boolean AFKeystoreWrapper(String str);

    int AFLogger(String str, int i10);

    void AFLogger(String str);

    void AFLogger(String str, long j10);

    /* JADX INFO: renamed from: d */
    String mo8762d(String str);

    /* JADX INFO: renamed from: d */
    void mo8763d(String str, int i10);

    /* JADX INFO: renamed from: d */
    void mo8764d(String str, String str2);

    /* JADX INFO: renamed from: p_ */
    SharedPreferences mo8765p_();

    void registerClient(String str, boolean z10);

    boolean registerClient(String str);

    long unregisterClient(String str, long j10);
}
