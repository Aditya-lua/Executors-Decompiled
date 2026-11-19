package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends zzbx {
    final /* synthetic */ zzad zza;

    public zzab(zzad zzadVar) {
        this.zza = zzadVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.zza.zza.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzac(this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzad zzadVar = this.zza;
        zzal.zzk(zzadVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbx
    public final Map zza() {
        return this.zza;
    }
}
