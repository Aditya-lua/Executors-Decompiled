package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzoo {
    private static zzoo zza;

    private zzoo() {
    }

    public static synchronized zzoo zza() {
        try {
            if (zza == null) {
                zza = new zzoo();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
