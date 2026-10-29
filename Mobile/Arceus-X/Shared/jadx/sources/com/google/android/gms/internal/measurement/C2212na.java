package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.na */
/* JADX INFO: loaded from: classes.dex */
public final class C2212na implements InterfaceC2413yd {

    /* JADX INFO: renamed from: a */
    public final AbstractC2194ma f8515a;

    public C2212na(AbstractC2194ma abstractC2194ma) {
        Charset charset = C2267qb.f8595a;
        this.f8515a = abstractC2194ma;
        abstractC2194ma.f8420a = this;
    }

    /* JADX INFO: renamed from: M */
    public static C2212na m10432M(AbstractC2194ma abstractC2194ma) {
        C2212na c2212na = abstractC2194ma.f8420a;
        return c2212na != null ? c2212na : new C2212na(abstractC2194ma);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: A */
    public final void mo10433A(int i10, long j10) {
        this.f8515a.mo10333m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: B */
    public final void mo10434B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2105hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10331k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int iM10380G = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM10380G += AbstractC2194ma.m10380G(((Integer) list.get(i12)).intValue());
            }
            abstractC2194ma.mo10346z(iM10380G);
            while (i11 < list.size()) {
                abstractC2194ma.mo10346z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2105hb c2105hb = (C2105hb) list;
        if (!z10) {
            while (i11 < c2105hb.size()) {
                this.f8515a.mo10331k(i10, c2105hb.m10191c(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int iM10380G2 = 0;
        for (int i13 = 0; i13 < c2105hb.size(); i13++) {
            iM10380G2 += AbstractC2194ma.m10380G(c2105hb.m10191c(i13));
        }
        abstractC2194ma2.mo10346z(iM10380G2);
        while (i11 < c2105hb.size()) {
            abstractC2194ma2.mo10346z(c2105hb.m10191c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: C */
    public final void mo10435C(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2230oa)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10334n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10324C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        C2230oa c2230oa = (C2230oa) list;
        if (!z10) {
            while (i11 < c2230oa.size()) {
                this.f8515a.mo10334n(i10, Double.doubleToRawLongBits(c2230oa.m10509c(i11)));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2230oa.size(); i15++) {
            c2230oa.m10509c(i15);
            i14 += 8;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2230oa.size()) {
            abstractC2194ma2.mo10324C(Double.doubleToRawLongBits(c2230oa.m10509c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: D */
    public final void mo10436D(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f8515a.mo10337q(i10, (AbstractC2104ha) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: E */
    public final void mo10437E(int i10, int i11) {
        this.f8515a.mo10331k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: F */
    public final void mo10438F(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2411yb)) {
            while (i11 < list.size()) {
                this.f8515a.mo10336p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC2411yb interfaceC2411yb = (InterfaceC2411yb) list;
        while (i11 < list.size()) {
            Object objZzc = interfaceC2411yb.zzc();
            if (objZzc instanceof String) {
                this.f8515a.mo10336p(i10, (String) objZzc);
            } else {
                this.f8515a.mo10337q(i10, (AbstractC2104ha) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: G */
    public final void mo10439G(int i10, int i11) {
        this.f8515a.mo10331k(i10, (i11 >> 31) ^ (i11 + i11));
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: H */
    public final void mo10440H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2391x9)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10335o(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10344x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        C2391x9 c2391x9 = (C2391x9) list;
        if (!z10) {
            while (i11 < c2391x9.size()) {
                this.f8515a.mo10335o(i10, c2391x9.m10976c(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2391x9.size(); i15++) {
            c2391x9.m10976c(i15);
            i14++;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2391x9.size()) {
            abstractC2194ma2.mo10344x(c2391x9.m10976c(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: I */
    public final void mo10441I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2105hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10332l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10322A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2105hb c2105hb = (C2105hb) list;
        if (!z10) {
            while (i11 < c2105hb.size()) {
                this.f8515a.mo10332l(i10, c2105hb.m10191c(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2105hb.size(); i15++) {
            c2105hb.m10191c(i15);
            i14 += 4;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2105hb.size()) {
            abstractC2194ma2.mo10322A(c2105hb.m10191c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: J */
    public final void mo10442J(int i10, Object obj) {
        if (obj instanceof AbstractC2104ha) {
            this.f8515a.mo10342v(i10, (AbstractC2104ha) obj);
        } else {
            this.f8515a.mo10341u(i10, (InterfaceC2232oc) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: K */
    public final void mo10443K(int i10, boolean z10) {
        this.f8515a.mo10335o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: L */
    public final void mo10444L(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2105hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10330j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int iM10381a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM10381a += AbstractC2194ma.m10381a(((Integer) list.get(i12)).intValue());
            }
            abstractC2194ma.mo10346z(iM10381a);
            while (i11 < list.size()) {
                abstractC2194ma.mo10345y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2105hb c2105hb = (C2105hb) list;
        if (!z10) {
            while (i11 < c2105hb.size()) {
                this.f8515a.mo10330j(i10, c2105hb.m10191c(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int iM10381a2 = 0;
        for (int i13 = 0; i13 < c2105hb.size(); i13++) {
            iM10381a2 += AbstractC2194ma.m10381a(c2105hb.m10191c(i13));
        }
        abstractC2194ma2.mo10346z(iM10381a2);
        while (i11 < c2105hb.size()) {
            abstractC2194ma2.mo10345y(c2105hb.m10191c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: a */
    public final void mo10445a(int i10, double d10) {
        this.f8515a.mo10334n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: b */
    public final void mo10446b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2105hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC2194ma abstractC2194ma = this.f8515a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC2194ma.mo10331k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma2 = this.f8515a;
            abstractC2194ma2.mo10329i(i10, 2);
            int iM10380G = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iM10380G += AbstractC2194ma.m10380G((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            abstractC2194ma2.mo10346z(iM10380G);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC2194ma2.mo10346z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C2105hb c2105hb = (C2105hb) list;
        if (!z10) {
            while (i11 < c2105hb.size()) {
                AbstractC2194ma abstractC2194ma3 = this.f8515a;
                int iM10191c = c2105hb.m10191c(i11);
                abstractC2194ma3.mo10331k(i10, (iM10191c >> 31) ^ (iM10191c + iM10191c));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma4 = this.f8515a;
        abstractC2194ma4.mo10329i(i10, 2);
        int iM10380G2 = 0;
        for (int i13 = 0; i13 < c2105hb.size(); i13++) {
            int iM10191c2 = c2105hb.m10191c(i13);
            iM10380G2 += AbstractC2194ma.m10380G((iM10191c2 >> 31) ^ (iM10191c2 + iM10191c2));
        }
        abstractC2194ma4.mo10346z(iM10380G2);
        while (i11 < c2105hb.size()) {
            int iM10191c3 = c2105hb.m10191c(i11);
            abstractC2194ma4.mo10346z((iM10191c3 >> 31) ^ (iM10191c3 + iM10191c3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: c */
    public final void mo10447c(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2011cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10333m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int iM10381a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM10381a += AbstractC2194ma.m10381a(((Long) list.get(i12)).longValue());
            }
            abstractC2194ma.mo10346z(iM10381a);
            while (i11 < list.size()) {
                abstractC2194ma.mo10323B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2011cc c2011cc = (C2011cc) list;
        if (!z10) {
            while (i11 < c2011cc.size()) {
                this.f8515a.mo10333m(i10, c2011cc.mo9893x0(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int iM10381a2 = 0;
        for (int i13 = 0; i13 < c2011cc.size(); i13++) {
            iM10381a2 += AbstractC2194ma.m10381a(c2011cc.mo9893x0(i13));
        }
        abstractC2194ma2.mo10346z(iM10381a2);
        while (i11 < c2011cc.size()) {
            abstractC2194ma2.mo10323B(c2011cc.mo9893x0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: d */
    public final void mo10448d(int i10, int i11) {
        this.f8515a.mo10332l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: e */
    public final void mo10449e(int i10, int i11) {
        this.f8515a.mo10330j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: f */
    public final void mo10450f(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2410ya)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10332l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10322A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        C2410ya c2410ya = (C2410ya) list;
        if (!z10) {
            while (i11 < c2410ya.size()) {
                this.f8515a.mo10332l(i10, Float.floatToRawIntBits(c2410ya.m11022c(i11)));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2410ya.size(); i15++) {
            c2410ya.m11022c(i15);
            i14 += 4;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2410ya.size()) {
            abstractC2194ma2.mo10322A(Float.floatToRawIntBits(c2410ya.m11022c(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: g */
    public final void mo10451g(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2105hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10330j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int iM10381a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM10381a += AbstractC2194ma.m10381a(((Integer) list.get(i12)).intValue());
            }
            abstractC2194ma.mo10346z(iM10381a);
            while (i11 < list.size()) {
                abstractC2194ma.mo10345y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2105hb c2105hb = (C2105hb) list;
        if (!z10) {
            while (i11 < c2105hb.size()) {
                this.f8515a.mo10330j(i10, c2105hb.m10191c(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int iM10381a2 = 0;
        for (int i13 = 0; i13 < c2105hb.size(); i13++) {
            iM10381a2 += AbstractC2194ma.m10381a(c2105hb.m10191c(i13));
        }
        abstractC2194ma2.mo10346z(iM10381a2);
        while (i11 < c2105hb.size()) {
            abstractC2194ma2.mo10345y(c2105hb.m10191c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: h */
    public final void mo10452h(int i10, int i11) {
        this.f8515a.mo10332l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: i */
    public final void mo10453i(int i10, C2087gc c2087gc, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            abstractC2194ma.mo10346z(C2106hc.m10198c(c2087gc, entry.getKey(), entry.getValue()));
            C2106hc.m10197b(abstractC2194ma, c2087gc, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: j */
    public final void mo10454j(int i10, Object obj, InterfaceC2430zc interfaceC2430zc) {
        this.f8515a.mo10340t(i10, (InterfaceC2232oc) obj, interfaceC2430zc);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: k */
    public final void mo10455k(int i10, long j10) {
        this.f8515a.mo10333m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: l */
    public final void mo10456l(int i10, long j10) {
        this.f8515a.mo10333m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: m */
    public final void mo10457m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2011cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10334n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10324C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2011cc c2011cc = (C2011cc) list;
        if (!z10) {
            while (i11 < c2011cc.size()) {
                this.f8515a.mo10334n(i10, c2011cc.mo9893x0(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2011cc.size(); i15++) {
            c2011cc.mo9893x0(i15);
            i14 += 8;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2011cc.size()) {
            abstractC2194ma2.mo10324C(c2011cc.mo9893x0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    @Deprecated
    /* JADX INFO: renamed from: n */
    public final void mo10458n(int i10) {
        this.f8515a.mo10329i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    @Deprecated
    /* JADX INFO: renamed from: o */
    public final void mo10459o(int i10) {
        this.f8515a.mo10329i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: p */
    public final void mo10460p(int i10, String str) {
        this.f8515a.mo10336p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: q */
    public final void mo10461q(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2011cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC2194ma abstractC2194ma = this.f8515a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    abstractC2194ma.mo10333m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma2 = this.f8515a;
            abstractC2194ma2.mo10329i(i10, 2);
            int iM10381a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iM10381a += AbstractC2194ma.m10381a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            abstractC2194ma2.mo10346z(iM10381a);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                abstractC2194ma2.mo10323B((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C2011cc c2011cc = (C2011cc) list;
        if (!z10) {
            while (i11 < c2011cc.size()) {
                AbstractC2194ma abstractC2194ma3 = this.f8515a;
                long jMo9893x0 = c2011cc.mo9893x0(i11);
                abstractC2194ma3.mo10333m(i10, (jMo9893x0 >> 63) ^ (jMo9893x0 + jMo9893x0));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma4 = this.f8515a;
        abstractC2194ma4.mo10329i(i10, 2);
        int iM10381a2 = 0;
        for (int i13 = 0; i13 < c2011cc.size(); i13++) {
            long jMo9893x1 = c2011cc.mo9893x0(i13);
            iM10381a2 += AbstractC2194ma.m10381a((jMo9893x1 >> 63) ^ (jMo9893x1 + jMo9893x1));
        }
        abstractC2194ma4.mo10346z(iM10381a2);
        while (i11 < c2011cc.size()) {
            long jMo9893x2 = c2011cc.mo9893x0(i11);
            abstractC2194ma4.mo10323B((jMo9893x2 >> 63) ^ (jMo9893x2 + jMo9893x2));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: r */
    public final void mo10462r(int i10, int i11) {
        this.f8515a.mo10330j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: s */
    public final void mo10463s(int i10, Object obj, InterfaceC2430zc interfaceC2430zc) {
        AbstractC2194ma abstractC2194ma = this.f8515a;
        abstractC2194ma.mo10329i(i10, 3);
        interfaceC2430zc.mo10660e((InterfaceC2232oc) obj, abstractC2194ma.f8420a);
        abstractC2194ma.mo10329i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: t */
    public final void mo10464t(int i10, long j10) {
        this.f8515a.mo10334n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: u */
    public final void mo10465u(int i10, float f10) {
        this.f8515a.mo10332l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: v */
    public final void mo10466v(int i10, AbstractC2104ha abstractC2104ha) {
        this.f8515a.mo10337q(i10, abstractC2104ha);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: w */
    public final void mo10467w(int i10, long j10) {
        this.f8515a.mo10334n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: x */
    public final void mo10468x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2011cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10333m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int iM10381a = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iM10381a += AbstractC2194ma.m10381a(((Long) list.get(i12)).longValue());
            }
            abstractC2194ma.mo10346z(iM10381a);
            while (i11 < list.size()) {
                abstractC2194ma.mo10323B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2011cc c2011cc = (C2011cc) list;
        if (!z10) {
            while (i11 < c2011cc.size()) {
                this.f8515a.mo10333m(i10, c2011cc.mo9893x0(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int iM10381a2 = 0;
        for (int i13 = 0; i13 < c2011cc.size(); i13++) {
            iM10381a2 += AbstractC2194ma.m10381a(c2011cc.mo9893x0(i13));
        }
        abstractC2194ma2.mo10346z(iM10381a2);
        while (i11 < c2011cc.size()) {
            abstractC2194ma2.mo10323B(c2011cc.mo9893x0(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: y */
    public final void mo10469y(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2105hb)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10332l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10322A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C2105hb c2105hb = (C2105hb) list;
        if (!z10) {
            while (i11 < c2105hb.size()) {
                this.f8515a.mo10332l(i10, c2105hb.m10191c(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2105hb.size(); i15++) {
            c2105hb.m10191c(i15);
            i14 += 4;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2105hb.size()) {
            abstractC2194ma2.mo10322A(c2105hb.m10191c(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2413yd
    /* JADX INFO: renamed from: z */
    public final void mo10470z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof C2011cc)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f8515a.mo10334n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            AbstractC2194ma abstractC2194ma = this.f8515a;
            abstractC2194ma.mo10329i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            abstractC2194ma.mo10346z(i12);
            while (i11 < list.size()) {
                abstractC2194ma.mo10324C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C2011cc c2011cc = (C2011cc) list;
        if (!z10) {
            while (i11 < c2011cc.size()) {
                this.f8515a.mo10334n(i10, c2011cc.mo9893x0(i11));
                i11++;
            }
            return;
        }
        AbstractC2194ma abstractC2194ma2 = this.f8515a;
        abstractC2194ma2.mo10329i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c2011cc.size(); i15++) {
            c2011cc.mo9893x0(i15);
            i14 += 8;
        }
        abstractC2194ma2.mo10346z(i14);
        while (i11 < c2011cc.size()) {
            abstractC2194ma2.mo10324C(c2011cc.mo9893x0(i11));
            i11++;
        }
    }
}
