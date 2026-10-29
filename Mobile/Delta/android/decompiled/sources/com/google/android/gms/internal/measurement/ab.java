package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cd f6376c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(bc bcVar, String str, cd cdVar) {
        super("getValue");
        this.f6376c = cdVar;
        Objects.requireNonNull(bcVar);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        v5.a("getValue", 2, list);
        q qVarA = u4Var.a((q) list.get(0));
        q qVarA2 = u4Var.a((q) list.get(1));
        String strA = this.f6376c.a(qVarA.zzc());
        return strA != null ? new u(strA) : qVarA2;
    }
}
