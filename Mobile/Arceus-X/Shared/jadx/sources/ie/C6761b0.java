package ie;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p169he.C6380j;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6761b0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ie.b0$a */
    public class a<T> extends AbstractC6807y0<T> {

        /* JADX INFO: renamed from: a */
        public boolean f26627a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f26628b;

        public a(Object obj) {
            this.f26628b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f26627a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f26627a) {
                throw new NoSuchElementException();
            }
            this.f26627a = true;
            return (T) this.f26628b;
        }
    }

    /* JADX INFO: renamed from: ie.b0$b */
    public static final class b<T> extends AbstractC6758a<T> {

        /* JADX INFO: renamed from: e */
        public static final AbstractC6809z0<Object> f26629e = new b(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: c */
        public final T[] f26630c;

        /* JADX INFO: renamed from: d */
        public final int f26631d;

        public b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f26630c = tArr;
            this.f26631d = i10;
        }

        @Override // ie.AbstractC6758a
        /* JADX INFO: renamed from: a */
        public T mo28873a(int i10) {
            return this.f26630c[this.f26631d + i10];
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m28881a(Collection<T> collection, Iterator<? extends T> it) {
        C6384n.m27928l(collection);
        C6384n.m27928l(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m28882b(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C6380j.m27910a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: c */
    public static <T> AbstractC6807y0<T> m28883c() {
        return m28884d();
    }

    /* JADX INFO: renamed from: d */
    public static <T> AbstractC6809z0<T> m28884d() {
        return (AbstractC6809z0<T>) b.f26629e;
    }

    /* JADX INFO: renamed from: e */
    public static <T> AbstractC6807y0<T> m28885e(T t8) {
        return new a(t8);
    }

    /* JADX INFO: renamed from: f */
    public static String m28886f(Iterator<?> it) {
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
