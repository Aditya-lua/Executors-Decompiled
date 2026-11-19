package ob;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class n8 extends h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ve f27615a;
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27616c;

    public n8(ve veVar, String str) {
        o9.s.l(veVar);
        this.f27615a = veVar;
        this.f27616c = null;
    }

    public final void A2(i0 i0Var, hf hfVar) {
        ve veVar = this.f27615a;
        veVar.E();
        veVar.k(i0Var, hfVar);
    }

    public final void B2(hf hfVar, boolean z10) {
        o9.s.l(hfVar);
        String str = hfVar.f27424f;
        o9.s.f(str);
        C2(str, false);
        this.f27615a.N0().o(hfVar.f27425g);
    }

    public final void C2(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f27615a.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f27616c)) {
                        ve veVar = this.f27615a;
                        if (!v9.p.a(veVar.d(), Binder.getCallingUid()) && !k9.k.a(veVar.d()).c(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.b = Boolean.valueOf(z11);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f27615a.a().o().b("Measurement Service called with invalid calling package. appId", b6.x(str));
                throw e10;
            }
        }
        if (this.f27616c == null && k9.j.j(this.f27615a.d(), Binder.getCallingUid(), str)) {
            this.f27616c = str;
        }
        if (str.equals(this.f27616c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public final void D2(i0 i0Var, hf hfVar) {
        ve veVar = this.f27615a;
        c7 c7VarD0 = veVar.D0();
        String str = hfVar.f27424f;
        com.google.android.gms.internal.measurement.d1 d1Var = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.d1) c7VarD0.f27154j.d(str);
        if (d1Var == null) {
            this.f27615a.a().w().b("EES not loaded for", hfVar.f27424f);
            A2(i0Var, hfVar);
            return;
        }
        try {
            Map mapZ = veVar.K0().Z(i0Var.f27457g.D3(), true);
            String str2 = i0Var.f27456f;
            String strA = w8.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (d1Var.b(new com.google.android.gms.internal.measurement.b(str2, i0Var.f27459i, mapZ))) {
                if (d1Var.c()) {
                    ve veVar2 = this.f27615a;
                    veVar2.a().w().b("EES edited event", i0Var.f27456f);
                    A2(veVar2.K0().m(d1Var.e().c()), hfVar);
                } else {
                    A2(i0Var, hfVar);
                }
                if (d1Var.d()) {
                    for (com.google.android.gms.internal.measurement.b bVar : d1Var.e().f()) {
                        ve veVar3 = this.f27615a;
                        veVar3.a().w().b("EES logging created event", bVar.b());
                        A2(veVar3.K0().m(bVar), hfVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f27615a.a().o().c("EES error. appId, eventName", hfVar.f27425g, i0Var.f27456f);
        }
        this.f27615a.a().w().b("EES was not applied to event", i0Var.f27456f);
        A2(i0Var, hfVar);
    }

    public final i0 E2(i0 i0Var, hf hfVar) {
        g0 g0Var;
        if ("_cmp".equals(i0Var.f27456f) && (g0Var = i0Var.f27457g) != null && g0Var.zze() != 0) {
            String strC3 = g0Var.C3("_cis");
            if ("referrer broadcast".equals(strC3) || "referrer API".equals(strC3)) {
                this.f27615a.a().u().b("Event has been filtered ", i0Var.toString());
                return new i0("_cmpx", g0Var, i0Var.f27458h, i0Var.f27459i);
            }
        }
        return i0Var;
    }

    @Override // ob.i5
    public final void F1(i iVar, hf hfVar) {
        o9.s.l(iVar);
        o9.s.l(iVar.f27447h);
        B2(hfVar, false);
        i iVar2 = new i(iVar);
        iVar2.f27445f = hfVar.f27424f;
        F2(new q7(this, iVar2, hfVar));
    }

    public final void F2(Runnable runnable) {
        o9.s.l(runnable);
        ve veVar = this.f27615a;
        if (veVar.b().p()) {
            runnable.run();
        } else {
            veVar.b().t(runnable);
        }
    }

    @Override // ob.i5
    public final void G(bf bfVar, hf hfVar) {
        o9.s.l(bfVar);
        B2(hfVar, false);
        F2(new d8(this, bfVar, hfVar));
    }

    @Override // ob.i5
    public final void H(final hf hfVar, final Bundle bundle, final l5 l5Var) {
        B2(hfVar, false);
        final String str = (String) o9.s.l(hfVar.f27424f);
        this.f27615a.b().t(new Runnable() { // from class: ob.h8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27403a.v2(hfVar, bundle, l5Var, str);
            }
        });
    }

    @Override // ob.i5
    public final void H0(hf hfVar) {
        B2(hfVar, false);
        F2(new w7(this, hfVar));
    }

    @Override // ob.i5
    public final void I0(final hf hfVar) {
        o9.s.f(hfVar.f27424f);
        o9.s.l(hfVar.f27442x);
        s2(new Runnable() { // from class: ob.g8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27352a.u2(hfVar);
            }
        });
    }

    @Override // ob.i5
    public final List L(String str, String str2, String str3) {
        C2(str, true);
        try {
            return (List) this.f27615a.b().r(new v7(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f27615a.a().o().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.i5
    public final void L1(final Bundle bundle, final hf hfVar) {
        B2(hfVar, false);
        final String str = hfVar.f27424f;
        o9.s.l(str);
        F2(new Runnable() { // from class: ob.l8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27559a.y2(bundle, str, hfVar);
            }
        });
    }

    @Override // ob.i5
    public final void O(hf hfVar) {
        o9.s.f(hfVar.f27424f);
        o9.s.l(hfVar.f27442x);
        s2(new y7(this, hfVar));
    }

    @Override // ob.i5
    public final List R(hf hfVar, Bundle bundle) {
        B2(hfVar, false);
        o9.s.l(hfVar.f27424f);
        ve veVar = this.f27615a;
        if (!veVar.B0().H(null, e5.Z0)) {
            try {
                return (List) this.f27615a.b().r(new f8(this, hfVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f27615a.a().o().c("Failed to get trigger URIs. appId", b6.x(hfVar.f27424f), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) veVar.b().s(new e8(this, hfVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f27615a.a().o().c("Failed to get trigger URIs. appId", b6.x(hfVar.f27424f), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.i5
    public final byte[] V1(i0 i0Var, String str) {
        o9.s.f(str);
        o9.s.l(i0Var);
        C2(str, true);
        ve veVar = this.f27615a;
        z5 z5VarV = veVar.a().v();
        u5 u5VarM0 = veVar.M0();
        String str2 = i0Var.f27456f;
        z5VarV.b("Log and bundle. event", u5VarM0.a(str2));
        long jC = veVar.e().c() / 1000000;
        try {
            byte[] bArr = (byte[]) veVar.b().s(new c8(this, i0Var, str)).get();
            if (bArr == null) {
                veVar.a().o().b("Log and bundle returned null. appId", b6.x(str));
                bArr = new byte[0];
            }
            veVar.a().v().d("Log and bundle processed. event, size, time_ms", veVar.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((veVar.e().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            ve veVar2 = this.f27615a;
            veVar2.a().o().d("Failed to log and bundle. appId, event, error", b6.x(str), veVar2.M0().a(i0Var.f27456f), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            ve veVar3 = this.f27615a;
            veVar3.a().o().d("Failed to log and bundle. appId, event, error", b6.x(str), veVar3.M0().a(i0Var.f27456f), e);
            return null;
        }
    }

    @Override // ob.i5
    public final void X0(i0 i0Var, String str, String str2) {
        o9.s.l(i0Var);
        o9.s.f(str);
        C2(str, true);
        F2(new b8(this, i0Var, str));
    }

    @Override // ob.i5
    public final p Y(hf hfVar) {
        B2(hfVar, false);
        o9.s.f(hfVar.f27424f);
        try {
            return (p) this.f27615a.b().s(new z7(this, hfVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f27615a.a().o().c("Failed to get consent. appId", b6.x(hfVar.f27424f), e10);
            return new p(null);
        }
    }

    @Override // ob.i5
    public final String Y0(hf hfVar) {
        B2(hfVar, false);
        return this.f27615a.p0(hfVar);
    }

    @Override // ob.i5
    public final void a0(i iVar) {
        o9.s.l(iVar);
        o9.s.l(iVar.f27447h);
        o9.s.f(iVar.f27445f);
        C2(iVar.f27445f, true);
        F2(new r7(this, new i(iVar)));
    }

    @Override // ob.i5
    public final void d0(final hf hfVar, final g gVar) {
        B2(hfVar, false);
        F2(new Runnable() { // from class: ob.k8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27512a.x2(hfVar, gVar);
            }
        });
    }

    @Override // ob.i5
    public final void d1(long j10, String str, String str2, String str3) {
        F2(new p7(this, str2, str3, str, j10));
    }

    @Override // ob.i5
    public final void i0(hf hfVar) {
        B2(hfVar, false);
        F2(new n7(this, hfVar));
    }

    @Override // ob.i5
    public final List l1(String str, String str2, hf hfVar) {
        B2(hfVar, false);
        String str3 = hfVar.f27424f;
        o9.s.l(str3);
        try {
            return (List) this.f27615a.b().r(new u7(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f27615a.a().o().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.i5
    public final List o(String str, String str2, String str3, boolean z10) {
        C2(str, true);
        try {
            List<df> list = (List) this.f27615a.b().r(new t7(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (df dfVar : list) {
                if (z10 || !ff.N(dfVar.f27202c)) {
                    arrayList.add(new bf(dfVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f27615a.a().o().c("Failed to get user properties as. appId", b6.x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f27615a.a().o().c("Failed to get user properties as. appId", b6.x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ob.i5
    public final List p2(hf hfVar, boolean z10) {
        B2(hfVar, false);
        String str = hfVar.f27424f;
        o9.s.l(str);
        try {
            List<df> list = (List) this.f27615a.b().r(new m7(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (df dfVar : list) {
                if (z10 || !ff.N(dfVar.f27202c)) {
                    arrayList.add(new bf(dfVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f27615a.a().o().c("Failed to get user properties. appId", b6.x(hfVar.f27424f), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f27615a.a().o().c("Failed to get user properties. appId", b6.x(hfVar.f27424f), e);
            return null;
        }
    }

    @Override // ob.i5
    public final void q(hf hfVar) {
        B2(hfVar, false);
        F2(new o7(this, hfVar));
    }

    public final void s2(Runnable runnable) {
        o9.s.l(runnable);
        ve veVar = this.f27615a;
        if (veVar.b().p()) {
            runnable.run();
        } else {
            veVar.b().v(runnable);
        }
    }

    @Override // ob.i5
    public final void t0(final hf hfVar) {
        o9.s.f(hfVar.f27424f);
        o9.s.l(hfVar.f27442x);
        s2(new Runnable() { // from class: ob.m8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27584a.t2(hfVar);
            }
        });
    }

    public final /* synthetic */ void t2(hf hfVar) {
        ve veVar = this.f27615a;
        veVar.E();
        veVar.P0(hfVar);
    }

    public final /* synthetic */ void u2(hf hfVar) {
        ve veVar = this.f27615a;
        veVar.E();
        veVar.Q0(hfVar);
    }

    @Override // ob.i5
    public final void v(hf hfVar) {
        String str = hfVar.f27424f;
        o9.s.f(str);
        C2(str, false);
        F2(new x7(this, hfVar));
    }

    public final /* synthetic */ void v2(hf hfVar, Bundle bundle, l5 l5Var, String str) {
        ve veVar = this.f27615a;
        veVar.E();
        try {
            l5Var.D0(veVar.q0(hfVar, bundle));
        } catch (RemoteException e10) {
            this.f27615a.a().o().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    public final /* synthetic */ void w2(String str, ce ceVar, o5 o5Var) {
        ve veVar = this.f27615a;
        veVar.E();
        veVar.b().h();
        veVar.O0();
        List<ye> listO = veVar.F0().o(str, ceVar, ((Integer) e5.B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (ye yeVar : listO) {
            if (veVar.t(str, yeVar.e())) {
                int i10 = yeVar.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) e5.f27285z.b(null)).intValue()) {
                        if (veVar.e().a() >= yeVar.h() + Math.min(((Long) e5.f27281x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) e5.f27283y.b(null)).longValue())) {
                        }
                    }
                    veVar.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(yeVar.c()), Long.valueOf(yeVar.h()));
                }
                ae aeVarB = yeVar.b();
                try {
                    com.google.android.gms.internal.measurement.z6 z6Var = (com.google.android.gms.internal.measurement.z6) af.W(com.google.android.gms.internal.measurement.c7.M(), aeVarB.f27090g);
                    for (int i11 = 0; i11 < z6Var.B(); i11++) {
                        com.google.android.gms.internal.measurement.d7 d7Var = (com.google.android.gms.internal.measurement.d7) z6Var.C(i11).q();
                        d7Var.r1(veVar.e().a());
                        z6Var.D(i11, d7Var);
                    }
                    aeVarB.f27090g = ((com.google.android.gms.internal.measurement.c7) z6Var.v()).d();
                    if (Log.isLoggable(veVar.a().z(), 2)) {
                        aeVarB.f27095l = veVar.K0().K((com.google.android.gms.internal.measurement.c7) z6Var.v());
                    }
                    arrayList.add(aeVarB);
                } catch (com.google.android.gms.internal.measurement.wb unused) {
                    veVar.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                veVar.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(yeVar.c()), yeVar.e());
            }
        }
        ee eeVar = new ee(arrayList);
        try {
            o5Var.H1(eeVar);
            this.f27615a.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(eeVar.f27308f.size()));
        } catch (RemoteException e10) {
            this.f27615a.a().o().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    @Override // ob.i5
    public final List x1(String str, String str2, boolean z10, hf hfVar) {
        B2(hfVar, false);
        String str3 = hfVar.f27424f;
        o9.s.l(str3);
        try {
            List<df> list = (List) this.f27615a.b().r(new s7(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (df dfVar : list) {
                if (z10 || !ff.N(dfVar.f27202c)) {
                    arrayList.add(new bf(dfVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f27615a.a().o().c("Failed to query user properties. appId", b6.x(hfVar.f27424f), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f27615a.a().o().c("Failed to query user properties. appId", b6.x(hfVar.f27424f), e);
            return Collections.EMPTY_LIST;
        }
    }

    public final /* synthetic */ void x2(hf hfVar, g gVar) {
        ve veVar = this.f27615a;
        veVar.E();
        veVar.r0((String) o9.s.l(hfVar.f27424f), gVar);
    }

    @Override // ob.i5
    public final void y(hf hfVar, final ce ceVar, final o5 o5Var) {
        B2(hfVar, false);
        final String str = (String) o9.s.l(hfVar.f27424f);
        this.f27615a.b().t(new Runnable() { // from class: ob.i8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27466a.w2(str, ceVar, o5Var);
            }
        });
    }

    @Override // ob.i5
    public final void y1(i0 i0Var, hf hfVar) {
        o9.s.l(i0Var);
        B2(hfVar, false);
        F2(new a8(this, i0Var, hfVar));
    }

    public final /* synthetic */ void y2(Bundle bundle, String str, hf hfVar) {
        ve veVar = this.f27615a;
        boolean zH = veVar.B0().H(null, e5.W0);
        if (bundle.isEmpty() && zH) {
            w wVarF0 = this.f27615a.F0();
            wVarF0.h();
            wVarF0.j();
            try {
                wVarF0.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                wVarF0.f27641a.a().o().b("Error clearing default event params", e10);
                return;
            }
        }
        w wVarF1 = veVar.F0();
        wVarF1.h();
        wVarF1.j();
        byte[] bArrD = wVarF1.b.K0().J(new d0(wVarF1.f27641a, BuildConfig.FLAVOR, str, "dep", 0L, 0L, bundle)).d();
        l7 l7Var = wVarF1.f27641a;
        l7Var.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrD.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrD);
        try {
            if (wVarF1.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                l7Var.a().o().b("Failed to insert default event parameters (got -1). appId", b6.x(str));
            }
        } catch (SQLiteException e11) {
            wVarF1.f27641a.a().o().c("Error storing default event parameters. appId", b6.x(str), e11);
        }
        ve veVar2 = this.f27615a;
        w wVarF2 = veVar2.F0();
        long j10 = hfVar.I;
        if (wVarF2.H(str, j10)) {
            veVar2.F0().I(str, Long.valueOf(j10), null, bundle);
        }
    }

    public final /* synthetic */ ve z2() {
        return this.f27615a;
    }
}
