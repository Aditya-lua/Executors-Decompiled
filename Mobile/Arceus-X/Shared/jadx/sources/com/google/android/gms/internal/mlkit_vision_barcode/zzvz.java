package com.google.android.gms.internal.mlkit_vision_barcode;

import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zzvz {
    private final zzcs zza;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.mlkit_vision_barcode.zzvx.zzc():com.google.android.gms.internal.mlkit_vision_barcode.zzvz] */
    public /* synthetic */ zzvz(zzvx zzvxVar, zzvy zzvyVar) {
        this.zza = zzvxVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzvz) {
            return C8947k.m36026b(this.zza, ((zzvz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza);
    }

    @zzfe(zza = 1)
    public final zzcs zza() {
        return this.zza;
    }
}
