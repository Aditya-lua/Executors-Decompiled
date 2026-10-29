package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2165l implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f8384a;

    public C2165l(Iterator it) {
        this.f8384a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8384a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C2327u((String) this.f8384a.next());
    }
}
