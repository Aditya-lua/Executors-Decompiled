package com.google.android.gms.internal.mlkit_vision_text_common;

import p305n9.C8947k;

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
        return C8947k.m36026b(this.zza, zzodVar.zza) && C8947k.m36026b(this.zzb, zzodVar.zzb) && C8947k.m36026b(null, null) && C8947k.m36026b(null, null);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, this.zzb, null, null);
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
