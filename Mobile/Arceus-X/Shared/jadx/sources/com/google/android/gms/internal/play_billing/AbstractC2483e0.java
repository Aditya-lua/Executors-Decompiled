package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2483e0 extends AbstractC2506g1 {

    /* JADX INFO: renamed from: a */
    public final int f8953a;

    /* JADX INFO: renamed from: b */
    public int f8954b;

    public AbstractC2483e0(int i10, int i11) {
        C2691x.m11816b(i11, i10, "index");
        this.f8953a = i10;
        this.f8954b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo11375a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8954b < this.f8953a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8954b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8954b;
        this.f8954b = i10 + 1;
        return mo11375a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8954b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f8954b - 1;
        this.f8954b = i10;
        return mo11375a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8954b - 1;
    }
}
