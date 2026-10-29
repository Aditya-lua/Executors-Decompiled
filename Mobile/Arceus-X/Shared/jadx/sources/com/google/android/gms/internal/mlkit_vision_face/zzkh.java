package com.google.android.gms.internal.mlkit_vision_face;

import p305n9.C8947k;

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
        return C8947k.m36026b(this.zza, zzkhVar.zza) && C8947k.m36026b(this.zzb, zzkhVar.zzb) && C8947k.m36026b(null, null) && C8947k.m36026b(null, null);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, this.zzb, null, null);
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
