package m9;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements l9.h.a, l9.h.b {
    public final l9.a.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f23020d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1 f23024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23025i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f23029r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f23018a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f23021e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f23022f = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f23026o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k9.b f23027p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23028q = 0;

    public j0(f fVar, l9.g gVar) {
        this.f23029r = fVar;
        l9.a.f fVarL = gVar.L(fVar.f23002s.getLooper(), this);
        this.b = fVarL;
        this.f23019c = gVar.v();
        this.f23020d = new z();
        this.f23023g = gVar.K();
        if (fVarL.requiresSignIn()) {
            this.f23024h = gVar.M(fVar.f22993e, fVar.f23002s);
        } else {
            this.f23024h = null;
        }
    }

    public static /* bridge */ /* synthetic */ void A(j0 j0Var, l0 l0Var) {
        k9.d[] dVarArrG;
        if (j0Var.f23026o.remove(l0Var)) {
            j0Var.f23029r.f23002s.removeMessages(15, l0Var);
            j0Var.f23029r.f23002s.removeMessages(16, l0Var);
            k9.d dVar = l0Var.b;
            ArrayList arrayList = new ArrayList(j0Var.f23018a.size());
            for (o1 o1Var : j0Var.f23018a) {
                if ((o1Var instanceof r0) && (dVarArrG = ((r0) o1Var).g(j0Var)) != null && v9.b.b(dVarArrG, dVar)) {
                    arrayList.add(o1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o1 o1Var2 = (o1) arrayList.get(i10);
                j0Var.f23018a.remove(o1Var2);
                o1Var2.b(new l9.r(dVar));
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(j0 j0Var, l0 l0Var) {
        if (j0Var.f23026o.contains(l0Var) && !j0Var.f23025i) {
            if (j0Var.b.isConnected()) {
                j0Var.g();
            } else {
                j0Var.C();
            }
        }
    }

    public final void B() {
        o9.s.d(this.f23029r.f23002s);
        this.f23027p = null;
    }

    public final void C() {
        o9.s.d(this.f23029r.f23002s);
        if (this.b.isConnected() || this.b.isConnecting()) {
            return;
        }
        try {
            f fVar = this.f23029r;
            int iB = fVar.f22995g.b(fVar.f22993e, this.b);
            if (iB == 0) {
                f fVar2 = this.f23029r;
                l9.a.f fVar3 = this.b;
                n0 n0Var = new n0(fVar2, fVar3, this.f23019c);
                if (fVar3.requiresSignIn()) {
                    ((f1) o9.s.l(this.f23024h)).u2(n0Var);
                }
                try {
                    this.b.connect(n0Var);
                    return;
                } catch (SecurityException e10) {
                    F(new k9.b(10), e10);
                    return;
                }
            }
            k9.b bVar = new k9.b(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + bVar.toString());
            F(bVar, null);
        } catch (IllegalStateException e11) {
            F(new k9.b(10), e11);
        }
    }

    public final void D(o1 o1Var) {
        o9.s.d(this.f23029r.f23002s);
        if (this.b.isConnected()) {
            if (m(o1Var)) {
                j();
                return;
            } else {
                this.f23018a.add(o1Var);
                return;
            }
        }
        this.f23018a.add(o1Var);
        k9.b bVar = this.f23027p;
        if (bVar == null || !bVar.E3()) {
            C();
        } else {
            F(this.f23027p, null);
        }
    }

    public final void E() {
        this.f23028q++;
    }

    public final void F(@NonNull k9.b bVar, Exception exc) {
        o9.s.d(this.f23029r.f23002s);
        f1 f1Var = this.f23024h;
        if (f1Var != null) {
            f1Var.v2();
        }
        B();
        this.f23029r.f22995g.c();
        d(bVar);
        if ((this.b instanceof q9.e) && bVar.B3() != 24) {
            this.f23029r.b = true;
            f fVar = this.f23029r;
            fVar.f23002s.sendMessageDelayed(fVar.f23002s.obtainMessage(19), 300000L);
        }
        if (bVar.B3() == 4) {
            e(f.f22987v);
            return;
        }
        if (this.f23018a.isEmpty()) {
            this.f23027p = bVar;
            return;
        }
        if (exc != null) {
            o9.s.d(this.f23029r.f23002s);
            f(null, exc, false);
            return;
        }
        if (!this.f23029r.f23003t) {
            e(f.g(this.f23019c, bVar));
            return;
        }
        f(f.g(this.f23019c, bVar), null, true);
        if (this.f23018a.isEmpty() || n(bVar) || this.f23029r.f(bVar, this.f23023g)) {
            return;
        }
        if (bVar.B3() == 18) {
            this.f23025i = true;
        }
        if (!this.f23025i) {
            e(f.g(this.f23019c, bVar));
            return;
        }
        f fVar2 = this.f23029r;
        fVar2.f23002s.sendMessageDelayed(Message.obtain(fVar2.f23002s, 9, this.f23019c), 5000L);
    }

    public final void G(@NonNull k9.b bVar) {
        o9.s.d(this.f23029r.f23002s);
        l9.a.f fVar = this.b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        F(bVar, null);
    }

    public final void H(p1 p1Var) {
        o9.s.d(this.f23029r.f23002s);
        this.f23021e.add(p1Var);
    }

    public final void I() {
        o9.s.d(this.f23029r.f23002s);
        if (this.f23025i) {
            C();
        }
    }

    public final void J() {
        o9.s.d(this.f23029r.f23002s);
        e(f.f22986u);
        this.f23020d.f();
        for (k.a aVar : (k.a[]) this.f23022f.keySet().toArray(new k.a[0])) {
            D(new n1(aVar, new tb.k()));
        }
        d(new k9.b(4));
        if (this.b.isConnected()) {
            this.b.onUserSignOut(new i0(this));
        }
    }

    public final void K() {
        o9.s.d(this.f23029r.f23002s);
        if (this.f23025i) {
            l();
            f fVar = this.f23029r;
            e(fVar.f22994f.g(fVar.f22993e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean N() {
        return this.b.isConnected();
    }

    public final boolean a() {
        return this.b.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k9.d c(k9.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            k9.d[] availableFeatures = this.b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new k9.d[0];
            }
            w1.a aVar = new w1.a(availableFeatures.length);
            for (k9.d dVar : availableFeatures) {
                aVar.put(dVar.getName(), Long.valueOf(dVar.B3()));
            }
            for (k9.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.getName());
                if (l10 == null || l10.longValue() < dVar2.B3()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void d(k9.b bVar) {
        Iterator it = this.f23021e.iterator();
        while (it.hasNext()) {
            ((p1) it.next()).c(this.f23019c, bVar, o9.q.b(bVar, k9.b.f21215k) ? this.b.getEndpointPackageName() : null);
        }
        this.f23021e.clear();
    }

    public final void e(Status status) {
        o9.s.d(this.f23029r.f23002s);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z10) {
        o9.s.d(this.f23029r.f23002s);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f23018a.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            if (!z10 || o1Var.f23048a == 2) {
                if (status != null) {
                    o1Var.a(status);
                } else {
                    o1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList(this.f23018a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o1 o1Var = (o1) arrayList.get(i10);
            if (!this.b.isConnected()) {
                return;
            }
            if (m(o1Var)) {
                this.f23018a.remove(o1Var);
            }
        }
    }

    public final void h() {
        B();
        d(k9.b.f21215k);
        l();
        Iterator it = this.f23022f.values().iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (c(w0Var.f23084a.c()) != null) {
                it.remove();
            } else {
                try {
                    w0Var.f23084a.d(this.b, new tb.k<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        j();
    }

    public final void i(int i10) {
        B();
        this.f23025i = true;
        this.f23020d.e(i10, this.b.getLastDisconnectMessage());
        b bVar = this.f23019c;
        f fVar = this.f23029r;
        fVar.f23002s.sendMessageDelayed(Message.obtain(fVar.f23002s, 9, bVar), 5000L);
        b bVar2 = this.f23019c;
        f fVar2 = this.f23029r;
        fVar2.f23002s.sendMessageDelayed(Message.obtain(fVar2.f23002s, 11, bVar2), 120000L);
        this.f23029r.f22995g.c();
        Iterator it = this.f23022f.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).f23085c.run();
        }
    }

    public final void j() {
        this.f23029r.f23002s.removeMessages(12, this.f23019c);
        b bVar = this.f23019c;
        f fVar = this.f23029r;
        fVar.f23002s.sendMessageDelayed(fVar.f23002s.obtainMessage(12, bVar), this.f23029r.f22990a);
    }

    public final void k(o1 o1Var) {
        o1Var.d(this.f23020d, a());
        try {
            o1Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void l() {
        if (this.f23025i) {
            f fVar = this.f23029r;
            fVar.f23002s.removeMessages(11, this.f23019c);
            f fVar2 = this.f23029r;
            fVar2.f23002s.removeMessages(9, this.f23019c);
            this.f23025i = false;
        }
    }

    public final boolean m(o1 o1Var) {
        if (!(o1Var instanceof r0)) {
            k(o1Var);
            return true;
        }
        r0 r0Var = (r0) o1Var;
        k9.d dVarC = c(r0Var.g(this));
        if (dVarC == null) {
            k(o1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + dVarC.getName() + ", " + dVarC.B3() + ").");
        if (!this.f23029r.f23003t || !r0Var.f(this)) {
            r0Var.b(new l9.r(dVarC));
            return true;
        }
        l0 l0Var = new l0(this.f23019c, dVarC, null);
        int iIndexOf = this.f23026o.indexOf(l0Var);
        if (iIndexOf >= 0) {
            l0 l0Var2 = (l0) this.f23026o.get(iIndexOf);
            this.f23029r.f23002s.removeMessages(15, l0Var2);
            f fVar = this.f23029r;
            fVar.f23002s.sendMessageDelayed(Message.obtain(fVar.f23002s, 15, l0Var2), 5000L);
            return false;
        }
        this.f23026o.add(l0Var);
        f fVar2 = this.f23029r;
        fVar2.f23002s.sendMessageDelayed(Message.obtain(fVar2.f23002s, 15, l0Var), 5000L);
        f fVar3 = this.f23029r;
        fVar3.f23002s.sendMessageDelayed(Message.obtain(fVar3.f23002s, 16, l0Var), 120000L);
        k9.b bVar = new k9.b(2, null);
        if (n(bVar)) {
            return false;
        }
        this.f23029r.f(bVar, this.f23023g);
        return false;
    }

    public final boolean n(@NonNull k9.b bVar) {
        synchronized (f.f22988w) {
            try {
                f fVar = this.f23029r;
                if (fVar.f22999p == null || !fVar.f23000q.contains(this.f23019c)) {
                    return false;
                }
                this.f23029r.f22999p.s(bVar, this.f23023g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean o(boolean z10) {
        o9.s.d(this.f23029r.f23002s);
        if (!this.b.isConnected() || !this.f23022f.isEmpty()) {
            return false;
        }
        if (!this.f23020d.g()) {
            this.b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    @Override // m9.e
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f23029r.f23002s.getLooper()) {
            h();
        } else {
            this.f23029r.f23002s.post(new f0(this));
        }
    }

    @Override // m9.n
    public final void onConnectionFailed(@NonNull k9.b bVar) {
        F(bVar, null);
    }

    @Override // m9.e
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f23029r.f23002s.getLooper()) {
            i(i10);
        } else {
            this.f23029r.f23002s.post(new g0(this, i10));
        }
    }

    public final int p() {
        return this.f23023g;
    }

    public final int q() {
        return this.f23028q;
    }

    public final k9.b r() {
        o9.s.d(this.f23029r.f23002s);
        return this.f23027p;
    }

    public final l9.a.f t() {
        return this.b;
    }

    public final Map v() {
        return this.f23022f;
    }
}
