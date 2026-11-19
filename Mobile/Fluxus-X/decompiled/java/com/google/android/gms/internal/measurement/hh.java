package com.google.android.gms.internal.measurement;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh f6540c;

    public hh(lh lhVar) {
        super("internal.registerCallback");
        this.f6540c = lhVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        z5.a(this.f6570a, 3, list);
        String strZzc = y4Var.a((q) list.get(0)).zzc();
        q qVarA = y4Var.a((q) list.get(1));
        if (!(qVarA instanceof p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        q qVarA2 = y4Var.a((q) list.get(2));
        if (!(qVarA2 instanceof n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        n nVar = (n) qVarA2;
        if (!nVar.g(Payload.TYPE)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f6540c.a(strZzc, nVar.g("priority") ? z5.g(nVar.c("priority").zzd().doubleValue()) : 1000, (p) qVarA, nVar.c(Payload.TYPE).zzc());
        return q.Co;
    }
}
