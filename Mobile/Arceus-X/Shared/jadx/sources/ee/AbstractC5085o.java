package ee;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ee.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5085o extends AbstractC5103x {

    /* JADX INFO: renamed from: a */
    public final int f19901a;

    /* JADX INFO: renamed from: b */
    public int f19902b;

    public AbstractC5085o(int i10, int i11) {
        C5081m.m23816b(i11, i10, "index");
        this.f19901a = i10;
        this.f19902b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo23824a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19902b < this.f19901a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19902b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19902b;
        this.f19902b = i10 + 1;
        return mo23824a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19902b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19902b - 1;
        this.f19902b = i10;
        return mo23824a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19902b - 1;
    }
}
