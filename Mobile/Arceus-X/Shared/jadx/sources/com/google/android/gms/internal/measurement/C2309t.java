package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2309t implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f8654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2327u f8655b;

    public C2309t(C2327u c2327u) {
        Objects.requireNonNull(c2327u);
        this.f8655b = c2327u;
        this.f8654a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8654a < this.f8655b.m10775b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C2327u c2327u = this.f8655b;
        String strM10775b = c2327u.m10775b();
        int i10 = this.f8654a;
        if (i10 >= strM10775b.length()) {
            throw new NoSuchElementException();
        }
        this.f8654a = i10 + 1;
        return new C2327u(String.valueOf(c2327u.m10775b().charAt(i10)));
    }
}
