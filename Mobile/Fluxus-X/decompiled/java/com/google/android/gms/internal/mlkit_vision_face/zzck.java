package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class zzck implements Iterator {
    final Iterator zza;

    public zzck(Iterator it) {
        it.getClass();
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    public abstract Object zza(Object obj);
}
