package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eb extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gd f6492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(fc fcVar, String str, gd gdVar) {
        super("getValue");
        this.f6492c = gdVar;
        Objects.requireNonNull(fcVar);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        z5.a("getValue", 2, list);
        q qVarA = y4Var.a((q) list.get(0));
        q qVarA2 = y4Var.a((q) list.get(1));
        String strA = this.f6492c.a(qVarA.zzc());
        return strA != null ? new u(strA) : qVarA2;
    }
}
