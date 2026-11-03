package nb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me f26419a;
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26420c;

    public i8(me meVar, String str) {
        n9.m.l(meVar);
        this.f26419a = meVar;
        this.f26420c = null;
    }

    @Override // nb.d5
    public final String A0(zzr zzrVar) {
        B2(zzrVar, false);
        return this.f26419a.p0(zzrVar);
    }

    public final void A2(zzbg zzbgVar, zzr zzrVar) {
        me meVar = this.f26419a;
        meVar.E();
        meVar.k(zzbgVar, zzrVar);
    }

    public final void B2(zzr zzrVar, boolean z10) {
        n9.m.l(zzrVar);
        String str = zzrVar.f7519f;
        n9.m.f(str);
        C2(str, false);
        this.f26419a.N0().o(zzrVar.f7520g);
    }

    @Override // nb.d5
    public final zzao C1(zzr zzrVar) {
        B2(zzrVar, false);
        n9.m.f(zzrVar.f7519f);
        try {
            return (zzao) this.f26419a.b().s(new u7(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f26419a.a().o().c("Failed to get consent. appId", w5.x(zzrVar.f7519f), e10);
            return new zzao(null);
        }
    }

    public final void C2(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f26419a.a().o().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f26420c)) {
                        me meVar = this.f26419a;
                        if (!u9.p.a(meVar.d(), Binder.getCallingUid()) && !j9.i.a(meVar.d()).c(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.b = Boolean.valueOf(z11);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f26419a.a().o().b("Measurement Service called with invalid calling package. appId", w5.x(str));
                throw e10;
            }
        }
        if (this.f26420c == null && j9.h.j(this.f26419a.d(), Binder.getCallingUid(), str)) {
            this.f26420c = str;
        }
        if (str.equals(this.f26420c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public final void D2(zzbg zzbgVar, zzr zzrVar) {
        me meVar = this.f26419a;
        x6 x6VarD0 = meVar.D0();
        String str = zzrVar.f7519f;
        com.google.android.gms.internal.measurement.d1 d1Var = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.d1) x6VarD0.f26918j.d(str);
        if (d1Var == null) {
            this.f26419a.a().w().b("EES not loaded for", zzrVar.f7519f);
            A2(zzbgVar, zzrVar);
            return;
        }
        try {
            Map mapZ = meVar.K0().Z(zzbgVar.f7497g.y3(), true);
            String str2 = zzbgVar.f7496f;
            String strA = r8.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (d1Var.b(new com.google.android.gms.internal.measurement.b(str2, zzbgVar.f7499i, mapZ))) {
                if (d1Var.c()) {
                    me meVar2 = this.f26419a;
                    meVar2.a().w().b("EES edited event", zzbgVar.f7496f);
                    A2(meVar2.K0().m(d1Var.e().c()), zzrVar);
                } else {
                    A2(zzbgVar, zzrVar);
                }
                if (d1Var.d()) {
                    for (com.google.android.gms.internal.measurement.b bVar : d1Var.e().f()) {
                        me meVar3 = this.f26419a;
                        meVar3.a().w().b("EES logging created event", bVar.b());
                        A2(meVar3.K0().m(bVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.d2 unused) {
            this.f26419a.a().o().c("EES error. appId, eventName", zzrVar.f7520g, zzbgVar.f7496f);
        }
        this.f26419a.a().w().b("EES was not applied to event", zzbgVar.f7496f);
        A2(zzbgVar, zzrVar);
    }

    @Override // nb.d5
    public final void E1(final Bundle bundle, final zzr zzrVar) {
        B2(zzrVar, false);
        final String str = zzrVar.f7519f;
        n9.m.l(str);
        F2(new Runnable() { // from class: nb.g8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26377a.y2(bundle, str, zzrVar);
            }
        });
    }

    public final zzbg E2(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        if ("_cmp".equals(zzbgVar.f7496f) && (zzbeVar = zzbgVar.f7497g) != null && zzbeVar.zze() != 0) {
            String strX3 = zzbeVar.x3("_cis");
            if ("referrer broadcast".equals(strX3) || "referrer API".equals(strX3)) {
                this.f26419a.a().u().b("Event has been filtered ", zzbgVar.toString());
                return new zzbg("_cmpx", zzbeVar, zzbgVar.f7498h, zzbgVar.f7499i);
            }
        }
        return zzbgVar;
    }

    public final void F2(Runnable runnable) {
        n9.m.l(runnable);
        me meVar = this.f26419a;
        if (meVar.b().p()) {
            runnable.run();
        } else {
            meVar.b().t(runnable);
        }
    }

    @Override // nb.d5
    public final List G0(zzr zzrVar, boolean z10) {
        B2(zzrVar, false);
        String str = zzrVar.f7519f;
        n9.m.l(str);
        try {
            List<te> list = (List) this.f26419a.b().r(new h7(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (te teVar : list) {
                if (z10 || !ve.N(teVar.f26817c)) {
                    arrayList.add(new zzpl(teVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f26419a.a().o().c("Failed to get user properties. appId", w5.x(zzrVar.f7519f), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f26419a.a().o().c("Failed to get user properties. appId", w5.x(zzrVar.f7519f), e);
            return null;
        }
    }

    @Override // nb.d5
    public final void H(zzr zzrVar, final zzoo zzooVar, final j5 j5Var) {
        B2(zzrVar, false);
        final String str = (String) n9.m.l(zzrVar.f7519f);
        this.f26419a.b().t(new Runnable() { // from class: nb.d8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26271a.w2(str, zzooVar, j5Var);
            }
        });
    }

    @Override // nb.d5
    public final List K(String str, String str2, String str3) {
        C2(str, true);
        try {
            return (List) this.f26419a.b().r(new q7(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f26419a.a().o().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // nb.d5
    public final void K1(zzr zzrVar) {
        B2(zzrVar, false);
        F2(new i7(this, zzrVar));
    }

    @Override // nb.d5
    public final void P(final zzr zzrVar) {
        n9.m.f(zzrVar.f7519f);
        n9.m.l(zzrVar.f7537x);
        s2(new Runnable() { // from class: nb.h8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26399a.t2(zzrVar);
            }
        });
    }

    @Override // nb.d5
    public final void Q0(zzbg zzbgVar, String str, String str2) {
        n9.m.l(zzbgVar);
        n9.m.f(str);
        C2(str, true);
        F2(new w7(this, zzbgVar, str));
    }

    @Override // nb.d5
    public final List S(zzr zzrVar, Bundle bundle) {
        B2(zzrVar, false);
        n9.m.l(zzrVar.f7519f);
        me meVar = this.f26419a;
        if (!meVar.B0().H(null, z4.Z0)) {
            try {
                return (List) this.f26419a.b().r(new a8(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f26419a.a().o().c("Failed to get trigger URIs. appId", w5.x(zzrVar.f7519f), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) meVar.b().s(new z7(this, zzrVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f26419a.a().o().c("Failed to get trigger URIs. appId", w5.x(zzrVar.f7519f), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // nb.d5
    public final void S1(zzr zzrVar) {
        B2(zzrVar, false);
        F2(new j7(this, zzrVar));
    }

    @Override // nb.d5
    public final void V(zzbg zzbgVar, zzr zzrVar) {
        n9.m.l(zzbgVar);
        B2(zzrVar, false);
        F2(new v7(this, zzbgVar, zzrVar));
    }

    @Override // nb.d5
    public final void V0(long j10, String str, String str2, String str3) {
        F2(new k7(this, str2, str3, str, j10));
    }

    @Override // nb.d5
    public final void W(zzr zzrVar) {
        B2(zzrVar, false);
        F2(new r7(this, zzrVar));
    }

    @Override // nb.d5
    public final void W0(zzr zzrVar) {
        String str = zzrVar.f7519f;
        n9.m.f(str);
        C2(str, false);
        F2(new s7(this, zzrVar));
    }

    @Override // nb.d5
    public final List Y1(String str, String str2, boolean z10, zzr zzrVar) {
        B2(zzrVar, false);
        String str3 = zzrVar.f7519f;
        n9.m.l(str3);
        try {
            List<te> list = (List) this.f26419a.b().r(new n7(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (te teVar : list) {
                if (z10 || !ve.N(teVar.f26817c)) {
                    arrayList.add(new zzpl(teVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f26419a.a().o().c("Failed to query user properties. appId", w5.x(zzrVar.f7519f), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f26419a.a().o().c("Failed to query user properties. appId", w5.x(zzrVar.f7519f), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // nb.d5
    public final void c0(final zzr zzrVar) {
        n9.m.f(zzrVar.f7519f);
        n9.m.l(zzrVar.f7537x);
        s2(new Runnable() { // from class: nb.b8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26184a.u2(zzrVar);
            }
        });
    }

    @Override // nb.d5
    public final byte[] e0(zzbg zzbgVar, String str) {
        n9.m.f(str);
        n9.m.l(zzbgVar);
        C2(str, true);
        me meVar = this.f26419a;
        u5 u5VarV = meVar.a().v();
        p5 p5VarM0 = meVar.M0();
        String str2 = zzbgVar.f7496f;
        u5VarV.b("Log and bundle. event", p5VarM0.a(str2));
        long jNanoTime = meVar.e().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) meVar.b().s(new x7(this, zzbgVar, str)).get();
            if (bArr == null) {
                meVar.a().o().b("Log and bundle returned null. appId", w5.x(str));
                bArr = new byte[0];
            }
            meVar.a().v().d("Log and bundle processed. event, size, time_ms", meVar.M0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((meVar.e().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            me meVar2 = this.f26419a;
            meVar2.a().o().d("Failed to log and bundle. appId, event, error", w5.x(str), meVar2.M0().a(zzbgVar.f7496f), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            me meVar3 = this.f26419a;
            meVar3.a().o().d("Failed to log and bundle. appId, event, error", w5.x(str), meVar3.M0().a(zzbgVar.f7496f), e);
            return null;
        }
    }

    @Override // nb.d5
    public final List e2(String str, String str2, zzr zzrVar) {
        B2(zzrVar, false);
        String str3 = zzrVar.f7519f;
        n9.m.l(str3);
        try {
            return (List) this.f26419a.b().r(new p7(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f26419a.a().o().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // nb.d5
    public final void f0(zzah zzahVar) {
        n9.m.l(zzahVar);
        n9.m.l(zzahVar.f7485h);
        n9.m.f(zzahVar.f7483f);
        C2(zzahVar.f7483f, true);
        F2(new m7(this, new zzah(zzahVar)));
    }

    @Override // nb.d5
    public final void g1(final zzr zzrVar, final Bundle bundle, final g5 g5Var) {
        B2(zzrVar, false);
        final String str = (String) n9.m.l(zzrVar.f7519f);
        this.f26419a.b().t(new Runnable() { // from class: nb.c8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26242a.v2(zzrVar, bundle, g5Var, str);
            }
        });
    }

    @Override // nb.d5
    public final void j0(zzpl zzplVar, zzr zzrVar) {
        n9.m.l(zzplVar);
        B2(zzrVar, false);
        F2(new y7(this, zzplVar, zzrVar));
    }

    @Override // nb.d5
    public final List o(String str, String str2, String str3, boolean z10) {
        C2(str, true);
        try {
            List<te> list = (List) this.f26419a.b().r(new o7(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (te teVar : list) {
                if (z10 || !ve.N(teVar.f26817c)) {
                    arrayList.add(new zzpl(teVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f26419a.a().o().c("Failed to get user properties as. appId", w5.x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f26419a.a().o().c("Failed to get user properties as. appId", w5.x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // nb.d5
    public final void p2(zzr zzrVar) {
        n9.m.f(zzrVar.f7519f);
        n9.m.l(zzrVar.f7537x);
        s2(new t7(this, zzrVar));
    }

    @Override // nb.d5
    public final void q(zzah zzahVar, zzr zzrVar) {
        n9.m.l(zzahVar);
        n9.m.l(zzahVar.f7485h);
        B2(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f7483f = zzrVar.f7519f;
        F2(new l7(this, zzahVar2, zzrVar));
    }

    public final void s2(Runnable runnable) {
        n9.m.l(runnable);
        me meVar = this.f26419a;
        if (meVar.b().p()) {
            runnable.run();
        } else {
            meVar.b().v(runnable);
        }
    }

    public final /* synthetic */ void t2(zzr zzrVar) {
        me meVar = this.f26419a;
        meVar.E();
        meVar.P0(zzrVar);
    }

    @Override // nb.d5
    public final void u1(final zzr zzrVar, final zzaf zzafVar) {
        B2(zzrVar, false);
        F2(new Runnable() { // from class: nb.f8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26332a.x2(zzrVar, zzafVar);
            }
        });
    }

    public final /* synthetic */ void u2(zzr zzrVar) {
        me meVar = this.f26419a;
        meVar.E();
        meVar.Q0(zzrVar);
    }

    public final /* synthetic */ void v2(zzr zzrVar, Bundle bundle, g5 g5Var, String str) {
        me meVar = this.f26419a;
        meVar.E();
        try {
            g5Var.x0(meVar.q0(zzrVar, bundle));
        } catch (RemoteException e10) {
            this.f26419a.a().o().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    public final /* synthetic */ void w2(String str, zzoo zzooVar, j5 j5Var) {
        me meVar = this.f26419a;
        meVar.E();
        meVar.b().h();
        meVar.O0();
        List<pe> listO = meVar.F0().o(str, zzooVar, ((Integer) z4.B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (pe peVar : listO) {
            if (meVar.t(str, peVar.e())) {
                int i10 = peVar.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) z4.f27031z.b(null)).intValue()) {
                        if (meVar.e().a() >= peVar.h() + Math.min(((Long) z4.f27027x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) z4.f27029y.b(null)).longValue())) {
                        }
                    }
                    meVar.a().w().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(peVar.c()), Long.valueOf(peVar.h()));
                }
                zzom zzomVarB = peVar.b();
                try {
                    com.google.android.gms.internal.measurement.v6 v6Var = (com.google.android.gms.internal.measurement.v6) re.W(com.google.android.gms.internal.measurement.y6.O(), zzomVarB.f7504g);
                    for (int i11 = 0; i11 < v6Var.z(); i11++) {
                        com.google.android.gms.internal.measurement.z6 z6Var = (com.google.android.gms.internal.measurement.z6) v6Var.B(i11).q();
                        z6Var.n1(meVar.e().a());
                        v6Var.C(i11, z6Var);
                    }
                    zzomVarB.f7504g = ((com.google.android.gms.internal.measurement.y6) v6Var.t()).d();
                    if (Log.isLoggable(meVar.a().z(), 2)) {
                        zzomVarB.f7509l = meVar.K0().K((com.google.android.gms.internal.measurement.y6) v6Var.t());
                    }
                    arrayList.add(zzomVarB);
                } catch (com.google.android.gms.internal.measurement.sb unused) {
                    meVar.a().r().b("Failed to parse queued batch. appId", str);
                }
            } else {
                meVar.a().w().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(peVar.c()), peVar.e());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            j5Var.M1(zzoqVar);
            this.f26419a.a().w().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.f7511f.size()));
        } catch (RemoteException e10) {
            this.f26419a.a().o().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    public final /* synthetic */ void x2(zzr zzrVar, zzaf zzafVar) {
        me meVar = this.f26419a;
        meVar.E();
        meVar.r0((String) n9.m.l(zzrVar.f7519f), zzafVar);
    }

    public final /* synthetic */ void y2(Bundle bundle, String str, zzr zzrVar) {
        me meVar = this.f26419a;
        boolean zH = meVar.B0().H(null, z4.W0);
        if (bundle.isEmpty() && zH) {
            t tVarF0 = this.f26419a.F0();
            tVarF0.h();
            tVarF0.j();
            try {
                tVarF0.u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                tVarF0.f26446a.a().o().b("Error clearing default event params", e10);
                return;
            }
        }
        t tVarF1 = meVar.F0();
        tVarF1.h();
        tVarF1.j();
        byte[] bArrD = tVarF1.b.K0().J(new a0(tVarF1.f26446a, "", str, "dep", 0L, 0L, bundle)).d();
        g7 g7Var = tVarF1.f26446a;
        g7Var.a().w().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrD.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrD);
        try {
            if (tVarF1.u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                g7Var.a().o().b("Failed to insert default event parameters (got -1). appId", w5.x(str));
            }
        } catch (SQLiteException e11) {
            tVarF1.f26446a.a().o().c("Error storing default event parameters. appId", w5.x(str), e11);
        }
        me meVar2 = this.f26419a;
        t tVarF2 = meVar2.F0();
        long j10 = zzrVar.I;
        if (tVarF2.H(str, j10)) {
            meVar2.F0().I(str, Long.valueOf(j10), null, bundle);
        }
    }

    public final /* synthetic */ me z2() {
        return this.f26419a;
    }
}
