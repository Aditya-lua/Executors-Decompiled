package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6780a;
    public final /* synthetic */ u b;

    public s(u uVar) {
        Objects.requireNonNull(uVar);
        this.b = uVar;
        this.f6780a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6780a < this.b.b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strB = this.b.b();
        int i10 = this.f6780a;
        if (i10 >= strB.length()) {
            throw new NoSuchElementException();
        }
        this.f6780a = i10 + 1;
        return new u(String.valueOf(i10));
    }
}
