package hb;

import android.content.Context;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<f> f18755a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18756c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<l9.k.a<lb.e>, l> f18757d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<l9.k.a, j> f18758e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<l9.k.a<lb.d>, i> f18759f = new HashMap();

    public m(Context context, r<f> rVar) {
        this.b = context;
        this.f18755a = rVar;
    }

    public final void a(boolean z10) {
        ((u) this.f18755a).f18762a.checkConnected();
        ((u) this.f18755a).a().q2(z10);
        this.f18756c = z10;
    }

    public final void b() {
        synchronized (this.f18757d) {
            try {
                for (l lVar : this.f18757d.values()) {
                    if (lVar != null) {
                        ((u) this.f18755a).a().w(zzbc.a(lVar, null));
                    }
                }
                this.f18757d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f18759f) {
            try {
                for (i iVar : this.f18759f.values()) {
                    if (iVar != null) {
                        ((u) this.f18755a).a().w(zzbc.v3(iVar, null));
                    }
                }
                this.f18759f.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f18758e) {
            try {
                for (j jVar : this.f18758e.values()) {
                    if (jVar != null) {
                        ((u) this.f18755a).a().W(new zzl(2, null, jVar, null));
                    }
                }
                this.f18758e.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void c() {
        if (this.f18756c) {
            a(false);
        }
    }
}
