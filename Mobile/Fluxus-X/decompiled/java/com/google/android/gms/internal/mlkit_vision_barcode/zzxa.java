package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzxa {
    private static zzwz zza;

    public static synchronized zzwp zza(zzwh zzwhVar) {
        try {
            if (zza == null) {
                zza = new zzwz(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzwp) zza.get(zzwhVar);
    }

    public static synchronized zzwp zzb(String str) {
        return zza(zzwh.zzd(str).zzd());
    }
}
