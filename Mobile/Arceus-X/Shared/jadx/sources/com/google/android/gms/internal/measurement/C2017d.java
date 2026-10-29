package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2017d implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f8139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f8140b;

    public C2017d(C2055f c2055f, Iterator it, Iterator it2) {
        this.f8139a = it;
        this.f8140b = it2;
        Objects.requireNonNull(c2055f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8139a.hasNext()) {
            return true;
        }
        return this.f8140b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f8139a;
        if (it.hasNext()) {
            return new C2327u(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f8140b;
        if (it2.hasNext()) {
            return new C2327u((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
