package com.google.android.gms.internal.mlkit_vision_face;

import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zzkd {
    private final zzka zza;
    private final zzjy zzb;
    private final zzkb zzc;
    private final zzjz zzd;
    private final Boolean zze;
    private final Float zzf;

    public /* synthetic */ zzkd(zzjx zzjxVar, zzkc zzkcVar) {
        this.zza = zzjxVar.zza;
        this.zzb = zzjxVar.zzb;
        this.zzc = zzjxVar.zzc;
        this.zzd = zzjxVar.zzd;
        this.zze = zzjxVar.zze;
        this.zzf = zzjxVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkd)) {
            return false;
        }
        zzkd zzkdVar = (zzkd) obj;
        return C8947k.m36026b(this.zza, zzkdVar.zza) && C8947k.m36026b(this.zzb, zzkdVar.zzb) && C8947k.m36026b(this.zzc, zzkdVar.zzc) && C8947k.m36026b(this.zzd, zzkdVar.zzd) && C8947k.m36026b(this.zze, zzkdVar.zze) && C8947k.m36026b(this.zzf, zzkdVar.zzf);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    @zzcu(zza = 2)
    public final zzjy zza() {
        return this.zzb;
    }

    @zzcu(zza = 4)
    public final zzjz zzb() {
        return this.zzd;
    }

    @zzcu(zza = 1)
    public final zzka zzc() {
        return this.zza;
    }

    @zzcu(zza = 3)
    public final zzkb zzd() {
        return this.zzc;
    }

    @zzcu(zza = 5)
    public final Boolean zze() {
        return this.zze;
    }

    @zzcu(zza = 6)
    public final Float zzf() {
        return this.zzf;
    }
}
