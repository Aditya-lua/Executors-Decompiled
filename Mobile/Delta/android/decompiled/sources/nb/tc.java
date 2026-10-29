package nb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class tc extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc f25987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d5 f25988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f25989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f25990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f25991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pd f25992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f25993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f25994j;

    public tc(g7 g7Var) {
        super(g7Var);
        this.f25993i = new ArrayList();
        this.f25992h = new pd(g7Var.e());
        this.f25987c = new nc(this);
        this.f25990f = new tb(this, g7Var);
        this.f25994j = new xb(this, g7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        h();
        this.f25992h.a();
        this.f25625a.w();
        this.f25990f.b(((Long) z4.Z.b(null)).longValue());
    }

    public final void A() {
        h();
        j();
        nc ncVar = this.f25987c;
        ncVar.b();
        try {
            t9.a.b().c(this.f25625a.d(), ncVar);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f25988d = null;
    }

    public final void B(com.google.android.gms.internal.measurement.x1 x1Var, zzbg zzbgVar, String str) {
        h();
        j();
        g7 g7Var = this.f25625a;
        if (g7Var.C().X(12451000) == 0) {
            T(new wb(this, zzbgVar, str, x1Var));
        } else {
            g7Var.a().r().a("Not bundling data. Service unavailable or out of date");
            g7Var.C().d0(x1Var, new byte[0]);
        }
    }

    public final boolean C() {
        h();
        j();
        return !y() || this.f25625a.C().W() >= ((Integer) z4.K0.b(null)).intValue();
    }

    public final boolean D() {
        h();
        j();
        return !y() || this.f25625a.C().W() >= 241200;
    }

    public final /* synthetic */ void E() {
        d5 d5Var = this.f25988d;
        if (d5Var == null) {
            this.f25625a.a().o().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr zzrVarV = V(false);
            n9.m.l(zzrVarV);
            d5Var.R(zzrVarV);
            J();
        } catch (RemoteException e10) {
            this.f25625a.a().o().b("Failed to send storage consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void F() {
        d5 d5Var = this.f25988d;
        if (d5Var == null) {
            this.f25625a.a().o().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr zzrVarV = V(false);
            n9.m.l(zzrVarV);
            d5Var.e0(zzrVarV);
            J();
        } catch (RemoteException e10) {
            this.f25625a.a().o().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    public final /* synthetic */ void G(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                d5 d5Var = this.f25988d;
                if (d5Var == null) {
                    this.f25625a.a().o().a("Failed to request trigger URIs; not connected to service");
                    return;
                }
                n9.m.l(zzrVar);
                d5Var.k1(zzrVar, bundle, new lb(this, atomicReference));
                J();
            } catch (RemoteException e10) {
                this.f25625a.a().o().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    public final /* synthetic */ void H(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        synchronized (atomicReference) {
            try {
                d5 d5Var = this.f25988d;
                if (d5Var == null) {
                    this.f25625a.a().o().a("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                n9.m.l(zzrVar);
                d5Var.J(zzrVar, zzooVar, new mb(this, atomicReference));
                J();
            } catch (RemoteException e10) {
                this.f25625a.a().o().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    public final /* synthetic */ void I(zzr zzrVar, zzaf zzafVar) {
        d5 d5Var = this.f25988d;
        if (d5Var == null) {
            this.f25625a.a().o().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            d5Var.w1(zzrVar, zzafVar);
            J();
        } catch (RemoteException e10) {
            this.f25625a.a().o().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.f7406f), e10);
        }
    }

    public final /* synthetic */ void K(ComponentName componentName) {
        h();
        if (this.f25988d != null) {
            this.f25988d = null;
            this.f25625a.a().w().b("Disconnected from device MeasurementService", componentName);
            h();
            w();
        }
    }

    public final /* synthetic */ nc M() {
        return this.f25987c;
    }

    public final /* synthetic */ d5 N() {
        return this.f25988d;
    }

    public final /* synthetic */ void O(d5 d5Var) {
        this.f25988d = null;
    }

    public final /* synthetic */ ScheduledExecutorService P() {
        return this.f25991g;
    }

    public final /* synthetic */ void Q(ScheduledExecutorService scheduledExecutorService) {
        this.f25991g = scheduledExecutorService;
    }

    public final boolean R() {
        this.f25625a.c();
        return true;
    }

    public final void T(Runnable runnable) {
        h();
        if (W()) {
            runnable.run();
            return;
        }
        List list = this.f25993i;
        long size = list.size();
        g7 g7Var = this.f25625a;
        g7Var.w();
        if (size >= 1000) {
            g7Var.a().o().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f25994j.b(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        w();
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L() {
        h();
        u5 u5VarW = this.f25625a.a().w();
        List list = this.f25993i;
        u5VarW.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f25625a.a().o().b("Task exception while flushing queue", e10);
            }
        }
        this.f25993i.clear();
        this.f25994j.d();
    }

    public final zzr V(boolean z10) {
        Pair pairB;
        g7 g7Var = this.f25625a;
        g7Var.c();
        k5 k5VarL = this.f25625a.L();
        String string = null;
        if (z10) {
            g7 g7Var2 = g7Var.a().f25625a;
            if (g7Var2.x().f25670e != null && (pairB = g7Var2.x().f25670e.b()) != null && pairB != k6.A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return k5VarL.o(string);
    }

    public final boolean W() {
        h();
        j();
        return this.f25988d != null;
    }

    public final void X() {
        h();
        j();
        T(new yb(this, V(true)));
    }

    public final void Y(boolean z10) {
        h();
        j();
        if (C()) {
            T(new zb(this, V(false)));
        }
    }

    public final void Z(boolean z10) {
        h();
        j();
        T(new Runnable() { // from class: nb.sc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25951a.E();
            }
        });
    }

    public final void a0() {
        h();
        j();
        T(new Runnable() { // from class: nb.oc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25823a.F();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fe  */
    public final void b0(d5 d5Var, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        zzr zzrVar2;
        String str;
        long jB;
        long j10;
        h();
        j();
        R();
        g7 g7Var = this.f25625a;
        g7Var.w();
        zzr zzrVar3 = zzrVar;
        int size = 100;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && size == i11; i11 = 100) {
            g7 g7Var2 = this.f25625a;
            ArrayList arrayList = new ArrayList();
            List listT = g7Var2.E().t(i11);
            if (listT != null) {
                arrayList.addAll(listT);
                size = listT.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != 0 && size < i11) {
                arrayList.add(new m5(abstractSafeParcelable, zzrVar3.f7447h, zzrVar3.f7454o));
            }
            String str2 = null;
            boolean zH = g7Var.w().H(null, z4.P0);
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                m5 m5Var = (m5) arrayList.get(i12);
                AbstractSafeParcelable abstractSafeParcelable2 = m5Var.f25744a;
                k kVarW = g7Var.w();
                y4 y4Var = z4.f26156c1;
                if (kVarW.H(str2, y4Var)) {
                    String str3 = m5Var.b;
                    if (TextUtils.isEmpty(str3)) {
                        zzrVar2 = zzrVar3;
                    } else {
                        zzrVar2 = new zzr(zzrVar3.f7445f, zzrVar3.f7446g, str3, m5Var.f25745c, zzrVar3.f7448i, zzrVar3.f7449j, zzrVar3.f7450k, zzrVar3.f7451l, zzrVar3.f7452m, zzrVar3.f7453n, zzrVar3.f7455p, zzrVar3.f7456q, zzrVar3.f7457r, zzrVar3.f7458s, zzrVar3.f7459t, zzrVar3.f7460u, zzrVar3.f7461v, zzrVar3.f7462w, zzrVar3.f7463x, zzrVar3.f7464y, zzrVar3.f7465z, zzrVar3.A, zzrVar3.B, zzrVar3.C, zzrVar3.D, zzrVar3.E, zzrVar3.F, zzrVar3.G, zzrVar3.H, zzrVar3.I, zzrVar3.J);
                    }
                } else {
                    zzrVar2 = zzrVar3;
                }
                if (abstractSafeParcelable2 instanceof zzbg) {
                    if (zH) {
                        try {
                            g7 g7Var3 = this.f25625a;
                            long jA = g7Var3.e().a();
                            try {
                                j10 = jA;
                                jB = g7Var3.e().b();
                            } catch (RemoteException e10) {
                                e = e10;
                                j10 = jA;
                                jB = 0;
                                this.f25625a.a().o().b("Failed to send event to the service", e);
                                if (zH && j10 != 0) {
                                    g7 g7Var4 = this.f25625a;
                                    s5.a(g7Var4).b(36301, 13, j10, g7Var4.e().a(), (int) (g7Var4.e().b() - jB));
                                }
                                str = null;
                                i12++;
                                zzrVar3 = zzrVar2;
                                str2 = str;
                                g7Var = g7Var;
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
                        d5Var.X((zzbg) abstractSafeParcelable2, zzrVar2);
                        if (zH) {
                            g7Var.a().w().a("Logging telemetry for logEvent from database");
                            g7 g7Var5 = this.f25625a;
                            s5.a(g7Var5).b(36301, 0, j10, g7Var5.e().a(), (int) (g7Var5.e().b() - jB));
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        this.f25625a.a().o().b("Failed to send event to the service", e);
                        if (zH) {
                            g7 g7Var6 = this.f25625a;
                            s5.a(g7Var6).b(36301, 13, j10, g7Var6.e().a(), (int) (g7Var6.e().b() - jB));
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof zzpl) {
                    try {
                        d5Var.m0((zzpl) abstractSafeParcelable2, zzrVar2);
                    } catch (RemoteException e13) {
                        this.f25625a.a().o().b("Failed to send user property to the service", e13);
                    }
                } else {
                    if (abstractSafeParcelable2 instanceof zzah) {
                        try {
                            d5Var.q((zzah) abstractSafeParcelable2, zzrVar2);
                        } catch (RemoteException e14) {
                            this.f25625a.a().o().b("Failed to send conditional user property to the service", e14);
                        }
                    } else {
                        g7 g7Var7 = this.f25625a;
                        str = null;
                        if (g7Var7.w().H(null, y4Var) && (abstractSafeParcelable2 instanceof zzbe)) {
                            try {
                                d5Var.F1(((zzbe) abstractSafeParcelable2).y3(), zzrVar2);
                            } catch (RemoteException e15) {
                                this.f25625a.a().o().b("Failed to send default event parameters to the service", e15);
                            }
                        } else {
                            g7Var7.a().o().a("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i12++;
                    zzrVar3 = zzrVar2;
                    str2 = str;
                    g7Var = g7Var;
                }
                str = null;
                i12++;
                zzrVar3 = zzrVar2;
                str2 = str;
                g7Var = g7Var;
            }
            i10++;
        }
    }

    public final void c0(zzbg zzbgVar, String str) {
        n9.m.l(zzbgVar);
        h();
        j();
        R();
        T(new ac(this, true, V(true), this.f25625a.E().p(zzbgVar), zzbgVar, str));
    }

    public final void d0(zzah zzahVar) {
        n9.m.l(zzahVar);
        h();
        j();
        this.f25625a.c();
        T(new bc(this, true, V(true), this.f25625a.E().r(zzahVar), new zzah(zzahVar), zzahVar));
    }

    public final void e0(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        j();
        T(new cc(this, atomicReference, null, str2, str3, V(false)));
    }

    public final void f0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2) {
        h();
        j();
        T(new dc(this, str, str2, V(false), x1Var));
    }

    public final void g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        h();
        j();
        T(new ec(this, atomicReference, null, str2, str3, V(false), z10));
    }

    public final void h0(com.google.android.gms.internal.measurement.x1 x1Var, String str, String str2, boolean z10) {
        h();
        j();
        T(new kb(this, str, str2, V(false), z10, x1Var));
    }

    public final void i0(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        j();
        final zzr zzrVarV = V(false);
        T(new Runnable() { // from class: nb.pc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25861a.G(atomicReference, zzrVarV, bundle);
            }
        });
    }

    public final void j0(final AtomicReference atomicReference, final zzoo zzooVar) {
        h();
        j();
        final zzr zzrVarV = V(false);
        T(new Runnable() { // from class: nb.qc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25914a.H(atomicReference, zzrVarV, zzooVar);
            }
        });
    }

    public final void k0(final zzaf zzafVar) {
        h();
        j();
        final zzr zzrVarV = V(true);
        n9.m.l(zzrVarV);
        T(new Runnable() { // from class: nb.rc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f25932a.I(zzrVarV, zzafVar);
            }
        });
    }

    public final zzao l0() {
        h();
        j();
        d5 d5Var = this.f25988d;
        if (d5Var == null) {
            w();
            this.f25625a.a().v().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr zzrVarV = V(false);
        n9.m.l(zzrVarV);
        try {
            zzao zzaoVarD1 = d5Var.D1(zzrVarV);
            J();
            return zzaoVarD1;
        } catch (RemoteException e10) {
            this.f25625a.a().o().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(zzpl zzplVar) {
        h();
        j();
        R();
        T(new nb(this, V(true), this.f25625a.E().q(zzplVar), zzplVar));
    }

    public final void p() {
        h();
        j();
        zzr zzrVarV = V(false);
        R();
        this.f25625a.E().o();
        T(new ob(this, zzrVarV));
    }

    public final void q(AtomicReference atomicReference) {
        h();
        j();
        T(new pb(this, atomicReference, V(false)));
    }

    public final void r(com.google.android.gms.internal.measurement.x1 x1Var) {
        h();
        j();
        T(new qb(this, V(false), x1Var));
    }

    public final void s() {
        h();
        j();
        zzr zzrVarV = V(true);
        R();
        this.f25625a.w().H(null, z4.f26156c1);
        this.f25625a.E().u();
        T(new rb(this, zzrVarV, true));
    }

    public final void t() {
        h();
        j();
        T(new sb(this, V(true)));
    }

    public final void u(bb bbVar) {
        h();
        j();
        T(new ub(this, bbVar));
    }

    public final void v(Bundle bundle) {
        h();
        j();
        zzbe zzbeVar = new zzbe(bundle);
        R();
        T(new vb(this, true, V(false), this.f25625a.w().H(null, z4.f26156c1) && this.f25625a.E().s(zzbeVar), zzbeVar, bundle));
    }

    public final void w() {
        h();
        j();
        if (W()) {
            return;
        }
        if (y()) {
            this.f25987c.c();
            return;
        }
        g7 g7Var = this.f25625a;
        if (g7Var.w().m()) {
            return;
        }
        g7Var.c();
        List<ResolveInfo> listQueryIntentServices = g7Var.d().getPackageManager().queryIntentServices(new Intent().setClassName(g7Var.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            g7Var.a().o().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextD = g7Var.d();
        g7Var.c();
        intent.setComponent(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f25987c.a(intent);
    }

    public final Boolean x() {
        return this.f25989e;
    }

    public final boolean y() {
        h();
        j();
        if (this.f25989e == null) {
            h();
            j();
            g7 g7Var = this.f25625a;
            k6 k6VarX = g7Var.x();
            k6VarX.h();
            boolean z10 = false;
            Boolean boolValueOf = !k6VarX.p().contains("use_service") ? null : Boolean.valueOf(k6VarX.p().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                g7Var.c();
                if (this.f25625a.L().v() == 1) {
                    z10 = true;
                } else {
                    g7Var.a().w().a("Checking service availability");
                    int iX = g7Var.C().X(12451000);
                    if (iX == 0) {
                        g7Var.a().w().a("Service available");
                    } else if (iX == 1) {
                        g7Var.a().w().a("Service missing");
                    } else if (iX != 2) {
                        if (iX == 3) {
                            g7Var.a().r().a("Service disabled");
                        } else if (iX == 9) {
                            g7Var.a().r().a("Service invalid");
                        } else if (iX != 18) {
                            g7Var.a().r().b("Unexpected service status", Integer.valueOf(iX));
                        } else {
                            g7Var.a().r().a("Service updating");
                        }
                        z11 = false;
                    } else {
                        g7Var.a().v().a("Service container out of date");
                        if (g7Var.C().W() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && g7Var.w().m()) {
                    g7Var.a().o().a("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    k6 k6VarX2 = g7Var.x();
                    k6VarX2.h();
                    SharedPreferences.Editor editorEdit = k6VarX2.p().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f25989e = Boolean.valueOf(z11);
        }
        return this.f25989e.booleanValue();
    }

    public final void z(d5 d5Var) {
        h();
        n9.m.l(d5Var);
        this.f25988d = d5Var;
        J();
        L();
    }
}
