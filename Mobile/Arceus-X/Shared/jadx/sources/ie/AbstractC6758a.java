package ie;

import java.util.NoSuchElementException;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6758a<E> extends AbstractC6809z0<E> {

    /* JADX INFO: renamed from: a */
    public final int f26617a;

    /* JADX INFO: renamed from: b */
    public int f26618b;

    public AbstractC6758a(int i10, int i11) {
        C6384n.m27931o(i11, i10);
        this.f26617a = i10;
        this.f26618b = i11;
    }

    /* JADX INFO: renamed from: a */
    public abstract E mo28873a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26618b < this.f26617a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26618b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26618b;
        this.f26618b = i10 + 1;
        return mo28873a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26618b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f26618b - 1;
        this.f26618b = i10;
        return mo28873a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26618b - 1;
    }
}
