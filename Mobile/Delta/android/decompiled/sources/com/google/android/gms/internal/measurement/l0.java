package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends x {
    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, u4 u4Var, List list) {
        if (str == null || str.isEmpty() || !u4Var.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        q qVarH = u4Var.h(str);
        if (qVarH instanceof k) {
            return ((k) qVarH).h(u4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
