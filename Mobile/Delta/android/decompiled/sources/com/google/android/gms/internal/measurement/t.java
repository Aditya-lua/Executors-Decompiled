package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6797a;
    public final /* synthetic */ u b;

    public t(u uVar) {
        Objects.requireNonNull(uVar);
        this.b = uVar;
        this.f6797a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6797a < this.b.b().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        u uVar = this.b;
        String strB = uVar.b();
        int i10 = this.f6797a;
        if (i10 >= strB.length()) {
            throw new NoSuchElementException();
        }
        this.f6797a = i10 + 1;
        return new u(String.valueOf(uVar.b().charAt(i10)));
    }
}
