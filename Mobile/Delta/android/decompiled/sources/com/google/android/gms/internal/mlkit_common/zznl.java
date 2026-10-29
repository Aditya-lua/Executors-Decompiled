package com.google.android.gms.internal.mlkit_common;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb = null;
    private final zznj zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        this.zza = zzniVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznl) && k.b(this.zza, ((zznl) obj).zza) && k.b(null, null) && k.b(null, null) && k.b(null, null);
    }

    public final int hashCode() {
        return k.c(this.zza, null, null, null);
    }

    @zzbc(zza = 1)
    public final zznh zza() {
        return this.zza;
    }
}
