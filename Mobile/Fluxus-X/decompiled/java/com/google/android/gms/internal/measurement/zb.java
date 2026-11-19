package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zb implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f6975a;

    public zb(Iterator it) {
        this.f6975a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6975a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f6975a.next();
        return entry.getValue() instanceof ac ? new yb(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6975a.remove();
    }
}
