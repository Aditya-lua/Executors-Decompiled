package p268l9;

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
import p242k9.AbstractC7495e;
import p242k9.AbstractC7496f;
import p242k9.C7491a;
import p242k9.C7506p;
import p305n9.C8947k;
import p305n9.C8953m;
import p355p9.C10182e;
import p462u9.C11811b;
import p504w1.C12277a;
import sb.C11264k;

/* JADX INFO: renamed from: l9.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8046j0 implements AbstractC7496f.a, AbstractC7496f.b {

    /* JADX INFO: renamed from: b */
    public final C7491a.f f30027b;

    /* JADX INFO: renamed from: c */
    public final C8021b f30028c;

    /* JADX INFO: renamed from: d */
    public final C8093z f30029d;

    /* JADX INFO: renamed from: g */
    public final int f30032g;

    /* JADX INFO: renamed from: h */
    public final BinderC8035f1 f30033h;

    /* JADX INFO: renamed from: i */
    public boolean f30034i;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C8033f f30038r;

    /* JADX INFO: renamed from: a */
    public final Queue f30026a = new LinkedList();

    /* JADX INFO: renamed from: e */
    public final Set f30030e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Map f30031f = new HashMap();

    /* JADX INFO: renamed from: o */
    public final List f30035o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public ConnectionResult f30036p = null;

    /* JADX INFO: renamed from: q */
    public int f30037q = 0;

    public C8046j0(C8033f c8033f, AbstractC7495e abstractC7495e) {
        this.f30038r = c8033f;
        C7491a.f fVarM31144L = abstractC7495e.m31144L(c8033f.f30007s.getLooper(), this);
        this.f30027b = fVarM31144L;
        this.f30028c = abstractC7495e.mo31148u();
        this.f30029d = new C8093z();
        this.f30032g = abstractC7495e.m31143K();
        if (fVarM31144L.requiresSignIn()) {
            this.f30033h = abstractC7495e.m31145M(c8033f.f29998e, c8033f.f30007s);
        } else {
            this.f30033h = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m33188A(C8046j0 c8046j0, C8052l0 c8052l0) {
        Feature[] featureArrMo33239g;
        if (c8046j0.f30035o.remove(c8052l0)) {
            c8046j0.f30038r.f30007s.removeMessages(15, c8052l0);
            c8046j0.f30038r.f30007s.removeMessages(16, c8052l0);
            Feature feature = c8052l0.f30046b;
            ArrayList arrayList = new ArrayList(c8046j0.f30026a.size());
            for (AbstractC8062o1 abstractC8062o1 : c8046j0.f30026a) {
                if ((abstractC8062o1 instanceof AbstractC8070r0) && (featureArrMo33239g = ((AbstractC8070r0) abstractC8062o1).mo33239g(c8046j0)) != null && C11811b.m44170b(featureArrMo33239g, feature)) {
                    arrayList.add(abstractC8062o1);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC8062o1 abstractC8062o2 = (AbstractC8062o1) arrayList.get(i10);
                c8046j0.f30026a.remove(abstractC8062o2);
                abstractC8062o2.mo33185b(new C7506p(feature));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m33196z(C8046j0 c8046j0, C8052l0 c8052l0) {
        if (c8046j0.f30035o.contains(c8052l0) && !c8046j0.f30034i) {
            if (c8046j0.f30027b.isConnected()) {
                c8046j0.m33214g();
            } else {
                c8046j0.m33198C();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m33197B() {
        C8953m.m36039d(this.f30038r.f30007s);
        this.f30036p = null;
    }

    /* JADX INFO: renamed from: C */
    public final void m33198C() {
        C8953m.m36039d(this.f30038r.f30007s);
        if (this.f30027b.isConnected() || this.f30027b.isConnecting()) {
            return;
        }
        try {
            C8033f c8033f = this.f30038r;
            int iM35976b = c8033f.f30000g.m35976b(c8033f.f29998e, this.f30027b);
            if (iM35976b == 0) {
                C8033f c8033f2 = this.f30038r;
                C7491a.f fVar = this.f30027b;
                C8058n0 c8058n0 = new C8058n0(c8033f2, fVar, this.f30028c);
                if (fVar.requiresSignIn()) {
                    ((BinderC8035f1) C8953m.m36047l(this.f30033h)).m33167u2(c8058n0);
                }
                try {
                    this.f30027b.connect(c8058n0);
                    return;
                } catch (SecurityException e10) {
                    m33201F(new ConnectionResult(10), e10);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iM35976b, null);
            Log.w("GoogleApiManager", "The service for " + this.f30027b.getClass().getName() + " is not available: " + connectionResult.toString());
            m33201F(connectionResult, null);
        } catch (IllegalStateException e11) {
            m33201F(new ConnectionResult(10), e11);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m33199D(AbstractC8062o1 abstractC8062o1) {
        C8953m.m36039d(this.f30038r.f30007s);
        if (this.f30027b.isConnected()) {
            if (m33220m(abstractC8062o1)) {
                m33217j();
                return;
            } else {
                this.f30026a.add(abstractC8062o1);
                return;
            }
        }
        this.f30026a.add(abstractC8062o1);
        ConnectionResult connectionResult = this.f30036p;
        if (connectionResult == null || !connectionResult.m9143z3()) {
            m33198C();
        } else {
            m33201F(this.f30036p, null);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m33200E() {
        this.f30037q++;
    }

    /* JADX INFO: renamed from: F */
    public final void m33201F(@NonNull ConnectionResult connectionResult, Exception exc) {
        C8953m.m36039d(this.f30038r.f30007s);
        BinderC8035f1 binderC8035f1 = this.f30033h;
        if (binderC8035f1 != null) {
            binderC8035f1.m33168v2();
        }
        m33197B();
        this.f30038r.f30000g.m35977c();
        m33211d(connectionResult);
        if ((this.f30027b instanceof C10182e) && connectionResult.m9140w3() != 24) {
            this.f30038r.f29995b = true;
            C8033f c8033f = this.f30038r;
            c8033f.f30007s.sendMessageDelayed(c8033f.f30007s.obtainMessage(19), 300000L);
        }
        if (connectionResult.m9140w3() == 4) {
            m33212e(C8033f.f29991v);
            return;
        }
        if (this.f30026a.isEmpty()) {
            this.f30036p = connectionResult;
            return;
        }
        if (exc != null) {
            C8953m.m36039d(this.f30038r.f30007s);
            m33213f(null, exc, false);
            return;
        }
        if (!this.f30038r.f30008t) {
            m33212e(C8033f.m33134g(this.f30028c, connectionResult));
            return;
        }
        m33213f(C8033f.m33134g(this.f30028c, connectionResult), null, true);
        if (this.f30026a.isEmpty() || m33221n(connectionResult) || this.f30038r.m33154f(connectionResult, this.f30032g)) {
            return;
        }
        if (connectionResult.m9140w3() == 18) {
            this.f30034i = true;
        }
        if (!this.f30034i) {
            m33212e(C8033f.m33134g(this.f30028c, connectionResult));
            return;
        }
        C8033f c8033f2 = this.f30038r;
        c8033f2.f30007s.sendMessageDelayed(Message.obtain(c8033f2.f30007s, 9, this.f30028c), 5000L);
    }

    /* JADX INFO: renamed from: G */
    public final void m33202G(@NonNull ConnectionResult connectionResult) {
        C8953m.m36039d(this.f30038r.f30007s);
        C7491a.f fVar = this.f30027b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        m33201F(connectionResult, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m33203H(C8065p1 c8065p1) {
        C8953m.m36039d(this.f30038r.f30007s);
        this.f30030e.add(c8065p1);
    }

    /* JADX INFO: renamed from: I */
    public final void m33204I() {
        C8953m.m36039d(this.f30038r.f30007s);
        if (this.f30034i) {
            m33198C();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m33205J() {
        C8953m.m36039d(this.f30038r.f30007s);
        m33212e(C8033f.f29990u);
        this.f30029d.m33301f();
        for (C8048k.a aVar : (C8048k.a[]) this.f30031f.keySet().toArray(new C8048k.a[0])) {
            m33199D(new C8059n1(aVar, new C11264k()));
        }
        m33211d(new ConnectionResult(4));
        if (this.f30027b.isConnected()) {
            this.f30027b.onUserSignOut(new C8043i0(this));
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m33206K() {
        C8953m.m36039d(this.f30038r.f30007s);
        if (this.f30034i) {
            m33219l();
            C8033f c8033f = this.f30038r;
            m33212e(c8033f.f29999f.mo29854g(c8033f.f29998e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f30027b.disconnect("Timing out connection while resuming.");
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m33207N() {
        return this.f30027b.isConnected();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m33208a() {
        return this.f30027b.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: b */
    public final boolean m33209b() {
        return m33222o(true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final Feature m33210c(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f30027b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            C12277a c12277a = new C12277a(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                c12277a.put(feature.getName(), Long.valueOf(feature.m9145w3()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) c12277a.get(feature2.getName());
                if (l10 == null || l10.longValue() < feature2.m9145w3()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m33211d(ConnectionResult connectionResult) {
        Iterator it = this.f30030e.iterator();
        while (it.hasNext()) {
            ((C8065p1) it.next()).m33267c(this.f30028c, connectionResult, C8947k.m36026b(connectionResult, ConnectionResult.f7373k) ? this.f30027b.getEndpointPackageName() : null);
        }
        this.f30030e.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m33212e(Status status) {
        C8953m.m36039d(this.f30038r.f30007s);
        m33213f(status, null, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m33213f(Status status, Exception exc, boolean z10) {
        C8953m.m36039d(this.f30038r.f30007s);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f30026a.iterator();
        while (it.hasNext()) {
            AbstractC8062o1 abstractC8062o1 = (AbstractC8062o1) it.next();
            if (!z10 || abstractC8062o1.f30065a == 2) {
                if (status != null) {
                    abstractC8062o1.mo33184a(status);
                } else {
                    abstractC8062o1.mo33185b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m33214g() {
        ArrayList arrayList = new ArrayList(this.f30026a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC8062o1 abstractC8062o1 = (AbstractC8062o1) arrayList.get(i10);
            if (!this.f30027b.isConnected()) {
                return;
            }
            if (m33220m(abstractC8062o1)) {
                this.f30026a.remove(abstractC8062o1);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m33215h() {
        m33197B();
        m33211d(ConnectionResult.f7373k);
        m33219l();
        Iterator it = this.f30031f.values().iterator();
        while (it.hasNext()) {
            C8085w0 c8085w0 = (C8085w0) it.next();
            if (m33210c(c8085w0.f30115a.m33249c()) != null) {
                it.remove();
            } else {
                try {
                    c8085w0.f30115a.mo33250d(this.f30027b, new C11264k<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f30027b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m33214g();
        m33217j();
    }

    /* JADX INFO: renamed from: i */
    public final void m33216i(int i10) {
        m33197B();
        this.f30034i = true;
        this.f30029d.m33300e(i10, this.f30027b.getLastDisconnectMessage());
        C8021b c8021b = this.f30028c;
        C8033f c8033f = this.f30038r;
        c8033f.f30007s.sendMessageDelayed(Message.obtain(c8033f.f30007s, 9, c8021b), 5000L);
        C8021b c8021b2 = this.f30028c;
        C8033f c8033f2 = this.f30038r;
        c8033f2.f30007s.sendMessageDelayed(Message.obtain(c8033f2.f30007s, 11, c8021b2), 120000L);
        this.f30038r.f30000g.m35977c();
        Iterator it = this.f30031f.values().iterator();
        while (it.hasNext()) {
            ((C8085w0) it.next()).f30117c.run();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m33217j() {
        this.f30038r.f30007s.removeMessages(12, this.f30028c);
        C8021b c8021b = this.f30028c;
        C8033f c8033f = this.f30038r;
        c8033f.f30007s.sendMessageDelayed(c8033f.f30007s.obtainMessage(12, c8021b), this.f30038r.f29994a);
    }

    /* JADX INFO: renamed from: k */
    public final void m33218k(AbstractC8062o1 abstractC8062o1) {
        abstractC8062o1.mo33232d(this.f30029d, m33208a());
        try {
            abstractC8062o1.mo33186c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f30027b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m33219l() {
        if (this.f30034i) {
            C8033f c8033f = this.f30038r;
            c8033f.f30007s.removeMessages(11, this.f30028c);
            C8033f c8033f2 = this.f30038r;
            c8033f2.f30007s.removeMessages(9, this.f30028c);
            this.f30034i = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m33220m(AbstractC8062o1 abstractC8062o1) {
        if (!(abstractC8062o1 instanceof AbstractC8070r0)) {
            m33218k(abstractC8062o1);
            return true;
        }
        AbstractC8070r0 abstractC8070r0 = (AbstractC8070r0) abstractC8062o1;
        Feature featureM33210c = m33210c(abstractC8070r0.mo33239g(this));
        if (featureM33210c == null) {
            m33218k(abstractC8062o1);
            return true;
        }
        Log.w("GoogleApiManager", this.f30027b.getClass().getName() + " could not execute call because it requires feature (" + featureM33210c.getName() + ", " + featureM33210c.m9145w3() + ").");
        if (!this.f30038r.f30008t || !abstractC8070r0.mo33238f(this)) {
            abstractC8070r0.mo33185b(new C7506p(featureM33210c));
            return true;
        }
        C8052l0 c8052l0 = new C8052l0(this.f30028c, featureM33210c, null);
        int iIndexOf = this.f30035o.indexOf(c8052l0);
        if (iIndexOf >= 0) {
            C8052l0 c8052l1 = (C8052l0) this.f30035o.get(iIndexOf);
            this.f30038r.f30007s.removeMessages(15, c8052l1);
            C8033f c8033f = this.f30038r;
            c8033f.f30007s.sendMessageDelayed(Message.obtain(c8033f.f30007s, 15, c8052l1), 5000L);
            return false;
        }
        this.f30035o.add(c8052l0);
        C8033f c8033f2 = this.f30038r;
        c8033f2.f30007s.sendMessageDelayed(Message.obtain(c8033f2.f30007s, 15, c8052l0), 5000L);
        C8033f c8033f3 = this.f30038r;
        c8033f3.f30007s.sendMessageDelayed(Message.obtain(c8033f3.f30007s, 16, c8052l0), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (m33221n(connectionResult)) {
            return false;
        }
        this.f30038r.m33154f(connectionResult, this.f30032g);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m33221n(@NonNull ConnectionResult connectionResult) {
        synchronized (C8033f.f29992w) {
            try {
                C8033f c8033f = this.f30038r;
                if (c8033f.f30004p == null || !c8033f.f30005q.contains(this.f30028c)) {
                    return false;
                }
                this.f30038r.f30004p.m33279s(connectionResult, this.f30032g);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m33222o(boolean z10) {
        C8953m.m36039d(this.f30038r.f30007s);
        if (!this.f30027b.isConnected() || !this.f30031f.isEmpty()) {
            return false;
        }
        if (!this.f30029d.m33302g()) {
            this.f30027b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m33217j();
        return false;
    }

    @Override // p268l9.InterfaceC8030e
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f30038r.f30007s.getLooper()) {
            m33215h();
        } else {
            this.f30038r.f30007s.post(new RunnableC8034f0(this));
        }
    }

    @Override // p268l9.InterfaceC8057n
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        m33201F(connectionResult, null);
    }

    @Override // p268l9.InterfaceC8030e
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f30038r.f30007s.getLooper()) {
            m33216i(i10);
        } else {
            this.f30038r.f30007s.post(new RunnableC8037g0(this, i10));
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m33223p() {
        return this.f30032g;
    }

    /* JADX INFO: renamed from: q */
    public final int m33224q() {
        return this.f30037q;
    }

    /* JADX INFO: renamed from: r */
    public final ConnectionResult m33225r() {
        C8953m.m36039d(this.f30038r.f30007s);
        return this.f30036p;
    }

    /* JADX INFO: renamed from: t */
    public final C7491a.f m33226t() {
        return this.f30027b;
    }

    /* JADX INFO: renamed from: v */
    public final Map m33227v() {
        return this.f30031f;
    }
}
