package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
abstract class zzcn extends zzcm implements ListIterator {
    public zzcn(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.zzb).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.zzb).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return zza(((ListIterator) this.zzb).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.zzb).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
