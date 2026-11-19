package ob;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.mg;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class c8 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f27159a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f27160c;

    public c8(n8 n8Var, i0 i0Var, String str) {
        this.f27159a = i0Var;
        this.b = str;
        Objects.requireNonNull(n8Var);
        this.f27160c = n8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Throwable {
        bb bbVar;
        byte[] bArr;
        ve veVar;
        df dfVar;
        ve veVar2;
        Bundle bundle;
        String str;
        boolean z10;
        Object obj;
        com.google.android.gms.internal.measurement.z6 z6Var;
        e0 e0VarA;
        long j10;
        byte[] bArr2;
        n8 n8Var = this.f27160c;
        n8Var.z2().E();
        bb bbVarJ0 = n8Var.z2().J0();
        bbVarJ0.h();
        l7 l7Var = bbVarJ0.f27641a;
        l7.q();
        i0 i0Var = this.f27159a;
        o9.s.l(i0Var);
        String str2 = this.b;
        o9.s.f(str2);
        String str3 = i0Var.f27456f;
        if (!"_iap".equals(str3) && !"_iapx".equals(str3)) {
            bbVarJ0.f27641a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        ve veVar3 = bbVarJ0.b;
        com.google.android.gms.internal.measurement.z6 z6VarM = com.google.android.gms.internal.measurement.c7.M();
        veVar3.F0().r0();
        try {
            h6 h6VarJ0 = veVar3.F0().J0(str2);
            if (h6VarJ0 != null) {
                if (h6VarJ0.d()) {
                    com.google.android.gms.internal.measurement.d7 d7VarM0 = com.google.android.gms.internal.measurement.e7.m0();
                    d7VarM0.i0(1);
                    d7VarM0.C("android");
                    if (!TextUtils.isEmpty(h6VarJ0.o0())) {
                        d7VarM0.R(h6VarJ0.o0());
                    }
                    if (!TextUtils.isEmpty(h6VarJ0.H0())) {
                        d7VarM0.O((String) o9.s.l(h6VarJ0.H0()));
                    }
                    if (!TextUtils.isEmpty(h6VarJ0.D0())) {
                        d7VarM0.S((String) o9.s.l(h6VarJ0.D0()));
                    }
                    if (h6VarJ0.F0() != -2147483648L) {
                        d7VarM0.J0((int) h6VarJ0.F0());
                    }
                    d7VarM0.U(h6VarJ0.J0());
                    d7VarM0.R0(h6VarJ0.b());
                    String strR0 = h6VarJ0.r0();
                    if (!TextUtils.isEmpty(strR0)) {
                        d7VarM0.D0(strR0);
                    }
                    d7VarM0.Y0(h6VarJ0.X());
                    v8 v8VarG = bbVarJ0.b.g(str2);
                    d7VarM0.g0(h6VarJ0.L0());
                    if (l7Var.g() && bbVarJ0.f27641a.w().k(d7VarM0.P()) && v8VarG.o(u8.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        d7VarM0.M0(null);
                    }
                    d7VarM0.T0(v8VarG.k());
                    if (v8VarG.o(u8.AD_STORAGE) && h6VarJ0.P()) {
                        Pair pairM = veVar3.L0().m(h6VarJ0.o0(), v8VarG);
                        if (h6VarJ0.P() && !TextUtils.isEmpty((CharSequence) pairM.first)) {
                            try {
                                d7VarM0.X(bb.m((String) pairM.first, Long.toString(i0Var.f27459i)));
                                Object obj2 = pairM.second;
                                if (obj2 != null) {
                                    d7VarM0.a0(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                bbVarJ0.f27641a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                veVar = bbVarJ0.b;
                                veVar.F0().t0();
                                return bArr;
                            }
                        }
                    }
                    l7 l7Var2 = bbVarJ0.f27641a;
                    l7Var2.K().l();
                    d7VarM0.G(Build.MODEL);
                    l7Var2.K().l();
                    d7VarM0.F(Build.VERSION.RELEASE);
                    d7VarM0.M((int) l7Var2.K().o());
                    d7VarM0.J(l7Var2.K().p());
                    try {
                        if (v8VarG.o(u8.ANALYTICS_STORAGE) && h6VarJ0.p0() != null) {
                            d7VarM0.e0(bb.m((String) o9.s.l(h6VarJ0.p0()), Long.toString(i0Var.f27459i)));
                        }
                        if (!TextUtils.isEmpty(h6VarJ0.x0())) {
                            d7VarM0.H0((String) o9.s.l(h6VarJ0.x0()));
                        }
                        String strO0 = h6VarJ0.o0();
                        ve veVar4 = bbVarJ0.b;
                        List listC0 = veVar4.F0().C0(strO0);
                        Iterator it = listC0.iterator();
                        do {
                            if (!it.hasNext()) {
                                dfVar = null;
                                break;
                            }
                            dfVar = (df) it.next();
                        } while (!"_lte".equals(dfVar.f27202c));
                        if (dfVar == null || dfVar.f27204e == null) {
                            df dfVar2 = new df(strO0, "auto", "_lte", bbVarJ0.f27641a.e().a(), 0L);
                            listC0.add(dfVar2);
                            veVar4.F0().A0(dfVar2);
                        }
                        com.google.android.gms.internal.measurement.v7[] v7VarArr = new com.google.android.gms.internal.measurement.v7[listC0.size()];
                        for (int i10 = 0; i10 < listC0.size(); i10++) {
                            com.google.android.gms.internal.measurement.u7 u7VarR = com.google.android.gms.internal.measurement.v7.R();
                            u7VarR.B(((df) listC0.get(i10)).f27202c);
                            u7VarR.z(((df) listC0.get(i10)).f27203d);
                            veVar4.K0().G(u7VarR, ((df) listC0.get(i10)).f27204e);
                            v7VarArr[i10] = (com.google.android.gms.internal.measurement.v7) u7VarR.v();
                        }
                        d7VarM0.p1(Arrays.asList(v7VarArr));
                        ve veVar5 = bbVarJ0.b;
                        veVar5.n(h6VarJ0, d7VarM0);
                        veVar5.o(h6VarJ0, d7VarM0);
                        c6 c6VarA = c6.a(i0Var);
                        l7 l7Var3 = bbVarJ0.f27641a;
                        ff ffVarC = l7Var3.C();
                        Bundle bundle2 = c6VarA.f27147d;
                        ffVarC.w(bundle2, veVar4.F0().G(str2));
                        l7Var3.C().u(c6VarA, l7Var3.w().w(str2));
                        bundle2.putLong("_c", 1L);
                        l7Var3.a().v().a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        String str4 = i0Var.f27458h;
                        bundle2.putString("_o", str4);
                        if (l7Var3.C().P(d7VarM0.P(), h6VarJ0.l0())) {
                            l7Var3.C().A(bundle2, "_dbg", 1L);
                            l7Var3.C().A(bundle2, "_r", 1L);
                        }
                        w wVarF0 = veVar4.F0();
                        String str5 = i0Var.f27456f;
                        e0 e0VarV0 = wVarF0.v0(str2, str5);
                        if (e0VarV0 == null) {
                            veVar2 = veVar5;
                            obj = null;
                            bundle = bundle2;
                            str = str4;
                            e0VarA = new e0(str2, str5, 0L, 0L, 0L, i0Var.f27459i, 0L, null, null, null, null);
                            z10 = true;
                            j10 = 0;
                            z6Var = z6VarM;
                        } else {
                            veVar2 = veVar5;
                            bundle = bundle2;
                            str = str4;
                            z10 = true;
                            obj = null;
                            z6Var = z6VarM;
                            long j11 = e0VarV0.f27214f;
                            e0VarA = e0VarV0.a(i0Var.f27459i);
                            j10 = j11;
                        }
                        e0 e0Var = e0VarA;
                        veVar4.F0().w0(e0Var);
                        l7 l7Var4 = bbVarJ0.f27641a;
                        boolean z11 = z10;
                        ve veVar6 = veVar2;
                        try {
                            d0 d0Var = new d0(l7Var4, str, str2, str5, i0Var.f27459i, j10, bundle);
                            com.google.android.gms.internal.measurement.r6 r6VarP = com.google.android.gms.internal.measurement.s6.P();
                            r6VarP.V(d0Var.f27175d);
                            r6VarP.R(d0Var.b);
                            r6VarP.X(d0Var.f27176e);
                            g0 g0Var = d0Var.f27177f;
                            f0 f0Var = new f0(g0Var);
                            while (f0Var.hasNext()) {
                                String next = f0Var.next();
                                com.google.android.gms.internal.measurement.v6 v6VarS = com.google.android.gms.internal.measurement.w6.S();
                                v6VarS.B(next);
                                Object objA = g0Var.a(next);
                                if (objA != null) {
                                    veVar4.K0().H(v6VarS, objA);
                                    r6VarP.H(v6VarS);
                                }
                            }
                            d7VarM0.f1(r6VarP);
                            com.google.android.gms.internal.measurement.f7 f7VarF = com.google.android.gms.internal.measurement.h7.F();
                            com.google.android.gms.internal.measurement.t6 t6VarF = com.google.android.gms.internal.measurement.u6.F();
                            t6VarF.B(e0Var.f27211c);
                            t6VarF.z(str5);
                            f7VarF.z(t6VarF);
                            d7VarM0.P0(f7VarF);
                            d7VarM0.F0(veVar4.I0().m(h6VarJ0.o0(), Collections.EMPTY_LIST, d7VarM0.j1(), Long.valueOf(r6VarP.U()), Long.valueOf(r6VarP.U()), false));
                            if (r6VarP.S()) {
                                d7VarM0.u1(r6VarP.U());
                                d7VarM0.w1(r6VarP.U());
                            }
                            long jB0 = h6VarJ0.B0();
                            if (jB0 != 0) {
                                d7VarM0.z(jB0);
                            }
                            long jZ0 = h6VarJ0.z0();
                            if (jZ0 != 0) {
                                d7VarM0.x1(jZ0);
                            } else if (jB0 != 0) {
                                d7VarM0.x1(jB0);
                            }
                            String strT0 = h6VarJ0.t0();
                            mg.a();
                            if (l7Var3.w().H(str2, e5.N0) && strT0 != null) {
                                d7VarM0.U0(strT0);
                            }
                            h6VarJ0.l();
                            d7VarM0.h0((int) h6VarJ0.g());
                            l7Var3.w().A();
                            d7VarM0.V(133005L);
                            d7VarM0.r1(l7Var3.e().a());
                            d7VarM0.E0(z11);
                            veVar6.x(d7VarM0.P(), d7VarM0);
                            z6Var.F(d7VarM0);
                            h6VarJ0.A0(d7VarM0.t1());
                            h6VarJ0.C0(d7VarM0.v1());
                            veVar4.F0().K0(h6VarJ0, false, false);
                            veVar4.F0().s0();
                            veVar4.F0().t0();
                            try {
                                return veVar4.K0().V(((com.google.android.gms.internal.measurement.c7) z6Var.v()).d());
                            } catch (IOException e11) {
                                bbVarJ0.f27641a.a().o().c("Data loss. Failed to bundle and serialize. appId", b6.x(str2), e11);
                                return obj;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bbVar = bbVarJ0;
                        }
                    } catch (SecurityException e12) {
                        bbVar = bbVarJ0;
                        try {
                            bbVar.f27641a.a().v().b("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            veVar = bbVar.b;
                            veVar.F0().t0();
                            return bArr;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } else {
                    bbVarJ0.f27641a.a().v().b("Log and bundle disabled. package_name", str2);
                    bArr2 = new byte[0];
                }
                bbVar.b.F0().t0();
                throw th;
            }
            bbVarJ0.f27641a.a().v().b("Log and bundle not available. package_name", str2);
            bArr2 = new byte[0];
            veVar3.F0().t0();
            return bArr2;
        } catch (Throwable th4) {
            th = th4;
            bbVar = bbVarJ0;
        }
    }
}
