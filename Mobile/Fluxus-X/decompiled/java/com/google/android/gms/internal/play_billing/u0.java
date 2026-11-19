package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7325a;
    public boolean b;

    public u0(Object obj) {
        this.f7325a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.f7325a;
    }
}
