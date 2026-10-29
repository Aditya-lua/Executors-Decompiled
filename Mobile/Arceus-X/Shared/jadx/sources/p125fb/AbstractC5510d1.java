package p125fb;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: fb.d1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5510d1 extends AbstractC5558r1 {

    /* JADX INFO: renamed from: a */
    public final int f21285a;

    /* JADX INFO: renamed from: b */
    public int f21286b;

    public AbstractC5510d1(int i10, int i11) {
        C5581z0.m25236b(i11, i10, "index");
        this.f21285a = i10;
        this.f21286b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo25171a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f21286b < this.f21285a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21286b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21286b;
        this.f21286b = i10 + 1;
        return mo25171a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21286b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f21286b - 1;
        this.f21286b = i10;
        return mo25171a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21286b - 1;
    }
}
