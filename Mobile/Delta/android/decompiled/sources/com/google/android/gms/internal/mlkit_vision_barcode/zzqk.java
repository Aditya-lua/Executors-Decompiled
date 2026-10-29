package com.google.android.gms.internal.mlkit_vision_barcode;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzqk {
    private final zzqi zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzqk(zzqh zzqhVar, zzqj zzqjVar) {
        this.zza = zzqhVar.zza;
        this.zzb = zzqhVar.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return k.b(this.zza, zzqkVar.zza) && k.b(this.zzb, zzqkVar.zzb) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, this.zzb, null, null);
    }

    @zzfe(zza = 1)
    public final zzqi zza() {
        return this.zza;
    }

    @zzfe(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
