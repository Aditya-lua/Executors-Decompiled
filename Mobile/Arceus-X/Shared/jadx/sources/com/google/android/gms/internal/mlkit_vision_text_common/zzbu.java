package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class zzbu {
    public static List zza(List list, zzu zzuVar) {
        return list instanceof RandomAccess ? new zzbr(list, zzuVar) : new zzbt(list, zzuVar);
    }
}
