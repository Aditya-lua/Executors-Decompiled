package gb;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17617a;
    public int b;

    public e1(int i10, int i11) {
        a1.b(i11, i10, "index");
        this.f17617a = i10;
        this.b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.f17617a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.b;
        this.b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.b - 1;
        this.b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
