package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzjt {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzjt zza(Long l10) {
        this.zzc = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzb(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzd(Long l10) {
        this.zze = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zze(Long l10) {
        this.zzb = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzf(Long l10) {
        this.zzf = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjv zzg() {
        return new zzjv(this, null);
    }
}
