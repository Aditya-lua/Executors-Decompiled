package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2659u0 extends AbstractC2495f1 {

    /* JADX INFO: renamed from: a */
    public final Object f9395a;

    /* JADX INFO: renamed from: b */
    public boolean f9396b;

    public C2659u0(Object obj) {
        this.f9395a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f9396b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9396b) {
            throw new NoSuchElementException();
        }
        this.f9396b = true;
        return this.f9395a;
    }
}
