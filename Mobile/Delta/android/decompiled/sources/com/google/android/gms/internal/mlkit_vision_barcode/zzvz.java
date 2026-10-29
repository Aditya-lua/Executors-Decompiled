package com.google.android.gms.internal.mlkit_vision_barcode;

import n9.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzvz {
    private final zzcs zza;

    public /* synthetic */ zzvz(zzvx zzvxVar, zzvy zzvyVar) {
        this.zza = zzvxVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzvz) {
            return k.b(this.zza, ((zzvz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return k.c(this.zza);
    }

    @zzfe(zza = 1)
    public final zzcs zza() {
        return this.zza;
    }
}
