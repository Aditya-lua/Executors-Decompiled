package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
public final class zznu {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zznu zza(Long l10) {
        this.zzc = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzb(Long l10) {
        this.zzd = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzd(Long l10) {
        this.zze = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zze(Long l10) {
        this.zzb = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzf(Long l10) {
        this.zzf = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznw zzg() {
        return new zznw(this, null);
    }
}
