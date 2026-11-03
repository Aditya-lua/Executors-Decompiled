package ie;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> extends y0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0360b f21021a = EnumC0360b.NOT_READY;
    public T b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21022a;

        static {
            int[] iArr = new int[EnumC0360b.values().length];
            f21022a = iArr;
            try {
                iArr[EnumC0360b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21022a[EnumC0360b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ie.b$b, reason: collision with other inner class name */
    public enum EnumC0360b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T b();

    public final T d() {
        this.f21021a = EnumC0360b.DONE;
        return null;
    }

    public final boolean e() {
        this.f21021a = EnumC0360b.FAILED;
        this.b = b();
        if (this.f21021a == EnumC0360b.DONE) {
            return false;
        }
        this.f21021a = EnumC0360b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        he.n.r(this.f21021a != EnumC0360b.FAILED);
        int i10 = a.f21022a[this.f21021a.ordinal()];
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
        this.f21021a = EnumC0360b.NOT_READY;
        T t8 = (T) k0.a(this.b);
        this.b = null;
        return t8;
    }
}
