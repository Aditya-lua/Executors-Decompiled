package p306nb;

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
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
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
import okhttp3.internal.p336ws.RealWebSocket;
import p305n9.C8953m;
import p445t9.C11555a;

/* JADX INFO: renamed from: nb.tc */
/* JADX INFO: loaded from: classes.dex */
public final class C9307tc extends AbstractC9008b5 {

    /* JADX INFO: renamed from: c */
    public final ServiceConnectionC9211nc f33508c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9042d5 f33509d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f33510e;

    /* JADX INFO: renamed from: f */
    public final AbstractC9342w f33511f;

    /* JADX INFO: renamed from: g */
    public ScheduledExecutorService f33512g;

    /* JADX INFO: renamed from: h */
    public final C9244pd f33513h;

    /* JADX INFO: renamed from: i */
    public final List f33514i;

    /* JADX INFO: renamed from: j */
    public final AbstractC9342w f33515j;

    public C9307tc(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33514i = new ArrayList();
        this.f33513h = new C9244pd(c9094g7.mo36325e());
        this.f33508c = new ServiceConnectionC9211nc(this);
        this.f33511f = new C9306tb(this, c9094g7);
        this.f33515j = new C9370xb(this, c9094g7);
    }

    /* JADX DEBUG: Method merged with bridge method: J()V */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m36869J() {
        mo36088h();
        this.f33513h.m36628a();
        this.f33067a.m36338w();
        this.f33511f.m36990b(((Long) C9395z4.f33755Z.m37079b(null)).longValue());
    }

    /* JADX INFO: renamed from: A */
    public final void m36860A() {
        mo36088h();
        m36121j();
        ServiceConnectionC9211nc serviceConnectionC9211nc = this.f33508c;
        serviceConnectionC9211nc.m36595b();
        try {
            C11555a.m43201b().m43206c(this.f33067a.mo36324d(), serviceConnectionC9211nc);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f33509d = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m36861B(InterfaceC2383x1 interfaceC2383x1, zzbg zzbgVar, String str) {
        mo36088h();
        m36121j();
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36308C().m36954X(12451000) == 0) {
            m36878T(new RunnableC9354wb(this, zzbgVar, str, interfaceC2383x1));
        } else {
            c9094g7.mo36321a().m37006r().m36911a("Not bundling data. Service unavailable or out of date");
            c9094g7.m36308C().m36960d0(interfaceC2383x1, new byte[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m36862C() {
        mo36088h();
        m36121j();
        return !m36907y() || this.f33067a.m36308C().m36953W() >= ((Integer) C9395z4.f33726K0.m37079b(null)).intValue();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m36863D() {
        mo36088h();
        m36121j();
        return !m36907y() || this.f33067a.m36308C().m36953W() >= 241200;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m36864E() {
        InterfaceC9042d5 interfaceC9042d5 = this.f33509d;
        if (interfaceC9042d5 == null) {
            this.f33067a.mo36321a().m37003o().m36911a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzr zzrVarM36880V = m36880V(false);
            C8953m.m36047l(zzrVarM36880V);
            interfaceC9042d5.mo36095P(zzrVarM36880V);
            m36869J();
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to send storage consent settings to the service", e10);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m36865F() {
        InterfaceC9042d5 interfaceC9042d5 = this.f33509d;
        if (interfaceC9042d5 == null) {
            this.f33067a.mo36321a().m37003o().m36911a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzr zzrVarM36880V = m36880V(false);
            C8953m.m36047l(zzrVarM36880V);
            interfaceC9042d5.mo36102c0(zzrVarM36880V);
            m36869J();
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to send Dma consent settings to the service", e10);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m36866G(AtomicReference atomicReference, zzr zzrVar, Bundle bundle) {
        synchronized (atomicReference) {
            try {
                InterfaceC9042d5 interfaceC9042d5 = this.f33509d;
                if (interfaceC9042d5 == null) {
                    this.f33067a.mo36321a().m37003o().m36911a("Failed to request trigger URIs; not connected to service");
                    return;
                }
                C8953m.m36047l(zzrVar);
                interfaceC9042d5.mo36105g1(zzrVar, bundle, new BinderC9178lb(this, atomicReference));
                m36869J();
            } catch (RemoteException e10) {
                this.f33067a.mo36321a().m37003o().m36912b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m36867H(AtomicReference atomicReference, zzr zzrVar, zzoo zzooVar) {
        synchronized (atomicReference) {
            try {
                InterfaceC9042d5 interfaceC9042d5 = this.f33509d;
                if (interfaceC9042d5 == null) {
                    this.f33067a.mo36321a().m37003o().m36911a("[sgtm] Failed to get upload batches; not connected to service");
                    return;
                }
                C8953m.m36047l(zzrVar);
                interfaceC9042d5.mo36092H(zzrVar, zzooVar, new BinderC9194mb(this, atomicReference));
                m36869J();
            } catch (RemoteException e10) {
                this.f33067a.mo36321a().m37003o().m36912b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m36868I(zzr zzrVar, zzaf zzafVar) {
        InterfaceC9042d5 interfaceC9042d5 = this.f33509d;
        if (interfaceC9042d5 == null) {
            this.f33067a.mo36321a().m37003o().m36911a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC9042d5.mo36110u1(zzrVar, zzafVar);
            m36869J();
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37003o().m36913c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.f9486f), e10);
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m36870K(ComponentName componentName) {
        mo36088h();
        if (this.f33509d != null) {
            this.f33509d = null;
            this.f33067a.mo36321a().m37011w().m36912b("Disconnected from device MeasurementService", componentName);
            mo36088h();
            m36905w();
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ ServiceConnectionC9211nc m36872M() {
        return this.f33508c;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC9042d5 m36873N() {
        return this.f33509d;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m36874O(InterfaceC9042d5 interfaceC9042d5) {
        this.f33509d = null;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ ScheduledExecutorService m36875P() {
        return this.f33512g;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m36876Q(ScheduledExecutorService scheduledExecutorService) {
        this.f33512g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m36877R() {
        this.f33067a.mo36323c();
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final void m36878T(Runnable runnable) {
        mo36088h();
        if (m36881W()) {
            runnable.run();
            return;
        }
        List list = this.f33514i;
        long size = list.size();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.m36338w();
        if (size >= 1000) {
            c9094g7.mo36321a().m37003o().m36911a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f33515j.m36990b(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        m36905w();
    }

    /* JADX DEBUG: Method merged with bridge method: L()V */
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void m36871L() {
        mo36088h();
        C9316u5 c9316u5M37011w = this.f33067a.mo36321a().m37011w();
        List list = this.f33514i;
        c9316u5M37011w.m36912b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f33067a.mo36321a().m37003o().m36912b("Task exception while flushing queue", e10);
            }
        }
        this.f33514i.clear();
        this.f33515j.m36992d();
    }

    /* JADX INFO: renamed from: V */
    public final zzr m36880V(boolean z10) {
        Pair pairM36350b;
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36323c();
        C9156k5 c9156k5M36317L = this.f33067a.m36317L();
        String string = null;
        if (z10) {
            C9094g7 c9094g8 = c9094g7.mo36321a().f33067a;
            if (c9094g8.m36339x().f33117e != null && (pairM36350b = c9094g8.m36339x().f33117e.m36350b()) != null && pairM36350b != C9157k6.f33114A) {
                String strValueOf = String.valueOf(pairM36350b.second);
                String str = (String) pairM36350b.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return c9156k5M36317L.m36430o(string);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m36881W() {
        mo36088h();
        m36121j();
        return this.f33509d != null;
    }

    /* JADX INFO: renamed from: X */
    public final void m36882X() {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9386yb(this, m36880V(true)));
    }

    /* JADX INFO: renamed from: Y */
    public final void m36883Y(boolean z10) {
        mo36088h();
        m36121j();
        if (m36862C()) {
            m36878T(new RunnableC9402zb(this, m36880V(false)));
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m36884Z(boolean z10) {
        mo36088h();
        m36121j();
        m36878T(new Runnable() { // from class: nb.sc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33466a.m36864E();
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final void m36885a0() {
        mo36088h();
        m36121j();
        m36878T(new Runnable() { // from class: nb.oc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33310a.m36865F();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fe  */
    /* JADX INFO: renamed from: b0 */
    public final void m36886b0(InterfaceC9042d5 interfaceC9042d5, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) {
        zzr zzrVar2;
        String str;
        long jMo44176b;
        long j10;
        mo36088h();
        m36121j();
        m36877R();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.m36338w();
        zzr zzrVar3 = zzrVar;
        int size = 100;
        int i10 = 0;
        for (int i11 = 100; i10 < 1001 && size == i11; i11 = 100) {
            C9094g7 c9094g8 = this.f33067a;
            ArrayList arrayList = new ArrayList();
            List listM36587t = c9094g8.m36310E().m36587t(i11);
            if (listM36587t != null) {
                arrayList.addAll(listM36587t);
                size = listM36587t.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != 0 && size < i11) {
                arrayList.add(new C9188m5(abstractSafeParcelable, zzrVar3.f9537h, zzrVar3.f9544o));
            }
            String str2 = null;
            boolean zM36406H = c9094g7.m36338w().m36406H(null, C9395z4.f33736P0);
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                C9188m5 c9188m5 = (C9188m5) arrayList.get(i12);
                AbstractSafeParcelable abstractSafeParcelable2 = c9188m5.f33200a;
                C9150k c9150kM36338w = c9094g7.m36338w();
                C9379y4 c9379y4 = C9395z4.f33765c1;
                if (c9150kM36338w.m36406H(str2, c9379y4)) {
                    String str3 = c9188m5.f33201b;
                    if (TextUtils.isEmpty(str3)) {
                        zzrVar2 = zzrVar3;
                    } else {
                        zzrVar2 = new zzr(zzrVar3.f9535f, zzrVar3.f9536g, str3, c9188m5.f33202c, zzrVar3.f9538i, zzrVar3.f9539j, zzrVar3.f9540k, zzrVar3.f9541l, zzrVar3.f9542m, zzrVar3.f9543n, zzrVar3.f9545p, zzrVar3.f9546q, zzrVar3.f9547r, zzrVar3.f9548s, zzrVar3.f9549t, zzrVar3.f9550u, zzrVar3.f9551v, zzrVar3.f9552w, zzrVar3.f9553x, zzrVar3.f9554y, zzrVar3.f9555z, zzrVar3.f9525A, zzrVar3.f9526B, zzrVar3.f9527C, zzrVar3.f9528D, zzrVar3.f9529E, zzrVar3.f9530F, zzrVar3.f9531G, zzrVar3.f9532H, zzrVar3.f9533I, zzrVar3.f9534J);
                    }
                } else {
                    zzrVar2 = zzrVar3;
                }
                if (abstractSafeParcelable2 instanceof zzbg) {
                    if (zM36406H) {
                        try {
                            C9094g7 c9094g9 = this.f33067a;
                            long jMo44175a = c9094g9.mo36325e().mo44175a();
                            try {
                                j10 = jMo44175a;
                                jMo44176b = c9094g9.mo36325e().mo44176b();
                            } catch (RemoteException e10) {
                                e = e10;
                                j10 = jMo44175a;
                                jMo44176b = 0;
                                this.f33067a.mo36321a().m37003o().m36912b("Failed to send event to the service", e);
                                if (zM36406H && j10 != 0) {
                                    C9094g7 c9094g10 = this.f33067a;
                                    C9284s5.m36768a(c9094g10).m36769b(36301, 13, j10, c9094g10.mo36325e().mo44175a(), (int) (c9094g10.mo36325e().mo44176b() - jMo44176b));
                                }
                                str = null;
                                i12++;
                                zzrVar3 = zzrVar2;
                                str2 = str;
                                c9094g7 = c9094g7;
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            jMo44176b = 0;
                            j10 = 0;
                        }
                    } else {
                        jMo44176b = 0;
                        j10 = 0;
                    }
                    try {
                        interfaceC9042d5.mo36097V((zzbg) abstractSafeParcelable2, zzrVar2);
                        if (zM36406H) {
                            c9094g7.mo36321a().m37011w().m36911a("Logging telemetry for logEvent from database");
                            C9094g7 c9094g11 = this.f33067a;
                            C9284s5.m36768a(c9094g11).m36769b(36301, 0, j10, c9094g11.mo36325e().mo44175a(), (int) (c9094g11.mo36325e().mo44176b() - jMo44176b));
                        }
                    } catch (RemoteException e12) {
                        e = e12;
                        this.f33067a.mo36321a().m37003o().m36912b("Failed to send event to the service", e);
                        if (zM36406H) {
                            C9094g7 c9094g12 = this.f33067a;
                            C9284s5.m36768a(c9094g12).m36769b(36301, 13, j10, c9094g12.mo36325e().mo44175a(), (int) (c9094g12.mo36325e().mo44176b() - jMo44176b));
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof zzpl) {
                    try {
                        interfaceC9042d5.mo36106j0((zzpl) abstractSafeParcelable2, zzrVar2);
                    } catch (RemoteException e13) {
                        this.f33067a.mo36321a().m37003o().m36912b("Failed to send user property to the service", e13);
                    }
                } else {
                    if (abstractSafeParcelable2 instanceof zzah) {
                        try {
                            interfaceC9042d5.mo36109q((zzah) abstractSafeParcelable2, zzrVar2);
                        } catch (RemoteException e14) {
                            this.f33067a.mo36321a().m37003o().m36912b("Failed to send conditional user property to the service", e14);
                        }
                    } else {
                        C9094g7 c9094g13 = this.f33067a;
                        str = null;
                        if (c9094g13.m36338w().m36406H(null, c9379y4) && (abstractSafeParcelable2 instanceof zzbe)) {
                            try {
                                interfaceC9042d5.mo36091E1(((zzbe) abstractSafeParcelable2).m11882y3(), zzrVar2);
                            } catch (RemoteException e15) {
                                this.f33067a.mo36321a().m37003o().m36912b("Failed to send default event parameters to the service", e15);
                            }
                        } else {
                            c9094g13.mo36321a().m37003o().m36911a("Discarding data. Unrecognized parcel type.");
                        }
                    }
                    i12++;
                    zzrVar3 = zzrVar2;
                    str2 = str;
                    c9094g7 = c9094g7;
                }
                str = null;
                i12++;
                zzrVar3 = zzrVar2;
                str2 = str;
                c9094g7 = c9094g7;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m36887c0(zzbg zzbgVar, String str) {
        C8953m.m36047l(zzbgVar);
        mo36088h();
        m36121j();
        m36877R();
        m36878T(new RunnableC8998ac(this, true, m36880V(true), this.f33067a.m36310E().m36583p(zzbgVar), zzbgVar, str));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m36888d0(zzah zzahVar) {
        C8953m.m36047l(zzahVar);
        mo36088h();
        m36121j();
        this.f33067a.mo36323c();
        m36878T(new RunnableC9015bc(this, true, m36880V(true), this.f33067a.m36310E().m36585r(zzahVar), new zzah(zzahVar), zzahVar));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m36889e0(AtomicReference atomicReference, String str, String str2, String str3) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9032cc(this, atomicReference, null, str2, str3, m36880V(false)));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m36890f0(InterfaceC2383x1 interfaceC2383x1, String str, String str2) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9049dc(this, str, str2, m36880V(false), interfaceC2383x1));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m36891g0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9066ec(this, atomicReference, null, str2, str3, m36880V(false), z10));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m36892h0(InterfaceC2383x1 interfaceC2383x1, String str, String str2, boolean z10) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9162kb(this, str, str2, m36880V(false), z10, interfaceC2383x1));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m36893i0(final AtomicReference atomicReference, final Bundle bundle) {
        mo36088h();
        m36121j();
        final zzr zzrVarM36880V = m36880V(false);
        m36878T(new Runnable() { // from class: nb.pc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33355a.m36866G(atomicReference, zzrVarM36880V, bundle);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m36894j0(final AtomicReference atomicReference, final zzoo zzooVar) {
        mo36088h();
        m36121j();
        final zzr zzrVarM36880V = m36880V(false);
        m36878T(new Runnable() { // from class: nb.qc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33416a.m36867H(atomicReference, zzrVarM36880V, zzooVar);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m36895k0(final zzaf zzafVar) {
        mo36088h();
        m36121j();
        final zzr zzrVarM36880V = m36880V(true);
        C8953m.m36047l(zzrVarM36880V);
        m36878T(new Runnable() { // from class: nb.rc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33441a.m36868I(zzrVarM36880V, zzafVar);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final zzao m36896l0() {
        mo36088h();
        m36121j();
        InterfaceC9042d5 interfaceC9042d5 = this.f33509d;
        if (interfaceC9042d5 == null) {
            m36905w();
            this.f33067a.mo36321a().m37010v().m36911a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzr zzrVarM36880V = m36880V(false);
        C8953m.m36047l(zzrVarM36880V);
        try {
            zzao zzaoVarMo36090C1 = interfaceC9042d5.mo36090C1(zzrVarM36880V);
            m36869J();
            return zzaoVarMo36090C1;
        } catch (RemoteException e10) {
            this.f33067a.mo36321a().m37003o().m36912b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m36897o(zzpl zzplVar) {
        mo36088h();
        m36121j();
        m36877R();
        m36878T(new RunnableC9210nb(this, m36880V(true), this.f33067a.m36310E().m36584q(zzplVar), zzplVar));
    }

    /* JADX INFO: renamed from: p */
    public final void m36898p() {
        mo36088h();
        m36121j();
        zzr zzrVarM36880V = m36880V(false);
        m36877R();
        this.f33067a.m36310E().m36582o();
        m36878T(new RunnableC9226ob(this, zzrVarM36880V));
    }

    /* JADX INFO: renamed from: q */
    public final void m36899q(AtomicReference atomicReference) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9242pb(this, atomicReference, m36880V(false)));
    }

    /* JADX INFO: renamed from: r */
    public final void m36900r(InterfaceC2383x1 interfaceC2383x1) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9258qb(this, m36880V(false), interfaceC2383x1));
    }

    /* JADX INFO: renamed from: s */
    public final void m36901s() {
        mo36088h();
        m36121j();
        zzr zzrVarM36880V = m36880V(true);
        m36877R();
        this.f33067a.m36338w().m36406H(null, C9395z4.f33765c1);
        this.f33067a.m36310E().m36588u();
        m36878T(new RunnableC9274rb(this, zzrVarM36880V, true));
    }

    /* JADX INFO: renamed from: t */
    public final void m36902t() {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9290sb(this, m36880V(true)));
    }

    /* JADX INFO: renamed from: u */
    public final void m36903u(C9014bb c9014bb) {
        mo36088h();
        m36121j();
        m36878T(new RunnableC9322ub(this, c9014bb));
    }

    /* JADX INFO: renamed from: v */
    public final void m36904v(Bundle bundle) {
        mo36088h();
        m36121j();
        zzbe zzbeVar = new zzbe(bundle);
        m36877R();
        m36878T(new RunnableC9338vb(this, true, m36880V(false), this.f33067a.m36338w().m36406H(null, C9395z4.f33765c1) && this.f33067a.m36310E().m36586s(zzbeVar), zzbeVar, bundle));
    }

    /* JADX INFO: renamed from: w */
    public final void m36905w() {
        mo36088h();
        m36121j();
        if (m36881W()) {
            return;
        }
        if (m36907y()) {
            this.f33508c.m36596c();
            return;
        }
        C9094g7 c9094g7 = this.f33067a;
        if (c9094g7.m36338w().m36421m()) {
            return;
        }
        c9094g7.mo36323c();
        List<ResolveInfo> listQueryIntentServices = c9094g7.mo36324d().getPackageManager().queryIntentServices(new Intent().setClassName(c9094g7.mo36324d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            c9094g7.mo36321a().m37003o().m36911a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextMo36324d = c9094g7.mo36324d();
        c9094g7.mo36323c();
        intent.setComponent(new ComponentName(contextMo36324d, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f33508c.m36594a(intent);
    }

    /* JADX INFO: renamed from: x */
    public final Boolean m36906x() {
        return this.f33510e;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m36907y() {
        mo36088h();
        m36121j();
        if (this.f33510e == null) {
            mo36088h();
            m36121j();
            C9094g7 c9094g7 = this.f33067a;
            C9157k6 c9157k6M36339x = c9094g7.m36339x();
            c9157k6M36339x.mo36088h();
            boolean z10 = false;
            Boolean boolValueOf = !c9157k6M36339x.m36443p().contains("use_service") ? null : Boolean.valueOf(c9157k6M36339x.m36443p().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                c9094g7.mo36323c();
                if (this.f33067a.m36317L().m36437v() == 1) {
                    z10 = true;
                } else {
                    c9094g7.mo36321a().m37011w().m36911a("Checking service availability");
                    int iM36954X = c9094g7.m36308C().m36954X(12451000);
                    if (iM36954X == 0) {
                        c9094g7.mo36321a().m37011w().m36911a("Service available");
                    } else if (iM36954X == 1) {
                        c9094g7.mo36321a().m37011w().m36911a("Service missing");
                    } else if (iM36954X != 2) {
                        if (iM36954X == 3) {
                            c9094g7.mo36321a().m37006r().m36911a("Service disabled");
                        } else if (iM36954X == 9) {
                            c9094g7.mo36321a().m37006r().m36911a("Service invalid");
                        } else if (iM36954X != 18) {
                            c9094g7.mo36321a().m37006r().m36912b("Unexpected service status", Integer.valueOf(iM36954X));
                        } else {
                            c9094g7.mo36321a().m37006r().m36911a("Service updating");
                        }
                        z11 = false;
                    } else {
                        c9094g7.mo36321a().m37010v().m36911a("Service container out of date");
                        if (c9094g7.m36308C().m36953W() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && c9094g7.m36338w().m36421m()) {
                    c9094g7.mo36321a().m37003o().m36911a("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    C9157k6 c9157k6M36339x2 = c9094g7.m36339x();
                    c9157k6M36339x2.mo36088h();
                    SharedPreferences.Editor editorEdit = c9157k6M36339x2.m36443p().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f33510e = Boolean.valueOf(z11);
        }
        return this.f33510e.booleanValue();
    }

    /* JADX INFO: renamed from: z */
    public final void m36908z(InterfaceC9042d5 interfaceC9042d5) {
        mo36088h();
        C8953m.m36047l(interfaceC9042d5);
        this.f33509d = interfaceC9042d5;
        m36869J();
        m36871L();
    }
}
