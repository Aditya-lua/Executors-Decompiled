package eb;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class n1 extends c2 {
    public static final Object b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15310a;

    public n1(Object obj) {
        this.f15310a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15310a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f15310a;
        Object obj2 = b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f15310a = obj2;
        return obj;
    }
}
