package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzoa {
    private zzob zza;
    private Integer zzb;

    public final zzoa zza(zzob zzobVar) {
        this.zza = zzobVar;
        return this;
    }

    public final zzoa zzb(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzod zzd() {
        return new zzod(this, null);
    }
}
