package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzqb {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzqb zza(Long l10) {
        this.zzc = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzb(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzd(Long l10) {
        this.zze = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zze(Long l10) {
        this.zzb = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzf(Long l10) {
        this.zzf = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqd zzg() {
        return new zzqd(this, null);
    }
}
