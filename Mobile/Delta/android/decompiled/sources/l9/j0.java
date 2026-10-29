package l9;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
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
public final class j0 implements k9.f.a, k9.f.b {
    public final k9.a.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f23035d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f1 f23039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23040i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f23044r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f23033a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f23036e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f23037f = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f23041o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ConnectionResult f23042p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23043q = 0;

    public j0(f fVar, k9.e eVar) {
        this.f23044r = fVar;
        k9.a.f fVarL = eVar.L(fVar.f23017s.getLooper(), this);
        this.b = fVarL;
        this.f23034c = eVar.u();
        this.f23035d = new z();
        this.f23038g = eVar.K();
        if (fVarL.requiresSignIn()) {
            this.f23039h = eVar.M(fVar.f23008e, fVar.f23017s);
        } else {
            this.f23039h = null;
        }
    }

    public static /* bridge */ /* synthetic */ void A(j0 j0Var, l0 l0Var) {
        Feature[] featureArrG;
        if (j0Var.f23041o.remove(l0Var)) {
            j0Var.f23044r.f23017s.removeMessages(15, l0Var);
            j0Var.f23044r.f23017s.removeMessages(16, l0Var);
            Feature feature = l0Var.b;
            ArrayList arrayList = new ArrayList(j0Var.f23033a.size());
            for (o1 o1Var : j0Var.f23033a) {
                if ((o1Var instanceof r0) && (featureArrG = ((r0) o1Var).g(j0Var)) != null && u9.b.b(featureArrG, feature)) {
                    arrayList.add(o1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o1 o1Var2 = (o1) arrayList.get(i10);
                j0Var.f23033a.remove(o1Var2);
                o1Var2.b(new k9.p(feature));
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(j0 j0Var, l0 l0Var) {
        if (j0Var.f23041o.contains(l0Var) && !j0Var.f23040i) {
            if (j0Var.b.isConnected()) {
                j0Var.g();
            } else {
                j0Var.C();
            }
        }
    }

    public final void B() {
        n9.m.d(this.f23044r.f23017s);
        this.f23042p = null;
    }

    public final void C() {
        n9.m.d(this.f23044r.f23017s);
        if (this.b.isConnected() || this.b.isConnecting()) {
            return;
        }
        try {
            f fVar = this.f23044r;
            int iB = fVar.f23010g.b(fVar.f23008e, this.b);
            if (iB == 0) {
                f fVar2 = this.f23044r;
                k9.a.f fVar3 = this.b;
                n0 n0Var = new n0(fVar2, fVar3, this.f23034c);
                if (fVar3.requiresSignIn()) {
                    ((f1) n9.m.l(this.f23039h)).u2(n0Var);
                }
                try {
                    this.b.connect(n0Var);
                    return;
                } catch (SecurityException e10) {
                    F(new ConnectionResult(10), e10);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
            F(connectionResult, null);
        } catch (IllegalStateException e11) {
            F(new ConnectionResult(10), e11);
        }
    }

    public final void D(o1 o1Var) {
        n9.m.d(this.f23044r.f23017s);
        if (this.b.isConnected()) {
            if (m(o1Var)) {
                j();
                return;
            } else {
                this.f23033a.add(o1Var);
                return;
            }
        }
        this.f23033a.add(o1Var);
        ConnectionResult connectionResult = this.f23042p;
        if (connectionResult == null || !connectionResult.z3()) {
            C();
        } else {
            F(this.f23042p, null);
        }
    }

    public final void E() {
        this.f23043q++;
    }

    public final void F(@NonNull ConnectionResult connectionResult, Exception exc) {
        n9.m.d(this.f23044r.f23017s);
        f1 f1Var = this.f23039h;
        if (f1Var != null) {
            f1Var.v2();
        }
        B();
        this.f23044r.f23010g.c();
        d(connectionResult);
        if ((this.b instanceof p9.e) && connectionResult.w3() != 24) {
            this.f23044r.b = true;
            f fVar = this.f23044r;
            fVar.f23017s.sendMessageDelayed(fVar.f23017s.obtainMessage(19), 300000L);
        }
        if (connectionResult.w3() == 4) {
            e(f.f23002v);
            return;
        }
        if (this.f23033a.isEmpty()) {
            this.f23042p = connectionResult;
            return;
        }
        if (exc != null) {
            n9.m.d(this.f23044r.f23017s);
            f(null, exc, false);
            return;
        }
        if (!this.f23044r.f23018t) {
            e(f.g(this.f23034c, connectionResult));
            return;
        }
        f(f.g(this.f23034c, connectionResult), null, true);
        if (this.f23033a.isEmpty() || n(connectionResult) || this.f23044r.f(connectionResult, this.f23038g)) {
            return;
        }
        if (connectionResult.w3() == 18) {
            this.f23040i = true;
        }
        if (!this.f23040i) {
            e(f.g(this.f23034c, connectionResult));
            return;
        }
        f fVar2 = this.f23044r;
        fVar2.f23017s.sendMessageDelayed(Message.obtain(fVar2.f23017s, 9, this.f23034c), 5000L);
    }

    public final void G(@NonNull ConnectionResult connectionResult) {
        n9.m.d(this.f23044r.f23017s);
        k9.a.f fVar = this.b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        F(connectionResult, null);
    }

    public final void H(p1 p1Var) {
        n9.m.d(this.f23044r.f23017s);
        this.f23036e.add(p1Var);
    }

    public final void I() {
        n9.m.d(this.f23044r.f23017s);
        if (this.f23040i) {
            C();
        }
    }

    public final void J() {
        n9.m.d(this.f23044r.f23017s);
        e(f.f23001u);
        this.f23035d.f();
        for (k.a aVar : (k.a[]) this.f23037f.keySet().toArray(new k.a[0])) {
            D(new n1(aVar, new sb.k()));
        }
        d(new ConnectionResult(4));
        if (this.b.isConnected()) {
            this.b.onUserSignOut(new i0(this));
        }
    }

    public final void K() {
        n9.m.d(this.f23044r.f23017s);
        if (this.f23040i) {
            l();
            f fVar = this.f23044r;
            e(fVar.f23009f.g(fVar.f23008e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
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
    public final Feature c(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            w1.a aVar = new w1.a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                aVar.put(feature.getName(), Long.valueOf(feature.w3()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) aVar.get(feature2.getName());
                if (l10 == null || l10.longValue() < feature2.w3()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void d(ConnectionResult connectionResult) {
        Iterator it = this.f23036e.iterator();
        while (it.hasNext()) {
            ((p1) it.next()).c(this.f23034c, connectionResult, n9.k.b(connectionResult, ConnectionResult.f5688k) ? this.b.getEndpointPackageName() : null);
        }
        this.f23036e.clear();
    }

    public final void e(Status status) {
        n9.m.d(this.f23044r.f23017s);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z10) {
        n9.m.d(this.f23044r.f23017s);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f23033a.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            if (!z10 || o1Var.f23063a == 2) {
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
        ArrayList arrayList = new ArrayList(this.f23033a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o1 o1Var = (o1) arrayList.get(i10);
            if (!this.b.isConnected()) {
                return;
            }
            if (m(o1Var)) {
                this.f23033a.remove(o1Var);
            }
        }
    }

    public final void h() {
        B();
        d(ConnectionResult.f5688k);
        l();
        Iterator it = this.f23037f.values().iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (c(w0Var.f23099a.c()) != null) {
                it.remove();
            } else {
                try {
                    w0Var.f23099a.d(this.b, new sb.k<>());
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
        this.f23040i = true;
        this.f23035d.e(i10, this.b.getLastDisconnectMessage());
        b bVar = this.f23034c;
        f fVar = this.f23044r;
        fVar.f23017s.sendMessageDelayed(Message.obtain(fVar.f23017s, 9, bVar), 5000L);
        b bVar2 = this.f23034c;
        f fVar2 = this.f23044r;
        fVar2.f23017s.sendMessageDelayed(Message.obtain(fVar2.f23017s, 11, bVar2), 120000L);
        this.f23044r.f23010g.c();
        Iterator it = this.f23037f.values().iterator();
        while (it.hasNext()) {
            ((w0) it.next()).f23100c.run();
        }
    }

    public final void j() {
        this.f23044r.f23017s.removeMessages(12, this.f23034c);
        b bVar = this.f23034c;
        f fVar = this.f23044r;
        fVar.f23017s.sendMessageDelayed(fVar.f23017s.obtainMessage(12, bVar), this.f23044r.f23005a);
    }

    public final void k(o1 o1Var) {
        o1Var.d(this.f23035d, a());
        try {
            o1Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void l() {
        if (this.f23040i) {
            f fVar = this.f23044r;
            fVar.f23017s.removeMessages(11, this.f23034c);
            f fVar2 = this.f23044r;
            fVar2.f23017s.removeMessages(9, this.f23034c);
            this.f23040i = false;
        }
    }

    public final boolean m(o1 o1Var) {
        if (!(o1Var instanceof r0)) {
            k(o1Var);
            return true;
        }
        r0 r0Var = (r0) o1Var;
        Feature featureC = c(r0Var.g(this));
        if (featureC == null) {
            k(o1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + featureC.getName() + ", " + featureC.w3() + ").");
        if (!this.f23044r.f23018t || !r0Var.f(this)) {
            r0Var.b(new k9.p(featureC));
            return true;
        }
        l0 l0Var = new l0(this.f23034c, featureC, null);
        int iIndexOf = this.f23041o.indexOf(l0Var);
        if (iIndexOf >= 0) {
            l0 l0Var2 = (l0) this.f23041o.get(iIndexOf);
            this.f23044r.f23017s.removeMessages(15, l0Var2);
            f fVar = this.f23044r;
            fVar.f23017s.sendMessageDelayed(Message.obtain(fVar.f23017s, 15, l0Var2), 5000L);
            return false;
        }
        this.f23041o.add(l0Var);
        f fVar2 = this.f23044r;
        fVar2.f23017s.sendMessageDelayed(Message.obtain(fVar2.f23017s, 15, l0Var), 5000L);
        f fVar3 = this.f23044r;
        fVar3.f23017s.sendMessageDelayed(Message.obtain(fVar3.f23017s, 16, l0Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (n(connectionResult)) {
            return false;
        }
        this.f23044r.f(connectionResult, this.f23038g);
        return false;
    }

    public final boolean n(@NonNull ConnectionResult connectionResult) {
        synchronized (f.f23003w) {
            try {
                f fVar = this.f23044r;
                if (fVar.f23014p == null || !fVar.f23015q.contains(this.f23034c)) {
                    return false;
                }
                this.f23044r.f23014p.s(connectionResult, this.f23038g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean o(boolean z10) {
        n9.m.d(this.f23044r.f23017s);
        if (!this.b.isConnected() || !this.f23037f.isEmpty()) {
            return false;
        }
        if (!this.f23035d.g()) {
            this.b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        j();
        return false;
    }

    @Override // l9.e
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f23044r.f23017s.getLooper()) {
            h();
        } else {
            this.f23044r.f23017s.post(new f0(this));
        }
    }

    @Override // l9.n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        F(connectionResult, null);
    }

    @Override // l9.e
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f23044r.f23017s.getLooper()) {
            i(i10);
        } else {
            this.f23044r.f23017s.post(new g0(this, i10));
        }
    }

    public final int p() {
        return this.f23038g;
    }

    public final int q() {
        return this.f23043q;
    }

    public final ConnectionResult r() {
        n9.m.d(this.f23044r.f23017s);
        return this.f23042p;
    }

    public final k9.a.f t() {
        return this.b;
    }

    public final Map v() {
        return this.f23037f;
    }
}
