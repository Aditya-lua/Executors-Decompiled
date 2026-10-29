package com.google.android.gms.internal.mlkit_vision_text_common;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzod {
    private final zzob zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzod(zzoa zzoaVar, zzoc zzocVar) {
        this.zza = zzoaVar.zza;
        this.zzb = zzoaVar.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzod)) {
            return false;
        }
        zzod zzodVar = (zzod) obj;
        return k.b(this.zza, zzodVar.zza) && k.b(this.zzb, zzodVar.zzb) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, this.zzb, null, null);
    }

    @zzcx(zza = 1)
    public final zzob zza() {
        return this.zza;
    }

    @zzcx(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
