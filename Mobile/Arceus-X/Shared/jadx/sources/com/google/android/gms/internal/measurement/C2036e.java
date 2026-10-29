package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2036e implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f8153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2055f f8154b;

    public C2036e(C2055f c2055f) {
        Objects.requireNonNull(c2055f);
        this.f8154b = c2055f;
        this.f8153a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8153a < this.f8154b.m9957k();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C2055f c2055f = this.f8154b;
        if (this.f8153a < c2055f.m9957k()) {
            int i10 = this.f8153a;
            this.f8153a = i10 + 1;
            return c2055f.m9959m(i10);
        }
        int i11 = this.f8153a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
