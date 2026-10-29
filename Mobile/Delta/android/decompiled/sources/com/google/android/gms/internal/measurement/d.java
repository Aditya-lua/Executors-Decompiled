package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f6409a;
    public final /* synthetic */ Iterator b;

    public d(f fVar, Iterator it, Iterator it2) {
        this.f6409a = it;
        this.b = it2;
        Objects.requireNonNull(fVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6409a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f6409a;
        if (it.hasNext()) {
            return new u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.b;
        if (it2.hasNext()) {
            return new u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
