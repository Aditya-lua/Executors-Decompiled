package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends x {
    public e0() {
        this.f6892a.add(n0.AND);
        this.f6892a.add(n0.NOT);
        this.f6892a.add(n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        n0 n0Var = n0.ADD;
        int iOrdinal = v5.e(str).ordinal();
        if (iOrdinal == 1) {
            v5.a(n0.AND.name(), 2, list);
            q qVarA = u4Var.a((q) list.get(0));
            return qVarA.zze().booleanValue() ? u4Var.a((q) list.get(1)) : qVarA;
        }
        if (iOrdinal == 47) {
            v5.a(n0.NOT.name(), 1, list);
            return new g(Boolean.valueOf(!u4Var.a((q) list.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        v5.a(n0.OR.name(), 2, list);
        q qVarA2 = u4Var.a((q) list.get(0));
        return !qVarA2.zze().booleanValue() ? u4Var.a((q) list.get(1)) : qVarA2;
    }
}
