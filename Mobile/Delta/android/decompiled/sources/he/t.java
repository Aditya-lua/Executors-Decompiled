package he;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t<E> extends r<E> implements List<E>, RandomAccess {
    public static final z0<Object> b = new b(p0.f19249e, 0);

    public static final class a<E> extends r.a<E> {
        public a() {
            this(4);
        }

        @Override // he.r.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterator<? extends E> it) {
            super.b(it);
            return this;
        }

        public t<E> k() {
            this.f19268c = true;
            return t.i(this.f19267a, this.b);
        }

        public a(int i10) {
            super(i10);
        }
    }

    public static class b<E> extends he.a<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t<E> f19279c;

        public b(t<E> tVar, int i10) {
            super(tVar.size(), i10);
            this.f19279c = tVar;
        }

        @Override // he.a
        public E a(int i10) {
            return this.f19279c.get(i10);
        }
    }

    public static class c<E> extends t<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient t<E> f19280c;

        public c(t<E> tVar) {
            this.f19280c = tVar;
        }

        @Override // he.t
        public t<E> F() {
            return this.f19280c;
        }

        @Override // he.t, java.util.List
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public t<E> subList(int i10, int i11) {
            ge.n.q(i10, i11, size());
            return this.f19280c.subList(K(i11), K(i10)).F();
        }

        public final int J(int i10) {
            return (size() - 1) - i10;
        }

        public final int K(int i10) {
            return size() - i10;
        }

        @Override // he.t, he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f19280c.contains(obj);
        }

        @Override // he.r
        public boolean f() {
            return this.f19280c.f();
        }

        @Override // java.util.List
        public E get(int i10) {
            ge.n.j(i10, size());
            return this.f19280c.get(J(i10));
        }

        @Override // he.t, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f19280c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return J(iLastIndexOf);
            }
            return -1;
        }

        @Override // he.t, he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // he.t, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f19280c.indexOf(obj);
            if (iIndexOf >= 0) {
                return J(iIndexOf);
            }
            return -1;
        }

        @Override // he.t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19280c.size();
        }

        @Override // he.t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public class d extends t<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient int f19281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f19282d;

        public d(int i10, int i11) {
            this.f19281c = i10;
            this.f19282d = i11;
        }

        @Override // he.t, java.util.List
        /* JADX INFO: renamed from: H */
        public t<E> subList(int i10, int i11) {
            ge.n.q(i10, i11, this.f19282d);
            t tVar = t.this;
            int i12 = this.f19281c;
            return tVar.subList(i10 + i12, i11 + i12);
        }

        @Override // he.r
        public Object[] c() {
            return t.this.c();
        }

        @Override // he.r
        public int d() {
            return t.this.e() + this.f19281c + this.f19282d;
        }

        @Override // he.r
        public int e() {
            return t.this.e() + this.f19281c;
        }

        @Override // he.r
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public E get(int i10) {
            ge.n.j(i10, this.f19282d);
            return t.this.get(i10 + this.f19281c);
        }

        @Override // he.t, he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // he.t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19282d;
        }

        @Override // he.t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    public static <E> t<E> A(E e10) {
        return l(e10);
    }

    public static <E> t<E> B(E e10, E e11) {
        return l(e10, e11);
    }

    public static <E> t<E> C(E e10, E e11, E e12) {
        return l(e10, e11, e12);
    }

    public static <E> t<E> D(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return l(e10, e11, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    public static <E> t<E> E(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        ge.n.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return l(objArr);
    }

    public static <E> t<E> G(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        ge.n.l(comparator);
        Object[] objArrB = a0.b(iterable);
        l0.b(objArrB);
        Arrays.sort(objArrB, comparator);
        return h(objArrB);
    }

    public static <E> t<E> h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    public static <E> t<E> i(Object[] objArr, int i10) {
        return i10 == 0 ? z() : new p0(objArr, i10);
    }

    public static <E> a<E> k() {
        return new a<>();
    }

    public static <E> t<E> l(Object... objArr) {
        return h(l0.b(objArr));
    }

    public static <E> t<E> m(Iterable<? extends E> iterable) {
        ge.n.l(iterable);
        return iterable instanceof Collection ? p((Collection) iterable) : t(iterable.iterator());
    }

    public static <E> t<E> p(Collection<? extends E> collection) {
        if (!(collection instanceof r)) {
            return l(collection.toArray());
        }
        t<E> tVarA = ((r) collection).a();
        return tVarA.f() ? h(tVarA.toArray()) : tVarA;
    }

    public static <E> t<E> t(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return z();
        }
        E next = it.next();
        return !it.hasNext() ? A(next) : new a().a(next).j(it).k();
    }

    public static <E> t<E> u(E[] eArr) {
        return eArr.length == 0 ? z() : l((Object[]) eArr.clone());
    }

    public static <E> t<E> z() {
        return (t<E>) p0.f19249e;
    }

    public t<E> F() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: H */
    public t<E> subList(int i10, int i11) {
        ge.n.q(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? z() : I(i10, i11);
    }

    public t<E> I(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // he.r
    @Deprecated
    public final t<E> a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // he.r
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return d0.a(this, obj);
    }

    @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return d0.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return d0.d(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public z0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public z0<E> listIterator(int i10) {
        ge.n.o(i10, size());
        return isEmpty() ? (z0<E>) b : new b(this, i10);
    }
}
