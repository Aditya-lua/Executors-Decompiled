package com.google.android.gms.internal.mlkit_vision_text_common;

import o9.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzsd {
    private final zzsb zza;
    private final Boolean zzb = null;
    private final String zzc = null;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        this.zza = zzsaVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzsd) && q.b(this.zza, ((zzsd) obj).zza) && q.b(null, null) && q.b(null, null);
    }

    public final int hashCode() {
        return q.c(this.zza, null, null);
    }

    @zzcx(zza = 3)
    public final zzsb zza() {
        return this.zza;
    }
}
