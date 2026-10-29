package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class zzbg extends zzbh {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzbg(int i10) {
    }

    private final void zzb(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i11);
        this.zzc = false;
    }

    public final zzbg zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
