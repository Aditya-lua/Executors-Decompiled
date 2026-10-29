package ie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6802w<E> extends AbstractC6792r<E> implements Set<E> {

    /* JADX INFO: renamed from: b */
    public transient AbstractC6796t<E> f26744b;

    /* JADX INFO: renamed from: h */
    public static int m29136h(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            C6384n.m27921e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: i */
    public static <E> AbstractC6802w<E> m29137i(int i10, Object... objArr) {
        if (i10 == 0) {
            return m29140t();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m29141u(obj);
        }
        int iM29136h = m29136h(i10);
        Object[] objArr2 = new Object[iM29136h];
        int i11 = iM29136h - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objM29009a = C6781l0.m29009a(objArr[i14], i14);
            int iHashCode = objM29009a.hashCode();
            int iM29029b = C6788p.m29029b(iHashCode);
            while (true) {
                int i15 = iM29029b & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objM29009a;
                    objArr2[i15] = objM29009a;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objM29009a)) {
                    break;
                }
                iM29029b++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C6799u0(obj3);
        }
        if (m29136h(i13) < iM29136h / 2) {
            return m29137i(i13, objArr);
        }
        if (m29144z(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C6793r0(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: renamed from: k */
    public static <E> AbstractC6802w<E> m29138k(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC6802w) && !(collection instanceof SortedSet)) {
            AbstractC6802w<E> abstractC6802w = (AbstractC6802w) collection;
            if (!abstractC6802w.mo29035f()) {
                return abstractC6802w;
            }
        }
        Object[] array = collection.toArray();
        return m29137i(array.length, array);
    }

    /* JADX INFO: renamed from: l */
    public static <E> AbstractC6802w<E> m29139l(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? m29137i(eArr.length, (Object[]) eArr.clone()) : m29141u(eArr[0]);
        }
        return m29140t();
    }

    /* JADX INFO: renamed from: t */
    public static <E> AbstractC6802w<E> m29140t() {
        return C6793r0.f26701i;
    }

    /* JADX INFO: renamed from: u */
    public static <E> AbstractC6802w<E> m29141u(E e10) {
        return new C6799u0(e10);
    }

    /* JADX INFO: renamed from: x */
    public static <E> AbstractC6802w<E> m29142x(E e10, E e11, E e12) {
        return m29137i(3, e10, e11, e12);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: y */
    public static <E> AbstractC6802w<E> m29143y(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        C6384n.m27921e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m29137i(length, objArr);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m29144z(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: a */
    public AbstractC6796t<E> mo29064a() {
        AbstractC6796t<E> abstractC6796t = this.f26744b;
        if (abstractC6796t != null) {
            return abstractC6796t;
        }
        AbstractC6796t<E> abstractC6796tMo29062m = mo29062m();
        this.f26744b = abstractC6796tMo29062m;
        return abstractC6796tMo29062m;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6802w) && mo29072p() && ((AbstractC6802w) obj).mo29072p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C6797t0.m29109a(this, obj);
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: g */
    public abstract AbstractC6807y0<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C6797t0.m29110b(this);
    }

    /* JADX INFO: renamed from: m */
    public AbstractC6796t<E> mo29062m() {
        return AbstractC6796t.m29089h(toArray());
    }

    /* JADX INFO: renamed from: p */
    public boolean mo29072p() {
        return false;
    }
}
