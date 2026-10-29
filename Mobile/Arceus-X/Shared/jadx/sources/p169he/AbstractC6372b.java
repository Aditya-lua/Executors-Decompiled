package p169he;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: he.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6372b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public b f24245a = b.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f24246b;

    /* JADX INFO: renamed from: he.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24247a;

        static {
            int[] iArr = new int[b.values().length];
            f24247a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24247a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: he.b$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo27885b();

    /* JADX INFO: renamed from: d */
    public final T m27886d() {
        this.f24245a = b.DONE;
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m27887e() {
        this.f24245a = b.FAILED;
        this.f24246b = mo27885b();
        if (this.f24245a == b.DONE) {
            return false;
        }
        this.f24245a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C6384n.m27934r(this.f24245a != b.FAILED);
        int i10 = a.f24247a[this.f24245a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m27887e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24245a = b.NOT_READY;
        T t8 = (T) C6379i.m27909a(this.f24246b);
        this.f24246b = null;
        return t8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
