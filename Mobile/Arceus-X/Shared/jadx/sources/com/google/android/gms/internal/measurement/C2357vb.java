package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.vb */
/* JADX INFO: loaded from: classes.dex */
public final class C2357vb implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f8719a;

    public C2357vb(Iterator it) {
        this.f8719a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8719a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f8719a.next();
        return entry.getValue() instanceof C2375wb ? new C2339ub(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8719a.remove();
    }
}
