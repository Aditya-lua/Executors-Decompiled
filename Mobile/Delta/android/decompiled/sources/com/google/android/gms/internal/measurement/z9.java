package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z9 extends n {
    public final c b;

    public z9(c cVar) {
        this.b = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.n, com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    v5.a("getEventName", 0, list);
                    return new u(this.b.c().b());
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    v5.a("getTimestamp", 0, list);
                    return new j(Double.valueOf(this.b.c().a()));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    v5.a("getParamValue", 1, list);
                    return w6.a(this.b.c().e(u4Var.a((q) list.get(0)).zzc()));
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    v5.a("getParams", 0, list);
                    Map mapF = this.b.c().f();
                    n nVar = new n();
                    for (String str2 : mapF.keySet()) {
                        nVar.d(str2, w6.a(mapF.get(str2)));
                    }
                    return nVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    v5.a("setParamValue", 2, list);
                    String strZzc = u4Var.a((q) list.get(0)).zzc();
                    q qVarA = u4Var.a((q) list.get(1));
                    this.b.c().d(strZzc, v5.j(qVarA));
                    return qVarA;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    v5.a("setEventName", 1, list);
                    q qVarA2 = u4Var.a((q) list.get(0));
                    if (q.f6743zo.equals(qVarA2) || q.Ao.equals(qVarA2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.b.c().c(qVarA2.zzc());
                    return new u(qVarA2.zzc());
                }
                break;
        }
        return super.e(str, u4Var, list);
    }
}
