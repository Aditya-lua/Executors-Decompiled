package p100eb;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: eb.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4974n1 extends AbstractC4909c2 {

    /* JADX INFO: renamed from: b */
    public static final Object f19705b = new Object();

    /* JADX INFO: renamed from: a */
    public Object f19706a;

    public C4974n1(Object obj) {
        this.f19706a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19706a != f19705b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f19706a;
        Object obj2 = f19705b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f19706a = obj2;
        return obj;
    }
}
