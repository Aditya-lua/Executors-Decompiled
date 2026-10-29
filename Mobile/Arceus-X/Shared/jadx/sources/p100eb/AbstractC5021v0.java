package p100eb;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: eb.v0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5021v0 extends AbstractC4915d2 {

    /* JADX INFO: renamed from: a */
    public final int f19828a;

    /* JADX INFO: renamed from: b */
    public int f19829b;

    public AbstractC5021v0(int i10, int i11) {
        C4973n0.m23678b(i11, i10, "index");
        this.f19828a = i10;
        this.f19829b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo23548a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19829b < this.f19828a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19829b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19829b;
        this.f19829b = i10 + 1;
        return mo23548a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19829b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19829b - 1;
        this.f19829b = i10;
        return mo23548a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19829b - 1;
    }
}
