package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class zzbt extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzu zzb;

    public zzbt(List list, zzu zzuVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzbs(this, this.zza.listIterator(i10));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.zza.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
