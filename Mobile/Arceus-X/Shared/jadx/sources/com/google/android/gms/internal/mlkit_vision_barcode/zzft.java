package com.google.android.gms.internal.mlkit_vision_barcode;

import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zzft {
    private final zzrb zza;
    private final Boolean zzc;
    private final zzvz zze;
    private final zzcs zzf;
    private final zzcs zzg;
    private final Boolean zzb = null;
    private final zzqk zzd = null;

    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.gms.internal.mlkit_vision_barcode.zzfr.zzi(com.google.android.gms.internal.mlkit_vision_barcode.zzfr):com.google.android.gms.internal.mlkit_vision_barcode.zzrb */
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
        return C8947k.m36026b(this.zza, zzftVar.zza) && C8947k.m36026b(null, null) && C8947k.m36026b(this.zzc, zzftVar.zzc) && C8947k.m36026b(null, null) && C8947k.m36026b(this.zze, zzftVar.zze) && C8947k.m36026b(this.zzf, zzftVar.zzf) && C8947k.m36026b(this.zzg, zzftVar.zzg);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
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
