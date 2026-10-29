package com.google.android.gms.internal.measurement;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hh f6420c;

    public dh(hh hhVar) {
        super("internal.registerCallback");
        this.f6420c = hhVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        v5.a(this.f6569a, 3, list);
        String strZzc = u4Var.a((q) list.get(0)).zzc();
        q qVarA = u4Var.a((q) list.get(1));
        if (!(qVarA instanceof p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        q qVarA2 = u4Var.a((q) list.get(2));
        if (!(qVarA2 instanceof n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        n nVar = (n) qVarA2;
        if (!nVar.g(Payload.TYPE)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f6420c.a(strZzc, nVar.g("priority") ? v5.g(nVar.c("priority").zzd().doubleValue()) : 1000, (p) qVarA, nVar.c(Payload.TYPE).zzc());
        return q.f6743zo;
    }
}
