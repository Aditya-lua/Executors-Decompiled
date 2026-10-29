package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i11));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar != null) {
            throw zzagVar.zza();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.zzb, this.zza, this);
        zzag zzagVar2 = this.zzc;
        if (zzagVar2 == null) {
            return zzaqVarZzg;
        }
        throw zzagVar2.zza();
    }
}
