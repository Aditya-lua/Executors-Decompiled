package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f6594a;

    public l(Iterator it) {
        this.f6594a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6594a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new u((String) this.f6594a.next());
    }
}
