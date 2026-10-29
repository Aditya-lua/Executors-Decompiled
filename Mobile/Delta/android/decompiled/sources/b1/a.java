package b1;

import g0.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n0.i4;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static k0 a(List<k0> list) {
        if (list.isEmpty()) {
            return null;
        }
        k0 k0Var = list.get(0);
        Integer numValueOf = Integer.valueOf(k0Var.b());
        Integer numValueOf2 = Integer.valueOf(k0Var.a());
        for (int i10 = 1; i10 < list.size(); i10++) {
            k0 k0Var2 = list.get(i10);
            numValueOf = c(numValueOf, Integer.valueOf(k0Var2.b()));
            numValueOf2 = b(numValueOf2, Integer.valueOf(k0Var2.a()));
            if (numValueOf == null || numValueOf2 == null) {
                return null;
            }
        }
        return new k0(numValueOf.intValue(), numValueOf2.intValue());
    }

    public static Integer b(Integer num, Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    public static Integer c(Integer num, Integer num2) {
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

    public static k0 d(Set<i4<?>> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<i4<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().M());
        }
        return a(arrayList);
    }
}
