package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzun {
    private static zzum zza;

    public static synchronized zzuc zza(zztu zztuVar) {
        try {
            if (zza == null) {
                zza = new zzum(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzuc) zza.get(zztuVar);
    }

    public static synchronized zzuc zzb(String str) {
        return zza(zztu.zzd(str).zzd());
    }
}
