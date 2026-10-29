package he;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends y0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19205a;
        public final /* synthetic */ Object b;

        public a(Object obj) {
            this.b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f19205a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f19205a) {
                throw new NoSuchElementException();
            }
            this.f19205a = true;
            return (T) this.b;
        }
    }

    public static final class b<T> extends he.a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final z0<Object> f19206e = new b(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T[] f19207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19208d;

        public b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f19207c = tArr;
            this.f19208d = i10;
        }

        @Override // he.a
        public T a(int i10) {
            return this.f19207c[this.f19208d + i10];
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        ge.n.l(collection);
        ge.n.l(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static boolean b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !ge.j.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> y0<T> c() {
        return d();
    }

    public static <T> z0<T> d() {
        return (z0<T>) b.f19206e;
    }

    public static <T> y0<T> e(T t8) {
        return new a(t8);
    }

    public static String f(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
