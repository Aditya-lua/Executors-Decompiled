package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzcj extends zzbm {
    final transient Object[] zza;

    private zzcj(Object obj, Object[] objArr, int i10) {
        this.zza = objArr;
    }

    public static zzcj zzg(int i10, Object[] objArr, zzbl zzblVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzaq.zzb(obj, obj2);
        return new zzcj(null, objArr, 1);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.zza;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbf zza() {
        return new zzci(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbn zzd() {
        return new zzcg(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbn zze() {
        return new zzch(this, new zzci(this.zza, 0, 1));
    }
}
