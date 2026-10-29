package he;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class j<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f19233a;
    public transient int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f19234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f19235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f19236e;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19237a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19238c = -1;

        public a() {
            this.f19237a = j.this.f19235d;
            this.b = j.this.l();
        }

        public final void b() {
            if (j.this.f19235d != this.f19237a) {
                throw new ConcurrentModificationException();
            }
        }

        public void d() {
            this.f19237a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public E next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.b;
            this.f19238c = i10;
            E e10 = (E) j.this.i(i10);
            this.b = j.this.m(this.b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            g.c(this.f19238c >= 0);
            d();
            j jVar = j.this;
            jVar.remove(jVar.i(this.f19238c));
            this.b = j.this.c(this.b, this.f19238c);
            this.f19238c = -1;
        }
    }

    public j() {
        u(3);
    }

    public static <E> j<E> f() {
        return new j<>();
    }

    public final Object[] A() {
        Object[] objArr = this.f19234c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] B() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object C() {
        Object obj = this.f19233a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void D(int i10) {
        this.b = Arrays.copyOf(B(), i10);
        this.f19234c = Arrays.copyOf(A(), i10);
    }

    public final void E(int i10) {
        int iMin;
        int length = B().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        D(iMin);
    }

    public final int F(int i10, int i11, int i12, int i13) {
        Object objA = k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            k.i(objA, i12 & i14, i13 + 1);
        }
        Object objC = C();
        int[] iArrB = B();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = k.h(objC, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrB[i16];
                int iB = k.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = k.h(objA, i18);
                k.i(objA, i18, iH);
                iArrB[i16] = k.d(iB, iH2, i14);
                iH = k.c(i17, i10);
            }
        }
        this.f19233a = objA;
        I(i14);
        return i14;
    }

    public final void G(int i10, E e10) {
        A()[i10] = e10;
    }

    public final void H(int i10, int i11) {
        B()[i10] = i11;
    }

    public final void I(int i10) {
        this.f19235d = k.d(this.f19235d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (z()) {
            d();
        }
        Set<E> setH = h();
        if (setH != null) {
            return setH.add(e10);
        }
        int[] iArrB = B();
        Object[] objArrA = A();
        int i10 = this.f19236e;
        int i11 = i10 + 1;
        int iC = p.c(e10);
        int iP = p();
        int i12 = iC & iP;
        int iH = k.h(C(), i12);
        if (iH != 0) {
            int iB = k.b(iC, iP);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrB[i14];
                if (k.b(i15, iP) == iB && ge.j.a(e10, objArrA[i14])) {
                    return false;
                }
                int iC2 = k.c(i15, iP);
                i13++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i13 >= 9) {
                        return e().add(e10);
                    }
                    if (i11 > iP) {
                        iP = F(iP, k.e(iP), iC, i10);
                    } else {
                        iArrB[i14] = k.d(i15, i11, iP);
                    }
                }
            }
        } else if (i11 > iP) {
            iP = F(iP, k.e(iP), iC, i10);
        } else {
            k.i(C(), i12, i11);
        }
        E(i11);
        x(i10, e10, iC, iP);
        this.f19236e = i11;
        t();
        return true;
    }

    public int c(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (z()) {
            return;
        }
        t();
        Set<E> setH = h();
        if (setH != null) {
            this.f19235d = le.a.a(size(), 3, 1073741823);
            setH.clear();
            this.f19233a = null;
            this.f19236e = 0;
            return;
        }
        Arrays.fill(A(), 0, this.f19236e, (Object) null);
        k.g(C());
        Arrays.fill(B(), 0, this.f19236e, 0);
        this.f19236e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (z()) {
            return false;
        }
        Set<E> setH = h();
        if (setH != null) {
            return setH.contains(obj);
        }
        int iC = p.c(obj);
        int iP = p();
        int iH = k.h(C(), iC & iP);
        if (iH == 0) {
            return false;
        }
        int iB = k.b(iC, iP);
        do {
            int i10 = iH - 1;
            int iK = k(i10);
            if (k.b(iK, iP) == iB && ge.j.a(obj, i(i10))) {
                return true;
            }
            iH = k.c(iK, iP);
        } while (iH != 0);
        return false;
    }

    public int d() {
        ge.n.s(z(), "Arrays already allocated");
        int i10 = this.f19235d;
        int iJ = k.j(i10);
        this.f19233a = k.a(iJ);
        I(iJ - 1);
        this.b = new int[i10];
        this.f19234c = new Object[i10];
        return i10;
    }

    public Set<E> e() {
        Set<E> setG = g(p() + 1);
        int iL = l();
        while (iL >= 0) {
            setG.add(i(iL));
            iL = m(iL);
        }
        this.f19233a = setG;
        this.b = null;
        this.f19234c = null;
        t();
        return setG;
    }

    public final Set<E> g(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public Set<E> h() {
        Object obj = this.f19233a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public final E i(int i10) {
        return (E) A()[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setH = h();
        return setH != null ? setH.iterator() : new a();
    }

    public final int k(int i10) {
        return B()[i10];
    }

    public int l() {
        return isEmpty() ? -1 : 0;
    }

    public int m(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f19236e) {
            return i11;
        }
        return -1;
    }

    public final int p() {
        return (1 << (this.f19235d & 31)) - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (z()) {
            return false;
        }
        Set<E> setH = h();
        if (setH != null) {
            return setH.remove(obj);
        }
        int iP = p();
        int iF = k.f(obj, null, iP, C(), B(), A(), null);
        if (iF == -1) {
            return false;
        }
        y(iF, iP);
        this.f19236e--;
        t();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setH = h();
        return setH != null ? setH.size() : this.f19236e;
    }

    public void t() {
        this.f19235d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (z()) {
            return new Object[0];
        }
        Set<E> setH = h();
        return setH != null ? setH.toArray() : Arrays.copyOf(A(), this.f19236e);
    }

    public void u(int i10) {
        ge.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f19235d = le.a.a(i10, 1, 1073741823);
    }

    public void x(int i10, E e10, int i11, int i12) {
        H(i10, k.d(i11, 0, i12));
        G(i10, e10);
    }

    public void y(int i10, int i11) {
        Object objC = C();
        int[] iArrB = B();
        Object[] objArrA = A();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrA[i10] = null;
            iArrB[i10] = 0;
            return;
        }
        Object obj = objArrA[i12];
        objArrA[i10] = obj;
        objArrA[i12] = null;
        iArrB[i10] = iArrB[i12];
        iArrB[i12] = 0;
        int iC = p.c(obj) & i11;
        int iH = k.h(objC, iC);
        if (iH == size) {
            k.i(objC, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrB[i13];
            int iC2 = k.c(i14, i11);
            if (iC2 == size) {
                iArrB[i13] = k.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    public boolean z() {
        return this.f19233a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (z()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setH = h();
        if (setH != null) {
            return (T[]) setH.toArray(tArr);
        }
        return (T[]) l0.e(A(), 0, this.f19236e, tArr);
    }
}
