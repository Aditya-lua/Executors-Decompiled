package p306nb;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C1979b;
import com.google.android.gms.internal.measurement.C2019d1;
import com.google.android.gms.internal.measurement.C2020d2;
import com.google.android.gms.internal.measurement.C2303sb;
import com.google.android.gms.internal.measurement.C2352v6;
import com.google.android.gms.internal.measurement.C2406y6;
import com.google.android.gms.internal.measurement.C2424z6;
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
import p213j9.C7099h;
import p213j9.C7101i;
import p305n9.C8953m;
import p462u9.C11825p;

/* JADX INFO: renamed from: nb.i8 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC9127i8 extends AbstractBinderC9025c5 {

    /* JADX INFO: renamed from: a */
    public final C9197me f33033a;

    /* JADX INFO: renamed from: b */
    public Boolean f33034b;

    /* JADX INFO: renamed from: c */
    public String f33035c;

    public BinderC9127i8(C9197me c9197me, String str) {
        C8953m.m36047l(c9197me);
        this.f33033a = c9197me;
        this.f33035c = null;
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: A0 */
    public final String mo36089A0(zzr zzrVar) {
        m36354B2(zzrVar, false);
        return this.f33033a.m36561p0(zzrVar);
    }

    /* JADX INFO: renamed from: A2 */
    public final void m36353A2(zzbg zzbgVar, zzr zzrVar) {
        C9197me c9197me = this.f33033a;
        c9197me.m36505E();
        c9197me.m36550k(zzbgVar, zzrVar);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m36354B2(zzr zzrVar, boolean z10) {
        C8953m.m36047l(zzrVar);
        String str = zzrVar.f9535f;
        C8953m.m36041f(str);
        m36355C2(str, false);
        this.f33033a.m36521N0().m36967o(zzrVar.f9536g);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: C1 */
    public final zzao mo36090C1(zzr zzrVar) {
        m36354B2(zzrVar, false);
        C8953m.m36041f(zzrVar.f9535f);
        try {
            return (zzao) this.f33033a.mo36322b().m36262s(new CallableC9318u7(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f33033a.mo36321a().m37003o().m36913c("Failed to get consent. appId", C9348w5.m36998x(zzrVar.f9535f), e10);
            return new zzao(null);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final void m36355C2(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            this.f33033a.mo36321a().m37003o().m36911a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f33034b == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f33035c)) {
                        C9197me c9197me = this.f33033a;
                        if (!C11825p.m44208a(c9197me.mo36324d(), Binder.getCallingUid()) && !C7101i.m29899a(c9197me.mo36324d()).m29903c(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.f33034b = Boolean.valueOf(z11);
                }
                if (this.f33034b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f33033a.mo36321a().m37003o().m36912b("Measurement Service called with invalid calling package. appId", C9348w5.m36998x(str));
                throw e10;
            }
        }
        if (this.f33035c == null && C7099h.m29895j(this.f33033a.mo36324d(), Binder.getCallingUid(), str)) {
            this.f33035c = str;
        }
        if (str.equals(this.f33035c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final void m36356D2(zzbg zzbgVar, zzr zzrVar) {
        C9197me c9197me = this.f33033a;
        C9365x6 c9365x6M36504D0 = c9197me.m36504D0();
        String str = zzrVar.f9535f;
        C2019d1 c2019d1 = TextUtils.isEmpty(str) ? null : (C2019d1) c9365x6M36504D0.f33641j.m45612d(str);
        if (c2019d1 == null) {
            this.f33033a.mo36321a().m37011w().m36912b("EES not loaded for", zzrVar.f9535f);
            m36353A2(zzbgVar, zzrVar);
            return;
        }
        try {
            Map mapM36763Z = c9197me.m36515K0().m36763Z(zzbgVar.f9503g.m11882y3(), true);
            String str2 = zzbgVar.f9502f;
            String strM36726a = C9271r8.m36726a(str2);
            if (strM36726a != null) {
                str2 = strM36726a;
            }
            if (c2019d1.m9901b(new C1979b(str2, zzbgVar.f9505i, mapM36763Z))) {
                if (c2019d1.m9902c()) {
                    C9197me c9197me2 = this.f33033a;
                    c9197me2.mo36321a().m37011w().m36912b("EES edited event", zzbgVar.f9502f);
                    m36353A2(c9197me2.m36515K0().m36764m(c2019d1.m9904e().m9834c()), zzrVar);
                } else {
                    m36353A2(zzbgVar, zzrVar);
                }
                if (c2019d1.m9903d()) {
                    for (C1979b c1979b : c2019d1.m9904e().m9837f()) {
                        C9197me c9197me3 = this.f33033a;
                        c9197me3.mo36321a().m37011w().m36912b("EES logging created event", c1979b.m9768b());
                        m36353A2(c9197me3.m36515K0().m36764m(c1979b), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (C2020d2 unused) {
            this.f33033a.mo36321a().m37003o().m36913c("EES error. appId, eventName", zzrVar.f9536g, zzbgVar.f9502f);
        }
        this.f33033a.mo36321a().m37011w().m36912b("EES was not applied to event", zzbgVar.f9502f);
        m36353A2(zzbgVar, zzrVar);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: E1 */
    public final void mo36091E1(final Bundle bundle, final zzr zzrVar) {
        m36354B2(zzrVar, false);
        final String str = zzrVar.f9535f;
        C8953m.m36047l(str);
        m36358F2(new Runnable() { // from class: nb.g8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32976a.m36365y2(bundle, str, zzrVar);
            }
        });
    }

    /* JADX INFO: renamed from: E2 */
    public final zzbg m36357E2(zzbg zzbgVar, zzr zzrVar) {
        zzbe zzbeVar;
        if ("_cmp".equals(zzbgVar.f9502f) && (zzbeVar = zzbgVar.f9503g) != null && zzbeVar.zze() != 0) {
            String strM11881x3 = zzbeVar.m11881x3("_cis");
            if ("referrer broadcast".equals(strM11881x3) || "referrer API".equals(strM11881x3)) {
                this.f33033a.mo36321a().m37009u().m36912b("Event has been filtered ", zzbgVar.toString());
                return new zzbg("_cmpx", zzbeVar, zzbgVar.f9504h, zzbgVar.f9505i);
            }
        }
        return zzbgVar;
    }

    /* JADX INFO: renamed from: F2 */
    public final void m36358F2(Runnable runnable) {
        C8953m.m36047l(runnable);
        C9197me c9197me = this.f33033a;
        if (c9197me.mo36322b().m36259p()) {
            runnable.run();
        } else {
            c9197me.mo36322b().m36263t(runnable);
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: G0 */
    public final List mo36277G0(zzr zzrVar, boolean z10) {
        m36354B2(zzrVar, false);
        String str = zzrVar.f9535f;
        C8953m.m36047l(str);
        try {
            List<C9309te> list = (List) this.f33033a.mo36322b().m36261r(new CallableC9110h7(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C9309te c9309te : list) {
                if (z10 || !C9341ve.m36926N(c9309te.f33519c)) {
                    arrayList.add(new zzpl(c9309te));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f33033a.mo36321a().m37003o().m36913c("Failed to get user properties. appId", C9348w5.m36998x(zzrVar.f9535f), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f33033a.mo36321a().m37003o().m36913c("Failed to get user properties. appId", C9348w5.m36998x(zzrVar.f9535f), e);
            return null;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: H */
    public final void mo36092H(zzr zzrVar, final zzoo zzooVar, final InterfaceC9140j5 interfaceC9140j5) {
        m36354B2(zzrVar, false);
        final String str = (String) C8953m.m36047l(zzrVar.f9535f);
        this.f33033a.mo36322b().m36263t(new Runnable() { // from class: nb.d8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32842a.m36363w2(str, zzooVar, interfaceC9140j5);
            }
        });
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: K */
    public final List mo36093K(String str, String str2, String str3) {
        m36355C2(str, true);
        try {
            return (List) this.f33033a.mo36322b().m36261r(new CallableC9254q7(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f33033a.mo36321a().m37003o().m36912b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: K1 */
    public final void mo36094K1(zzr zzrVar) {
        m36354B2(zzrVar, false);
        m36358F2(new RunnableC9126i7(this, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: P */
    public final void mo36095P(final zzr zzrVar) {
        C8953m.m36041f(zzrVar.f9535f);
        C8953m.m36047l(zzrVar.f9553x);
        m36359s2(new Runnable() { // from class: nb.h8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33007a.m36360t2(zzrVar);
            }
        });
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: Q0 */
    public final void mo36278Q0(zzbg zzbgVar, String str, String str2) {
        C8953m.m36047l(zzbgVar);
        C8953m.m36041f(str);
        m36355C2(str, true);
        m36358F2(new RunnableC9350w7(this, zzbgVar, str));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: S */
    public final List mo36279S(zzr zzrVar, Bundle bundle) {
        m36354B2(zzrVar, false);
        C8953m.m36047l(zzrVar.f9535f);
        C9197me c9197me = this.f33033a;
        if (!c9197me.m36500B0().m36406H(null, C9395z4.f33756Z0)) {
            try {
                return (List) this.f33033a.mo36322b().m36261r(new CallableC8994a8(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f33033a.mo36321a().m37003o().m36913c("Failed to get trigger URIs. appId", C9348w5.m36998x(zzrVar.f9535f), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) c9197me.mo36322b().m36262s(new CallableC9398z7(this, zzrVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f33033a.mo36321a().m37003o().m36913c("Failed to get trigger URIs. appId", C9348w5.m36998x(zzrVar.f9535f), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: S1 */
    public final void mo36096S1(zzr zzrVar) {
        m36354B2(zzrVar, false);
        m36358F2(new RunnableC9142j7(this, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: V */
    public final void mo36097V(zzbg zzbgVar, zzr zzrVar) {
        C8953m.m36047l(zzbgVar);
        m36354B2(zzrVar, false);
        m36358F2(new RunnableC9334v7(this, zzbgVar, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: V0 */
    public final void mo36098V0(long j10, String str, String str2, String str3) {
        m36358F2(new RunnableC9158k7(this, str2, str3, str, j10));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: W */
    public final void mo36099W(zzr zzrVar) {
        m36354B2(zzrVar, false);
        m36358F2(new RunnableC9270r7(this, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: W0 */
    public final void mo36100W0(zzr zzrVar) {
        String str = zzrVar.f9535f;
        C8953m.m36041f(str);
        m36355C2(str, false);
        m36358F2(new RunnableC9286s7(this, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: Y1 */
    public final List mo36101Y1(String str, String str2, boolean z10, zzr zzrVar) {
        m36354B2(zzrVar, false);
        String str3 = zzrVar.f9535f;
        C8953m.m36047l(str3);
        try {
            List<C9309te> list = (List) this.f33033a.mo36322b().m36261r(new CallableC9206n7(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C9309te c9309te : list) {
                if (z10 || !C9341ve.m36926N(c9309te.f33519c)) {
                    arrayList.add(new zzpl(c9309te));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f33033a.mo36321a().m37003o().m36913c("Failed to query user properties. appId", C9348w5.m36998x(zzrVar.f9535f), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f33033a.mo36321a().m37003o().m36913c("Failed to query user properties. appId", C9348w5.m36998x(zzrVar.f9535f), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: c0 */
    public final void mo36102c0(final zzr zzrVar) {
        C8953m.m36041f(zzrVar.f9535f);
        C8953m.m36047l(zzrVar.f9553x);
        m36359s2(new Runnable() { // from class: nb.b8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32720a.m36361u2(zzrVar);
            }
        });
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: e0 */
    public final byte[] mo36103e0(zzbg zzbgVar, String str) {
        C8953m.m36041f(str);
        C8953m.m36047l(zzbgVar);
        m36355C2(str, true);
        C9197me c9197me = this.f33033a;
        C9316u5 c9316u5M37010v = c9197me.mo36321a().m37010v();
        C9236p5 c9236p5M36519M0 = c9197me.m36519M0();
        String str2 = zzbgVar.f9502f;
        c9316u5M37010v.m36912b("Log and bundle. event", c9236p5M36519M0.m36620a(str2));
        long jNanoTime = c9197me.mo36325e().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c9197me.mo36322b().m36262s(new CallableC9366x7(this, zzbgVar, str)).get();
            if (bArr == null) {
                c9197me.mo36321a().m37003o().m36912b("Log and bundle returned null. appId", C9348w5.m36998x(str));
                bArr = new byte[0];
            }
            c9197me.mo36321a().m37010v().m36914d("Log and bundle processed. event, size, time_ms", c9197me.m36519M0().m36620a(str2), Integer.valueOf(bArr.length), Long.valueOf((c9197me.mo36325e().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            C9197me c9197me2 = this.f33033a;
            c9197me2.mo36321a().m37003o().m36914d("Failed to log and bundle. appId, event, error", C9348w5.m36998x(str), c9197me2.m36519M0().m36620a(zzbgVar.f9502f), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            C9197me c9197me3 = this.f33033a;
            c9197me3.mo36321a().m37003o().m36914d("Failed to log and bundle. appId, event, error", C9348w5.m36998x(str), c9197me3.m36519M0().m36620a(zzbgVar.f9502f), e);
            return null;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: e2 */
    public final List mo36104e2(String str, String str2, zzr zzrVar) {
        m36354B2(zzrVar, false);
        String str3 = zzrVar.f9535f;
        C8953m.m36047l(str3);
        try {
            return (List) this.f33033a.mo36322b().m36261r(new CallableC9238p7(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f33033a.mo36321a().m37003o().m36912b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: f0 */
    public final void mo36280f0(zzah zzahVar) {
        C8953m.m36047l(zzahVar);
        C8953m.m36047l(zzahVar.f9491h);
        C8953m.m36041f(zzahVar.f9489f);
        m36355C2(zzahVar.f9489f, true);
        m36358F2(new RunnableC9190m7(this, new zzah(zzahVar)));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: g1 */
    public final void mo36105g1(final zzr zzrVar, final Bundle bundle, final InterfaceC9092g5 interfaceC9092g5) {
        m36354B2(zzrVar, false);
        final String str = (String) C8953m.m36047l(zzrVar.f9535f);
        this.f33033a.mo36322b().m36263t(new Runnable() { // from class: nb.c8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32805a.m36362v2(zzrVar, bundle, interfaceC9092g5, str);
            }
        });
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: j0 */
    public final void mo36106j0(zzpl zzplVar, zzr zzrVar) {
        C8953m.m36047l(zzplVar);
        m36354B2(zzrVar, false);
        m36358F2(new RunnableC9382y7(this, zzplVar, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: o */
    public final List mo36107o(String str, String str2, String str3, boolean z10) {
        m36355C2(str, true);
        try {
            List<C9309te> list = (List) this.f33033a.mo36322b().m36261r(new CallableC9222o7(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C9309te c9309te : list) {
                if (z10 || !C9341ve.m36926N(c9309te.f33519c)) {
                    arrayList.add(new zzpl(c9309te));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f33033a.mo36321a().m37003o().m36913c("Failed to get user properties as. appId", C9348w5.m36998x(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f33033a.mo36321a().m37003o().m36913c("Failed to get user properties as. appId", C9348w5.m36998x(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: p2 */
    public final void mo36108p2(zzr zzrVar) {
        C8953m.m36041f(zzrVar.f9535f);
        C8953m.m36047l(zzrVar.f9553x);
        m36359s2(new RunnableC9302t7(this, zzrVar));
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: q */
    public final void mo36109q(zzah zzahVar, zzr zzrVar) {
        C8953m.m36047l(zzahVar);
        C8953m.m36047l(zzahVar.f9491h);
        m36354B2(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f9489f = zzrVar.f9535f;
        m36358F2(new RunnableC9174l7(this, zzahVar2, zzrVar));
    }

    /* JADX INFO: renamed from: s2 */
    public final void m36359s2(Runnable runnable) {
        C8953m.m36047l(runnable);
        C9197me c9197me = this.f33033a;
        if (c9197me.mo36322b().m36259p()) {
            runnable.run();
        } else {
            c9197me.mo36322b().m36265v(runnable);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m36360t2(zzr zzrVar) {
        C9197me c9197me = this.f33033a;
        c9197me.m36505E();
        c9197me.m36525P0(zzrVar);
    }

    @Override // p306nb.InterfaceC9042d5
    /* JADX INFO: renamed from: u1 */
    public final void mo36110u1(final zzr zzrVar, final zzaf zzafVar) {
        m36354B2(zzrVar, false);
        m36358F2(new Runnable() { // from class: nb.f8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32917a.m36364x2(zzrVar, zzafVar);
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m36361u2(zzr zzrVar) {
        C9197me c9197me = this.f33033a;
        c9197me.m36505E();
        c9197me.m36526Q0(zzrVar);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m36362v2(zzr zzrVar, Bundle bundle, InterfaceC9092g5 interfaceC9092g5, String str) {
        C9197me c9197me = this.f33033a;
        c9197me.m36505E();
        try {
            interfaceC9092g5.mo36288x0(c9197me.m36563q0(zzrVar, bundle));
        } catch (RemoteException e10) {
            this.f33033a.mo36321a().m37003o().m36913c("Failed to return trigger URIs for app", str, e10);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m36363w2(String str, zzoo zzooVar, InterfaceC9140j5 interfaceC9140j5) {
        C9197me c9197me = this.f33033a;
        c9197me.m36505E();
        c9197me.mo36322b().mo36088h();
        c9197me.m36523O0();
        List<C9245pe> listM36836o = c9197me.m36507F0().m36836o(str, zzooVar, ((Integer) C9395z4.f33707B.m37079b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (C9245pe c9245pe : listM36836o) {
            if (c9197me.m36568t(str, c9245pe.m36635e())) {
                int iM36639i = c9245pe.m36639i();
                if (iM36639i > 0) {
                    if (iM36639i <= ((Integer) C9395z4.f33819z.m37079b(null)).intValue()) {
                        if (c9197me.mo36325e().mo44175a() >= c9245pe.m36638h() + Math.min(((Long) C9395z4.f33815x.m37079b(null)).longValue() * (1 << (iM36639i - 1)), ((Long) C9395z4.f33817y.m37079b(null)).longValue())) {
                        }
                    }
                    c9197me.mo36321a().m37011w().m36914d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(c9245pe.m36633c()), Long.valueOf(c9245pe.m36638h()));
                }
                zzom zzomVarM36632b = c9245pe.m36632b();
                try {
                    C2352v6 c2352v6 = (C2352v6) C9277re.m36737W(C2406y6.m10998O(), zzomVarM36632b.f9510g);
                    for (int i10 = 0; i10 < c2352v6.m10849z(); i10++) {
                        C2424z6 c2424z6 = (C2424z6) c2352v6.m10840A(i10).m10075q();
                        c2424z6.m11134n1(c9197me.mo36325e().mo44175a());
                        c2352v6.m10841C(i10, c2424z6);
                    }
                    zzomVarM36632b.f9510g = ((C2406y6) c2352v6.m9882t()).m10628d();
                    if (Log.isLoggable(c9197me.mo36321a().m37013z(), 2)) {
                        zzomVarM36632b.f9515l = c9197me.m36515K0().m36754K((C2406y6) c2352v6.m9882t());
                    }
                    arrayList.add(zzomVarM36632b);
                } catch (C2303sb unused) {
                    c9197me.mo36321a().m37006r().m36912b("Failed to parse queued batch. appId", str);
                }
            } else {
                c9197me.mo36321a().m37011w().m36914d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(c9245pe.m36633c()), c9245pe.m36635e());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            interfaceC9140j5.mo36344M1(zzoqVar);
            this.f33033a.mo36321a().m37011w().m36913c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.f9517f.size()));
        } catch (RemoteException e10) {
            this.f33033a.mo36321a().m37003o().m36913c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m36364x2(zzr zzrVar, zzaf zzafVar) {
        C9197me c9197me = this.f33033a;
        c9197me.m36505E();
        c9197me.m36565r0((String) C8953m.m36047l(zzrVar.f9535f), zzafVar);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m36365y2(Bundle bundle, String str, zzr zzrVar) {
        C9197me c9197me = this.f33033a;
        boolean zM36406H = c9197me.m36500B0().m36406H(null, C9395z4.f33750W0);
        if (bundle.isEmpty() && zM36406H) {
            C9294t c9294tM36507F0 = this.f33033a.m36507F0();
            c9294tM36507F0.mo36088h();
            c9294tM36507F0.m37067j();
            try {
                c9294tM36507F0.m36848u0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c9294tM36507F0.f33067a.mo36321a().m37003o().m36912b("Error clearing default event params", e10);
                return;
            }
        }
        C9294t c9294tM36507F1 = c9197me.m36507F0();
        c9294tM36507F1.mo36088h();
        c9294tM36507F1.m37067j();
        byte[] bArrM10628d = c9294tM36507F1.f33516b.m36515K0().m36753J(new C8986a0(c9294tM36507F1.f33067a, "", str, "dep", 0L, 0L, bundle)).m10628d();
        C9094g7 c9094g7 = c9294tM36507F1.f33067a;
        c9094g7.mo36321a().m37011w().m36913c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrM10628d.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrM10628d);
        try {
            if (c9294tM36507F1.m36848u0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c9094g7.mo36321a().m37003o().m36912b("Failed to insert default event parameters (got -1). appId", C9348w5.m36998x(str));
            }
        } catch (SQLiteException e11) {
            c9294tM36507F1.f33067a.mo36321a().m37003o().m36913c("Error storing default event parameters. appId", C9348w5.m36998x(str), e11);
        }
        C9197me c9197me2 = this.f33033a;
        C9294t c9294tM36507F2 = c9197me2.m36507F0();
        long j10 = zzrVar.f9533I;
        if (c9294tM36507F2.m36804H(str, j10)) {
            c9197me2.m36507F0().m36806I(str, Long.valueOf(j10), null, bundle);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ C9197me m36366z2() {
        return this.f33033a;
    }
}
