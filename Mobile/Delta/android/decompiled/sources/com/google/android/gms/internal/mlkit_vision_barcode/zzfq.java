package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzfq {
    private zzft zza;
    private Integer zzb;
    private zzqd zzc;

    public final zzfq zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzfq zzb(zzqd zzqdVar) {
        this.zzc = zzqdVar;
        return this;
    }

    public final zzfq zzc(zzft zzftVar) {
        this.zza = zzftVar;
        return this;
    }

    public final zzfv zze() {
        return new zzfv(this, null);
    }
}
