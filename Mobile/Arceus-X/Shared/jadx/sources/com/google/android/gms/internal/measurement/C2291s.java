package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2291s implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f8632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2327u f8633b;

    public C2291s(C2327u c2327u) {
        Objects.requireNonNull(c2327u);
        this.f8633b = c2327u;
        this.f8632a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8632a < this.f8633b.m10775b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strM10775b = this.f8633b.m10775b();
        int i10 = this.f8632a;
        if (i10 >= strM10775b.length()) {
            throw new NoSuchElementException();
        }
        this.f8632a = i10 + 1;
        return new C2327u(String.valueOf(i10));
    }
}
