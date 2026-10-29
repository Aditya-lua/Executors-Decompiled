package he;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> extends y0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0338b f19199a = EnumC0338b.NOT_READY;
    public T b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19200a;

        static {
            int[] iArr = new int[EnumC0338b.values().length];
            f19200a = iArr;
            try {
                iArr[EnumC0338b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19200a[EnumC0338b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: he.b$b, reason: collision with other inner class name */
    public enum EnumC0338b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T b();

    public final T d() {
        this.f19199a = EnumC0338b.DONE;
        return null;
    }

    public final boolean e() {
        this.f19199a = EnumC0338b.FAILED;
        this.b = b();
        if (this.f19199a == EnumC0338b.DONE) {
            return false;
        }
        this.f19199a = EnumC0338b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ge.n.r(this.f19199a != EnumC0338b.FAILED);
        int i10 = a.f19200a[this.f19199a.ordinal()];
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
        this.f19199a = EnumC0338b.NOT_READY;
        T t8 = (T) k0.a(this.b);
        this.b = null;
        return t8;
    }
}
