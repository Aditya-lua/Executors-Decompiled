package he;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w<E> extends r<E> implements Set<E> {
    public transient t<E> b;

    public static int h(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            ge.n.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> w<E> i(int i10, Object... objArr) {
        if (i10 == 0) {
            return t();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return u(obj);
        }
        int iH = h(i10);
        Object[] objArr2 = new Object[iH];
        int i11 = iH - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = l0.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = p.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new u0(obj3);
        }
        if (h(i13) < iH / 2) {
            return i(i13, objArr);
        }
        if (z(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new r0(objArr, i12, objArr2, i11, i13);
    }

    public static <E> w<E> k(Collection<? extends E> collection) {
        if ((collection instanceof w) && !(collection instanceof SortedSet)) {
            w<E> wVar = (w) collection;
            if (!wVar.f()) {
                return wVar;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static <E> w<E> l(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? i(eArr.length, (Object[]) eArr.clone()) : u(eArr[0]);
        }
        return t();
    }

    public static <E> w<E> t() {
        return r0.f19270i;
    }

    public static <E> w<E> u(E e10) {
        return new u0(e10);
    }

    public static <E> w<E> x(E e10, E e11, E e12) {
        return i(3, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> w<E> y(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        ge.n.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return i(length, objArr);
    }

    public static boolean z(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // he.r
    public t<E> a() {
        t<E> tVar = this.b;
        if (tVar != null) {
            return tVar;
        }
        t<E> tVarM = m();
        this.b = tVarM;
        return tVarM;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w) && p() && ((w) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return t0.a(this, obj);
    }

    @Override // he.r
    /* JADX INFO: renamed from: g */
    public abstract y0<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return t0.b(this);
    }

    public t<E> m() {
        return t.h(toArray());
    }

    public boolean p() {
        return false;
    }
}
