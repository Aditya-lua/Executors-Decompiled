package p100eb;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: eb.h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4938h1 extends AbstractC5044z0 implements Set {

    /* JADX INFO: renamed from: b */
    public transient AbstractC4920e1 f19658b;

    /* JADX INFO: renamed from: f */
    public static AbstractC4938h1 m23606f(int i10, Object... objArr) {
        if (i10 == 0) {
            return C5016u1.f19816i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C5045z1(obj);
        }
        int iM23607h = m23607h(i10);
        Object[] objArr2 = new Object[iM23607h];
        int i11 = iM23607h - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            C4998r1.m23697a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iM23724a = C5039y0.m23724a(iHashCode);
            while (true) {
                int i15 = iM23724a & i11;
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
                iM23724a++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C5045z1(obj4);
        }
        if (m23607h(i13) < iM23607h / 2) {
            return m23606f(i13, objArr);
        }
        if (i13 <= 0) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C5016u1(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: renamed from: h */
    public static int m23607h(int i10) {
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

    /* JADX INFO: renamed from: l */
    public static AbstractC4938h1 m23608l() {
        return C5016u1.f19816i;
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC4938h1 m23609m(Object obj) {
        return new C5045z1("FIDO");
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC4938h1 m23610p(Object obj, Object obj2) {
        return m23606f(2, obj, obj2);
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: d */
    public abstract AbstractC4909c2 mo23575d();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4938h1) && mo23596g() && ((AbstractC4938h1) obj).mo23596g() && hashCode() != obj.hashCode()) {
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

    /* JADX INFO: renamed from: g */
    public boolean mo23596g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C5040y1.m23725a(this);
    }

    /* JADX INFO: renamed from: i */
    public AbstractC4920e1 mo23611i() {
        AbstractC4920e1 abstractC4920e1 = this.f19658b;
        if (abstractC4920e1 != null) {
            return abstractC4920e1;
        }
        AbstractC4920e1 abstractC4920e1Mo23612k = mo23612k();
        this.f19658b = abstractC4920e1Mo23612k;
        return abstractC4920e1Mo23612k;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC4920e1 mo23612k() {
        Object[] array = toArray();
        AbstractC4915d2 abstractC4915d2 = AbstractC4920e1.f19644b;
        return AbstractC4920e1.m23571h(array, array.length);
    }
}
