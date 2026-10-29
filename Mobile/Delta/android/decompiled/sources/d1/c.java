package d1;

import android.annotation.SuppressLint;
import androidx.p000lifecycle.f0;
import androidx.p000lifecycle.r;
import androidx.p000lifecycle.s;
import g0.g2;
import g0.l;
import g0.m;
import g0.q1;
import g0.t;
import g0.w2;
import j0.ResolvedFeatureGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import n0.o0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class c implements r, l {
    public final s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0.f f14275c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14274a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f14276d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14277e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14278f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g2 f14279g = null;

    public c(s sVar, s0.f fVar) {
        this.b = sVar;
        this.f14275c = fVar;
        if (sVar.a().getState().b(androidx.lifecycle.l.b.STARTED)) {
            fVar.w();
        } else {
            fVar.H();
        }
        sVar.a().a(this);
    }

    public static /* synthetic */ void m(ResolvedFeatureGroup resolvedFeatureGroup, g2 g2Var) {
        HashSet hashSet = new HashSet();
        if (resolvedFeatureGroup != null) {
            hashSet.addAll(resolvedFeatureGroup.a());
        }
        g2Var.d().accept(hashSet);
    }

    public void A() {
        synchronized (this.f14274a) {
            try {
                if (this.f14277e) {
                    this.f14277e = false;
                    if (this.b.a().getState().b(androidx.lifecycle.l.b.STARTED)) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.l
    public m c() {
        return this.f14275c.c();
    }

    @Override // g0.l
    public t d() {
        return this.f14275c.d();
    }

    public void n(final g2 g2Var) {
        synchronized (this.f14274a) {
            try {
                if (this.f14279g == null) {
                    this.f14279g = g2Var;
                } else if (g2Var.getIsLegacy()) {
                    if (!this.f14279g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f14279g.k());
                    arrayList.addAll(g2Var.k());
                    this.f14279g = new q1(arrayList, g2Var.getViewPort(), g2Var.c());
                } else {
                    if (this.f14279g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f14279g = g2Var;
                    s0.f fVar = this.f14275c;
                    fVar.f0(fVar.O());
                }
                this.f14275c.m0(g2Var.getViewPort());
                this.f14275c.i0(g2Var.c());
                this.f14275c.l0(g2Var.getSessionType());
                this.f14275c.k0(g2Var.f());
                final ResolvedFeatureGroup resolvedFeatureGroupB = ResolvedFeatureGroup.b(g2Var, (o0) d());
                g2Var.getFeatureSelectionListenerExecutor().execute(new Runnable() { // from class: d1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.m(resolvedFeatureGroupB, g2Var);
                    }
                });
                this.f14275c.n(g2Var.k(), resolvedFeatureGroupB);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(androidx.lifecycle.l.a.ON_DESTROY)
    public void onDestroy(s sVar) {
        synchronized (this.f14274a) {
            s0.f fVar = this.f14275c;
            fVar.f0(fVar.O());
        }
    }

    @f0(androidx.lifecycle.l.a.ON_PAUSE)
    public void onPause(s sVar) {
        this.f14275c.h(false);
    }

    @f0(androidx.lifecycle.l.a.ON_RESUME)
    public void onResume(s sVar) {
        this.f14275c.h(true);
    }

    @f0(androidx.lifecycle.l.a.ON_START)
    public void onStart(s sVar) {
        synchronized (this.f14274a) {
            try {
                if (!this.f14277e && !this.f14278f) {
                    this.f14275c.w();
                    this.f14276d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(androidx.lifecycle.l.a.ON_STOP)
    public void onStop(s sVar) {
        synchronized (this.f14274a) {
            try {
                if (!this.f14277e && !this.f14278f) {
                    this.f14275c.H();
                    this.f14276d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s0.f s() {
        return this.f14275c;
    }

    public s t() {
        s sVar;
        synchronized (this.f14274a) {
            sVar = this.b;
        }
        return sVar;
    }

    public List<w2> u() {
        List<w2> listUnmodifiableList;
        synchronized (this.f14274a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f14275c.O());
        }
        return listUnmodifiableList;
    }

    public boolean v(w2 w2Var) {
        boolean zContains;
        synchronized (this.f14274a) {
            zContains = this.f14275c.O().contains(w2Var);
        }
        return zContains;
    }

    public boolean w() {
        boolean zM;
        synchronized (this.f14274a) {
            g2 g2Var = this.f14279g;
            zM = g2Var == null ? false : g2Var.getIsLegacy();
        }
        return zM;
    }

    public void x() {
        synchronized (this.f14274a) {
            try {
                if (this.f14277e) {
                    return;
                }
                onStop(this.b);
                this.f14277e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(g2 g2Var) {
        synchronized (this.f14274a) {
            try {
                g2 g2Var2 = this.f14279g;
                if (g2Var2 != null && g2Var2.getIsLegacy() == g2Var.getIsLegacy()) {
                    q1 q1Var = null;
                    if (this.f14279g.getIsLegacy() || g2Var.getIsLegacy()) {
                        if (this.f14279g.getIsLegacy() && g2Var.getIsLegacy()) {
                            ArrayList arrayList = new ArrayList(this.f14279g.k());
                            arrayList.removeAll(g2Var.k());
                            if (!arrayList.isEmpty()) {
                                q1Var = new q1(arrayList, this.f14279g.getViewPort(), this.f14279g.c());
                            }
                            this.f14279g = q1Var;
                        }
                    } else if (this.f14279g != g2Var) {
                        return;
                    } else {
                        this.f14279g = null;
                    }
                    ArrayList arrayList2 = new ArrayList(g2Var.k());
                    arrayList2.retainAll(this.f14275c.O());
                    this.f14275c.f0(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this.f14274a) {
            s0.f fVar = this.f14275c;
            fVar.f0(fVar.O());
            this.f14279g = null;
        }
    }
}
