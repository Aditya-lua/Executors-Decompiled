package fj;

import android.app.Activity;
import androidx.p000lifecycle.r;
import bh.d0;
import bh.t0;
import bh.x0;
import f4.v;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f16123a;

    public class a implements d0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f16124a;

        public a(v vVar) {
            this.f16124a = vVar;
        }

        @Override // bh.d0.d
        public void a() {
            c.this.b(this.f16124a);
        }
    }

    public interface b {
        void a();
    }

    public c(x0 x0Var) {
        this.f16123a = x0Var;
    }

    public final void b(Activity activity) {
        if (activity != null) {
            dj.b.f().i(activity, dj.b.d.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    public void c(r rVar) {
        if (this.f16123a == null) {
            return;
        }
        t0.v("logout");
        v vVarP = this.f16123a.p();
        d0 d0Var = new d0();
        d0Var.r2(2, 0);
        if (rVar != null) {
            d0Var.a().a(rVar);
        }
        d0Var.B2(new a(vVarP));
        d0Var.t2(vVarP.l1(), "dialog");
    }
}
