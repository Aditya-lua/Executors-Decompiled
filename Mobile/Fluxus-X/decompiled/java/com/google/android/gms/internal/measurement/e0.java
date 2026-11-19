package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x {
    public e0() {
        this.f6916a.add(n0.AND);
        this.f6916a.add(n0.NOT);
        this.f6916a.add(n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, y4 y4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = z5.e(str).ordinal();
        if (iOrdinal == 1) {
            z5.a(n0.AND.name(), 2, list);
            q qVarA = y4Var.a((q) list.get(0));
            return qVarA.zze().booleanValue() ? y4Var.a((q) list.get(1)) : qVarA;
        }
        if (iOrdinal == 47) {
            z5.a(n0.NOT.name(), 1, list);
            return new g(Boolean.valueOf(!y4Var.a((q) list.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        z5.a(n0.OR.name(), 2, list);
        q qVarA2 = y4Var.a((q) list.get(0));
        return !qVarA2.zze().booleanValue() ? y4Var.a((q) list.get(1)) : qVarA2;
    }
}
