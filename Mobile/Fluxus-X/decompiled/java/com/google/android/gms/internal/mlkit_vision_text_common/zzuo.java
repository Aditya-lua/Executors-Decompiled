package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzuo {
    private static zzuo zza;

    private zzuo() {
    }

    public static synchronized zzuo zza() {
        try {
            if (zza == null) {
                zza = new zzuo();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
