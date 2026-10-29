package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2454b4 implements InterfaceC2534i7 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2443a4 f8926a;

    public C2454b4(AbstractC2443a4 abstractC2443a4) {
        this.f8926a = abstractC2443a4;
        abstractC2443a4.f8900a = this;
    }

    /* JADX INFO: renamed from: M */
    public static C2454b4 m11276M(AbstractC2443a4 abstractC2443a4) {
        Object obj = abstractC2443a4.f8900a;
        return obj != null ? (C2454b4) obj : new C2454b4(abstractC2443a4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: A */
    public final void mo11277A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2663u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11180g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11181h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        if (!z10) {
            while (i11 < c2663u4.size()) {
                this.f8926a.mo11180g(i10, c2663u4.m11770c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2663u4.size(); i15++) {
            c2663u4.m11770c(i15);
            i14 += 4;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2663u4.size()) {
            abstractC2443a5.mo11181h(c2663u4.m11770c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: B */
    public final void mo11278B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2663u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11184k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int iM11174w = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM11174w += AbstractC2443a4.m11174w(((Integer) list.get(i12)).intValue());
            }
            abstractC2443a4.mo11191r(iM11174w);
            while (i11 < list.size()) {
                abstractC2443a4.mo11185l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        if (!z10) {
            while (i11 < c2663u4.size()) {
                this.f8926a.mo11184k(i10, c2663u4.m11770c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int iM11174w2 = 0;
        for (int i13 = 0; i13 < c2663u4.size(); i13++) {
            iM11174w2 += AbstractC2443a4.m11174w(c2663u4.m11770c(i13));
        }
        abstractC2443a5.mo11191r(iM11174w2);
        while (i11 < c2663u4.size()) {
            abstractC2443a5.mo11185l(c2663u4.m11770c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: C */
    public final void mo11279C(int i10, long j10) {
        this.f8926a.mo11192s(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: D */
    public final void mo11280D(int i10, Object obj) {
        if (obj instanceof AbstractC2640s3) {
            this.f8926a.mo11187n(i10, (AbstractC2640s3) obj);
        } else {
            this.f8926a.mo11186m(i10, (InterfaceC2697x5) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: E */
    public final void mo11281E(int i10, AbstractC2640s3 abstractC2640s3) {
        this.f8926a.mo11179f(i10, abstractC2640s3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: F */
    public final void mo11282F(int i10, float f10) {
        this.f8926a.mo11180g(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: G */
    public final void mo11283G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2565l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11192s(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int iM11174w = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM11174w += AbstractC2443a4.m11174w(((Long) list.get(i12)).longValue());
            }
            abstractC2443a4.mo11191r(iM11174w);
            while (i11 < list.size()) {
                abstractC2443a4.mo11193t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        if (!z10) {
            while (i11 < c2565l5.size()) {
                this.f8926a.mo11192s(i10, c2565l5.m11538c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int iM11174w2 = 0;
        for (int i13 = 0; i13 < c2565l5.size(); i13++) {
            iM11174w2 += AbstractC2443a4.m11174w(c2565l5.m11538c(i13));
        }
        abstractC2443a5.mo11191r(iM11174w2);
        while (i11 < c2565l5.size()) {
            abstractC2443a5.mo11193t(c2565l5.m11538c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: H */
    public final void mo11284H(int i10, Object obj, InterfaceC2522h6 interfaceC2522h6) {
        AbstractC2443a4 abstractC2443a4 = this.f8926a;
        AbstractC2464c3 abstractC2464c3 = (AbstractC2464c3) obj;
        abstractC2443a4.mo11189p(i10, 2);
        abstractC2443a4.mo11191r(abstractC2464c3.mo11332c(interfaceC2522h6));
        interfaceC2522h6.mo11217e(abstractC2464c3, this);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: I */
    public final void mo11285I(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2521h5)) {
            while (i11 < list.size()) {
                this.f8926a.mo11188o(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2521h5 interfaceC2521h5 = (InterfaceC2521h5) list;
        while (i11 < list.size()) {
            Object objZza = interfaceC2521h5.zza();
            if (objZza instanceof String) {
                this.f8926a.mo11188o(i10, (String) objZza);
            } else {
                this.f8926a.mo11179f(i10, (AbstractC2640s3) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: J */
    public final void mo11286J(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2465c4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11182i(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11183j(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        C2465c4 c2465c4 = (C2465c4) list;
        if (!z10) {
            while (i11 < c2465c4.size()) {
                this.f8926a.mo11182i(i10, Double.doubleToRawLongBits(c2465c4.m11335c(i11)));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2465c4.size(); i15++) {
            c2465c4.m11335c(i15);
            i14 += 8;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2465c4.size()) {
            abstractC2443a5.mo11183j(Double.doubleToRawLongBits(c2465c4.m11335c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: K */
    public final void mo11287K(int i10, int i11) {
        this.f8926a.mo11190q(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: L */
    public final void mo11288L(int i10, long j10) {
        this.f8926a.mo11182i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: a */
    public final void mo11289a(int i10, double d10) {
        this.f8926a.mo11182i(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: b */
    public final void mo11290b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2663u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11190q(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int iM11173v = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM11173v += AbstractC2443a4.m11173v(((Integer) list.get(i12)).intValue());
            }
            abstractC2443a4.mo11191r(iM11173v);
            while (i11 < list.size()) {
                abstractC2443a4.mo11191r(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        if (!z10) {
            while (i11 < c2663u4.size()) {
                this.f8926a.mo11190q(i10, c2663u4.m11770c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int iM11173v2 = 0;
        for (int i13 = 0; i13 < c2663u4.size(); i13++) {
            iM11173v2 += AbstractC2443a4.m11173v(c2663u4.m11770c(i13));
        }
        abstractC2443a5.mo11191r(iM11173v2);
        while (i11 < c2663u4.size()) {
            abstractC2443a5.mo11191r(c2663u4.m11770c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: c */
    public final void mo11291c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2663u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11180g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11181h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        if (!z10) {
            while (i11 < c2663u4.size()) {
                this.f8926a.mo11180g(i10, c2663u4.m11770c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2663u4.size(); i15++) {
            c2663u4.m11770c(i15);
            i14 += 4;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2663u4.size()) {
            abstractC2443a5.mo11181h(c2663u4.m11770c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: d */
    public final void mo11292d(int i10, int i11) {
        this.f8926a.mo11180g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: e */
    public final void mo11293e(int i10, int i11) {
        this.f8926a.mo11184k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: f */
    public final void mo11294f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2565l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11182i(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11183j(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        if (!z10) {
            while (i11 < c2565l5.size()) {
                this.f8926a.mo11182i(i10, c2565l5.m11538c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2565l5.size(); i15++) {
            c2565l5.m11538c(i15);
            i14 += 8;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2565l5.size()) {
            abstractC2443a5.mo11183j(c2565l5.m11538c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: g */
    public final void mo11295g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2663u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC2443a4 abstractC2443a4 = this.f8926a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC2443a4.mo11190q(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a5 = this.f8926a;
            abstractC2443a5.mo11189p(i10, 2);
            int iM11173v = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iM11173v += AbstractC2443a4.m11173v((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abstractC2443a5.mo11191r(iM11173v);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC2443a5.mo11191r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        if (!z10) {
            while (i11 < c2663u4.size()) {
                AbstractC2443a4 abstractC2443a6 = this.f8926a;
                int iM11770c = c2663u4.m11770c(i11);
                abstractC2443a6.mo11190q(i10, (iM11770c >> 31) ^ (iM11770c + iM11770c));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a7 = this.f8926a;
        abstractC2443a7.mo11189p(i10, 2);
        int iM11173v2 = 0;
        for (int i13 = 0; i13 < c2663u4.size(); i13++) {
            int iM11770c2 = c2663u4.m11770c(i13);
            iM11173v2 += AbstractC2443a4.m11173v((iM11770c2 >> 31) ^ (iM11770c2 + iM11770c2));
        }
        abstractC2443a7.mo11191r(iM11173v2);
        while (i11 < c2663u4.size()) {
            int iM11770c3 = c2663u4.m11770c(i11);
            abstractC2443a7.mo11191r((iM11770c3 >> 31) ^ (iM11770c3 + iM11770c3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: h */
    public final void mo11296h(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f8926a.mo11179f(i10, (AbstractC2640s3) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: i */
    public final void mo11297i(int i10, boolean z10) {
        this.f8926a.mo11178e(i10, z10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: j */
    public final void mo11298j(int i10, long j10) {
        this.f8926a.mo11182i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: k */
    public final void mo11299k(int i10, long j10) {
        this.f8926a.mo11192s(i10, j10);
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
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: l */
    public final void mo11300l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2519h3)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11178e(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11177d(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        C2519h3 c2519h3 = (C2519h3) list;
        if (!z10) {
            while (i11 < c2519h3.size()) {
                this.f8926a.mo11178e(i10, c2519h3.m11447d(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2519h3.size(); i15++) {
            c2519h3.m11447d(i15);
            i14++;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2519h3.size()) {
            abstractC2443a5.mo11177d(c2519h3.m11447d(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: m */
    public final void mo11301m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2663u4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11184k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int iM11174w = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM11174w += AbstractC2443a4.m11174w(((Integer) list.get(i12)).intValue());
            }
            abstractC2443a4.mo11191r(iM11174w);
            while (i11 < list.size()) {
                abstractC2443a4.mo11185l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        if (!z10) {
            while (i11 < c2663u4.size()) {
                this.f8926a.mo11184k(i10, c2663u4.m11770c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int iM11174w2 = 0;
        for (int i13 = 0; i13 < c2663u4.size(); i13++) {
            iM11174w2 += AbstractC2443a4.m11174w(c2663u4.m11770c(i13));
        }
        abstractC2443a5.mo11191r(iM11174w2);
        while (i11 < c2663u4.size()) {
            abstractC2443a5.mo11185l(c2663u4.m11770c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: n */
    public final void mo11302n(int i10, String str) {
        this.f8926a.mo11188o(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: o */
    public final void mo11303o(int i10, int i11) {
        this.f8926a.mo11184k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: p */
    public final void mo11304p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2565l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11182i(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11183j(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        if (!z10) {
            while (i11 < c2565l5.size()) {
                this.f8926a.mo11182i(i10, c2565l5.m11538c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2565l5.size(); i15++) {
            c2565l5.m11538c(i15);
            i14 += 8;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2565l5.size()) {
            abstractC2443a5.mo11183j(c2565l5.m11538c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    @Deprecated
    /* JADX INFO: renamed from: q */
    public final void mo11305q(int i10) {
        this.f8926a.mo11189p(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: r */
    public final void mo11306r(int i10, long j10) {
        this.f8926a.mo11192s(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: s */
    public final void mo11307s(int i10, Object obj, InterfaceC2522h6 interfaceC2522h6) {
        AbstractC2443a4 abstractC2443a4 = this.f8926a;
        abstractC2443a4.mo11189p(i10, 3);
        interfaceC2522h6.mo11217e((AbstractC2464c3) obj, this);
        abstractC2443a4.mo11189p(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: t */
    public final void mo11308t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2586n4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11180g(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2443a4.mo11191r(i12);
            while (i11 < list.size()) {
                abstractC2443a4.mo11181h(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        C2586n4 c2586n4 = (C2586n4) list;
        if (!z10) {
            while (i11 < c2586n4.size()) {
                this.f8926a.mo11180g(i10, Float.floatToRawIntBits(c2586n4.m11617c(i11)));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2586n4.size(); i15++) {
            c2586n4.m11617c(i15);
            i14 += 4;
        }
        abstractC2443a5.mo11191r(i14);
        while (i11 < c2586n4.size()) {
            abstractC2443a5.mo11181h(Float.floatToRawIntBits(c2586n4.m11617c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: u */
    public final void mo11309u(int i10, C2609p5 c2609p5, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            abstractC2443a4.mo11191r(C2620q5.m11684b(c2609p5, entry.getKey(), entry.getValue()));
            C2620q5.m11685d(abstractC2443a4, c2609p5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: v */
    public final void mo11310v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2565l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8926a.mo11192s(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a4 = this.f8926a;
            abstractC2443a4.mo11189p(i10, 2);
            int iM11174w = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM11174w += AbstractC2443a4.m11174w(((Long) list.get(i12)).longValue());
            }
            abstractC2443a4.mo11191r(iM11174w);
            while (i11 < list.size()) {
                abstractC2443a4.mo11193t(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        if (!z10) {
            while (i11 < c2565l5.size()) {
                this.f8926a.mo11192s(i10, c2565l5.m11538c(i11));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a5 = this.f8926a;
        abstractC2443a5.mo11189p(i10, 2);
        int iM11174w2 = 0;
        for (int i13 = 0; i13 < c2565l5.size(); i13++) {
            iM11174w2 += AbstractC2443a4.m11174w(c2565l5.m11538c(i13));
        }
        abstractC2443a5.mo11191r(iM11174w2);
        while (i11 < c2565l5.size()) {
            abstractC2443a5.mo11193t(c2565l5.m11538c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    @Deprecated
    /* JADX INFO: renamed from: w */
    public final void mo11311w(int i10) {
        this.f8926a.mo11189p(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: x */
    public final void mo11312x(int i10, int i11) {
        this.f8926a.mo11190q(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: y */
    public final void mo11313y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2565l5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC2443a4 abstractC2443a4 = this.f8926a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    abstractC2443a4.mo11192s(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            AbstractC2443a4 abstractC2443a5 = this.f8926a;
            abstractC2443a5.mo11189p(i10, 2);
            int iM11174w = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iM11174w += AbstractC2443a4.m11174w((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            abstractC2443a5.mo11191r(iM11174w);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                abstractC2443a5.mo11193t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        if (!z10) {
            while (i11 < c2565l5.size()) {
                AbstractC2443a4 abstractC2443a6 = this.f8926a;
                long jM11538c = c2565l5.m11538c(i11);
                abstractC2443a6.mo11192s(i10, (jM11538c >> 63) ^ (jM11538c + jM11538c));
                i11++;
            }
            return;
        }
        AbstractC2443a4 abstractC2443a7 = this.f8926a;
        abstractC2443a7.mo11189p(i10, 2);
        int iM11174w2 = 0;
        for (int i13 = 0; i13 < c2565l5.size(); i13++) {
            long jM11538c2 = c2565l5.m11538c(i13);
            iM11174w2 += AbstractC2443a4.m11174w((jM11538c2 >> 63) ^ (jM11538c2 + jM11538c2));
        }
        abstractC2443a7.mo11191r(iM11174w2);
        while (i11 < c2565l5.size()) {
            long jM11538c3 = c2565l5.m11538c(i11);
            abstractC2443a7.mo11193t((jM11538c3 >> 63) ^ (jM11538c3 + jM11538c3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2534i7
    /* JADX INFO: renamed from: z */
    public final void mo11314z(int i10, int i11) {
        this.f8926a.mo11180g(i10, i11);
    }
}
