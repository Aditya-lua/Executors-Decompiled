package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ab */
/* JADX INFO: loaded from: classes.dex */
public final class C1972ab extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2012cd f8097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1972ab(C1992bc c1992bc, String str, InterfaceC2012cd interfaceC2012cd) {
        super("getValue");
        this.f8097c = interfaceC2012cd;
        Objects.requireNonNull(c1992bc);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        C2351v5.m10828a("getValue", 2, list);
        InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
        InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
        String strMo9894a = this.f8097c.mo9894a(interfaceC2255qM10776a.zzc());
        return strMo9894a != null ? new C2327u(strMo9894a) : interfaceC2255qM10776a2;
    }
}
