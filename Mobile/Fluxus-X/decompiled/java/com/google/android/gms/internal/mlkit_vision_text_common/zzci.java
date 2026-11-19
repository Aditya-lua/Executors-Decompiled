package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzci extends zzbk {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    public zzci(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzx.zza(i10, this.zzc, "index");
        Object obj = this.zza[i10 + i10 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
