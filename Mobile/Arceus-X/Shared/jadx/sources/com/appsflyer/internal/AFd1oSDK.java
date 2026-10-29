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

    /* JADX INFO: renamed from: d */
    @NonNull
    public final String f6909d;

    /* JADX INFO: renamed from: e */
    final boolean f6910e;
    public boolean force;

    /* JADX INFO: renamed from: i */
    boolean f6911i;
    final boolean registerClient;
    public final byte[] unregisterClient;

    /* JADX INFO: renamed from: v */
    public int f6912v;

    /* JADX INFO: renamed from: w */
    public boolean f6913w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10) {
        this(str, bArr, str2, map, z10, (byte) 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10, byte b) {
        this.f6911i = true;
        this.force = false;
        this.f6913w = true;
        this.f6912v = -1;
        this.f6909d = str;
        this.unregisterClient = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = map;
        this.registerClient = z10;
        this.f6910e = true;
    }

    public AFd1oSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
