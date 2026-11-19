package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzf.zza(i10, this.zza.zzc, "index");
        zzw zzwVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzwVar.zzb[i11];
        obj.getClass();
        Object obj2 = zzwVar.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
