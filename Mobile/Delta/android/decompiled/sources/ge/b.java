package ge;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0324b f18140a = EnumC0324b.NOT_READY;
    public T b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18141a;

        static {
            int[] iArr = new int[EnumC0324b.values().length];
            f18141a = iArr;
            try {
                iArr[EnumC0324b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18141a[EnumC0324b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ge.b$b, reason: collision with other inner class name */
    public enum EnumC0324b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T b();

    public final T d() {
        this.f18140a = EnumC0324b.DONE;
        return null;
    }

    public final boolean e() {
        this.f18140a = EnumC0324b.FAILED;
        this.b = b();
        if (this.f18140a == EnumC0324b.DONE) {
            return false;
        }
        this.f18140a = EnumC0324b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.r(this.f18140a != EnumC0324b.FAILED);
        int i10 = a.f18141a[this.f18140a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18140a = EnumC0324b.NOT_READY;
        T t8 = (T) i.a(this.b);
        this.b = null;
        return t8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
