package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh extends zzbd {
    public zzbh() {
        super(4);
    }

    public final zzbh zza(Object obj) {
        obj.getClass();
        int i10 = this.zzb;
        int i11 = i10 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i12);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i13 = this.zzb;
        this.zzb = i13 + 1;
        objArr2[i13] = obj;
        return this;
    }

    public final zzbk zzb() {
        this.zzc = true;
        return zzbk.zzg(this.zza, this.zzb);
    }
}
