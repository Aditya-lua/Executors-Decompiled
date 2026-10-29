package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2037e0 extends AbstractC2381x {
    public C2037e0() {
        this.f8765a.add(EnumC2202n0.AND);
        this.f8765a.add(EnumC2202n0.NOT);
        this.f8765a.add(EnumC2202n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        EnumC2202n0 enumC2202n0 = EnumC2202n0.ADD;
        int iOrdinal = C2351v5.m10832e(str).ordinal();
        if (iOrdinal == 1) {
            C2351v5.m10828a(EnumC2202n0.AND.name(), 2, list);
            InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            return interfaceC2255qM10776a.zze().booleanValue() ? c2332u4.m10776a((InterfaceC2255q) list.get(1)) : interfaceC2255qM10776a;
        }
        if (iOrdinal == 47) {
            C2351v5.m10828a(EnumC2202n0.NOT.name(), 1, list);
            return new C2074g(Boolean.valueOf(!c2332u4.m10776a((InterfaceC2255q) list.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.m10957b(str);
        }
        C2351v5.m10828a(EnumC2202n0.OR.name(), 2, list);
        InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
        return !interfaceC2255qM10776a2.zze().booleanValue() ? c2332u4.m10776a((InterfaceC2255q) list.get(1)) : interfaceC2255qM10776a2;
    }
}
