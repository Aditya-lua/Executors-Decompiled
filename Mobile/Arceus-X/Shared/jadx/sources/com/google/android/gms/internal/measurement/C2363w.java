package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2363w extends AbstractC2381x {
    public C2363w() {
        this.f8765a.add(EnumC2202n0.BITWISE_AND);
        this.f8765a.add(EnumC2202n0.BITWISE_LEFT_SHIFT);
        this.f8765a.add(EnumC2202n0.BITWISE_NOT);
        this.f8765a.add(EnumC2202n0.BITWISE_OR);
        this.f8765a.add(EnumC2202n0.BITWISE_RIGHT_SHIFT);
        this.f8765a.add(EnumC2202n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f8765a.add(EnumC2202n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        EnumC2202n0 enumC2202n0 = EnumC2202n0.ADD;
        switch (C2351v5.m10832e(str).ordinal()) {
            case 4:
                C2351v5.m10828a(EnumC2202n0.BITWISE_AND.name(), 2, list);
                return new C2129j(Double.valueOf(C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) & C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue())));
            case 5:
                C2351v5.m10828a(EnumC2202n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C2129j(Double.valueOf(C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) << ((int) (C2351v5.m10835h(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                C2351v5.m10828a(EnumC2202n0.BITWISE_NOT.name(), 1, list);
                return new C2129j(Double.valueOf(~C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue())));
            case 7:
                C2351v5.m10828a(EnumC2202n0.BITWISE_OR.name(), 2, list);
                return new C2129j(Double.valueOf(C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) | C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue())));
            case 8:
                C2351v5.m10828a(EnumC2202n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C2129j(Double.valueOf(C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) >> ((int) (C2351v5.m10835h(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                C2351v5.m10828a(EnumC2202n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C2129j(Double.valueOf(C2351v5.m10835h(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) >>> ((int) (C2351v5.m10835h(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                C2351v5.m10828a(EnumC2202n0.BITWISE_XOR.name(), 2, list);
                return new C2129j(Double.valueOf(C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) ^ C2351v5.m10834g(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue())));
            default:
                return super.m10957b(str);
        }
    }
}
