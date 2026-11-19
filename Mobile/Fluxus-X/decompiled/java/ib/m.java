package ib;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<f> f19316a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19317c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<m9.k.a<mb.e>, l> f19318d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<m9.k.a, j> f19319e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<m9.k.a<mb.d>, i> f19320f = new HashMap();

    public m(Context context, t<f> tVar) {
        this.b = context;
        this.f19316a = tVar;
    }

    public final void a(boolean z10) {
        ((w) this.f19316a).f19341a.checkConnected();
        ((w) this.f19316a).a().q2(z10);
        this.f19317c = z10;
    }

    public final void b() {
        synchronized (this.f19318d) {
            try {
                for (l lVar : this.f19318d.values()) {
                    if (lVar != null) {
                        ((w) this.f19316a).a().k2(r.a(lVar, null));
                    }
                }
                this.f19318d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f19320f) {
            try {
                for (i iVar : this.f19320f.values()) {
                    if (iVar != null) {
                        ((w) this.f19316a).a().k2(r.A3(iVar, null));
                    }
                }
                this.f19320f.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f19319e) {
            try {
                for (j jVar : this.f19319e.values()) {
                    if (jVar != null) {
                        ((w) this.f19316a).a().D1(new a0(2, null, jVar, null));
                    }
                }
                this.f19319e.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void c() {
        if (this.f19317c) {
            a(false);
        }
    }
}
