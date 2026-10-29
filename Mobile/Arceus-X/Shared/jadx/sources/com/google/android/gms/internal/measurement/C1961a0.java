package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1961a0 extends AbstractC2381x {
    public C1961a0() {
        this.f8765a.add(EnumC2202n0.APPLY);
        this.f8765a.add(EnumC2202n0.BLOCK);
        this.f8765a.add(EnumC2202n0.BREAK);
        this.f8765a.add(EnumC2202n0.CASE);
        this.f8765a.add(EnumC2202n0.DEFAULT);
        this.f8765a.add(EnumC2202n0.CONTINUE);
        this.f8765a.add(EnumC2202n0.DEFINE_FUNCTION);
        this.f8765a.add(EnumC2202n0.FN);
        this.f8765a.add(EnumC2202n0.IF);
        this.f8765a.add(EnumC2202n0.QUOTE);
        this.f8765a.add(EnumC2202n0.RETURN);
        this.f8765a.add(EnumC2202n0.SWITCH);
        this.f8765a.add(EnumC2202n0.TERNARY);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2255q m9573c(C2332u4 c2332u4, List list) {
        C2351v5.m10829b(EnumC2202n0.FN.name(), 2, list);
        InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
        InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
        if (!(interfaceC2255qM10776a2 instanceof C2055f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC2255qM10776a2.getClass().getCanonicalName()));
        }
        List listM9955h = ((C2055f) interfaceC2255qM10776a2).m9955h();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C2237p(interfaceC2255qM10776a.zzc(), listM9955h, arrayList, c2332u4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        EnumC2202n0 enumC2202n0 = EnumC2202n0.ADD;
        int iOrdinal = C2351v5.m10832e(str).ordinal();
        if (iOrdinal == 2) {
            C2351v5.m10828a(EnumC2202n0.APPLY.name(), 3, list);
            InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            String strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzc();
            InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(2));
            if (!(interfaceC2255qM10776a2 instanceof C2055f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC2255qM10776a2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC2255qM10776a.mo9953e(strZzc, c2332u4, ((C2055f) interfaceC2255qM10776a2).m9955h());
        }
        if (iOrdinal == 15) {
            C2351v5.m10828a(EnumC2202n0.BREAK.name(), 0, list);
            return InterfaceC2255q.f8581Bo;
        }
        if (iOrdinal == 25) {
            return m9573c(c2332u4, list);
        }
        if (iOrdinal == 41) {
            C2351v5.m10829b(EnumC2202n0.IF.name(), 2, list);
            InterfaceC2255q interfaceC2255qM10776a3 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
            InterfaceC2255q interfaceC2255qM10776a4 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
            InterfaceC2255q interfaceC2255qM10776a5 = list.size() > 2 ? c2332u4.m10776a((InterfaceC2255q) list.get(2)) : null;
            InterfaceC2255q interfaceC2255q = InterfaceC2255q.f8587zo;
            InterfaceC2255q interfaceC2255qM10777b = interfaceC2255qM10776a3.zze().booleanValue() ? c2332u4.m10777b((C2055f) interfaceC2255qM10776a4) : interfaceC2255qM10776a5 != null ? c2332u4.m10777b((C2055f) interfaceC2255qM10776a5) : interfaceC2255q;
            return true != (interfaceC2255qM10777b instanceof C2093h) ? interfaceC2255q : interfaceC2255qM10777b;
        }
        if (iOrdinal == 54) {
            return new C2055f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC2255q.f8583Do;
            }
            C2351v5.m10828a(EnumC2202n0.RETURN.name(), 1, list);
            return new C2093h("return", c2332u4.m10776a((InterfaceC2255q) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                C2351v5.m10829b(EnumC2202n0.DEFINE_FUNCTION.name(), 2, list);
                C2237p c2237p = (C2237p) m9573c(c2332u4, list);
                if (c2237p.m10309i() == null) {
                    c2332u4.m10780e("", c2237p);
                    return c2237p;
                }
                c2332u4.m10780e(c2237p.m10309i(), c2237p);
                return c2237p;
            }
            if (iOrdinal == 60) {
                C2351v5.m10828a(EnumC2202n0.SWITCH.name(), 3, list);
                InterfaceC2255q interfaceC2255qM10776a6 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                InterfaceC2255q interfaceC2255qM10776a7 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
                InterfaceC2255q interfaceC2255qM10776a8 = c2332u4.m10776a((InterfaceC2255q) list.get(2));
                if (!(interfaceC2255qM10776a7 instanceof C2055f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC2255qM10776a8 instanceof C2055f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C2055f c2055f = (C2055f) interfaceC2255qM10776a7;
                C2055f c2055f2 = (C2055f) interfaceC2255qM10776a8;
                boolean z10 = false;
                for (int i10 = 0; i10 < c2055f.m9957k(); i10++) {
                    if (z10 || interfaceC2255qM10776a6.equals(c2332u4.m10776a(c2055f.m9959m(i10)))) {
                        InterfaceC2255q interfaceC2255qM10776a9 = c2332u4.m10776a(c2055f2.m9959m(i10));
                        if (interfaceC2255qM10776a9 instanceof C2093h) {
                            return ((C2093h) interfaceC2255qM10776a9).m10155c().equals("break") ? InterfaceC2255q.f8587zo : interfaceC2255qM10776a9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c2055f.m9957k() + 1 == c2055f2.m9957k()) {
                    InterfaceC2255q interfaceC2255qM10776a10 = c2332u4.m10776a(c2055f2.m9959m(c2055f.m9957k()));
                    if (interfaceC2255qM10776a10 instanceof C2093h) {
                        String strM10155c = ((C2093h) interfaceC2255qM10776a10).m10155c();
                        if (strM10155c.equals("return") || strM10155c.equals("continue")) {
                            return interfaceC2255qM10776a10;
                        }
                    }
                }
                return InterfaceC2255q.f8587zo;
            }
            if (iOrdinal == 61) {
                C2351v5.m10828a(EnumC2202n0.TERNARY.name(), 3, list);
                return c2332u4.m10776a((InterfaceC2255q) list.get(0)).zze().booleanValue() ? c2332u4.m10776a((InterfaceC2255q) list.get(1)) : c2332u4.m10776a((InterfaceC2255q) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return c2332u4.m10778c().m10777b(new C2055f(list));
                case 12:
                    C2351v5.m10828a(EnumC2202n0.BREAK.name(), 0, list);
                    return InterfaceC2255q.f8582Co;
                case 13:
                    break;
                default:
                    return super.m10957b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC2255q.f8587zo;
        }
        InterfaceC2255q interfaceC2255qM10776a11 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
        return interfaceC2255qM10776a11 instanceof C2055f ? c2332u4.m10777b((C2055f) interfaceC2255qM10776a11) : InterfaceC2255q.f8587zo;
    }
}
