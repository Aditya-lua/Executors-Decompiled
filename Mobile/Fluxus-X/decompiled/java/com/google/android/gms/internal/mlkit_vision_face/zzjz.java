package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public enum zzjz implements zzcs {
    UNKNOWN_CONTOURS(0),
    NO_CONTOURS(1),
    ALL_CONTOURS(2);

    private final int zze;

    zzjz(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}
