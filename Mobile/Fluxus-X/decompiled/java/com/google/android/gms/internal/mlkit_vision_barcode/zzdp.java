package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzdp extends zzcu {
    final transient Object[] zza;

    private zzdp(Object obj, Object[] objArr, int i10) {
        this.zza = objArr;
    }

    public static zzdp zzg(int i10, Object[] objArr, zzct zzctVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzby.zzb(obj, obj2);
        return new zzdp(null, objArr, 1);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu, java.util.Map
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    public final zzcn zza() {
        return new zzdo(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    public final zzcv zzd() {
        return new zzdm(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcu
    public final zzcv zze() {
        return new zzdn(this, new zzdo(this.zza, 0, 1));
    }
}
