package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zzmu {
    public static void zza(zzmj zzmjVar, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzmjVar.zzc(zzc(i10, i11, j10, i12, i13, i14, i15), zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(zzmj zzmjVar, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzmjVar.zzc(zzc(i10, i11, j10, i12, i13, i14, i15), zziv.ODML_IMAGE);
    }

    private static zzmt zzc(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new zzmt(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}
