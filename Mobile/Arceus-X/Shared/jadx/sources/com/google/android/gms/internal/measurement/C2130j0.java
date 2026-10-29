package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2130j0 extends AbstractC2381x {
    public C2130j0() {
        this.f8765a.add(EnumC2202n0.FOR_IN);
        this.f8765a.add(EnumC2202n0.FOR_IN_CONST);
        this.f8765a.add(EnumC2202n0.FOR_IN_LET);
        this.f8765a.add(EnumC2202n0.FOR_LET);
        this.f8765a.add(EnumC2202n0.FOR_OF);
        this.f8765a.add(EnumC2202n0.FOR_OF_CONST);
        this.f8765a.add(EnumC2202n0.FOR_OF_LET);
        this.f8765a.add(EnumC2202n0.WHILE);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC2255q m10295c(InterfaceC2094h0 interfaceC2094h0, InterfaceC2255q interfaceC2255q, InterfaceC2255q interfaceC2255q2) {
        return m10297e(interfaceC2094h0, interfaceC2255q.zzf(), interfaceC2255q2);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2255q m10296d(InterfaceC2094h0 interfaceC2094h0, InterfaceC2255q interfaceC2255q, InterfaceC2255q interfaceC2255q2) {
        if (interfaceC2255q instanceof Iterable) {
            return m10297e(interfaceC2094h0, ((Iterable) interfaceC2255q).iterator(), interfaceC2255q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC2255q m10297e(InterfaceC2094h0 interfaceC2094h0, Iterator it, InterfaceC2255q interfaceC2255q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2255q interfaceC2255qM10777b = interfaceC2094h0.mo9966a((InterfaceC2255q) it.next()).m10777b((C2055f) interfaceC2255q);
                if (interfaceC2255qM10777b instanceof C2093h) {
                    C2093h c2093h = (C2093h) interfaceC2255qM10777b;
                    if ("break".equals(c2093h.m10155c())) {
                        return InterfaceC2255q.f8587zo;
                    }
                    if ("return".equals(c2093h.m10155c())) {
                        return c2093h;
                    }
                }
            }
        }
        return InterfaceC2255q.f8587zo;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2381x
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list) {
        EnumC2202n0 enumC2202n0 = EnumC2202n0.ADD;
        int iOrdinal = C2351v5.m10832e(str).ordinal();
        if (iOrdinal == 65) {
            C2351v5.m10828a(EnumC2202n0.WHILE.name(), 4, list);
            InterfaceC2255q interfaceC2255q = (InterfaceC2255q) list.get(0);
            InterfaceC2255q interfaceC2255q2 = (InterfaceC2255q) list.get(1);
            InterfaceC2255q interfaceC2255q3 = (InterfaceC2255q) list.get(2);
            InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(3));
            if (c2332u4.m10776a(interfaceC2255q3).zze().booleanValue()) {
                InterfaceC2255q interfaceC2255qM10777b = c2332u4.m10777b((C2055f) interfaceC2255qM10776a);
                if (interfaceC2255qM10777b instanceof C2093h) {
                    C2093h c2093h = (C2093h) interfaceC2255qM10777b;
                    if ("break".equals(c2093h.m10155c())) {
                        return InterfaceC2255q.f8587zo;
                    }
                    if ("return".equals(c2093h.m10155c())) {
                        return c2093h;
                    }
                }
            }
            while (c2332u4.m10776a(interfaceC2255q).zze().booleanValue()) {
                InterfaceC2255q interfaceC2255qM10777b2 = c2332u4.m10777b((C2055f) interfaceC2255qM10776a);
                if (interfaceC2255qM10777b2 instanceof C2093h) {
                    C2093h c2093h2 = (C2093h) interfaceC2255qM10777b2;
                    if ("break".equals(c2093h2.m10155c())) {
                        return InterfaceC2255q.f8587zo;
                    }
                    if ("return".equals(c2093h2.m10155c())) {
                        return c2093h2;
                    }
                }
                c2332u4.m10776a(interfaceC2255q2);
            }
            return InterfaceC2255q.f8587zo;
        }
        switch (iOrdinal) {
            case 26:
                C2351v5.m10828a(EnumC2202n0.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C2327u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return m10295c(new C2113i0(c2332u4, ((InterfaceC2255q) list.get(0)).zzc()), c2332u4.m10776a((InterfaceC2255q) list.get(1)), c2332u4.m10776a((InterfaceC2255q) list.get(2)));
            case 27:
                C2351v5.m10828a(EnumC2202n0.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C2327u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return m10295c(new C2056f0(c2332u4, ((InterfaceC2255q) list.get(0)).zzc()), c2332u4.m10776a((InterfaceC2255q) list.get(1)), c2332u4.m10776a((InterfaceC2255q) list.get(2)));
            case 28:
                C2351v5.m10828a(EnumC2202n0.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C2327u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return m10295c(new C2075g0(c2332u4, ((InterfaceC2255q) list.get(0)).zzc()), c2332u4.m10776a((InterfaceC2255q) list.get(1)), c2332u4.m10776a((InterfaceC2255q) list.get(2)));
            case 29:
                C2351v5.m10828a(EnumC2202n0.FOR_LET.name(), 4, list);
                InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                if (!(interfaceC2255qM10776a2 instanceof C2055f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C2055f c2055f = (C2055f) interfaceC2255qM10776a2;
                InterfaceC2255q interfaceC2255q4 = (InterfaceC2255q) list.get(1);
                InterfaceC2255q interfaceC2255q5 = (InterfaceC2255q) list.get(2);
                InterfaceC2255q interfaceC2255qM10776a3 = c2332u4.m10776a((InterfaceC2255q) list.get(3));
                C2332u4 c2332u4M10778c = c2332u4.m10778c();
                for (int i10 = 0; i10 < c2055f.m9957k(); i10++) {
                    String strZzc = c2055f.m9959m(i10).zzc();
                    c2332u4M10778c.m10780e(strZzc, c2332u4.m10783h(strZzc));
                }
                while (c2332u4.m10776a(interfaceC2255q4).zze().booleanValue()) {
                    InterfaceC2255q interfaceC2255qM10777b3 = c2332u4.m10777b((C2055f) interfaceC2255qM10776a3);
                    if (interfaceC2255qM10777b3 instanceof C2093h) {
                        C2093h c2093h3 = (C2093h) interfaceC2255qM10777b3;
                        if ("break".equals(c2093h3.m10155c())) {
                            return InterfaceC2255q.f8587zo;
                        }
                        if ("return".equals(c2093h3.m10155c())) {
                            return c2093h3;
                        }
                    }
                    C2332u4 c2332u4M10778c2 = c2332u4.m10778c();
                    for (int i11 = 0; i11 < c2055f.m9957k(); i11++) {
                        String strZzc2 = c2055f.m9959m(i11).zzc();
                        c2332u4M10778c2.m10780e(strZzc2, c2332u4M10778c.m10783h(strZzc2));
                    }
                    c2332u4M10778c2.m10776a(interfaceC2255q5);
                    c2332u4M10778c = c2332u4M10778c2;
                }
                return InterfaceC2255q.f8587zo;
            case 30:
                C2351v5.m10828a(EnumC2202n0.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C2327u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return m10296d(new C2113i0(c2332u4, ((InterfaceC2255q) list.get(0)).zzc()), c2332u4.m10776a((InterfaceC2255q) list.get(1)), c2332u4.m10776a((InterfaceC2255q) list.get(2)));
            case 31:
                C2351v5.m10828a(EnumC2202n0.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C2327u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return m10296d(new C2056f0(c2332u4, ((InterfaceC2255q) list.get(0)).zzc()), c2332u4.m10776a((InterfaceC2255q) list.get(1)), c2332u4.m10776a((InterfaceC2255q) list.get(2)));
            case 32:
                C2351v5.m10828a(EnumC2202n0.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C2327u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return m10296d(new C2075g0(c2332u4, ((InterfaceC2255q) list.get(0)).zzc()), c2332u4.m10776a((InterfaceC2255q) list.get(1)), c2332u4.m10776a((InterfaceC2255q) list.get(2)));
            default:
                return super.m10957b(str);
        }
    }
}
