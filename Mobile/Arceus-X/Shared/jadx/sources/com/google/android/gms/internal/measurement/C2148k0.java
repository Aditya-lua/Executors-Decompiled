package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2148k0 extends AbstractC2381x {
    public C2148k0() {
        this.f8765a.add(EnumC2202n0.ADD);
        this.f8765a.add(EnumC2202n0.DIVIDE);
        this.f8765a.add(EnumC2202n0.MODULUS);
        this.f8765a.add(EnumC2202n0.MULTIPLY);
        this.f8765a.add(EnumC2202n0.NEGATE);
        this.f8765a.add(EnumC2202n0.POST_DECREMENT);
        this.f8765a.add(EnumC2202n0.POST_INCREMENT);
        this.f8765a.add(EnumC2202n0.PRE_DECREMENT);
        this.f8765a.add(EnumC2202n0.PRE_INCREMENT);
        this.f8765a.add(EnumC2202n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        EnumC2202n0 enumC2202n0 = EnumC2202n0.ADD;
        int iOrdinal = C2351v5.m10832e(str).ordinal();
        if (iOrdinal == 0) {
            C2351v5.m10828a(EnumC2202n0.ADD.name(), 2, list);
            InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
            if (!(interfaceC2255qM10776a instanceof InterfaceC2183m) && !(interfaceC2255qM10776a instanceof C2327u) && !(interfaceC2255qM10776a2 instanceof InterfaceC2183m) && !(interfaceC2255qM10776a2 instanceof C2327u)) {
                return new C2129j(Double.valueOf(interfaceC2255qM10776a.zzd().doubleValue() + interfaceC2255qM10776a2.zzd().doubleValue()));
            }
            return new C2327u(String.valueOf(interfaceC2255qM10776a.zzc()).concat(String.valueOf(interfaceC2255qM10776a2.zzc())));
        }
        if (iOrdinal == 21) {
            C2351v5.m10828a(EnumC2202n0.DIVIDE.name(), 2, list);
            return new C2129j(Double.valueOf(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue() / c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            C2351v5.m10828a(EnumC2202n0.SUBTRACT.name(), 2, list);
            return new C2129j(Double.valueOf(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue() + new C2129j(Double.valueOf(-c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            C2351v5.m10828a(str, 2, list);
            InterfaceC2255q interfaceC2255qM10776a3 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            c2332u4.m10776a((InterfaceC2255q) list.get(1));
            return interfaceC2255qM10776a3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            C2351v5.m10828a(str, 1, list);
            return c2332u4.m10776a((InterfaceC2255q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                C2351v5.m10828a(EnumC2202n0.MODULUS.name(), 2, list);
                return new C2129j(Double.valueOf(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue() % c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()));
            case 45:
                C2351v5.m10828a(EnumC2202n0.MULTIPLY.name(), 2, list);
                return new C2129j(Double.valueOf(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue() * c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()));
            case 46:
                C2351v5.m10828a(EnumC2202n0.NEGATE.name(), 1, list);
                return new C2129j(Double.valueOf(-c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()));
            default:
                return super.m10957b(str);
        }
    }
}
