package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
final class zzbb {
    public static int zza(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    public static int zzb(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZza = zzbc.zza(obj);
        int i11 = iZza & i10;
        int iZzc = zzc(obj3, i11);
        if (iZzc != 0) {
            int i12 = ~i10;
            int i13 = iZza & i12;
            int i14 = -1;
            while (true) {
                int i15 = iZzc - 1;
                int i16 = iArr[i15];
                int i17 = i16 & i10;
                if ((i16 & i12) != i13 || !zzw.zza(obj, objArr[i15]) || (objArr2 != null && !zzw.zza(obj2, objArr2[i15]))) {
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    iZzc = i17;
                } else {
                    if (i14 == -1) {
                        zze(obj3, i11, i17);
                        return i15;
                    }
                    iArr[i14] = (iArr[i14] & i12) | (i17 & i10);
                    return i15;
                }
            }
        }
        return -1;
    }

    public static int zzc(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static Object zzd(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    public static void zze(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
