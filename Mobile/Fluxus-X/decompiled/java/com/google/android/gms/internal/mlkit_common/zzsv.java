package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzsv {
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        try {
            if (zza == null) {
                zza = new zzsv();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
