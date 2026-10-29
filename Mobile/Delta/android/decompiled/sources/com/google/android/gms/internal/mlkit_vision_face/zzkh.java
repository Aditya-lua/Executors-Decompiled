package com.google.android.gms.internal.mlkit_vision_face;

import n9.k;

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
        return k.b(this.zza, zzkhVar.zza) && k.b(this.zzb, zzkhVar.zzb) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, this.zzb, null, null);
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
