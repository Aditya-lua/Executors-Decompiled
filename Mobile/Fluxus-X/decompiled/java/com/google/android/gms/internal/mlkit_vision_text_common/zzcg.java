package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzcg extends zzbn {
    private final transient zzbm zza;
    private final transient Object[] zzb;
    private final transient int zzc = 1;

    public zzcg(zzbm zzbmVar, Object[] objArr, int i10, int i11) {
        this.zza = zzbmVar;
        this.zzb = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbn, com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zza(Object[] objArr, int i10) {
        return zzf().zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbn, com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    /* JADX INFO: renamed from: zzd */
    public final zzco iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbn
    public final zzbk zzg() {
        return new zzcf(this);
    }
}
