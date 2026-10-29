package eb;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends z0 implements Set {
    public transient e1 b;

    public static h1 f(int i10, Object... objArr) {
        if (i10 == 0) {
            return u1.f15404i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new z1(obj);
        }
        int iH = h(i10);
        Object[] objArr2 = new Object[iH];
        int i11 = iH - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            r1.a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = y0.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new z1(obj4);
        }
        if (h(i13) < iH / 2) {
            return f(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new u1(objArr, i12, objArr2, i11, i13);
    }

    public static int h(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static h1 l() {
        return u1.f15404i;
    }

    public static h1 m(Object obj) {
        return new z1("FIDO");
    }

    public static h1 p(Object obj, Object obj2) {
        return f(2, obj, obj2);
    }

    @Override // eb.z0
    public abstract c2 d();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h1) && g() && ((h1) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return y1.a(this);
    }

    public e1 i() {
        e1 e1Var = this.b;
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1VarK = k();
        this.b = e1VarK;
        return e1VarK;
    }

    public e1 k() {
        Object[] array = toArray();
        d2 d2Var = e1.b;
        return e1.h(array, array.length);
    }
}
