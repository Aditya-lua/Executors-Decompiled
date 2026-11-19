package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static q a(String str, f fVar, y4 y4Var, List list) {
        double dJ;
        Double dValueOf = Double.valueOf(-1.0d);
        String strZzc = ",";
        double dJ2 = 0.0d;
        k kVar = null;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    z5.a("toString", 0, list);
                    return new u(fVar.x(","));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    f fVar2 = (f) fVar.a();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            q qVarA = y4Var.a((q) it.next());
                            if (qVarA instanceof h) {
                                throw new IllegalStateException("Failed evaluation of arguments");
                            }
                            int iJ = fVar2.j();
                            if (qVarA instanceof f) {
                                f fVar3 = (f) qVarA;
                                Iterator itI = fVar3.i();
                                while (itI.hasNext()) {
                                    Integer num = (Integer) itI.next();
                                    fVar2.n(num.intValue() + iJ, fVar3.m(num.intValue()));
                                }
                            } else {
                                fVar2.n(iJ, qVarA);
                            }
                        }
                    }
                    return fVar2;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1274492040:
                if (str.equals("filter")) {
                    z5.a("filter", 1, list);
                    q qVarA2 = y4Var.a((q) list.get(0));
                    if (!(qVarA2 instanceof p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.l() == 0) {
                        return new f();
                    }
                    f fVar4 = (f) fVar.a();
                    f fVarC = c(fVar, y4Var, (p) qVarA2, null, Boolean.TRUE);
                    f fVar5 = new f();
                    Iterator itI2 = fVarC.i();
                    while (itI2.hasNext()) {
                        fVar5.n(fVar5.j(), fVar4.m(((Integer) itI2.next()).intValue()));
                    }
                    return fVar5;
                }
                throw new IllegalArgumentException("Command not supported");
            case -934873754:
                if (str.equals("reduce")) {
                    return b(fVar, y4Var, list, true);
                }
                throw new IllegalArgumentException("Command not supported");
            case -895859076:
                if (str.equals("splice")) {
                    if (list.isEmpty()) {
                        return new f();
                    }
                    int i11 = (int) z5.i(y4Var.a((q) list.get(0)).zzd().doubleValue());
                    if (i11 < 0) {
                        i11 = Math.max(0, i11 + fVar.j());
                    } else if (i11 > fVar.j()) {
                        i11 = fVar.j();
                    }
                    int iJ2 = fVar.j();
                    f fVar6 = new f();
                    if (list.size() > 1) {
                        int iMax = Math.max(0, (int) z5.i(y4Var.a((q) list.get(1)).zzd().doubleValue()));
                        if (iMax > 0) {
                            for (int i12 = i11; i12 < Math.min(iJ2, i11 + iMax); i12++) {
                                fVar6.n(fVar6.j(), fVar.m(i11));
                                fVar.w(i11);
                            }
                        }
                        if (list.size() > 2) {
                            for (int i13 = 2; i13 < list.size(); i13++) {
                                q qVarA3 = y4Var.a((q) list.get(i13));
                                if (qVarA3 instanceof h) {
                                    throw new IllegalArgumentException("Failed to parse elements to add");
                                }
                                fVar.v((i11 + i13) - 2, qVarA3);
                            }
                        }
                    } else {
                        while (i11 < iJ2) {
                            fVar6.n(fVar6.j(), fVar.m(i11));
                            fVar.n(i11, null);
                            i11++;
                        }
                    }
                    return fVar6;
                }
                throw new IllegalArgumentException("Command not supported");
            case -678635926:
                if (str.equals("forEach")) {
                    z5.a("forEach", 1, list);
                    q qVarA4 = y4Var.a((q) list.get(0));
                    if (!(qVarA4 instanceof p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.l() == 0) {
                        return q.Co;
                    }
                    c(fVar, y4Var, (p) qVarA4, null, null);
                    return q.Co;
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    z5.c("lastIndexOf", 2, list);
                    q qVarA5 = q.Co;
                    if (!list.isEmpty()) {
                        qVarA5 = y4Var.a((q) list.get(0));
                    }
                    int iJ3 = fVar.j() - 1;
                    if (list.size() > 1) {
                        q qVarA6 = y4Var.a((q) list.get(1));
                        dJ = Double.isNaN(qVarA6.zzd().doubleValue()) ? fVar.j() - 1 : z5.i(qVarA6.zzd().doubleValue());
                        if (dJ < 0.0d) {
                            dJ += (double) fVar.j();
                        }
                    } else {
                        dJ = iJ3;
                    }
                    if (dJ < 0.0d) {
                        return new j(dValueOf);
                    }
                    for (int iMin = (int) Math.min(fVar.j(), dJ); iMin >= 0; iMin--) {
                        if (fVar.q(iMin) && z5.f(fVar.m(iMin), qVarA5)) {
                            return new j(Double.valueOf(iMin));
                        }
                    }
                    return new j(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            case -277637751:
                if (str.equals("unshift")) {
                    if (!list.isEmpty()) {
                        f fVar7 = new f();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            q qVarA7 = y4Var.a((q) it2.next());
                            if (qVarA7 instanceof h) {
                                throw new IllegalStateException("Argument evaluation failed");
                            }
                            fVar7.n(fVar7.j(), qVarA7);
                        }
                        int iJ4 = fVar7.j();
                        Iterator itI3 = fVar.i();
                        while (itI3.hasNext()) {
                            Integer num2 = (Integer) itI3.next();
                            fVar7.n(num2.intValue() + iJ4, fVar.m(num2.intValue()));
                        }
                        fVar.t();
                        Iterator itI4 = fVar7.i();
                        while (itI4.hasNext()) {
                            Integer num3 = (Integer) itI4.next();
                            fVar.n(num3.intValue(), fVar7.m(num3.intValue()));
                        }
                    }
                    return new j(Double.valueOf(fVar.j()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 107868:
                if (str.equals("map")) {
                    z5.a("map", 1, list);
                    q qVarA8 = y4Var.a((q) list.get(0));
                    if (qVarA8 instanceof p) {
                        return fVar.j() == 0 ? new f() : c(fVar, y4Var, (p) qVarA8, null, null);
                    }
                    throw new IllegalArgumentException("Callback should be a method");
                }
                throw new IllegalArgumentException("Command not supported");
            case 111185:
                if (str.equals("pop")) {
                    z5.a("pop", 0, list);
                    int iJ5 = fVar.j();
                    if (iJ5 == 0) {
                        return q.Co;
                    }
                    int i14 = iJ5 - 1;
                    q qVarM = fVar.m(i14);
                    fVar.w(i14);
                    return qVarM;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3267882:
                if (str.equals("join")) {
                    z5.c("join", 1, list);
                    if (fVar.j() == 0) {
                        return q.Ko;
                    }
                    if (!list.isEmpty()) {
                        q qVarA9 = y4Var.a((q) list.get(0));
                        strZzc = ((qVarA9 instanceof o) || (qVarA9 instanceof v)) ? BuildConfig.FLAVOR : qVarA9.zzc();
                    }
                    return new u(fVar.x(strZzc));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3452698:
                if (str.equals("push")) {
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            fVar.n(fVar.j(), y4Var.a((q) it3.next()));
                        }
                    }
                    return new j(Double.valueOf(fVar.j()));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536116:
                if (str.equals("some")) {
                    z5.a("some", 1, list);
                    q qVarA10 = y4Var.a((q) list.get(0));
                    if (!(qVarA10 instanceof k)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.j() == 0) {
                        return q.Jo;
                    }
                    k kVar2 = (k) qVarA10;
                    Iterator itI5 = fVar.i();
                    while (itI5.hasNext()) {
                        int iIntValue = ((Integer) itI5.next()).intValue();
                        if (fVar.q(iIntValue) && kVar2.h(y4Var, Arrays.asList(fVar.m(iIntValue), new j(Double.valueOf(iIntValue)), fVar)).zze().booleanValue()) {
                            return q.Ho;
                        }
                    }
                    return q.Jo;
                }
                throw new IllegalArgumentException("Command not supported");
            case 3536286:
                if (str.equals("sort")) {
                    z5.c("sort", 1, list);
                    if (fVar.j() >= 2) {
                        List listH = fVar.h();
                        if (!list.isEmpty()) {
                            q qVarA11 = y4Var.a((q) list.get(0));
                            if (!(qVarA11 instanceof k)) {
                                throw new IllegalArgumentException("Comparator should be a method");
                            }
                            kVar = (k) qVarA11;
                        }
                        Collections.sort(listH, new b0(kVar, y4Var));
                        fVar.t();
                        Iterator it4 = listH.iterator();
                        while (it4.hasNext()) {
                            fVar.n(i10, (q) it4.next());
                            i10++;
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 96891675:
                if (str.equals("every")) {
                    z5.a("every", 1, list);
                    q qVarA12 = y4Var.a((q) list.get(0));
                    if (!(qVarA12 instanceof p)) {
                        throw new IllegalArgumentException("Callback should be a method");
                    }
                    if (fVar.j() != 0 && c(fVar, y4Var, (p) qVarA12, Boolean.FALSE, Boolean.TRUE).j() != fVar.j()) {
                        return q.Jo;
                    }
                    return q.Ho;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109407362:
                if (str.equals("shift")) {
                    z5.a("shift", 0, list);
                    if (fVar.j() == 0) {
                        return q.Co;
                    }
                    q qVarM2 = fVar.m(0);
                    fVar.w(0);
                    return qVarM2;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    z5.c("slice", 2, list);
                    if (list.isEmpty()) {
                        return fVar.a();
                    }
                    double dJ3 = fVar.j();
                    double dI = z5.i(y4Var.a((q) list.get(0)).zzd().doubleValue());
                    double dMax = dI < 0.0d ? Math.max(dI + dJ3, 0.0d) : Math.min(dI, dJ3);
                    if (list.size() == 2) {
                        double dI2 = z5.i(y4Var.a((q) list.get(1)).zzd().doubleValue());
                        dJ3 = dI2 < 0.0d ? Math.max(dJ3 + dI2, 0.0d) : Math.min(dJ3, dI2);
                    }
                    f fVar8 = new f();
                    for (int i15 = (int) dMax; i15 < dJ3; i15++) {
                        fVar8.n(fVar8.j(), fVar.m(i15));
                    }
                    return fVar8;
                }
                throw new IllegalArgumentException("Command not supported");
            case 965561430:
                if (str.equals("reduceRight")) {
                    return b(fVar, y4Var, list, false);
                }
                throw new IllegalArgumentException("Command not supported");
            case 1099846370:
                if (str.equals("reverse")) {
                    z5.a("reverse", 0, list);
                    int iJ6 = fVar.j();
                    if (iJ6 != 0) {
                        while (i10 < iJ6 / 2) {
                            if (fVar.q(i10)) {
                                q qVarM3 = fVar.m(i10);
                                fVar.n(i10, null);
                                int i16 = (iJ6 - 1) - i10;
                                if (fVar.q(i16)) {
                                    fVar.n(i10, fVar.m(i16));
                                }
                                fVar.n(i16, qVarM3);
                            }
                            i10++;
                        }
                    }
                    return fVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    z5.c("indexOf", 2, list);
                    q qVarA13 = q.Co;
                    if (!list.isEmpty()) {
                        qVarA13 = y4Var.a((q) list.get(0));
                    }
                    if (list.size() > 1) {
                        double dI3 = z5.i(y4Var.a((q) list.get(1)).zzd().doubleValue());
                        if (dI3 >= fVar.j()) {
                            return new j(dValueOf);
                        }
                        dJ2 = dI3 < 0.0d ? ((double) fVar.j()) + dI3 : dI3;
                    }
                    Iterator itI6 = fVar.i();
                    while (itI6.hasNext()) {
                        int iIntValue2 = ((Integer) itI6.next()).intValue();
                        double d10 = iIntValue2;
                        if (d10 >= dJ2 && z5.f(fVar.m(iIntValue2), qVarA13)) {
                            return new j(Double.valueOf(d10));
                        }
                    }
                    return new j(dValueOf);
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public static q b(f fVar, y4 y4Var, List list, boolean z10) {
        q qVarH;
        z5.b("reduce", 1, list);
        z5.c("reduce", 2, list);
        q qVarA = y4Var.a((q) list.get(0));
        if (!(qVarA instanceof k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            qVarH = y4Var.a((q) list.get(1));
            if (qVarH instanceof h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (fVar.j() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            qVarH = null;
        }
        k kVar = (k) qVarA;
        int iJ = fVar.j();
        int i10 = z10 ? 0 : iJ - 1;
        int i11 = z10 ? iJ - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (qVarH == null) {
            qVarH = fVar.m(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (fVar.q(i10)) {
                qVarH = kVar.h(y4Var, Arrays.asList(qVarH, fVar.m(i10), new j(Double.valueOf(i10)), fVar));
                if (qVarH instanceof h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return qVarH;
    }

    public static f c(f fVar, y4 y4Var, k kVar, Boolean bool, Boolean bool2) {
        f fVar2 = new f();
        Iterator itI = fVar.i();
        while (itI.hasNext()) {
            int iIntValue = ((Integer) itI.next()).intValue();
            if (fVar.q(iIntValue)) {
                q qVarH = kVar.h(y4Var, Arrays.asList(fVar.m(iIntValue), new j(Double.valueOf(iIntValue)), fVar));
                if (qVarH.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || qVarH.zze().equals(bool2)) {
                    fVar2.n(iIntValue, qVarH);
                }
            }
        }
        return fVar2;
    }
}
