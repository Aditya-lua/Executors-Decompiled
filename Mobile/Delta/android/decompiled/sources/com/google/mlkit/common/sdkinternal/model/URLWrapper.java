package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class URLWrapper {
    private final URL zza;

    public URLWrapper(@NonNull String str) {
        this.zza = new URL(str);
    }

    @NonNull
    public URLConnection openConnection() {
        return this.zza.openConnection();
    }
}
