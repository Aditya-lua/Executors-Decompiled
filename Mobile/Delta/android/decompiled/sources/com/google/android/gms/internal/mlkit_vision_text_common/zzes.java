package com.google.android.gms.internal.mlkit_vision_text_common;

import n9.k;

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
        return k.b(this.zza, zzesVar.zza) && k.b(null, null) && k.b(this.zzc, zzesVar.zzc) && k.b(null, null) && k.b(this.zze, zzesVar.zze);
    }

    public final int hashCode() {
        return k.c(this.zza, null, this.zzc, null, this.zze);
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
