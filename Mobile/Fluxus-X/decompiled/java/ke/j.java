package ke;

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
    public transient Object f21377a;
    public transient int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f21378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f21379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f21380e;

    public class a implements Iterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21381a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21382c = -1;

        public a() {
            this.f21381a = j.this.f21379d;
            this.b = j.this.l();
        }

        public final void b() {
            if (j.this.f21379d != this.f21381a) {
                throw new ConcurrentModificationException();
            }
        }

        public void d() {
            this.f21381a += 32;
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
            this.f21382c = i10;
            E e10 = (E) j.this.i(i10);
            this.b = j.this.m(this.b);
            return e10;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            g.c(this.f21382c >= 0);
            d();
            j jVar = j.this;
            jVar.remove(jVar.i(this.f21382c));
            this.b = j.this.c(this.b, this.f21382c);
            this.f21382c = -1;
        }
    }

    public j() {
        t(3);
    }

    public static <E> j<E> f() {
        return new j<>();
    }

    public final Object[] A() {
        Object[] objArr = this.f21378c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] B() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object C() {
        Object obj = this.f21377a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public void D(int i10) {
        this.b = Arrays.copyOf(B(), i10);
        this.f21378c = Arrays.copyOf(A(), i10);
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
        this.f21377a = objA;
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
        this.f21379d = k.d(this.f21379d, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        if (x()) {
            d();
        }
        Set<E> setH = h();
        if (setH != null) {
            return setH.add(e10);
        }
        int[] iArrB = B();
        Object[] objArrA = A();
        int i10 = this.f21380e;
        int i11 = i10 + 1;
        int iC = p.c(e10);
        int iN = n();
        int i12 = iC & iN;
        int iH = k.h(C(), i12);
        if (iH != 0) {
            int iB = k.b(iC, iN);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrB[i14];
                if (k.b(i15, iN) == iB && je.j.a(e10, objArrA[i14])) {
                    return false;
                }
                int iC2 = k.c(i15, iN);
                i13++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i13 >= 9) {
                        return e().add(e10);
                    }
                    if (i11 > iN) {
                        iN = F(iN, k.e(iN), iC, i10);
                    } else {
                        iArrB[i14] = k.d(i15, i11, iN);
                    }
                }
            }
        } else if (i11 > iN) {
            iN = F(iN, k.e(iN), iC, i10);
        } else {
            k.i(C(), i12, i11);
        }
        E(i11);
        v(i10, e10, iC, iN);
        this.f21380e = i11;
        q();
        return true;
    }

    public int c(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (x()) {
            return;
        }
        q();
        Set<E> setH = h();
        if (setH != null) {
            this.f21379d = oe.a.a(size(), 3, 1073741823);
            setH.clear();
            this.f21377a = null;
            this.f21380e = 0;
            return;
        }
        Arrays.fill(A(), 0, this.f21380e, (Object) null);
        k.g(C());
        Arrays.fill(B(), 0, this.f21380e, 0);
        this.f21380e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (x()) {
            return false;
        }
        Set<E> setH = h();
        if (setH != null) {
            return setH.contains(obj);
        }
        int iC = p.c(obj);
        int iN = n();
        int iH = k.h(C(), iC & iN);
        if (iH == 0) {
            return false;
        }
        int iB = k.b(iC, iN);
        do {
            int i10 = iH - 1;
            int iJ = j(i10);
            if (k.b(iJ, iN) == iB && je.j.a(obj, i(i10))) {
                return true;
            }
            iH = k.c(iJ, iN);
        } while (iH != 0);
        return false;
    }

    public int d() {
        je.n.s(x(), "Arrays already allocated");
        int i10 = this.f21379d;
        int iJ = k.j(i10);
        this.f21377a = k.a(iJ);
        I(iJ - 1);
        this.b = new int[i10];
        this.f21378c = new Object[i10];
        return i10;
    }

    public Set<E> e() {
        Set<E> setG = g(n() + 1);
        int iL = l();
        while (iL >= 0) {
            setG.add(i(iL));
            iL = m(iL);
        }
        this.f21377a = setG;
        this.b = null;
        this.f21378c = null;
        q();
        return setG;
    }

    public final Set<E> g(int i10) {
        return new LinkedHashSet(i10, 1.0f);
    }

    public Set<E> h() {
        Object obj = this.f21377a;
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

    public final int j(int i10) {
        return B()[i10];
    }

    public int l() {
        return isEmpty() ? -1 : 0;
    }

    public int m(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f21380e) {
            return i11;
        }
        return -1;
    }

    public final int n() {
        return (1 << (this.f21379d & 31)) - 1;
    }

    public void q() {
        this.f21379d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (x()) {
            return false;
        }
        Set<E> setH = h();
        if (setH != null) {
            return setH.remove(obj);
        }
        int iN = n();
        int iF = k.f(obj, null, iN, C(), B(), A(), null);
        if (iF == -1) {
            return false;
        }
        w(iF, iN);
        this.f21380e--;
        q();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setH = h();
        return setH != null ? setH.size() : this.f21380e;
    }

    public void t(int i10) {
        je.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f21379d = oe.a.a(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (x()) {
            return new Object[0];
        }
        Set<E> setH = h();
        return setH != null ? setH.toArray() : Arrays.copyOf(A(), this.f21380e);
    }

    public void v(int i10, E e10, int i11, int i12) {
        H(i10, k.d(i11, 0, i12));
        G(i10, e10);
    }

    public void w(int i10, int i11) {
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

    public boolean x() {
        return this.f21377a == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (x()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setH = h();
        if (setH != null) {
            return (T[]) setH.toArray(tArr);
        }
        return (T[]) l0.e(A(), 0, this.f21380e, tArr);
    }
}
