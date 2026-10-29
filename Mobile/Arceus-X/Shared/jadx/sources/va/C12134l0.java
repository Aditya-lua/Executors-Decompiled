package va;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.zzg;
import p305n9.C8953m;
import sb.C11264k;
import sb.InterfaceC11254f;

/* JADX INFO: renamed from: va.l0 */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class C12134l0 {

    /* JADX INFO: renamed from: a */
    public final zzg f42752a;

    /* JADX INFO: renamed from: b */
    public final C11264k f42753b = new C11264k();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ExecutorC12136m0 f42754c;

    public C12134l0(ExecutorC12136m0 executorC12136m0, zzg zzgVar) {
        this.f42754c = executorC12136m0;
        this.f42752a = zzgVar;
    }

    /* JADX INFO: renamed from: a */
    public final Task m44965a() {
        return this.f42753b.m42326a();
    }

    /* JADX INFO: renamed from: d */
    public final void m44966d() {
        synchronized (this.f42754c.f42757c) {
            C8953m.m36051p(this.f42754c.f42758d == 0);
            this.f42754c.f42758d = 1;
        }
        this.f42754c.f42755a.m31136D(new C12132k0(this, null)).mo11890d(this.f42754c, new InterfaceC11254f() { // from class: va.h0
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                this.f42740a.m44967e(exc);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m44967e(Exception exc) {
        C12134l0 c12134l0;
        synchronized (this.f42754c.f42757c) {
            try {
                if (this.f42754c.f42757c.peek() == this) {
                    this.f42754c.f42757c.remove();
                    this.f42754c.f42758d = 0;
                    c12134l0 = (C12134l0) this.f42754c.f42757c.peek();
                } else {
                    c12134l0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f42753b.m42329d(exc);
        if (c12134l0 != null) {
            c12134l0.m44966d();
        }
    }
}
