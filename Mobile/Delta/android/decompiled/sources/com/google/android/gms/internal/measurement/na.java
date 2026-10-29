package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class na implements yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma f6689a;

    public na(ma maVar) {
        Charset charset = qb.f6750a;
        this.f6689a = maVar;
        maVar.f6625a = this;
    }

    public static na M(ma maVar) {
        na naVar = maVar.f6625a;
        return naVar != null ? naVar : new na(maVar);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void A(int i10, long j10) {
        this.f6689a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += ma.G(((Integer) list.get(i12)).intValue());
            }
            maVar.z(iG);
            while (i11 < list.size()) {
                maVar.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6689a.k(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < hbVar.size(); i13++) {
            iG2 += ma.G(hbVar.c(i13));
        }
        maVar2.z(iG2);
        while (i11 < hbVar.size()) {
            maVar2.z(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof oa)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        oa oaVar = (oa) list;
        if (!z10) {
            while (i11 < oaVar.size()) {
                this.f6689a.n(i10, Double.doubleToRawLongBits(oaVar.c(i11)));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < oaVar.size(); i15++) {
            oaVar.c(i15);
            i14 += 8;
        }
        maVar2.z(i14);
        while (i11 < oaVar.size()) {
            maVar2.C(Double.doubleToRawLongBits(oaVar.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void D(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f6689a.q(i10, (ha) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void E(int i10, int i11) {
        this.f6689a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void F(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof yb)) {
            while (i11 < list.size()) {
                this.f6689a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        yb ybVar = (yb) list;
        while (i11 < list.size()) {
            Object objZzc = ybVar.zzc();
            if (objZzc instanceof String) {
                this.f6689a.p(i10, (String) objZzc);
            } else {
                this.f6689a.q(i10, (ha) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void G(int i10, int i11) {
        this.f6689a.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.yd
    public final void H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof x9)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        x9 x9Var = (x9) list;
        if (!z10) {
            while (i11 < x9Var.size()) {
                this.f6689a.o(i10, x9Var.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < x9Var.size(); i15++) {
            x9Var.c(i15);
            i14++;
        }
        maVar2.z(i14);
        while (i11 < x9Var.size()) {
            maVar2.x(x9Var.c(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6689a.l(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            hbVar.c(i15);
            i14 += 4;
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.A(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void J(int i10, Object obj) {
        if (obj instanceof ha) {
            this.f6689a.v(i10, (ha) obj);
        } else {
            this.f6689a.u(i10, (oc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void K(int i10, boolean z10) {
        this.f6689a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void L(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += ma.a(((Integer) list.get(i12)).intValue());
            }
            maVar.z(iA);
            while (i11 < list.size()) {
                maVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6689a.j(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < hbVar.size(); i13++) {
            iA2 += ma.a(hbVar.c(i13));
        }
        maVar2.z(iA2);
        while (i11 < hbVar.size()) {
            maVar2.y(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void a(int i10, double d10) {
        this.f6689a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    ma maVar = this.f6689a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    maVar.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            ma maVar2 = this.f6689a;
            maVar2.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iG += ma.G((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            maVar2.z(iG);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                maVar2.z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                ma maVar3 = this.f6689a;
                int iC = hbVar.c(i11);
                maVar3.k(i10, (iC >> 31) ^ (iC + iC));
                i11++;
            }
            return;
        }
        ma maVar4 = this.f6689a;
        maVar4.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < hbVar.size(); i13++) {
            int iC2 = hbVar.c(i13);
            iG2 += ma.G((iC2 >> 31) ^ (iC2 + iC2));
        }
        maVar4.z(iG2);
        while (i11 < hbVar.size()) {
            int iC3 = hbVar.c(i11);
            maVar4.z((iC3 >> 31) ^ (iC3 + iC3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += ma.a(((Long) list.get(i12)).longValue());
            }
            maVar.z(iA);
            while (i11 < list.size()) {
                maVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6689a.m(i10, ccVar.x0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < ccVar.size(); i13++) {
            iA2 += ma.a(ccVar.x0(i13));
        }
        maVar2.z(iA2);
        while (i11 < ccVar.size()) {
            maVar2.B(ccVar.x0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void d(int i10, int i11) {
        this.f6689a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void e(int i10, int i11) {
        this.f6689a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof ya)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        ya yaVar = (ya) list;
        if (!z10) {
            while (i11 < yaVar.size()) {
                this.f6689a.l(i10, Float.floatToRawIntBits(yaVar.c(i11)));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < yaVar.size(); i15++) {
            yaVar.c(i15);
            i14 += 4;
        }
        maVar2.z(i14);
        while (i11 < yaVar.size()) {
            maVar2.A(Float.floatToRawIntBits(yaVar.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += ma.a(((Integer) list.get(i12)).intValue());
            }
            maVar.z(iA);
            while (i11 < list.size()) {
                maVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6689a.j(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < hbVar.size(); i13++) {
            iA2 += ma.a(hbVar.c(i13));
        }
        maVar2.z(iA2);
        while (i11 < hbVar.size()) {
            maVar2.y(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void h(int i10, int i11) {
        this.f6689a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void i(int i10, gc gcVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            maVar.z(hc.c(gcVar, entry.getKey(), entry.getValue()));
            hc.b(maVar, gcVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void j(int i10, Object obj, zc zcVar) {
        this.f6689a.t(i10, (oc) obj, zcVar);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void k(int i10, long j10) {
        this.f6689a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void l(int i10, long j10) {
        this.f6689a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6689a.n(i10, ccVar.x0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            ccVar.x0(i15);
            i14 += 8;
        }
        maVar2.z(i14);
        while (i11 < ccVar.size()) {
            maVar2.C(ccVar.x0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    @Deprecated
    public final void n(int i10) {
        this.f6689a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    @Deprecated
    public final void o(int i10) {
        this.f6689a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void p(int i10, String str) {
        this.f6689a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    ma maVar = this.f6689a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    maVar.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            ma maVar2 = this.f6689a;
            maVar2.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += ma.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            maVar2.z(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                maVar2.B((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                ma maVar3 = this.f6689a;
                long jX0 = ccVar.x0(i11);
                maVar3.m(i10, (jX0 >> 63) ^ (jX0 + jX0));
                i11++;
            }
            return;
        }
        ma maVar4 = this.f6689a;
        maVar4.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < ccVar.size(); i13++) {
            long jX1 = ccVar.x0(i13);
            iA2 += ma.a((jX1 >> 63) ^ (jX1 + jX1));
        }
        maVar4.z(iA2);
        while (i11 < ccVar.size()) {
            long jX2 = ccVar.x0(i11);
            maVar4.B((jX2 >> 63) ^ (jX2 + jX2));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void r(int i10, int i11) {
        this.f6689a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void s(int i10, Object obj, zc zcVar) {
        ma maVar = this.f6689a;
        maVar.i(i10, 3);
        zcVar.e((oc) obj, maVar.f6625a);
        maVar.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void t(int i10, long j10) {
        this.f6689a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void u(int i10, float f10) {
        this.f6689a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void v(int i10, ha haVar) {
        this.f6689a.q(i10, haVar);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void w(int i10, long j10) {
        this.f6689a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += ma.a(((Long) list.get(i12)).longValue());
            }
            maVar.z(iA);
            while (i11 < list.size()) {
                maVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6689a.m(i10, ccVar.x0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < ccVar.size(); i13++) {
            iA2 += ma.a(ccVar.x0(i13));
        }
        maVar2.z(iA2);
        while (i11 < ccVar.size()) {
            maVar2.B(ccVar.x0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        hb hbVar = (hb) list;
        if (!z10) {
            while (i11 < hbVar.size()) {
                this.f6689a.l(i10, hbVar.c(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hbVar.size(); i15++) {
            hbVar.c(i15);
            i14 += 4;
        }
        maVar2.z(i14);
        while (i11 < hbVar.size()) {
            maVar2.A(hbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6689a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            ma maVar = this.f6689a;
            maVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            maVar.z(i12);
            while (i11 < list.size()) {
                maVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        if (!z10) {
            while (i11 < ccVar.size()) {
                this.f6689a.n(i10, ccVar.x0(i11));
                i11++;
            }
            return;
        }
        ma maVar2 = this.f6689a;
        maVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ccVar.size(); i15++) {
            ccVar.x0(i15);
            i14 += 8;
        }
        maVar2.z(i14);
        while (i11 < ccVar.size()) {
            maVar2.C(ccVar.x0(i11));
            i11++;
        }
    }
}
