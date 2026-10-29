package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2018d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static InterfaceC2255q m9897a(String str, C2055f c2055f, C2332u4 c2332u4, List list) {
        double dM9957k;
        Double dValueOf = Double.valueOf(-1.0d);
        String strZzc = ",";
        double dM9957k2 = 0.0d;
        AbstractC2147k abstractC2147k = null;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    C2351v5.m10828a("toString", 0, list);
                    return new C2327u(c2055f.m9965z(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    C2055f c2055f2 = (C2055f) c2055f.mo9950a();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) it.next());
                            if (interfaceC2255qM10776a instanceof C2093h) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int iM9957k = c2055f2.m9957k();
                            if (interfaceC2255qM10776a instanceof C2055f) {
                                C2055f c2055f3 = (C2055f) interfaceC2255qM10776a;
                                Iterator itM9956i = c2055f3.m9956i();
                                while (itM9956i.hasNext()) {
                                    Integer num = (Integer) itM9956i.next();
                                    c2055f2.m9960p(num.intValue() + iM9957k, c2055f3.m9959m(num.intValue()));
                                }
                            } else {
                                c2055f2.m9960p(iM9957k, interfaceC2255qM10776a);
                            }
                        }
                    }
                    return c2055f2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    C2351v5.m10828a("filter", 1, list);
                    InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if (!(interfaceC2255qM10776a2 instanceof C2237p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c2055f.m9958l() == 0) {
                        return new C2055f();
                    }
                    C2055f c2055f4 = (C2055f) c2055f.mo9950a();
                    C2055f c2055fM9899c = m9899c(c2055f, c2332u4, (C2237p) interfaceC2255qM10776a2, null, Boolean.TRUE);
                    C2055f c2055f5 = new C2055f();
                    Iterator itM9956i2 = c2055fM9899c.m9956i();
                    while (itM9956i2.hasNext()) {
                        c2055f5.m9960p(c2055f5.m9957k(), c2055f4.m9959m(((Integer) itM9956i2.next()).intValue()));
                    }
                    return c2055f5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return m9898b(c2055f, c2332u4, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new C2055f();
                    }
                    int iM10836i = (int) C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue());
                    if (iM10836i < 0) {
                        iM10836i = Math.max(0, iM10836i + c2055f.m9957k());
                    } else if (iM10836i > c2055f.m9957k()) {
                        iM10836i = c2055f.m9957k();
                    }
                    int iM9957k2 = c2055f.m9957k();
                    C2055f c2055f6 = new C2055f();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()));
                        if (iMax > 0) {
                            for (int i11 = iM10836i; i11 < Math.min(iM9957k2, iM10836i + iMax); i11++) {
                                c2055f6.m9960p(c2055f6.m9957k(), c2055f.m9959m(iM10836i));
                                c2055f.m9964y(iM10836i);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i12 = 2; i12 < list.size(); i12++) {
                                InterfaceC2255q interfaceC2255qM10776a3 = c2332u4.m10776a((InterfaceC2255q) list.get(i12));
                                if (interfaceC2255qM10776a3 instanceof C2093h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                c2055f.m9963x((iM10836i + i12) - 2, interfaceC2255qM10776a3);
                            }
                        }
                    } else {
                        while (iM10836i < iM9957k2) {
                            c2055f6.m9960p(c2055f6.m9957k(), c2055f.m9959m(iM10836i));
                            c2055f.m9960p(iM10836i, null);
                            iM10836i++;
                        }
                    }
                    return c2055f6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    C2351v5.m10828a("forEach", 1, list);
                    InterfaceC2255q interfaceC2255qM10776a4 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if (!(interfaceC2255qM10776a4 instanceof C2237p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c2055f.m9958l() == 0) {
                        return InterfaceC2255q.f8587zo;
                    }
                    m9899c(c2055f, c2332u4, (C2237p) interfaceC2255qM10776a4, null, null);
                    return InterfaceC2255q.f8587zo;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    C2351v5.m10830c("lastIndexOf", 2, list);
                    InterfaceC2255q interfaceC2255qM10776a5 = InterfaceC2255q.f8587zo;
                    if (!list.isEmpty()) {
                        interfaceC2255qM10776a5 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    }
                    int iM9957k3 = c2055f.m9957k() - 1;
                    if (list.size() > 1) {
                        InterfaceC2255q interfaceC2255qM10776a6 = c2332u4.m10776a((InterfaceC2255q) list.get(1));
                        dM9957k = Double.isNaN(interfaceC2255qM10776a6.zzd().doubleValue()) ? c2055f.m9957k() - 1 : C2351v5.m10836i(interfaceC2255qM10776a6.zzd().doubleValue());
                        if (dM9957k < 0.0d) {
                            dM9957k += (double) c2055f.m9957k();
                        }
                    } else {
                        dM9957k = iM9957k3;
                    }
                    if (dM9957k < 0.0d) {
                        return new C2129j(dValueOf);
                    }
                    for (int iMin = (int) Math.min(c2055f.m9957k(), dM9957k); iMin >= 0; iMin--) {
                        if (c2055f.m9961t(iMin) && C2351v5.m10833f(c2055f.m9959m(iMin), interfaceC2255qM10776a5)) {
                            return new C2129j(Double.valueOf(iMin));
                        }
                    }
                    return new C2129j(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        C2055f c2055f7 = new C2055f();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            InterfaceC2255q interfaceC2255qM10776a7 = c2332u4.m10776a((InterfaceC2255q) it2.next());
                            if (interfaceC2255qM10776a7 instanceof C2093h) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            c2055f7.m9960p(c2055f7.m9957k(), interfaceC2255qM10776a7);
                        }
                        int iM9957k4 = c2055f7.m9957k();
                        Iterator itM9956i3 = c2055f.m9956i();
                        while (itM9956i3.hasNext()) {
                            Integer num2 = (Integer) itM9956i3.next();
                            c2055f7.m9960p(num2.intValue() + iM9957k4, c2055f.m9959m(num2.intValue()));
                        }
                        c2055f.m9962u();
                        Iterator itM9956i4 = c2055f7.m9956i();
                        while (itM9956i4.hasNext()) {
                            Integer num3 = (Integer) itM9956i4.next();
                            c2055f.m9960p(num3.intValue(), c2055f7.m9959m(num3.intValue()));
                        }
                    }
                    return new C2129j(Double.valueOf(c2055f.m9957k()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    C2351v5.m10828a("map", 1, list);
                    InterfaceC2255q interfaceC2255qM10776a8 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if (interfaceC2255qM10776a8 instanceof C2237p) {
                        return c2055f.m9957k() == 0 ? new C2055f() : m9899c(c2055f, c2332u4, (C2237p) interfaceC2255qM10776a8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    C2351v5.m10828a("pop", 0, list);
                    int iM9957k5 = c2055f.m9957k();
                    if (iM9957k5 == 0) {
                        return InterfaceC2255q.f8587zo;
                    }
                    int i13 = iM9957k5 - 1;
                    InterfaceC2255q interfaceC2255qM9959m = c2055f.m9959m(i13);
                    c2055f.m9964y(i13);
                    return interfaceC2255qM9959m;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    C2351v5.m10830c("join", 1, list);
                    if (c2055f.m9957k() == 0) {
                        return InterfaceC2255q.f8586Go;
                    }
                    if (!list.isEmpty()) {
                        InterfaceC2255q interfaceC2255qM10776a9 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                        strZzc = ((interfaceC2255qM10776a9 instanceof C2219o) || (interfaceC2255qM10776a9 instanceof C2345v)) ? "" : interfaceC2255qM10776a9.zzc();
                    }
                    return new C2327u(c2055f.m9965z(strZzc));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            c2055f.m9960p(c2055f.m9957k(), c2332u4.m10776a((InterfaceC2255q) it3.next()));
                        }
                    }
                    return new C2129j(Double.valueOf(c2055f.m9957k()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    C2351v5.m10828a("some", 1, list);
                    InterfaceC2255q interfaceC2255qM10776a10 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if (!(interfaceC2255qM10776a10 instanceof AbstractC2147k)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c2055f.m9957k() == 0) {
                        return InterfaceC2255q.f8585Fo;
                    }
                    AbstractC2147k abstractC2147k2 = (AbstractC2147k) interfaceC2255qM10776a10;
                    Iterator itM9956i5 = c2055f.m9956i();
                    while (itM9956i5.hasNext()) {
                        int iIntValue = ((Integer) itM9956i5.next()).intValue();
                        if (c2055f.m9961t(iIntValue) && abstractC2147k2.mo9763h(c2332u4, Arrays.asList(c2055f.m9959m(iIntValue), new C2129j(Double.valueOf(iIntValue)), c2055f)).zze().booleanValue()) {
                            return InterfaceC2255q.f8584Eo;
                        }
                    }
                    return InterfaceC2255q.f8585Fo;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    C2351v5.m10830c("sort", 1, list);
                    if (c2055f.m9957k() >= 2) {
                        List listM9955h = c2055f.m9955h();
                        if (!list.isEmpty()) {
                            InterfaceC2255q interfaceC2255qM10776a11 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                            if (!(interfaceC2255qM10776a11 instanceof AbstractC2147k)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            abstractC2147k = (AbstractC2147k) interfaceC2255qM10776a11;
                        }
                        Collections.sort(listM9955h, new C1980b0(abstractC2147k, c2332u4));
                        c2055f.m9962u();
                        Iterator it4 = listM9955h.iterator();
                        while (it4.hasNext()) {
                            c2055f.m9960p(i10, (InterfaceC2255q) it4.next());
                            i10++;
                        }
                    }
                    return c2055f;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    C2351v5.m10828a("every", 1, list);
                    InterfaceC2255q interfaceC2255qM10776a12 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if (!(interfaceC2255qM10776a12 instanceof C2237p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (c2055f.m9957k() != 0 && m9899c(c2055f, c2332u4, (C2237p) interfaceC2255qM10776a12, Boolean.FALSE, Boolean.TRUE).m9957k() != c2055f.m9957k()) {
                        return InterfaceC2255q.f8585Fo;
                    }
                    return InterfaceC2255q.f8584Eo;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    C2351v5.m10828a("shift", 0, list);
                    if (c2055f.m9957k() == 0) {
                        return InterfaceC2255q.f8587zo;
                    }
                    InterfaceC2255q interfaceC2255qM9959m2 = c2055f.m9959m(0);
                    c2055f.m9964y(0);
                    return interfaceC2255qM9959m2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    C2351v5.m10830c("slice", 2, list);
                    if (list.isEmpty()) {
                        return c2055f.mo9950a();
                    }
                    double dM9957k3 = c2055f.m9957k();
                    double dM10836i = C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue());
                    double dMax = dM10836i < 0.0d ? Math.max(dM10836i + dM9957k3, 0.0d) : Math.min(dM10836i, dM9957k3);
                    if (list.size() == 2) {
                        double dM10836i2 = C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue());
                        dM9957k3 = dM10836i2 < 0.0d ? Math.max(dM9957k3 + dM10836i2, 0.0d) : Math.min(dM9957k3, dM10836i2);
                    }
                    C2055f c2055f8 = new C2055f();
                    for (int i14 = (int) dMax; i14 < dM9957k3; i14++) {
                        c2055f8.m9960p(c2055f8.m9957k(), c2055f.m9959m(i14));
                    }
                    return c2055f8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return m9898b(c2055f, c2332u4, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    C2351v5.m10828a("reverse", 0, list);
                    int iM9957k6 = c2055f.m9957k();
                    if (iM9957k6 != 0) {
                        while (i10 < iM9957k6 / 2) {
                            if (c2055f.m9961t(i10)) {
                                InterfaceC2255q interfaceC2255qM9959m3 = c2055f.m9959m(i10);
                                c2055f.m9960p(i10, null);
                                int i15 = (iM9957k6 - 1) - i10;
                                if (c2055f.m9961t(i15)) {
                                    c2055f.m9960p(i10, c2055f.m9959m(i15));
                                }
                                c2055f.m9960p(i15, interfaceC2255qM9959m3);
                            }
                            i10++;
                        }
                    }
                    return c2055f;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    C2351v5.m10830c("indexOf", 2, list);
                    InterfaceC2255q interfaceC2255qM10776a13 = InterfaceC2255q.f8587zo;
                    if (!list.isEmpty()) {
                        interfaceC2255qM10776a13 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dM10836i3 = C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue());
                        if (dM10836i3 >= c2055f.m9957k()) {
                            return new C2129j(dValueOf);
                        }
                        dM9957k2 = dM10836i3 < 0.0d ? ((double) c2055f.m9957k()) + dM10836i3 : dM10836i3;
                    }
                    Iterator itM9956i6 = c2055f.m9956i();
                    while (itM9956i6.hasNext()) {
                        int iIntValue2 = ((Integer) itM9956i6.next()).intValue();
                        double d10 = iIntValue2;
                        if (d10 >= dM9957k2 && C2351v5.m10833f(c2055f.m9959m(iIntValue2), interfaceC2255qM10776a13)) {
                            return new C2129j(Double.valueOf(d10));
                        }
                    }
                    return new C2129j(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* JADX DEBUG: Duplicate block (B:27:0x0059) to fix multi-entry loop: BACK_EDGE: B:31:0x0063 -> B:27:0x0059 */
    /* JADX DEBUG: Duplicate block (B:27:0x0059) to fix multi-entry loop: BACK_EDGE: B:33:0x0089 -> B:27:0x0059 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC2255q m9898b(C2055f c2055f, C2332u4 c2332u4, List list, boolean z10) {
        InterfaceC2255q interfaceC2255qMo9763h;
        C2351v5.m10829b("reduce", 1, list);
        C2351v5.m10830c("reduce", 2, list);
        InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
        if (!(interfaceC2255qM10776a instanceof AbstractC2147k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            interfaceC2255qMo9763h = c2332u4.m10776a((InterfaceC2255q) list.get(1));
            if (interfaceC2255qMo9763h instanceof C2093h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c2055f.m9957k() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC2255qMo9763h = null;
        }
        AbstractC2147k abstractC2147k = (AbstractC2147k) interfaceC2255qM10776a;
        int iM9957k = c2055f.m9957k();
        int i10 = z10 ? 0 : iM9957k - 1;
        int i11 = z10 ? iM9957k - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (interfaceC2255qMo9763h == null) {
            interfaceC2255qMo9763h = c2055f.m9959m(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c2055f.m9961t(i10)) {
                interfaceC2255qMo9763h = abstractC2147k.mo9763h(c2332u4, Arrays.asList(interfaceC2255qMo9763h, c2055f.m9959m(i10), new C2129j(Double.valueOf(i10)), c2055f));
                if (interfaceC2255qMo9763h instanceof C2093h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC2255qMo9763h;
    }

    /* JADX INFO: renamed from: c */
    public static C2055f m9899c(C2055f c2055f, C2332u4 c2332u4, AbstractC2147k abstractC2147k, Boolean bool, Boolean bool2) {
        C2055f c2055f2 = new C2055f();
        Iterator itM9956i = c2055f.m9956i();
        while (itM9956i.hasNext()) {
            int iIntValue = ((Integer) itM9956i.next()).intValue();
            if (c2055f.m9961t(iIntValue)) {
                InterfaceC2255q interfaceC2255qMo9763h = abstractC2147k.mo9763h(c2332u4, Arrays.asList(c2055f.m9959m(iIntValue), new C2129j(Double.valueOf(iIntValue)), c2055f));
                if (interfaceC2255qMo9763h.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || interfaceC2255qMo9763h.zze().equals(bool2)) {
                    c2055f2.m9960p(iIntValue, interfaceC2255qMo9763h);
                }
            }
        }
        return c2055f2;
    }
}
