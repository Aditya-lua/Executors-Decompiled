package nb;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.ig;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class x7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26102a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26103c;

    public x7(i8 i8Var, zzbg zzbgVar, String str) {
        this.f26102a = zzbgVar;
        this.b = str;
        Objects.requireNonNull(i8Var);
        this.f26103c = i8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        wa waVar;
        byte[] bArr;
        me meVar;
        te teVar;
        me meVar2;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        com.google.android.gms.internal.measurement.v6 v6Var;
        b0 b0VarA;
        long j10;
        byte[] bArr2;
        i8 i8Var = this.f26103c;
        i8Var.z2().E();
        wa waVarJ0 = i8Var.z2().J0();
        waVarJ0.h();
        g7 g7Var = waVarJ0.f25625a;
        g7.q();
        zzbg zzbgVar = this.f26102a;
        n9.m.l(zzbgVar);
        String str2 = this.b;
        n9.m.f(str2);
        String str3 = zzbgVar.f7422f;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            waVarJ0.f25625a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        me meVar3 = waVarJ0.b;
        com.google.android.gms.internal.measurement.v6 v6VarO = com.google.android.gms.internal.measurement.y6.O();
        meVar3.F0().r0();
        try {
            c6 c6VarJ0 = meVar3.F0().J0(str2);
            if (c6VarJ0 != null) {
                if (c6VarJ0.d()) {
                    com.google.android.gms.internal.measurement.z6 z6VarM0 = com.google.android.gms.internal.measurement.a7.m0();
                    z6VarM0.e0(1);
                    z6VarM0.A("android");
                    if (!TextUtils.isEmpty(c6VarJ0.o0())) {
                        z6VarM0.P(c6VarJ0.o0());
                    }
                    if (!TextUtils.isEmpty(c6VarJ0.H0())) {
                        z6VarM0.N((String) n9.m.l(c6VarJ0.H0()));
                    }
                    if (!TextUtils.isEmpty(c6VarJ0.D0())) {
                        z6VarM0.Q((String) n9.m.l(c6VarJ0.D0()));
                    }
                    if (c6VarJ0.F0() != -2147483648L) {
                        z6VarM0.F0((int) c6VarJ0.F0());
                    }
                    z6VarM0.R(c6VarJ0.J0());
                    z6VarM0.N0(c6VarJ0.b());
                    String strR0 = c6VarJ0.r0();
                    if (!TextUtils.isEmpty(strR0)) {
                        z6VarM0.z0(strR0);
                    }
                    z6VarM0.U0(c6VarJ0.X());
                    q8 q8VarG = waVarJ0.b.g(str2);
                    z6VarM0.c0(c6VarJ0.L0());
                    if (g7Var.g() && waVarJ0.f25625a.w().k(z6VarM0.O()) && q8VarG.o(p8.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        z6VarM0.I0(null);
                    }
                    z6VarM0.P0(q8VarG.k());
                    if (q8VarG.o(p8.AD_STORAGE) && c6VarJ0.P()) {
                        Pair pairM = meVar3.L0().m(c6VarJ0.o0(), q8VarG);
                        if (c6VarJ0.P() && !TextUtils.isEmpty((CharSequence) pairM.first)) {
                            try {
                                z6VarM0.U(wa.m((String) pairM.first, Long.toString(zzbgVar.f7425i)));
                                Object obj2 = pairM.second;
                                if (obj2 != null) {
                                    z6VarM0.X(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                waVarJ0.f25625a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                meVar = waVarJ0.b;
                                meVar.F0().t0();
                                return bArr;
                            }
                        }
                    }
                    g7 g7Var2 = waVarJ0.f25625a;
                    g7Var2.K().l();
                    z6VarM0.E(Build.MODEL);
                    g7Var2.K().l();
                    z6VarM0.D(Build.VERSION.RELEASE);
                    z6VarM0.K((int) g7Var2.K().o());
                    z6VarM0.J(g7Var2.K().p());
                    try {
                        if (q8VarG.o(p8.ANALYTICS_STORAGE) && c6VarJ0.p0() != null) {
                            z6VarM0.a0(wa.m((String) n9.m.l(c6VarJ0.p0()), Long.toString(zzbgVar.f7425i)));
                        }
                        if (!TextUtils.isEmpty(c6VarJ0.x0())) {
                            z6VarM0.D0((String) n9.m.l(c6VarJ0.x0()));
                        }
                        String strO0 = c6VarJ0.o0();
                        me meVar4 = waVarJ0.b;
                        List listC0 = meVar4.F0().C0(strO0);
                        Iterator it = listC0.iterator();
                        do {
                            if (!it.hasNext()) {
                                teVar = null;
                                break;
                            }
                            teVar = (te) it.next();
                        } while (!"_lte".equals(teVar.f25996c));
                        if (teVar == null || teVar.f25998e == null) {
                            te teVar2 = new te(strO0, "auto", "_lte", waVarJ0.f25625a.e().a(), 0L);
                            listC0.add(teVar2);
                            meVar4.F0().A0(teVar2);
                        }
                        com.google.android.gms.internal.measurement.r7[] r7VarArr = new com.google.android.gms.internal.measurement.r7[listC0.size()];
                        for (int i10 = 0; i10 < listC0.size(); i10++) {
                            com.google.android.gms.internal.measurement.q7 q7VarS = com.google.android.gms.internal.measurement.r7.S();
                            q7VarS.z(((te) listC0.get(i10)).f25996c);
                            q7VarS.x(((te) listC0.get(i10)).f25997d);
                            meVar4.K0().G(q7VarS, ((te) listC0.get(i10)).f25998e);
                            r7VarArr[i10] = (com.google.android.gms.internal.measurement.r7) q7VarS.t();
                        }
                        z6VarM0.l1(Arrays.asList(r7VarArr));
                        me meVar5 = waVarJ0.b;
                        meVar5.n(c6VarJ0, z6VarM0);
                        meVar5.o(c6VarJ0, z6VarM0);
                        x5 x5VarA = x5.a(zzbgVar);
                        g7 g7Var3 = waVarJ0.f25625a;
                        ve veVarC = g7Var3.C();
                        Bundle bundle2 = x5VarA.f26090d;
                        veVarC.w(bundle2, meVar4.F0().G(str2));
                        g7Var3.C().u(x5VarA, g7Var3.w().w(str2));
                        bundle2.putLong("_c", 1L);
                        g7Var3.a().v().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = zzbgVar.f7424h;
                        bundle2.putString("_o", str4);
                        if (g7Var3.C().P(z6VarM0.O(), c6VarJ0.l0())) {
                            g7Var3.C().A(bundle2, "_dbg", 1L);
                            g7Var3.C().A(bundle2, "_r", 1L);
                        }
                        t tVarF0 = meVar4.F0();
                        String str5 = zzbgVar.f7422f;
                        b0 b0VarV0 = tVarF0.v0(str2, str5);
                        if (b0VarV0 == null) {
                            meVar2 = meVar5;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            b0VarA = new b0(str2, str5, 0L, 0L, 0L, zzbgVar.f7425i, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                            v6Var = v6VarO;
                        } else {
                            meVar2 = meVar5;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            v6Var = v6VarO;
                            long j11 = b0VarV0.f25350f;
                            b0VarA = b0VarV0.a(zzbgVar.f7425i);
                            j10 = j11;
                        }
                        b0 b0Var = b0VarA;
                        meVar4.F0().w0(b0Var);
                        g7 g7Var4 = waVarJ0.f25625a;
                        boolean z11 = z10;
                        me meVar6 = meVar2;
                        try {
                            a0 a0Var = new a0(g7Var4, str, str2, str5, zzbgVar.f7425i, j10, bundle);
                            com.google.android.gms.internal.measurement.n6 n6VarR = com.google.android.gms.internal.measurement.o6.R();
                            n6VarR.S(a0Var.f25316d);
                            n6VarR.P(a0Var.b);
                            n6VarR.U(a0Var.f25317e);
                            zzbe zzbeVar = a0Var.f25318f;
                            c0 c0Var = new c0(zzbeVar);
                            while (c0Var.hasNext()) {
                                String next = c0Var.next();
                                com.google.android.gms.internal.measurement.r6 r6VarT = com.google.android.gms.internal.measurement.s6.T();
                                r6VarT.z(next);
                                Object objA = zzbeVar.a(next);
                                if (objA != null) {
                                    meVar4.K0().H(r6VarT, objA);
                                    n6VarR.G(r6VarT);
                                }
                            }
                            z6VarM0.b1(n6VarR);
                            com.google.android.gms.internal.measurement.b7 b7VarF = com.google.android.gms.internal.measurement.d7.F();
                            com.google.android.gms.internal.measurement.p6 p6VarF = com.google.android.gms.internal.measurement.q6.F();
                            p6VarF.z(b0Var.f25347c);
                            p6VarF.x(str5);
                            b7VarF.x(p6VarF);
                            z6VarM0.L0(b7VarF);
                            z6VarM0.B0(meVar4.I0().m(c6VarJ0.o0(), Collections.EMPTY_LIST, z6VarM0.f1(), Long.valueOf(n6VarR.R()), Long.valueOf(n6VarR.R()), false));
                            if (n6VarR.Q()) {
                                z6VarM0.q1(n6VarR.R());
                                z6VarM0.s1(n6VarR.R());
                            }
                            long jB0 = c6VarJ0.B0();
                            if (jB0 != 0) {
                                z6VarM0.x(jB0);
                            }
                            long jZ0 = c6VarJ0.z0();
                            if (jZ0 != 0) {
                                z6VarM0.t1(jZ0);
                            } else if (jB0 != 0) {
                                z6VarM0.t1(jB0);
                            }
                            String strT0 = c6VarJ0.t0();
                            ig.a();
                            if (g7Var3.w().H(str2, z4.N0) && strT0 != null) {
                                z6VarM0.Q0(strT0);
                            }
                            c6VarJ0.l();
                            z6VarM0.d0((int) c6VarJ0.g());
                            g7Var3.w().A();
                            z6VarM0.S(133005L);
                            z6VarM0.n1(g7Var3.e().a());
                            z6VarM0.A0(z11);
                            meVar6.x(z6VarM0.O(), z6VarM0);
                            v6Var.D(z6VarM0);
                            c6VarJ0.A0(z6VarM0.p1());
                            c6VarJ0.C0(z6VarM0.r1());
                            meVar4.F0().K0(c6VarJ0, false, false);
                            meVar4.F0().s0();
                            meVar4.F0().t0();
                            try {
                                return meVar4.K0().V(((com.google.android.gms.internal.measurement.y6) v6Var.t()).d());
                            } catch (IOException e11) {
                                waVarJ0.f25625a.a().o().c("Data loss. Failed to bundle and serialize. appId", w5.x(str2), e11);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            waVar = waVarJ0;
                        }
                    } catch (SecurityException e12) {
                        waVar = waVarJ0;
                        try {
                            waVar.f25625a.a().v().b("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            meVar = waVar.b;
                            meVar.F0().t0();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    waVarJ0.f25625a.a().v().b("Log and bundle disabled. package_name", str2);
                    bArr2 = new byte[0];
                }
                waVar.b.F0().t0();
                throw th;
            }
            waVarJ0.f25625a.a().v().b("Log and bundle not available. package_name", str2);
            bArr2 = new byte[0];
            meVar3.F0().t0();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            waVar = waVarJ0;
        }
    }
}
