package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class zzan implements zzcc {
    private transient Set zza;
    private transient Map zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcc) {
            return zzn().equals(((zzcc) obj).zzn());
        }
        return false;
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    public abstract Map zzh();

    public abstract Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public boolean zzm(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Map zzn() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        Map mapZzh = zzh();
        this.zzb = mapZzh;
        return mapZzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final Set zzo() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZzi = zzi();
        this.zza = setZzi;
        return setZzi;
    }
}
