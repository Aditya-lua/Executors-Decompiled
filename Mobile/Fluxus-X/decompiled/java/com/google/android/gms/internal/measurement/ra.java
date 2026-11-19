package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ra implements ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qa f6812a;

    public ra(qa qaVar) {
        Charset charset = ub.f6869a;
        this.f6812a = qaVar;
        qaVar.f6791a = this;
    }

    public static ra M(qa qaVar) {
        ra raVar = qaVar.f6791a;
        return raVar != null ? raVar : new ra(qaVar);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void A(int i10, long j10) {
        this.f6812a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof lb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += qa.G(((Integer) list.get(i12)).intValue());
            }
            qaVar.z(iG);
            while (i11 < list.size()) {
                qaVar.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z10) {
            while (i11 < lbVar.size()) {
                this.f6812a.k(i10, lbVar.c(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < lbVar.size(); i13++) {
            iG2 += qa.G(lbVar.c(i13));
        }
        qaVar2.z(iG2);
        while (i11 < lbVar.size()) {
            qaVar2.z(lbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof sa)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        sa saVar = (sa) list;
        if (!z10) {
            while (i11 < saVar.size()) {
                this.f6812a.n(i10, Double.doubleToRawLongBits(saVar.c(i11)));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < saVar.size(); i15++) {
            saVar.c(i15);
            i14 += 8;
        }
        qaVar2.z(i14);
        while (i11 < saVar.size()) {
            qaVar2.C(Double.doubleToRawLongBits(saVar.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void D(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f6812a.q(i10, (la) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void E(int i10, int i11) {
        this.f6812a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void F(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof cc)) {
            while (i11 < list.size()) {
                this.f6812a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        cc ccVar = (cc) list;
        while (i11 < list.size()) {
            Object objZzc = ccVar.zzc();
            if (objZzc instanceof String) {
                this.f6812a.p(i10, (String) objZzc);
            } else {
                this.f6812a.q(i10, (la) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void G(int i10, int i11) {
        this.f6812a.k(i10, (i11 >> 31) ^ (i11 + i11));
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
    @Override // com.google.android.gms.internal.measurement.ce
    public final void H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof ba)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        ba baVar = (ba) list;
        if (!z10) {
            while (i11 < baVar.size()) {
                this.f6812a.o(i10, baVar.c(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < baVar.size(); i15++) {
            baVar.c(i15);
            i14++;
        }
        qaVar2.z(i14);
        while (i11 < baVar.size()) {
            qaVar2.x(baVar.c(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof lb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z10) {
            while (i11 < lbVar.size()) {
                this.f6812a.l(i10, lbVar.c(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < lbVar.size(); i15++) {
            lbVar.c(i15);
            i14 += 4;
        }
        qaVar2.z(i14);
        while (i11 < lbVar.size()) {
            qaVar2.A(lbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void J(int i10, Object obj) {
        if (obj instanceof la) {
            this.f6812a.v(i10, (la) obj);
        } else {
            this.f6812a.u(i10, (sc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void K(int i10, boolean z10) {
        this.f6812a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void L(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof lb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += qa.a(((Integer) list.get(i12)).intValue());
            }
            qaVar.z(iA);
            while (i11 < list.size()) {
                qaVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z10) {
            while (i11 < lbVar.size()) {
                this.f6812a.j(i10, lbVar.c(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < lbVar.size(); i13++) {
            iA2 += qa.a(lbVar.c(i13));
        }
        qaVar2.z(iA2);
        while (i11 < lbVar.size()) {
            qaVar2.y(lbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void a(int i10, double d10) {
        this.f6812a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof lb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    qa qaVar = this.f6812a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    qaVar.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            qa qaVar2 = this.f6812a;
            qaVar2.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iG += qa.G((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            qaVar2.z(iG);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                qaVar2.z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z10) {
            while (i11 < lbVar.size()) {
                qa qaVar3 = this.f6812a;
                int iC = lbVar.c(i11);
                qaVar3.k(i10, (iC >> 31) ^ (iC + iC));
                i11++;
            }
            return;
        }
        qa qaVar4 = this.f6812a;
        qaVar4.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < lbVar.size(); i13++) {
            int iC2 = lbVar.c(i13);
            iG2 += qa.G((iC2 >> 31) ^ (iC2 + iC2));
        }
        qaVar4.z(iG2);
        while (i11 < lbVar.size()) {
            int iC3 = lbVar.c(i11);
            qaVar4.z((iC3 >> 31) ^ (iC3 + iC3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof gc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += qa.a(((Long) list.get(i12)).longValue());
            }
            qaVar.z(iA);
            while (i11 < list.size()) {
                qaVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        gc gcVar = (gc) list;
        if (!z10) {
            while (i11 < gcVar.size()) {
                this.f6812a.m(i10, gcVar.w0(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < gcVar.size(); i13++) {
            iA2 += qa.a(gcVar.w0(i13));
        }
        qaVar2.z(iA2);
        while (i11 < gcVar.size()) {
            qaVar2.B(gcVar.w0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void d(int i10, int i11) {
        this.f6812a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void e(int i10, int i11) {
        this.f6812a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof cb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        cb cbVar = (cb) list;
        if (!z10) {
            while (i11 < cbVar.size()) {
                this.f6812a.l(i10, Float.floatToRawIntBits(cbVar.c(i11)));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < cbVar.size(); i15++) {
            cbVar.c(i15);
            i14 += 4;
        }
        qaVar2.z(i14);
        while (i11 < cbVar.size()) {
            qaVar2.A(Float.floatToRawIntBits(cbVar.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof lb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += qa.a(((Integer) list.get(i12)).intValue());
            }
            qaVar.z(iA);
            while (i11 < list.size()) {
                qaVar.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z10) {
            while (i11 < lbVar.size()) {
                this.f6812a.j(i10, lbVar.c(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < lbVar.size(); i13++) {
            iA2 += qa.a(lbVar.c(i13));
        }
        qaVar2.z(iA2);
        while (i11 < lbVar.size()) {
            qaVar2.y(lbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void h(int i10, int i11) {
        this.f6812a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void i(int i10, kc kcVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            qaVar.z(lc.c(kcVar, entry.getKey(), entry.getValue()));
            lc.b(qaVar, kcVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void j(int i10, Object obj, dd ddVar) {
        this.f6812a.t(i10, (sc) obj, ddVar);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void k(int i10, long j10) {
        this.f6812a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void l(int i10, long j10) {
        this.f6812a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof gc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        gc gcVar = (gc) list;
        if (!z10) {
            while (i11 < gcVar.size()) {
                this.f6812a.n(i10, gcVar.w0(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < gcVar.size(); i15++) {
            gcVar.w0(i15);
            i14 += 8;
        }
        qaVar2.z(i14);
        while (i11 < gcVar.size()) {
            qaVar2.C(gcVar.w0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    @Deprecated
    public final void n(int i10) {
        this.f6812a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    @Deprecated
    public final void o(int i10) {
        this.f6812a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void p(int i10, String str) {
        this.f6812a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof gc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    qa qaVar = this.f6812a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    qaVar.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            qa qaVar2 = this.f6812a;
            qaVar2.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += qa.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            qaVar2.z(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                qaVar2.B((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        gc gcVar = (gc) list;
        if (!z10) {
            while (i11 < gcVar.size()) {
                qa qaVar3 = this.f6812a;
                long jW0 = gcVar.w0(i11);
                qaVar3.m(i10, (jW0 >> 63) ^ (jW0 + jW0));
                i11++;
            }
            return;
        }
        qa qaVar4 = this.f6812a;
        qaVar4.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < gcVar.size(); i13++) {
            long jW1 = gcVar.w0(i13);
            iA2 += qa.a((jW1 >> 63) ^ (jW1 + jW1));
        }
        qaVar4.z(iA2);
        while (i11 < gcVar.size()) {
            long jW2 = gcVar.w0(i11);
            qaVar4.B((jW2 >> 63) ^ (jW2 + jW2));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void r(int i10, int i11) {
        this.f6812a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void s(int i10, Object obj, dd ddVar) {
        qa qaVar = this.f6812a;
        qaVar.i(i10, 3);
        ddVar.e((sc) obj, qaVar.f6791a);
        qaVar.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void t(int i10, long j10) {
        this.f6812a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void u(int i10, float f10) {
        this.f6812a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void v(int i10, la laVar) {
        this.f6812a.q(i10, laVar);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void w(int i10, long j10) {
        this.f6812a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof gc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += qa.a(((Long) list.get(i12)).longValue());
            }
            qaVar.z(iA);
            while (i11 < list.size()) {
                qaVar.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        gc gcVar = (gc) list;
        if (!z10) {
            while (i11 < gcVar.size()) {
                this.f6812a.m(i10, gcVar.w0(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < gcVar.size(); i13++) {
            iA2 += qa.a(gcVar.w0(i13));
        }
        qaVar2.z(iA2);
        while (i11 < gcVar.size()) {
            qaVar2.B(gcVar.w0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof lb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lb lbVar = (lb) list;
        if (!z10) {
            while (i11 < lbVar.size()) {
                this.f6812a.l(i10, lbVar.c(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < lbVar.size(); i15++) {
            lbVar.c(i15);
            i14 += 4;
        }
        qaVar2.z(i14);
        while (i11 < lbVar.size()) {
            qaVar2.A(lbVar.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ce
    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof gc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f6812a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            qa qaVar = this.f6812a;
            qaVar.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            qaVar.z(i12);
            while (i11 < list.size()) {
                qaVar.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        gc gcVar = (gc) list;
        if (!z10) {
            while (i11 < gcVar.size()) {
                this.f6812a.n(i10, gcVar.w0(i11));
                i11++;
            }
            return;
        }
        qa qaVar2 = this.f6812a;
        qaVar2.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < gcVar.size(); i15++) {
            gcVar.w0(i15);
            i14 += 8;
        }
        qaVar2.z(i14);
        while (i11 < gcVar.size()) {
            qaVar2.C(gcVar.w0(i11));
            i11++;
        }
    }
}
