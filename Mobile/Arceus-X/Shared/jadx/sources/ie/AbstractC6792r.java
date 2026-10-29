package ie;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6792r<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f26696a = new Object[0];

    /* JADX INFO: renamed from: ie.r$a */
    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a */
        public Object[] f26697a;

        /* JADX INFO: renamed from: b */
        public int f26698b;

        /* JADX INFO: renamed from: c */
        public boolean f26699c;

        public a(int i10) {
            C6770g.m28907b(i10, "initialCapacity");
            this.f26697a = new Object[i10];
            this.f26698b = 0;
        }

        /* JADX INFO: renamed from: d */
        public a<E> m29065d(E e10) {
            C6384n.m27928l(e10);
            m29068g(this.f26698b + 1);
            Object[] objArr = this.f26697a;
            int i10 = this.f26698b;
            this.f26698b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b<E> m29066e(E... eArr) {
            m29067f(eArr, eArr.length);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final void m29067f(Object[] objArr, int i10) {
            C6781l0.m29011c(objArr, i10);
            m29068g(this.f26698b + i10);
            System.arraycopy(objArr, 0, this.f26697a, this.f26698b, i10);
            this.f26698b += i10;
        }

        /* JADX INFO: renamed from: g */
        public final void m29068g(int i10) {
            Object[] objArr = this.f26697a;
            if (objArr.length < i10) {
                this.f26697a = Arrays.copyOf(objArr, b.m29069c(objArr.length, i10));
                this.f26699c = false;
            } else if (this.f26699c) {
                this.f26697a = (Object[]) objArr.clone();
                this.f26699c = false;
            }
        }
    }

    /* JADX INFO: renamed from: ie.r$b */
    public static abstract class b<E> {
        /* JADX INFO: renamed from: c */
        public static int m29069c(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        /* JADX INFO: renamed from: a */
        public abstract b<E> mo29070a(E e10);

        /* JADX INFO: renamed from: b */
        public b<E> m29071b(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo29070a(it.next());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public AbstractC6796t<E> mo29064a() {
        return isEmpty() ? AbstractC6796t.m29097z() : AbstractC6796t.m29089h(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public int mo29031b(Object[] objArr, int i10) {
        AbstractC6807y0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public Object[] mo29032c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public int mo29033d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public int mo29034e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo29035f();

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC6807y0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f26696a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C6384n.m27928l(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrMo29032c = mo29032c();
            if (objArrMo29032c != null) {
                return (T[]) C6785n0.m29021a(objArrMo29032c, mo29034e(), mo29033d(), tArr);
            }
            tArr = (T[]) C6781l0.m29012d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo29031b(tArr, 0);
        return tArr;
    }
}
