package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFd1oSDK {

    @NonNull
    final String AFKeystoreWrapper;

    @NonNull
    public final Map<String, String> AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final String f5281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f5282e;
    public boolean force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f5283i;
    final boolean registerClient;
    public final byte[] unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5284v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5285w;

    public AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10) {
        this(str, bArr, str2, map, z10, (byte) 0);
    }

    private AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10, byte b) {
        this.f5283i = true;
        this.force = false;
        this.f5285w = true;
        this.f5284v = -1;
        this.f5281d = str;
        this.unregisterClient = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = map;
        this.registerClient = z10;
        this.f5282e = true;
    }

    public AFd1oSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
