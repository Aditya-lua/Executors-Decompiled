package com.google.android.gms.internal.mlkit_common;

import p305n9.C8947k;

/* JADX INFO: loaded from: classes.dex */
public final class zznl {
    private final zznh zza;
    private final zznj zzb = null;
    private final zznj zzc = null;
    private final Boolean zzd = null;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.mlkit_common.zzni.zzc():com.google.android.gms.internal.mlkit_common.zznl] */
    public /* synthetic */ zznl(zzni zzniVar, zznk zznkVar) {
        this.zza = zzniVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zznl) && C8947k.m36026b(this.zza, ((zznl) obj).zza) && C8947k.m36026b(null, null) && C8947k.m36026b(null, null) && C8947k.m36026b(null, null);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.zza, null, null, null);
    }

    @zzbc(zza = 1)
    public final zznh zza() {
        return this.zza;
    }
}
