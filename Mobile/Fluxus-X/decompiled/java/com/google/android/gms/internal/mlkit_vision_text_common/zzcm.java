package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class zzcm implements Iterator {
    final Iterator zzb;

    public zzcm(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    public abstract Object zza(Object obj);
}
