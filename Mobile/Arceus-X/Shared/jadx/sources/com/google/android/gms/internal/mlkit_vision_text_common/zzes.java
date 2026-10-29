package com.google.android.gms.internal.mlkit_vision_text_common;

import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zzes {
    private final zzou zza;
    private final Boolean zzc;
    private final zzsd zze;
    private final Boolean zzb = null;
    private final zzod zzd = null;

    public /* synthetic */ zzes(zzeq zzeqVar, zzer zzerVar) {
        this.zza = zzeqVar.zza;
        this.zzc = zzeqVar.zzb;
        this.zze = zzeqVar.zzc;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        return C8947k.m36026b(this.zza, zzesVar.zza) && C8947k.m36026b(null, null) && C8947k.m36026b(this.zzc, zzesVar.zzc) && C8947k.m36026b(null, null) && C8947k.m36026b(this.zze, zzesVar.zze);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, null, this.zzc, null, this.zze);
    }

    @zzcx(zza = 1)
    public final zzou zza() {
        return this.zza;
    }

    @zzcx(zza = 5)
    public final zzsd zzb() {
        return this.zze;
    }

    @zzcx(zza = 3)
    public final Boolean zzc() {
        return this.zzc;
    }
}
