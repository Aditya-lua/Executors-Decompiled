package com.google.android.gms.internal.mlkit_vision_face;

import o9.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzkh {
    private final zzkf zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzkh(zzke zzkeVar, zzkg zzkgVar) {
        this.zza = zzkeVar.zza;
        this.zzb = zzkeVar.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        zzkh zzkhVar = (zzkh) obj;
        return q.b(this.zza, zzkhVar.zza) && q.b(this.zzb, zzkhVar.zzb) && q.b(null, null) && q.b(null, null);
    }

    public final int hashCode() {
        return q.c(this.zza, this.zzb, null, null);
    }

    @zzcu(zza = 1)
    public final zzkf zza() {
        return this.zza;
    }

    @zzcu(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
