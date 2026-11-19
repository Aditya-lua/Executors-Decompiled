package p0;

import g0.m0;
import java.util.ArrayList;
import n0.q3;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static m0 a(q3 q3Var, m0 m0Var) {
        boolean z10;
        if (q3Var == null) {
            return m0Var;
        }
        m0.a aVar = new m0.a(m0Var);
        boolean z11 = true;
        if (m0Var.c().isEmpty() || b(q3Var, 1, 2)) {
            z10 = false;
        } else {
            aVar.d(1);
            z10 = true;
        }
        if (!m0Var.b().isEmpty() && !b(q3Var, 3)) {
            aVar.d(2);
            z10 = true;
        }
        if (m0Var.d().isEmpty() || b(q3Var, 4)) {
            z11 = z10;
        } else {
            aVar.d(4);
        }
        if (!z11) {
            return m0Var;
        }
        m0 m0VarB = aVar.b();
        if (m0VarB.c().isEmpty() && m0VarB.b().isEmpty() && m0VarB.d().isEmpty()) {
            return null;
        }
        return aVar.b();
    }

    public static boolean b(q3 q3Var, int... iArr) {
        if (q3Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return q3Var.e().containsAll(arrayList);
    }
}
