package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b4 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f7007a;

    public b4(a4 a4Var) {
        this.f7007a = a4Var;
        a4Var.f6983a = this;
    }

    public static b4 M(a4 a4Var) {
        Object obj = a4Var.f6983a;
        return obj != null ? (b4) obj : new b4(a4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        if (!z10) {
            while (i11 < u4Var.size()) {
                this.f7007a.g(i10, u4Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u4Var.size(); i15++) {
            u4Var.c(i15);
            i14 += 4;
        }
        a4Var2.r(i14);
        while (i11 < u4Var.size()) {
            a4Var2.h(u4Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += a4.w(((Integer) list.get(i12)).intValue());
            }
            a4Var.r(iW);
            while (i11 < list.size()) {
                a4Var.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        if (!z10) {
            while (i11 < u4Var.size()) {
                this.f7007a.k(i10, u4Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < u4Var.size(); i13++) {
            iW2 += a4.w(u4Var.c(i13));
        }
        a4Var2.r(iW2);
        while (i11 < u4Var.size()) {
            a4Var2.l(u4Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void C(int i10, long j10) {
        this.f7007a.s(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void D(int i10, Object obj) {
        if (obj instanceof s3) {
            this.f7007a.n(i10, (s3) obj);
        } else {
            this.f7007a.m(i10, (x5) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void E(int i10, s3 s3Var) {
        this.f7007a.f(i10, s3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void F(int i10, float f10) {
        this.f7007a.g(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.s(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += a4.w(((Long) list.get(i12)).longValue());
            }
            a4Var.r(iW);
            while (i11 < list.size()) {
                a4Var.t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z10) {
            while (i11 < l5Var.size()) {
                this.f7007a.s(i10, l5Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < l5Var.size(); i13++) {
            iW2 += a4.w(l5Var.c(i13));
        }
        a4Var2.r(iW2);
        while (i11 < l5Var.size()) {
            a4Var2.t(l5Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void H(int i10, Object obj, h6 h6Var) {
        a4 a4Var = this.f7007a;
        c3 c3Var = (c3) obj;
        a4Var.p(i10, 2);
        a4Var.r(c3Var.c(h6Var));
        h6Var.e(c3Var, this);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void I(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof h5)) {
            while (i11 < list.size()) {
                this.f7007a.o(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        h5 h5Var = (h5) list;
        while (i11 < list.size()) {
            Object objZza = h5Var.zza();
            if (objZza instanceof String) {
                this.f7007a.o(i10, (String) objZza);
            } else {
                this.f7007a.f(i10, (s3) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void J(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof c4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.i(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.j(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        c4 c4Var = (c4) list;
        if (!z10) {
            while (i11 < c4Var.size()) {
                this.f7007a.i(i10, Double.doubleToRawLongBits(c4Var.c(i11)));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4Var.size(); i15++) {
            c4Var.c(i15);
            i14 += 8;
        }
        a4Var2.r(i14);
        while (i11 < c4Var.size()) {
            a4Var2.j(Double.doubleToRawLongBits(c4Var.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void K(int i10, int i11) {
        this.f7007a.q(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void L(int i10, long j10) {
        this.f7007a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void a(int i10, double d10) {
        this.f7007a.i(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.q(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int iV = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iV += a4.v(((Integer) list.get(i12)).intValue());
            }
            a4Var.r(iV);
            while (i11 < list.size()) {
                a4Var.r(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        if (!z10) {
            while (i11 < u4Var.size()) {
                this.f7007a.q(i10, u4Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int iV2 = 0;
        for (int i13 = 0; i13 < u4Var.size(); i13++) {
            iV2 += a4.v(u4Var.c(i13));
        }
        a4Var2.r(iV2);
        while (i11 < u4Var.size()) {
            a4Var2.r(u4Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        if (!z10) {
            while (i11 < u4Var.size()) {
                this.f7007a.g(i10, u4Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < u4Var.size(); i15++) {
            u4Var.c(i15);
            i14 += 4;
        }
        a4Var2.r(i14);
        while (i11 < u4Var.size()) {
            a4Var2.h(u4Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void d(int i10, int i11) {
        this.f7007a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void e(int i10, int i11) {
        this.f7007a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.i(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.j(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z10) {
            while (i11 < l5Var.size()) {
                this.f7007a.i(i10, l5Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < l5Var.size(); i15++) {
            l5Var.c(i15);
            i14 += 8;
        }
        a4Var2.r(i14);
        while (i11 < l5Var.size()) {
            a4Var2.j(l5Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    a4 a4Var = this.f7007a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    a4Var.q(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            a4 a4Var2 = this.f7007a;
            a4Var2.p(i10, 2);
            int iV = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iV += a4.v((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            a4Var2.r(iV);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                a4Var2.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        if (!z10) {
            while (i11 < u4Var.size()) {
                a4 a4Var3 = this.f7007a;
                int iC = u4Var.c(i11);
                a4Var3.q(i10, (iC >> 31) ^ (iC + iC));
                i11++;
            }
            return;
        }
        a4 a4Var4 = this.f7007a;
        a4Var4.p(i10, 2);
        int iV2 = 0;
        for (int i13 = 0; i13 < u4Var.size(); i13++) {
            int iC2 = u4Var.c(i13);
            iV2 += a4.v((iC2 >> 31) ^ (iC2 + iC2));
        }
        a4Var4.r(iV2);
        while (i11 < u4Var.size()) {
            int iC3 = u4Var.c(i11);
            a4Var4.r((iC3 >> 31) ^ (iC3 + iC3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void h(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7007a.f(i10, (s3) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void i(int i10, boolean z10) {
        this.f7007a.e(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void j(int i10, long j10) {
        this.f7007a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void k(int i10, long j10) {
        this.f7007a.s(i10, j10);
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
    @Override // com.google.android.gms.internal.play_billing.i7
    public final void l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof h3)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.e(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.d(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        h3 h3Var = (h3) list;
        if (!z10) {
            while (i11 < h3Var.size()) {
                this.f7007a.e(i10, h3Var.d(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < h3Var.size(); i15++) {
            h3Var.d(i15);
            i14++;
        }
        a4Var2.r(i14);
        while (i11 < h3Var.size()) {
            a4Var2.d(h3Var.d(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += a4.w(((Integer) list.get(i12)).intValue());
            }
            a4Var.r(iW);
            while (i11 < list.size()) {
                a4Var.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        if (!z10) {
            while (i11 < u4Var.size()) {
                this.f7007a.k(i10, u4Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < u4Var.size(); i13++) {
            iW2 += a4.w(u4Var.c(i13));
        }
        a4Var2.r(iW2);
        while (i11 < u4Var.size()) {
            a4Var2.l(u4Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void n(int i10, String str) {
        this.f7007a.o(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void o(int i10, int i11) {
        this.f7007a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.i(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.j(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z10) {
            while (i11 < l5Var.size()) {
                this.f7007a.i(i10, l5Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < l5Var.size(); i15++) {
            l5Var.c(i15);
            i14 += 8;
        }
        a4Var2.r(i14);
        while (i11 < l5Var.size()) {
            a4Var2.j(l5Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    @Deprecated
    public final void q(int i10) {
        this.f7007a.p(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void r(int i10, long j10) {
        this.f7007a.s(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void s(int i10, Object obj, h6 h6Var) {
        a4 a4Var = this.f7007a;
        a4Var.p(i10, 3);
        h6Var.e((c3) obj, this);
        a4Var.p(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof n4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.g(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            a4Var.r(i12);
            while (i11 < list.size()) {
                a4Var.h(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        n4 n4Var = (n4) list;
        if (!z10) {
            while (i11 < n4Var.size()) {
                this.f7007a.g(i10, Float.floatToRawIntBits(n4Var.c(i11)));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < n4Var.size(); i15++) {
            n4Var.c(i15);
            i14 += 4;
        }
        a4Var2.r(i14);
        while (i11 < n4Var.size()) {
            a4Var2.h(Float.floatToRawIntBits(n4Var.c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void u(int i10, p5 p5Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            a4Var.r(q5.b(p5Var, entry.getKey(), entry.getValue()));
            q5.d(a4Var, p5Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f7007a.s(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            a4 a4Var = this.f7007a;
            a4Var.p(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += a4.w(((Long) list.get(i12)).longValue());
            }
            a4Var.r(iW);
            while (i11 < list.size()) {
                a4Var.t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z10) {
            while (i11 < l5Var.size()) {
                this.f7007a.s(i10, l5Var.c(i11));
                i11++;
            }
            return;
        }
        a4 a4Var2 = this.f7007a;
        a4Var2.p(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < l5Var.size(); i13++) {
            iW2 += a4.w(l5Var.c(i13));
        }
        a4Var2.r(iW2);
        while (i11 < l5Var.size()) {
            a4Var2.t(l5Var.c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    @Deprecated
    public final void w(int i10) {
        this.f7007a.p(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void x(int i10, int i11) {
        this.f7007a.q(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    a4 a4Var = this.f7007a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    a4Var.s(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            a4 a4Var2 = this.f7007a;
            a4Var2.p(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iW += a4.w((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            a4Var2.r(iW);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                a4Var2.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        l5 l5Var = (l5) list;
        if (!z10) {
            while (i11 < l5Var.size()) {
                a4 a4Var3 = this.f7007a;
                long jC = l5Var.c(i11);
                a4Var3.s(i10, (jC >> 63) ^ (jC + jC));
                i11++;
            }
            return;
        }
        a4 a4Var4 = this.f7007a;
        a4Var4.p(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < l5Var.size(); i13++) {
            long jC2 = l5Var.c(i13);
            iW2 += a4.w((jC2 >> 63) ^ (jC2 + jC2));
        }
        a4Var4.r(iW2);
        while (i11 < l5Var.size()) {
            long jC3 = l5Var.c(i11);
            a4Var4.t((jC3 >> 63) ^ (jC3 + jC3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.i7
    public final void z(int i10, int i11) {
        this.f7007a.g(i10, i11);
    }
}
