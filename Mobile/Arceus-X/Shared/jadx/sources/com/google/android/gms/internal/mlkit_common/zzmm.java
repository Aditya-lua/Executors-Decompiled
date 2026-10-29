package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public enum zzmm implements zzba {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmm(int i10) {
        this.zzd = i10;
    }

    public static zzmm zzb(int i10) {
        for (zzmm zzmmVar : values()) {
            if (zzmmVar.zzd == i10) {
                return zzmmVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzba
    public final int zza() {
        return this.zzd;
    }
}
