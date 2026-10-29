package com.google.android.gms.internal.mlkit_vision_face;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzdn {
    private final zzks zza;
    private final Boolean zzb;
    private final zzkh zzc = null;
    private final zzkd zzd;
    private final Integer zze;
    private final Integer zzf;

    public /* synthetic */ zzdn(zzdl zzdlVar, zzdm zzdmVar) {
        this.zza = zzdlVar.zza;
        this.zzb = zzdlVar.zzb;
        this.zzd = zzdlVar.zzc;
        this.zze = zzdlVar.zzd;
        this.zzf = zzdlVar.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdn)) {
            return false;
        }
        zzdn zzdnVar = (zzdn) obj;
        return k.b(this.zza, zzdnVar.zza) && k.b(this.zzb, zzdnVar.zzb) && k.b(null, null) && k.b(this.zzd, zzdnVar.zzd) && k.b(this.zze, zzdnVar.zze) && k.b(this.zzf, zzdnVar.zzf);
    }

    public final int hashCode() {
        return k.c(this.zza, this.zzb, null, this.zzd, this.zze, this.zzf);
    }

    @zzcu(zza = 4)
    public final zzkd zza() {
        return this.zzd;
    }

    @zzcu(zza = 1)
    public final zzks zzb() {
        return this.zza;
    }

    @zzcu(zza = 2)
    public final Boolean zzc() {
        return this.zzb;
    }

    @zzcu(zza = 5)
    public final Integer zzd() {
        return this.zze;
    }

    @zzcu(zza = 6)
    public final Integer zze() {
        return this.zzf;
    }
}
