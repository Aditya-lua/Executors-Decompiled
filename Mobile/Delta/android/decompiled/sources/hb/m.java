package hb;

import android.content.Context;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<f> f19242a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19243c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<l9.k.a<lb.e>, l> f19244d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<l9.k.a, j> f19245e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<l9.k.a<lb.d>, i> f19246f = new HashMap();

    public m(Context context, r<f> rVar) {
        this.b = context;
        this.f19242a = rVar;
    }

    public final void a(boolean z10) {
        ((u) this.f19242a).f19249a.checkConnected();
        ((u) this.f19242a).a().q2(z10);
        this.f19243c = z10;
    }

    public final void b() {
        synchronized (this.f19244d) {
            try {
                for (l lVar : this.f19244d.values()) {
                    if (lVar != null) {
                        ((u) this.f19242a).a().w(zzbc.a(lVar, null));
                    }
                }
                this.f19244d.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f19246f) {
            try {
                for (i iVar : this.f19246f.values()) {
                    if (iVar != null) {
                        ((u) this.f19242a).a().w(zzbc.v3(iVar, null));
                    }
                }
                this.f19246f.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f19245e) {
            try {
                for (j jVar : this.f19245e.values()) {
                    if (jVar != null) {
                        ((u) this.f19242a).a().U(new zzl(2, null, jVar, null));
                    }
                }
                this.f19245e.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void c() {
        if (this.f19243c) {
            a(false);
        }
    }
}
