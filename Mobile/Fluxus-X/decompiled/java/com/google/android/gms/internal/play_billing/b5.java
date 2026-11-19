package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f7008a;

    public b5(Iterator it) {
        this.f7008a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7008a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f7008a.next();
        return entry.getValue() instanceof d5 ? new a5(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7008a.remove();
    }
}
