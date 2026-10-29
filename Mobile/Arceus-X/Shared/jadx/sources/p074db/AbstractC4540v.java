package p074db;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: db.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4540v extends AbstractC4531m {

    /* JADX INFO: renamed from: a */
    public final int f18583a;

    /* JADX INFO: renamed from: b */
    public int f18584b;

    public AbstractC4540v(int i10, int i11) {
        C4537s.m22511c(i11, i10, "index");
        this.f18583a = i10;
        this.f18584b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo22490a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f18584b < this.f18583a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f18584b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18584b;
        this.f18584b = i10 + 1;
        return mo22490a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f18584b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18584b - 1;
        this.f18584b = i10;
        return mo22490a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f18584b - 1;
    }
}
