package vi;

import android.app.Activity;
import androidx.p000lifecycle.r;
import e4.q;
import rg.d0;
import rg.t0;
import rg.x0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f33517a;

    public class a implements d0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f33518a;

        public a(q qVar) {
            this.f33518a = qVar;
        }

        @Override // rg.d0.d
        public void a() {
            c.this.b(this.f33518a);
        }
    }

    public interface b {
        void a();
    }

    public c(x0 x0Var) {
        this.f33517a = x0Var;
    }

    public final void b(Activity activity) {
        if (activity != null) {
            ti.b.f().i(activity, ti.b.d.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    public void c(r rVar) {
        if (this.f33517a == null) {
            return;
        }
        t0.v("logout");
        q qVarP = this.f33517a.p();
        d0 d0Var = new d0();
        d0Var.r2(2, 0);
        if (rVar != null) {
            d0Var.a().a(rVar);
        }
        d0Var.B2(new a(qVarP));
        d0Var.t2(qVarP.l1(), "dialog");
    }
}
