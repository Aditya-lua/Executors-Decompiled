package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzke {
    private zzkf zza;
    private Integer zzb;

    public final zzke zza(zzkf zzkfVar) {
        this.zza = zzkfVar;
        return this;
    }

    public final zzke zzb(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzkh zzd() {
        return new zzkh(this, null);
    }
}
