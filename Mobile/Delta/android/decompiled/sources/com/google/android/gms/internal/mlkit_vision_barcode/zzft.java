package com.google.android.gms.internal.mlkit_vision_barcode;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzft {
    private final zzrb zza;
    private final Boolean zzc;
    private final zzvz zze;
    private final zzcs zzf;
    private final zzcs zzg;
    private final Boolean zzb = null;
    private final zzqk zzd = null;

    public /* synthetic */ zzft(zzfr zzfrVar, zzfs zzfsVar) {
        this.zza = zzfrVar.zza;
        this.zzc = zzfrVar.zzb;
        this.zze = zzfrVar.zzc;
        this.zzf = zzfrVar.zzd;
        this.zzg = zzfrVar.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        return k.b(this.zza, zzftVar.zza) && k.b(null, null) && k.b(this.zzc, zzftVar.zzc) && k.b(null, null) && k.b(this.zze, zzftVar.zze) && k.b(this.zzf, zzftVar.zzf) && k.b(this.zzg, zzftVar.zzg);
    }

    public final int hashCode() {
        return k.c(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @zzfe(zza = 6)
    public final zzcs zza() {
        return this.zzf;
    }

    @zzfe(zza = 7)
    public final zzcs zzb() {
        return this.zzg;
    }

    @zzfe(zza = 1)
    public final zzrb zzc() {
        return this.zza;
    }

    @zzfe(zza = 5)
    public final zzvz zzd() {
        return this.zze;
    }

    @zzfe(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
