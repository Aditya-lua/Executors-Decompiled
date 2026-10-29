package va;

import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.appindexing.internal.zza;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p271lf.InterfaceC8132d;
import p305n9.C8953m;
import p487v8.C12102c;
import sb.C11264k;

/* JADX INFO: renamed from: va.k0 */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class C12132k0 extends AbstractC8078u {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C12134l0 f42749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12132k0(C12134l0 c12134l0, C12130j0 c12130j0) {
        super(null, false, 28901);
        this.f42749d = c12134l0;
    }

    @Override // p268l9.AbstractC8078u
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo33170d(C7491a.b bVar, C11264k c11264k) {
        zza zzaVarMo33351o0 = ((InterfaceC8132d) ((C12142p0) bVar).getService()).mo33351o0(new BinderC12128i0(this, c11264k), this.f42749d.f42752a);
        int i10 = zzaVarMo33351o0 == null ? 2 : zzaVarMo33351o0.f11169f;
        boolean z10 = true;
        C12134l0 c12134l0 = null;
        if (i10 == 3) {
            if (C12144q0.m44976b(4)) {
                Log.i("AppIndex", "Queue was full. API call will be retried.");
            }
            if (c11264k.m42330e(null)) {
                synchronized (this.f42749d.f42754c.f42757c) {
                    try {
                        ExecutorC12136m0 executorC12136m0 = this.f42749d.f42754c;
                        if (executorC12136m0.f42758d == 0) {
                            c12134l0 = (C12134l0) executorC12136m0.f42757c.peek();
                            C8953m.m36051p(c12134l0 == this.f42749d);
                        } else {
                            executorC12136m0.f42758d = 2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            if (i10 != 1) {
                String str = "API call failed. Status code: " + i10;
                if (C12144q0.m44976b(6)) {
                    Log.e("AppIndex", str);
                }
                if (c11264k.m42330e(null)) {
                    this.f42749d.f42753b.m42327b(new C12102c("Indexing error."));
                }
            }
            synchronized (this.f42749d.f42754c.f42757c) {
                if (((C12134l0) this.f42749d.f42754c.f42757c.poll()) != this.f42749d) {
                    z10 = false;
                }
                C8953m.m36051p(z10);
                c12134l0 = (C12134l0) this.f42749d.f42754c.f42757c.peek();
                this.f42749d.f42754c.f42758d = 0;
            }
        }
        if (c12134l0 != null) {
            c12134l0.m44966d();
        }
    }
}
