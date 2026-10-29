package com.google.android.gms.internal.mlkit_vision_barcode;

import p305n9.C8947k;

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
        return C8947k.m36026b(this.zza, zzqkVar.zza) && C8947k.m36026b(this.zzb, zzqkVar.zzb) && C8947k.m36026b(null, null) && C8947k.m36026b(null, null);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, this.zzb, null, null);
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
