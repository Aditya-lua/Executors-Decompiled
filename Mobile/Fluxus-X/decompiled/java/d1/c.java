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
    public final s0.f f11640c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11639a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f11641d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11642e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11643f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g2 f11644g = null;

    public c(s sVar, s0.f fVar) {
        this.b = sVar;
        this.f11640c = fVar;
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
        synchronized (this.f11639a) {
            try {
                if (this.f11642e) {
                    this.f11642e = false;
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
        return this.f11640c.c();
    }

    @Override // g0.l
    public t d() {
        return this.f11640c.d();
    }

    public void n(final g2 g2Var) {
        synchronized (this.f11639a) {
            try {
                if (this.f11644g == null) {
                    this.f11644g = g2Var;
                } else if (g2Var.getIsLegacy()) {
                    if (!this.f11644g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f11644g.k());
                    arrayList.addAll(g2Var.k());
                    this.f11644g = new q1(arrayList, g2Var.getViewPort(), g2Var.c());
                } else {
                    if (this.f11644g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f11644g = g2Var;
                    s0.f fVar = this.f11640c;
                    fVar.f0(fVar.O());
                }
                this.f11640c.m0(g2Var.getViewPort());
                this.f11640c.i0(g2Var.c());
                this.f11640c.l0(g2Var.getSessionType());
                this.f11640c.k0(g2Var.f());
                final ResolvedFeatureGroup resolvedFeatureGroupB = ResolvedFeatureGroup.b(g2Var, (o0) d());
                g2Var.getFeatureSelectionListenerExecutor().execute(new Runnable() { // from class: d1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.m(resolvedFeatureGroupB, g2Var);
                    }
                });
                this.f11640c.n(g2Var.k(), resolvedFeatureGroupB);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(androidx.lifecycle.l.a.ON_DESTROY)
    public void onDestroy(s sVar) {
        synchronized (this.f11639a) {
            s0.f fVar = this.f11640c;
            fVar.f0(fVar.O());
        }
    }

    @f0(androidx.lifecycle.l.a.ON_PAUSE)
    public void onPause(s sVar) {
        this.f11640c.h(false);
    }

    @f0(androidx.lifecycle.l.a.ON_RESUME)
    public void onResume(s sVar) {
        this.f11640c.h(true);
    }

    @f0(androidx.lifecycle.l.a.ON_START)
    public void onStart(s sVar) {
        synchronized (this.f11639a) {
            try {
                if (!this.f11642e && !this.f11643f) {
                    this.f11640c.w();
                    this.f11641d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @f0(androidx.lifecycle.l.a.ON_STOP)
    public void onStop(s sVar) {
        synchronized (this.f11639a) {
            try {
                if (!this.f11642e && !this.f11643f) {
                    this.f11640c.H();
                    this.f11641d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s0.f s() {
        return this.f11640c;
    }

    public s t() {
        s sVar;
        synchronized (this.f11639a) {
            sVar = this.b;
        }
        return sVar;
    }

    public List<w2> u() {
        List<w2> listUnmodifiableList;
        synchronized (this.f11639a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f11640c.O());
        }
        return listUnmodifiableList;
    }

    public boolean v(w2 w2Var) {
        boolean zContains;
        synchronized (this.f11639a) {
            zContains = this.f11640c.O().contains(w2Var);
        }
        return zContains;
    }

    public boolean w() {
        boolean zM;
        synchronized (this.f11639a) {
            g2 g2Var = this.f11644g;
            zM = g2Var == null ? false : g2Var.getIsLegacy();
        }
        return zM;
    }

    public void x() {
        synchronized (this.f11639a) {
            try {
                if (this.f11642e) {
                    return;
                }
                onStop(this.b);
                this.f11642e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(g2 g2Var) {
        synchronized (this.f11639a) {
            try {
                g2 g2Var2 = this.f11644g;
                if (g2Var2 != null && g2Var2.getIsLegacy() == g2Var.getIsLegacy()) {
                    q1 q1Var = null;
                    if (this.f11644g.getIsLegacy() || g2Var.getIsLegacy()) {
                        if (this.f11644g.getIsLegacy() && g2Var.getIsLegacy()) {
                            ArrayList arrayList = new ArrayList(this.f11644g.k());
                            arrayList.removeAll(g2Var.k());
                            if (!arrayList.isEmpty()) {
                                q1Var = new q1(arrayList, this.f11644g.getViewPort(), this.f11644g.c());
                            }
                            this.f11644g = q1Var;
                        }
                    } else if (this.f11644g != g2Var) {
                        return;
                    } else {
                        this.f11644g = null;
                    }
                    ArrayList arrayList2 = new ArrayList(g2Var.k());
                    arrayList2.retainAll(this.f11640c.O());
                    this.f11640c.f0(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z() {
        synchronized (this.f11639a) {
            s0.f fVar = this.f11640c;
            fVar.f0(fVar.O());
            this.f11644g = null;
        }
    }
}
