package je;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0382b f20709a = EnumC0382b.NOT_READY;
    public T b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20710a;

        static {
            int[] iArr = new int[EnumC0382b.values().length];
            f20710a = iArr;
            try {
                iArr[EnumC0382b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20710a[EnumC0382b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: je.b$b, reason: collision with other inner class name */
    public enum EnumC0382b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract T b();

    public final T d() {
        this.f20709a = EnumC0382b.DONE;
        return null;
    }

    public final boolean e() {
        this.f20709a = EnumC0382b.FAILED;
        this.b = b();
        if (this.f20709a == EnumC0382b.DONE) {
            return false;
        }
        this.f20709a = EnumC0382b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.r(this.f20709a != EnumC0382b.FAILED);
        int i10 = a.f20710a[this.f20709a.ordinal()];
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
        this.f20709a = EnumC0382b.NOT_READY;
        T t8 = (T) i.a(this.b);
        this.b = null;
        return t8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
