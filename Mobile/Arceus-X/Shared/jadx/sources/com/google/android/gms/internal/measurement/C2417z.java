package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2417z extends AbstractC2381x {
    public C2417z() {
        this.f8765a.add(EnumC2202n0.EQUALS);
        this.f8765a.add(EnumC2202n0.GREATER_THAN);
        this.f8765a.add(EnumC2202n0.GREATER_THAN_EQUALS);
        this.f8765a.add(EnumC2202n0.IDENTITY_EQUALS);
        this.f8765a.add(EnumC2202n0.IDENTITY_NOT_EQUALS);
        this.f8765a.add(EnumC2202n0.LESS_THAN);
        this.f8765a.add(EnumC2202n0.LESS_THAN_EQUALS);
        this.f8765a.add(EnumC2202n0.NOT_EQUALS);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11034c(InterfaceC2255q interfaceC2255q, InterfaceC2255q interfaceC2255q2) {
        if (interfaceC2255q instanceof InterfaceC2183m) {
            interfaceC2255q = new C2327u(interfaceC2255q.zzc());
        }
        if (interfaceC2255q2 instanceof InterfaceC2183m) {
            interfaceC2255q2 = new C2327u(interfaceC2255q2.zzc());
        }
        if ((interfaceC2255q instanceof C2327u) && (interfaceC2255q2 instanceof C2327u)) {
            return interfaceC2255q.zzc().compareTo(interfaceC2255q2.zzc()) < 0;
        }
        double dDoubleValue = interfaceC2255q.zzd().doubleValue();
        double dDoubleValue2 = interfaceC2255q2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11035d(InterfaceC2255q interfaceC2255q, InterfaceC2255q interfaceC2255q2) {
        if (interfaceC2255q.getClass().equals(interfaceC2255q2.getClass())) {
            if ((interfaceC2255q instanceof C2345v) || (interfaceC2255q instanceof C2219o)) {
                return true;
            }
            if (interfaceC2255q instanceof C2129j) {
                return (Double.isNaN(interfaceC2255q.zzd().doubleValue()) || Double.isNaN(interfaceC2255q2.zzd().doubleValue()) || interfaceC2255q.zzd().doubleValue() != interfaceC2255q2.zzd().doubleValue()) ? false : true;
            }
            if (interfaceC2255q instanceof C2327u) {
                return interfaceC2255q.zzc().equals(interfaceC2255q2.zzc());
            }
            if (interfaceC2255q instanceof C2074g) {
                return interfaceC2255q.zze().equals(interfaceC2255q2.zze());
            }
            return interfaceC2255q == interfaceC2255q2;
        }
        if (((interfaceC2255q instanceof C2345v) || (interfaceC2255q instanceof C2219o)) && ((interfaceC2255q2 instanceof C2345v) || (interfaceC2255q2 instanceof C2219o))) {
            return true;
        }
        boolean z10 = interfaceC2255q instanceof C2129j;
        if (z10 && (interfaceC2255q2 instanceof C2327u)) {
            return m11035d(interfaceC2255q, new C2129j(interfaceC2255q2.zzd()));
        }
        boolean z11 = interfaceC2255q instanceof C2327u;
        if ((!z11 || !(interfaceC2255q2 instanceof C2129j)) && !(interfaceC2255q instanceof C2074g)) {
            if (interfaceC2255q2 instanceof C2074g) {
                return m11035d(interfaceC2255q, new C2129j(interfaceC2255q2.zzd()));
            }
            if ((z11 || z10) && (interfaceC2255q2 instanceof InterfaceC2183m)) {
                return m11035d(interfaceC2255q, new C2327u(interfaceC2255q2.zzc()));
            }
            if ((interfaceC2255q instanceof InterfaceC2183m) && ((interfaceC2255q2 instanceof C2327u) || (interfaceC2255q2 instanceof C2129j))) {
                return m11035d(new C2327u(interfaceC2255q.zzc()), interfaceC2255q2);
            }
            return false;
        }
        return m11035d(new C2129j(interfaceC2255q.zzd()), interfaceC2255q2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11036e(InterfaceC2255q interfaceC2255q, InterfaceC2255q interfaceC2255q2) {
        if (interfaceC2255q instanceof InterfaceC2183m) {
            interfaceC2255q = new C2327u(interfaceC2255q.zzc());
        }
        if (interfaceC2255q2 instanceof InterfaceC2183m) {
            interfaceC2255q2 = new C2327u(interfaceC2255q2.zzc());
        }
        return (((interfaceC2255q instanceof C2327u) && (interfaceC2255q2 instanceof C2327u)) || !(Double.isNaN(interfaceC2255q.zzd().doubleValue()) || Double.isNaN(interfaceC2255q2.zzd().doubleValue()))) && !m11034c(interfaceC2255q2, interfaceC2255q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        boolean zM11035d;
        boolean zM11035d2;
        C2351v5.m10828a(C2351v5.m10832e(str).name(), 2, list);
        InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
        InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
        int iOrdinal = C2351v5.m10832e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zM11035d2 = m11035d(interfaceC2255qM10776a, interfaceC2255qM10776a2);
            } else if (iOrdinal == 42) {
                zM11035d = m11034c(interfaceC2255qM10776a, interfaceC2255qM10776a2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zM11035d = m11034c(interfaceC2255qM10776a2, interfaceC2255qM10776a);
                        break;
                    case 38:
                        zM11035d = m11036e(interfaceC2255qM10776a2, interfaceC2255qM10776a);
                        break;
                    case 39:
                        zM11035d = C2351v5.m10833f(interfaceC2255qM10776a, interfaceC2255qM10776a2);
                        break;
                    case 40:
                        zM11035d2 = C2351v5.m10833f(interfaceC2255qM10776a, interfaceC2255qM10776a2);
                        break;
                    default:
                        return super.m10957b(str);
                }
            } else {
                zM11035d = m11036e(interfaceC2255qM10776a, interfaceC2255qM10776a2);
            }
            zM11035d = !zM11035d2;
        } else {
            zM11035d = m11035d(interfaceC2255qM10776a, interfaceC2255qM10776a2);
        }
        return zM11035d ? InterfaceC2255q.f8584Eo : InterfaceC2255q.f8585Fo;
    }
}
