package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzxb {
    private static zzxb zza;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        try {
            if (zza == null) {
                zza = new zzxb();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
