package ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class yc extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sc f28002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i5 f28003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f28004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f28005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f28006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ud f28007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f28008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f28009j;

    public yc(l7 l7Var) {
        super(l7Var);
        this.f28008i = new ArrayList();
        this.f28007h = new ud(l7Var.e());
        this.f28002c = new sc(this);
        this.f28005f = new yb(this, l7Var);
        this.f28009j = new cc(this, l7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f28007h.a();
        this.f27641a.w();
        this.f28005f.b(((Long) e5.Z.b(null)).longValue());
    }

    public final void A() {
        h();
        j();
        sc scVar = this.f28002c;
        scVar.b();
        try {
            u9.a.b().c(this.f27641a.d(), scVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f28003d = null;
    }

    public final void B(com.google.android.gms.internal.measurement.x1 x1Var, i0 i0Var, String str) {
        h();
        j();
        l7 l7Var = this.f27641a;
        if (l7Var.C().X(12451000) == 0) {
            T(new bc(this, i0Var, str, x1Var));
        } else {
            l7Var.a().r().a("Not bundling data. Service unavailable or out of date");
            l7Var.C().d0(x1Var, new byte[0]);
        }
    }

    public final boolean C() {
        h();
        j();
        return !y() || this.f27641a.C().W() >= ((Integer) e5.K0.b(null)).intValue();
    }

    public final boolean D() {
        h();
        j();
        return !y() || this.f27641a.C().W() >= 241200;
    }

    public final /* synthetic */ void E() {
        i5 i5Var = this.f28003d;
        if (i5Var == null) {
            this.f27641a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            hf hfVarV = V(false);
            o9.s.l(hfVarV);
            i5Var.t0(hfVarV);
            J();
        } catch (RemoteException e10) {
            this.f27641a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void F() {
        i5 i5Var = this.f28003d;
        if (i5Var == null) {
            this.f27641a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            hf hfVarV = V(false);
            o9.s.l(hfVarV);
            i5Var.I0(hfVarV);
            J();
        } catch (RemoteException e10) {
            this.f27641a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void G(AtomicReference atomicReference, hf hfVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                i5 i5Var = this.f28003d;
                if (i5Var == null) {
                    this.f27641a.a().o().a("Failed to request trigger URIs; not connected to service");
                    return;
                }
                o9.s.l(hfVar);
                i5Var.H(hfVar, bundle, new qb(this, atomicReference));
                J();
            } catch (RemoteException e10) {
                this.f27641a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    public final /* synthetic */ void H(AtomicReference atomicReference, hf hfVar, ce ceVar) {
        synchronized (atomicReference) {
            try {
                i5 i5Var = this.f28003d;
                if (i5Var == null) {
                    this.f27641a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                o9.s.l(hfVar);
                i5Var.y(hfVar, ceVar, new rb(this, atomicReference));
                J();
            } catch (RemoteException e10) {
                this.f27641a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    public final /* synthetic */ void I(hf hfVar, g gVar) {
        i5 i5Var = this.f28003d;
        if (i5Var == null) {
            this.f27641a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            i5Var.d0(hfVar, gVar);
            J();
        } catch (RemoteException e10) {
            this.f27641a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(gVar.f27341f), e10);
        }
    }

    public final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f28003d != null) {
            this.f28003d = null;
            this.f27641a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    public final /* synthetic */ sc M() {
        return this.f28002c;
    }

    public final /* synthetic */ i5 N() {
        return this.f28003d;
    }

    public final /* synthetic */ void O(i5 i5Var) {
        this.f28003d = null;
    }

    public final /* synthetic */ ScheduledExecutorService P() {
        return this.f28006g;
    }

    public final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f28006g = scheduledExecutorService;
    }

    public final boolean R() {
        this.f27641a.c();
        return true;
    }

    public final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f28008i;
        long size = list.size();
        l7 l7Var = this.f27641a;
        l7Var.w();
        if (size >= 1000) {
            l7Var.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f28009j.b(60000L);
        w();
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        z5 z5VarW = this.f27641a.a().w();
        List list = this.f28008i;
        z5VarW.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f27641a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f28008i.clear();
        this.f28009j.d();
    }

    public final hf V(boolean z10) {
        Pair pairB;
        l7 l7Var = this.f27641a;
        l7Var.c();
        p5 p5VarL = this.f27641a.L();
        String string = null;
        if (z10) {
            l7 l7Var2 = l7Var.a().f27641a;
            if (l7Var2.x().f27685e != null && (pairB = l7Var2.x().f27685e.b()) != null && pairB != p6.A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return p5VarL.o(string);
    }

    public final boolean W() {
        h();
        j();
        return this.f28003d != null;
    }

    public final void X() {
        h();
        j();
        T(new dc(this, V(true)));
    }

    public final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new ec(this, V(false)));
        }
    }

    public final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: ob.xc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27972a.E();
            }
        });
    }

    public final void a0() {
        h();
        j();
        T(new Runnable() { // from class: ob.tc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27825a.F();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fe  */
    public final void b0(i5 i5Var, p9.a aVar, hf hfVar) {
        hf hfVar2;
        String str;
        long jB;
        long j10;
        h();
        j();
        R();
        l7 l7Var = this.f27641a;
        l7Var.w();
        hf hfVar3 = hfVar;
        int size = 100;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && size == i11; i11 = 100) {
            l7 l7Var2 = this.f27641a;
            ArrayList arrayList = new ArrayList();
            List listT = l7Var2.E().t(i11);
            if (listT != null) {
                arrayList.addAll(listT);
                size = listT.size();
            } else {
                size = 0;
            }
            if (aVar != 0 && size < i11) {
                arrayList.add(new r5(aVar, hfVar3.f27426h, hfVar3.f27433o));
            }
            String str2 = null;
            boolean zH = l7Var.w().H(null, e5.P0);
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                r5 r5Var = (r5) arrayList.get(i12);
                p9.a aVar2 = r5Var.f27760a;
                m mVarW = l7Var.w();
                d5 d5Var = e5.f27231c1;
                if (mVarW.H(str2, d5Var)) {
                    String str3 = r5Var.b;
                    if (TextUtils.isEmpty(str3)) {
                        hfVar2 = hfVar3;
                    } else {
                        hfVar2 = new hf(hfVar3.f27424f, hfVar3.f27425g, str3, r5Var.f27761c, hfVar3.f27427i, hfVar3.f27428j, hfVar3.f27429k, hfVar3.f27430l, hfVar3.f27431m, hfVar3.f27432n, hfVar3.f27434p, hfVar3.f27435q, hfVar3.f27436r, hfVar3.f27437s, hfVar3.f27438t, hfVar3.f27439u, hfVar3.f27440v, hfVar3.f27441w, hfVar3.f27442x, hfVar3.f27443y, hfVar3.f27444z, hfVar3.A, hfVar3.B, hfVar3.C, hfVar3.D, hfVar3.E, hfVar3.F, hfVar3.G, hfVar3.H, hfVar3.I, hfVar3.J);
                    }
                } else {
                    hfVar2 = hfVar3;
                }
                if (aVar2 instanceof i0) {
                    if (zH) {
                        try {
                            l7 l7Var3 = this.f27641a;
                            long jA = l7Var3.e().a();
                            try {
                                j10 = jA;
                                jB = l7Var3.e().b();
                            } catch (RemoteException e10) {
                                e = e10;
                                j10 = jA;
                                jB = 0;
                                this.f27641a.a().o().b("Failed to send event to the service", e);
                                if (zH && j10 != 0) {
                                    l7 l7Var4 = this.f27641a;
                                    x5.a(l7Var4).b(36301, 13, j10, l7Var4.e().a(), (int) (l7Var4.e().b() - jB));
                                }
                                str = null;
                                i12++;
                                hfVar3 = hfVar2;
                                str2 = str;
                                l7Var = l7Var;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            jB = 0;
                            j10 = 0;
                        }
                    } else {
                        jB = 0;
                        j10 = 0;
                    }
                    try {
                        i5Var.y1((i0) aVar2, hfVar2);
                        if (zH) {
                            l7Var.a().w().a("Logging telemetry for logEvent from database");
                            l7 l7Var5 = this.f27641a;
                            x5.a(l7Var5).b(36301, 0, j10, l7Var5.e().a(), (int) (l7Var5.e().b() - jB));
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        this.f27641a.a().o().b("Failed to send event to the service", e);
                        if (zH) {
                            l7 l7Var6 = this.f27641a;
                            x5.a(l7Var6).b(36301, 13, j10, l7Var6.e().a(), (int) (l7Var6.e().b() - jB));
                        }
                    }
                } else if (aVar2 instanceof bf) {
                    try {
                        i5Var.G((bf) aVar2, hfVar2);
                    } catch (RemoteException e13) {
                        this.f27641a.a().o().b("Failed to send user property to the service", e13);
                    }
                } else {
                    if (aVar2 instanceof i) {
                        try {
                            i5Var.F1((i) aVar2, hfVar2);
                        } catch (RemoteException e14) {
                            this.f27641a.a().o().b("Failed to send conditional user property to the service", e14);
                        }
                    } else {
                        l7 l7Var7 = this.f27641a;
                        str = null;
                        if (l7Var7.w().H(null, d5Var) && (aVar2 instanceof g0)) {
                            try {
                                i5Var.L1(((g0) aVar2).D3(), hfVar2);
                            } catch (RemoteException e15) {
                                this.f27641a.a().o().b("Failed to send default event parameters to the service", e15);
                            }
                        } else {
                            l7Var7.a().o().a("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i12++;
                    hfVar3 = hfVar2;
                    str2 = str;
                    l7Var = l7Var;
                }
                str = null;
                i12++;
                hfVar3 = hfVar2;
                str2 = str;
                l7Var = l7Var;
            }
            i10++;
        }
    }

    public final void c0(i0 i0Var, String str) {
        o9.s.l(i0Var);
        h();
        j();
        R();
        T(new fc(this, true, V(true), this.f27641a.E().p(i0Var), i0Var, str));
    }

    public final void d0(i iVar) {
        o9.s.l(iVar);
        h();
        j();
        this.f27641a.c();
        T(new gc(this, true, V(true), this.f27641a.E().r(iVar), new i(iVar), iVar));
    }

    public final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new hc(this, atomicReference, null, str2, str3, V(false)));
    }

    public final void f0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2) {
        h();
        j();
        T(new ic(this, str, str2, V(false), x1Var));
    }

    public final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new jc(this, atomicReference, null, str2, str3, V(false), z10));
    }

    public final void h0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        h();
        j();
        T(new pb(this, str, str2, V(false), z10, x1Var));
    }

    public final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final hf hfVarV = V(false);
        T(new Runnable() { // from class: ob.uc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27853a.G(atomicReference, hfVarV, bundle);
            }
        });
    }

    public final void j0(final AtomicReference atomicReference, final ce ceVar) {
        h();
        j();
        final hf hfVarV = V(false);
        T(new Runnable() { // from class: ob.vc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27897a.H(atomicReference, hfVarV, ceVar);
            }
        });
    }

    public final void k0(final g gVar) {
        h();
        j();
        final hf hfVarV = V(true);
        o9.s.l(hfVarV);
        T(new Runnable() { // from class: ob.wc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27954a.I(hfVarV, gVar);
            }
        });
    }

    public final p l0() {
        h();
        j();
        i5 i5Var = this.f28003d;
        if (i5Var == null) {
            w();
            this.f27641a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        hf hfVarV = V(false);
        o9.s.l(hfVarV);
        try {
            p pVarY = i5Var.Y(hfVarV);
            J();
            return pVarY;
        } catch (RemoteException e10) {
            this.f27641a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // ob.g5
    public final boolean m() {
        return false;
    }

    public final void o(bf bfVar) {
        h();
        j();
        R();
        T(new sb(this, V(true), this.f27641a.E().q(bfVar), bfVar));
    }

    public final void p() {
        h();
        j();
        hf hfVarV = V(false);
        R();
        this.f27641a.E().o();
        T(new tb(this, hfVarV));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new ub(this, atomicReference, V(false)));
    }

    public final void r(com.google.android.gms.internal.measurement.x1 x1Var) {
        h();
        j();
        T(new vb(this, V(false), x1Var));
    }

    public final void s() {
        h();
        j();
        hf hfVarV = V(true);
        R();
        this.f27641a.w().H(null, e5.f27231c1);
        this.f27641a.E().u();
        T(new wb(this, hfVarV, true));
    }

    public final void t() {
        h();
        j();
        T(new xb(this, V(true)));
    }

    public final void u(gb gbVar) {
        h();
        j();
        T(new zb(this, gbVar));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        g0 g0Var = new g0(bundle);
        R();
        T(new ac(this, true, V(false), this.f27641a.w().H(null, e5.f27231c1) && this.f27641a.E().s(g0Var), g0Var, bundle));
    }

    public final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f28002c.c();
            return;
        }
        l7 l7Var = this.f27641a;
        if (l7Var.w().m()) {
            return;
        }
        l7Var.c();
        List<ResolveInfo> listQueryIntentServices = l7Var.d().getPackageManager().queryIntentServices(new Intent().setClassName(l7Var.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            l7Var.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextD = l7Var.d();
        l7Var.c();
        intent.setComponent(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f28002c.a(intent);
    }

    public final Boolean x() {
        return this.f28004e;
    }

    public final boolean y() {
        h();
        j();
        if (this.f28004e == null) {
            h();
            j();
            l7 l7Var = this.f27641a;
            p6 p6VarX = l7Var.x();
            p6VarX.h();
            boolean z10 = false;
            Boolean boolValueOf = !p6VarX.p().contains("use_service") ? null : Boolean.valueOf(p6VarX.p().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                l7Var.c();
                if (this.f27641a.L().v() == 1) {
                    z10 = true;
                } else {
                    l7Var.a().w().a("Checking service availability");
                    int iX = l7Var.C().X(12451000);
                    if (iX == 0) {
                        l7Var.a().w().a("Service available");
                    } else if (iX == 1) {
                        l7Var.a().w().a("Service missing");
                    } else if (iX != 2) {
                        if (iX == 3) {
                            l7Var.a().r().a("Service disabled");
                        } else if (iX == 9) {
                            l7Var.a().r().a("Service invalid");
                        } else if (iX != 18) {
                            l7Var.a().r().b("Unexpected service status", Integer.valueOf(iX));
                        } else {
                            l7Var.a().r().a("Service updating");
                        }
                        z11 = false;
                    } else {
                        l7Var.a().v().a("Service container out of date");
                        if (l7Var.C().W() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && l7Var.w().m()) {
                    l7Var.a().o().a("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    p6 p6VarX2 = l7Var.x();
                    p6VarX2.h();
                    SharedPreferences.Editor editorEdit = p6VarX2.p().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f28004e = Boolean.valueOf(z11);
        }
        return this.f28004e.booleanValue();
    }

    public final void z(i5 i5Var) {
        h();
        o9.s.l(i5Var);
        this.f28003d = i5Var;
        J();
        L();
    }
}
