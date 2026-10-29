package com.google.android.gms.internal.mlkit_vision_text_common;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzsd {
    private final zzsb zza;
    private final Boolean zzb = null;
    private final String zzc = null;

    public /* synthetic */ zzsd(zzsa zzsaVar, zzsc zzscVar) {
        this.zza = zzsaVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzsd) && k.b(this.zza, ((zzsd) obj).zza) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, null, null);
    }

    @zzcx(zza = 3)
    public final zzsb zza() {
        return this.zza;
    }
}
