package p021b1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p140g0.C5902k0;
import p296n0.InterfaceC8771i4;

/* JADX INFO: renamed from: b1.a */
/* JADX INFO: loaded from: classes.dex */
public class C1190a {
    /* JADX INFO: renamed from: a */
    public static C5902k0 m6594a(List<C5902k0> list) {
        if (list.isEmpty()) {
            return null;
        }
        C5902k0 c5902k0 = list.get(0);
        Integer numValueOf = Integer.valueOf(c5902k0.m26517b());
        Integer numValueOf2 = Integer.valueOf(c5902k0.m26516a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            C5902k0 c5902k1 = list.get(i10);
            numValueOf = m6596c(numValueOf, Integer.valueOf(c5902k1.m26517b()));
            numValueOf2 = m6595b(numValueOf2, Integer.valueOf(c5902k1.m26516a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new C5902k0(numValueOf.intValue(), numValueOf2.intValue());
    }

    /* JADX INFO: renamed from: b */
    public static Integer m6595b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Integer m6596c(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (!num2.equals(0)) {
            if (num.equals(2) && !num2.equals(1)) {
                return num2;
            }
            if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
                return null;
            }
        }
        return num;
    }

    /* JADX INFO: renamed from: d */
    public static C5902k0 m6597d(Set<InterfaceC8771i4<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8771i4<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m35143M());
        }
        return m6594a(arrayList);
    }
}
