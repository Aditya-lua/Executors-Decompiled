package ie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6796t<E> extends AbstractC6792r<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final AbstractC6809z0<Object> f26711b = new b(C6789p0.f26679e, 0);

    /* JADX INFO: renamed from: ie.t$a */
    public static final class a<E> extends AbstractC6792r.a<E> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(4);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Lie/r$b; */
        @Override // ie.AbstractC6792r.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> mo29070a(E e10) {
            super.m29065d(e10);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a<E> m29104i(E... eArr) {
            super.m29066e(eArr);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a<E> m29105j(Iterator<? extends E> it) {
            super.m29071b(it);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public AbstractC6796t<E> m29106k() {
            this.f26699c = true;
            return AbstractC6796t.m29090i(this.f26697a, this.f26698b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i10) {
            super(i10);
        }
    }

    /* JADX INFO: renamed from: ie.t$b */
    public static class b<E> extends AbstractC6758a<E> {

        /* JADX INFO: renamed from: c */
        public final AbstractC6796t<E> f26712c;

        public b(AbstractC6796t<E> abstractC6796t, int i10) {
            super(abstractC6796t.size(), i10);
            this.f26712c = abstractC6796t;
        }

        @Override // ie.AbstractC6758a
        /* JADX INFO: renamed from: a */
        public E mo28873a(int i10) {
            return this.f26712c.get(i10);
        }
    }

    /* JADX INFO: renamed from: ie.t$c */
    public static class c<E> extends AbstractC6796t<E> {

        /* JADX INFO: renamed from: c */
        public final transient AbstractC6796t<E> f26713c;

        public c(AbstractC6796t<E> abstractC6796t) {
            this.f26713c = abstractC6796t;
        }

        @Override // ie.AbstractC6796t
        /* JADX INFO: renamed from: F */
        public AbstractC6796t<E> mo29098F() {
            return this.f26713c;
        }

        /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
        @Override // ie.AbstractC6796t, java.util.List
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public AbstractC6796t<E> subList(int i10, int i11) {
            C6384n.m27933q(i10, i11, size());
            return this.f26713c.subList(m29108K(i11), m29108K(i10)).mo29098F();
        }

        /* JADX INFO: renamed from: J */
        public final int m29107J(int i10) {
            return (size() - 1) - i10;
        }

        /* JADX INFO: renamed from: K */
        public final int m29108K(int i10) {
            return size() - i10;
        }

        @Override // ie.AbstractC6796t, ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26713c.contains(obj);
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: f */
        public boolean mo29035f() {
            return this.f26713c.mo29035f();
        }

        @Override // java.util.List
        public E get(int i10) {
            C6384n.m27926j(i10, size());
            return this.f26713c.get(m29107J(i10));
        }

        @Override // ie.AbstractC6796t, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f26713c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return m29107J(iLastIndexOf);
            }
            return -1;
        }

        @Override // ie.AbstractC6796t, ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // ie.AbstractC6796t, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f26713c.indexOf(obj);
            if (iIndexOf >= 0) {
                return m29107J(iIndexOf);
            }
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // ie.AbstractC6796t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26713c.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // ie.AbstractC6796t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: renamed from: ie.t$d */
    public class d extends AbstractC6796t<E> {

        /* JADX INFO: renamed from: c */
        public final transient int f26714c;

        /* JADX INFO: renamed from: d */
        public final transient int f26715d;

        public d(int i10, int i11) {
            this.f26714c = i10;
            this.f26715d = i11;
        }

        /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
        @Override // ie.AbstractC6796t, java.util.List
        /* JADX INFO: renamed from: H */
        public AbstractC6796t<E> subList(int i10, int i11) {
            C6384n.m27933q(i10, i11, this.f26715d);
            AbstractC6796t abstractC6796t = AbstractC6796t.this;
            int i12 = this.f26714c;
            return abstractC6796t.subList(i10 + i12, i11 + i12);
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: c */
        public Object[] mo29032c() {
            return AbstractC6796t.this.mo29032c();
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: d */
        public int mo29033d() {
            return AbstractC6796t.this.mo29034e() + this.f26714c + this.f26715d;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: e */
        public int mo29034e() {
            return AbstractC6796t.this.mo29034e() + this.f26714c;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: f */
        public boolean mo29035f() {
            return true;
        }

        @Override // java.util.List
        public E get(int i10) {
            C6384n.m27926j(i10, this.f26715d);
            return AbstractC6796t.this.get(i10 + this.f26714c);
        }

        @Override // ie.AbstractC6796t, ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // ie.AbstractC6796t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26715d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // ie.AbstractC6796t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    /* JADX INFO: renamed from: A */
    public static <E> AbstractC6796t<E> m29083A(E e10) {
        return m29092l(e10);
    }

    /* JADX INFO: renamed from: B */
    public static <E> AbstractC6796t<E> m29084B(E e10, E e11) {
        return m29092l(e10, e11);
    }

    /* JADX INFO: renamed from: C */
    public static <E> AbstractC6796t<E> m29085C(E e10, E e11, E e12) {
        return m29092l(e10, e11, e12);
    }

    /* JADX INFO: renamed from: D */
    public static <E> AbstractC6796t<E> m29086D(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return m29092l(e10, e11, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: E */
    public static <E> AbstractC6796t<E> m29087E(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        C6384n.m27921e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
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
        return m29092l(objArr);
    }

    /* JADX INFO: renamed from: G */
    public static <E> AbstractC6796t<E> m29088G(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C6384n.m27928l(comparator);
        Object[] objArrM28875b = C6759a0.m28875b(iterable);
        C6781l0.m29010b(objArrM28875b);
        Arrays.sort(objArrM28875b, comparator);
        return m29089h(objArrM28875b);
    }

    /* JADX INFO: renamed from: h */
    public static <E> AbstractC6796t<E> m29089h(Object[] objArr) {
        return m29090i(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: i */
    public static <E> AbstractC6796t<E> m29090i(Object[] objArr, int i10) {
        return i10 == 0 ? m29097z() : new C6789p0(objArr, i10);
    }

    /* JADX INFO: renamed from: k */
    public static <E> a<E> m29091k() {
        return new a<>();
    }

    /* JADX INFO: renamed from: l */
    public static <E> AbstractC6796t<E> m29092l(Object... objArr) {
        return m29089h(C6781l0.m29010b(objArr));
    }

    /* JADX INFO: renamed from: m */
    public static <E> AbstractC6796t<E> m29093m(Iterable<? extends E> iterable) {
        C6384n.m27928l(iterable);
        return iterable instanceof Collection ? m29094p((Collection) iterable) : m29095t(iterable.iterator());
    }

    /* JADX INFO: renamed from: p */
    public static <E> AbstractC6796t<E> m29094p(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC6792r)) {
            return m29092l(collection.toArray());
        }
        AbstractC6796t<E> abstractC6796tMo29064a = ((AbstractC6792r) collection).mo29064a();
        return abstractC6796tMo29064a.mo29035f() ? m29089h(abstractC6796tMo29064a.toArray()) : abstractC6796tMo29064a;
    }

    /* JADX INFO: renamed from: t */
    public static <E> AbstractC6796t<E> m29095t(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m29097z();
        }
        E next = it.next();
        return !it.hasNext() ? m29083A(next) : new a().mo29070a(next).m29105j(it).m29106k();
    }

    /* JADX INFO: renamed from: u */
    public static <E> AbstractC6796t<E> m29096u(E[] eArr) {
        return eArr.length == 0 ? m29097z() : m29092l((Object[]) eArr.clone());
    }

    /* JADX INFO: renamed from: z */
    public static <E> AbstractC6796t<E> m29097z() {
        return (AbstractC6796t<E>) C6789p0.f26679e;
    }

    /* JADX INFO: renamed from: F */
    public AbstractC6796t<E> mo29098F() {
        return size() <= 1 ? this : new c(this);
    }

    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // java.util.List
    /* JADX INFO: renamed from: H */
    public AbstractC6796t<E> subList(int i10, int i11) {
        C6384n.m27933q(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? m29097z() : m29100I(i10, i11);
    }

    /* JADX INFO: renamed from: I */
    public AbstractC6796t<E> m29100I(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // ie.AbstractC6792r
    @Deprecated
    /* JADX INFO: renamed from: a */
    public final AbstractC6796t<E> mo29064a() {
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

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: b */
    public int mo29031b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C6765d0.m28890a(this, obj);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public AbstractC6807y0<E> iterator() {
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
        return C6765d0.m28891b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6765d0.m28893d(this, obj);
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

    /* JADX DEBUG: Method merged with bridge method: listIterator()Ljava/util/ListIterator; */
    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public AbstractC6809z0<E> listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Method merged with bridge method: listIterator(I)Ljava/util/ListIterator; */
    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public AbstractC6809z0<E> listIterator(int i10) {
        C6384n.m27931o(i10, size());
        return isEmpty() ? (AbstractC6809z0<E>) f26711b : new b(this, i10);
    }
}
