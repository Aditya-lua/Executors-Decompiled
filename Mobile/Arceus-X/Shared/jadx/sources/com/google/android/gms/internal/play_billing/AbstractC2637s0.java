package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2637s0 extends AbstractC2538j0 implements Set {

    /* JADX INFO: renamed from: b */
    public transient AbstractC2582n0 f9219b;

    /* JADX INFO: renamed from: g */
    public static int m11705g(int i10) {
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

    /* JADX INFO: renamed from: k */
    public static AbstractC2637s0 m11707k() {
        return C2462c1.f8935i;
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC2637s0 m11708m(int i10, Object... objArr) {
        if (i10 == 0) {
            return C2462c1.f8935i;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C2484e1(obj);
        }
        int iM11705g = m11705g(i10);
        Object[] objArr2 = new Object[iM11705g];
        int i11 = iM11705g - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            C2670v0.m11801a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iM11418a = C2505g0.m11418a(iHashCode);
            while (true) {
                int i15 = iM11418a & i11;
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
                iM11418a++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C2484e1(obj4);
        }
        if (m11705g(i13) < iM11705g / 2) {
            return m11708m(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C2462c1(objArr, i12, objArr2, i11, i13);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: d */
    public AbstractC2582n0 mo11376d() {
        AbstractC2582n0 abstractC2582n0 = this.f9219b;
        if (abstractC2582n0 != null) {
            return abstractC2582n0;
        }
        AbstractC2582n0 abstractC2582n0Mo11328h = mo11328h();
        this.f9219b = abstractC2582n0Mo11328h;
        return abstractC2582n0Mo11328h;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2637s0) && mo11329l() && ((AbstractC2637s0) obj).mo11329l() && hashCode() != obj.hashCode()) {
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

    /* JADX INFO: renamed from: h */
    public AbstractC2582n0 mo11328h() {
        Object[] array = toArray();
        AbstractC2506g1 abstractC2506g1 = AbstractC2582n0.f9163b;
        return AbstractC2582n0.m11597h(array, array.length);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C2473d1.m11354a(this);
    }

    /* JADX INFO: renamed from: l */
    public boolean mo11329l() {
        return false;
    }
}
