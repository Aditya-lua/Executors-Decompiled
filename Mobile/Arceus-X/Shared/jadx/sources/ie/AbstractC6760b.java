package ie;

import java.util.NoSuchElementException;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6760b<T> extends AbstractC6807y0<T> {

    /* JADX INFO: renamed from: a */
    public b f26619a = b.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f26620b;

    /* JADX INFO: renamed from: ie.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26621a;

        static {
            int[] iArr = new int[b.values().length];
            f26621a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26621a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ie.b$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: b */
    public abstract T mo28877b();

    /* JADX INFO: renamed from: d */
    public final T m28878d() {
        this.f26619a = b.DONE;
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m28879e() {
        this.f26619a = b.FAILED;
        this.f26620b = mo28877b();
        if (this.f26619a == b.DONE) {
            return false;
        }
        this.f26619a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C6384n.m27934r(this.f26619a != b.FAILED);
        int i10 = a.f26621a[this.f26619a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m28879e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26619a = b.NOT_READY;
        T t8 = (T) C6779k0.m29007a(this.f26620b);
        this.f26620b = null;
        return t8;
    }
}
