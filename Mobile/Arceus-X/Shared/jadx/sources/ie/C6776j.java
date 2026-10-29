package ie;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import me.C8486a;
import p169he.C6380j;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.j */
/* JADX INFO: loaded from: classes2.dex */
public class C6776j<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: a */
    public transient Object f26661a;

    /* JADX INFO: renamed from: b */
    public transient int[] f26662b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f26663c;

    /* JADX INFO: renamed from: d */
    public transient int f26664d;

    /* JADX INFO: renamed from: e */
    public transient int f26665e;

    /* JADX INFO: renamed from: ie.j$a */
    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public int f26666a;

        /* JADX INFO: renamed from: b */
        public int f26667b;

        /* JADX INFO: renamed from: c */
        public int f26668c = -1;

        public a() {
            this.f26666a = C6776j.this.f26664d;
            this.f26667b = C6776j.this.m28986l();
        }

        /* JADX INFO: renamed from: b */
        public final void m28994b() {
            if (C6776j.this.f26664d != this.f26666a) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m28995d() {
            this.f26666a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26667b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            m28994b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f26667b;
            this.f26668c = i10;
            E e10 = (E) C6776j.this.m28984i(i10);
            this.f26667b = C6776j.this.m28987m(this.f26667b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            m28994b();
            C6770g.m28908c(this.f26668c >= 0);
            m28995d();
            C6776j c6776j = C6776j.this;
            c6776j.remove(c6776j.m28984i(this.f26668c));
            this.f26667b = C6776j.this.m28979c(this.f26667b, this.f26668c);
            this.f26668c = -1;
        }
    }

    public C6776j() {
        m28990u(3);
    }

    /* JADX INFO: renamed from: f */
    public static <E> C6776j<E> m28969f() {
        return new C6776j<>();
    }

    /* JADX INFO: renamed from: A */
    public final Object[] m28970A() {
        Object[] objArr = this.f26663c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: B */
    public final int[] m28971B() {
        int[] iArr = this.f26662b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: C */
    public final Object m28972C() {
        Object obj = this.f26661a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: renamed from: D */
    public void m28973D(int i10) {
        this.f26662b = Arrays.copyOf(m28971B(), i10);
        this.f26663c = Arrays.copyOf(m28970A(), i10);
    }

    /* JADX INFO: renamed from: E */
    public final void m28974E(int i10) {
        int iMin;
        int length = m28971B().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m28973D(iMin);
    }

    /* JADX INFO: renamed from: F */
    public final int m28975F(int i10, int i11, int i12, int i13) {
        Object objM28997a = C6778k.m28997a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C6778k.m29005i(objM28997a, i12 & i14, i13 + 1);
        }
        Object objM28972C = m28972C();
        int[] iArrM28971B = m28971B();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM29004h = C6778k.m29004h(objM28972C, i15);
            while (iM29004h != 0) {
                int i16 = iM29004h - 1;
                int i17 = iArrM28971B[i16];
                int iM28998b = C6778k.m28998b(i17, i10) | i15;
                int i18 = iM28998b & i14;
                int iM29004h2 = C6778k.m29004h(objM28997a, i18);
                C6778k.m29005i(objM28997a, i18, iM29004h);
                iArrM28971B[i16] = C6778k.m29000d(iM28998b, iM29004h2, i14);
                iM29004h = C6778k.m28999c(i17, i10);
            }
        }
        this.f26661a = objM28997a;
        m28978I(i14);
        return i14;
    }

    /* JADX INFO: renamed from: G */
    public final void m28976G(int i10, E e10) {
        m28970A()[i10] = e10;
    }

    /* JADX INFO: renamed from: H */
    public final void m28977H(int i10, int i11) {
        m28971B()[i10] = i11;
    }

    /* JADX INFO: renamed from: I */
    public final void m28978I(int i10) {
        this.f26664d = C6778k.m29000d(this.f26664d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (m28993z()) {
            m28980d();
        }
        Set<E> setM28983h = m28983h();
        if (setM28983h != null) {
            return setM28983h.add(e10);
        }
        int[] iArrM28971B = m28971B();
        Object[] objArrM28970A = m28970A();
        int i10 = this.f26665e;
        int i11 = i10 + 1;
        int iM29030c = C6788p.m29030c(e10);
        int iM28988p = m28988p();
        int i12 = iM29030c & iM28988p;
        int iM29004h = C6778k.m29004h(m28972C(), i12);
        if (iM29004h != 0) {
            int iM28998b = C6778k.m28998b(iM29030c, iM28988p);
            int i13 = 0;
            while (true) {
                int i14 = iM29004h - 1;
                int i15 = iArrM28971B[i14];
                if (C6778k.m28998b(i15, iM28988p) == iM28998b && C6380j.m27910a(e10, objArrM28970A[i14])) {
                    return false;
                }
                int iM28999c = C6778k.m28999c(i15, iM28988p);
                i13++;
                if (iM28999c != 0) {
                    iM29004h = iM28999c;
                } else {
                    if (i13 >= 9) {
                        return m28981e().add(e10);
                    }
                    if (i11 > iM28988p) {
                        iM28988p = m28975F(iM28988p, C6778k.m29001e(iM28988p), iM29030c, i10);
                    } else {
                        iArrM28971B[i14] = C6778k.m29000d(i15, i11, iM28988p);
                    }
                }
            }
        } else if (i11 > iM28988p) {
            iM28988p = m28975F(iM28988p, C6778k.m29001e(iM28988p), iM29030c, i10);
        } else {
            C6778k.m29005i(m28972C(), i12, i11);
        }
        m28974E(i11);
        m28991x(i10, e10, iM29030c, iM28988p);
        this.f26665e = i11;
        m28989t();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public int m28979c(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m28993z()) {
            return;
        }
        m28989t();
        Set<E> setM28983h = m28983h();
        if (setM28983h != null) {
            this.f26664d = C8486a.m34269a(size(), 3, 1073741823);
            setM28983h.clear();
            this.f26661a = null;
            this.f26665e = 0;
            return;
        }
        Arrays.fill(m28970A(), 0, this.f26665e, (Object) null);
        C6778k.m29003g(m28972C());
        Arrays.fill(m28971B(), 0, this.f26665e, 0);
        this.f26665e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (m28993z()) {
            return false;
        }
        Set<E> setM28983h = m28983h();
        if (setM28983h != null) {
            return setM28983h.contains(obj);
        }
        int iM29030c = C6788p.m29030c(obj);
        int iM28988p = m28988p();
        int iM29004h = C6778k.m29004h(m28972C(), iM29030c & iM28988p);
        if (iM29004h == 0) {
            return false;
        }
        int iM28998b = C6778k.m28998b(iM29030c, iM28988p);
        do {
            int i10 = iM29004h - 1;
            int iM28985k = m28985k(i10);
            if (C6778k.m28998b(iM28985k, iM28988p) == iM28998b && C6380j.m27910a(obj, m28984i(i10))) {
                return true;
            }
            iM29004h = C6778k.m28999c(iM28985k, iM28988p);
        } while (iM29004h != 0);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public int m28980d() {
        C6384n.m27935s(m28993z(), "Arrays already allocated");
        int i10 = this.f26664d;
        int iM29006j = C6778k.m29006j(i10);
        this.f26661a = C6778k.m28997a(iM29006j);
        m28978I(iM29006j - 1);
        this.f26662b = new int[i10];
        this.f26663c = new Object[i10];
        return i10;
    }

    /* JADX INFO: renamed from: e */
    public Set<E> m28981e() {
        Set<E> setM28982g = m28982g(m28988p() + 1);
        int iM28986l = m28986l();
        while (iM28986l >= 0) {
            setM28982g.add(m28984i(iM28986l));
            iM28986l = m28987m(iM28986l);
        }
        this.f26661a = setM28982g;
        this.f26662b = null;
        this.f26663c = null;
        m28989t();
        return setM28982g;
    }

    /* JADX INFO: renamed from: g */
    public final Set<E> m28982g(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    /* JADX INFO: renamed from: h */
    public Set<E> m28983h() {
        Object obj = this.f26661a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final E m28984i(int i10) {
        return (E) m28970A()[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setM28983h = m28983h();
        return setM28983h != null ? setM28983h.iterator() : new a();
    }

    /* JADX INFO: renamed from: k */
    public final int m28985k(int i10) {
        return m28971B()[i10];
    }

    /* JADX INFO: renamed from: l */
    public int m28986l() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: renamed from: m */
    public int m28987m(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f26665e) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public final int m28988p() {
        return (1 << (this.f26664d & 31)) - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (m28993z()) {
            return false;
        }
        Set<E> setM28983h = m28983h();
        if (setM28983h != null) {
            return setM28983h.remove(obj);
        }
        int iM28988p = m28988p();
        int iM29002f = C6778k.m29002f(obj, null, iM28988p, m28972C(), m28971B(), m28970A(), null);
        if (iM29002f == -1) {
            return false;
        }
        m28992y(iM29002f, iM28988p);
        this.f26665e--;
        m28989t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setM28983h = m28983h();
        return setM28983h != null ? setM28983h.size() : this.f26665e;
    }

    /* JADX INFO: renamed from: t */
    public void m28989t() {
        this.f26664d += 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m28993z()) {
            return new Object[0];
        }
        Set<E> setM28983h = m28983h();
        return setM28983h != null ? setM28983h.toArray() : Arrays.copyOf(m28970A(), this.f26665e);
    }

    /* JADX INFO: renamed from: u */
    public void m28990u(int i10) {
        C6384n.m27921e(i10 >= 0, "Expected size must be >= 0");
        this.f26664d = C8486a.m34269a(i10, 1, 1073741823);
    }

    /* JADX INFO: renamed from: x */
    public void m28991x(int i10, E e10, int i11, int i12) {
        m28977H(i10, C6778k.m29000d(i11, 0, i12));
        m28976G(i10, e10);
    }

    /* JADX INFO: renamed from: y */
    public void m28992y(int i10, int i11) {
        Object objM28972C = m28972C();
        int[] iArrM28971B = m28971B();
        Object[] objArrM28970A = m28970A();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrM28970A[i10] = null;
            iArrM28971B[i10] = 0;
            return;
        }
        Object obj = objArrM28970A[i12];
        objArrM28970A[i10] = obj;
        objArrM28970A[i12] = null;
        iArrM28971B[i10] = iArrM28971B[i12];
        iArrM28971B[i12] = 0;
        int iM29030c = C6788p.m29030c(obj) & i11;
        int iM29004h = C6778k.m29004h(objM28972C, iM29030c);
        if (iM29004h == size) {
            C6778k.m29005i(objM28972C, iM29030c, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iM29004h - 1;
            int i14 = iArrM28971B[i13];
            int iM28999c = C6778k.m28999c(i14, i11);
            if (iM28999c == size) {
                iArrM28971B[i13] = C6778k.m29000d(i14, i10 + 1, i11);
                return;
            }
            iM29004h = iM28999c;
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m28993z() {
        return this.f26661a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (m28993z()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setM28983h = m28983h();
        if (setM28983h != null) {
            return (T[]) setM28983h.toArray(tArr);
        }
        return (T[]) C6781l0.m29013e(m28970A(), 0, this.f26665e, tArr);
    }
}
