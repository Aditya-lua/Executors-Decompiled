package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzms {
    private static zzmr zza;

    public static synchronized zzmj zza(zzme zzmeVar) {
        try {
            if (zza == null) {
                zza = new zzmr(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzmj) zza.get(zzmeVar);
    }

    public static synchronized zzmj zzb(String str) {
        return zza(zzme.zzd("vision-common").zzd());
    }
}
