package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6421a;
    public final /* synthetic */ f b;

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.b = fVar;
        this.f6421a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6421a < this.b.k();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        f fVar = this.b;
        if (this.f6421a < fVar.k()) {
            int i10 = this.f6421a;
            this.f6421a = i10 + 1;
            return fVar.m(i10);
        }
        int i11 = this.f6421a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
