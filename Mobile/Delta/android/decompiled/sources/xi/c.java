package xi;

import android.app.Activity;
import androidx.p000lifecycle.r;
import e4.q;
import sg.d0;
import sg.t0;
import sg.x0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f35195a;

    public class a implements d0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f35196a;

        public a(q qVar) {
            this.f35196a = qVar;
        }

        @Override // sg.d0.d
        public void a() {
            c.this.b(this.f35196a);
        }
    }

    public interface b {
        void a();
    }

    public c(x0 x0Var) {
        this.f35195a = x0Var;
    }

    public final void b(Activity activity) {
        if (activity != null) {
            vi.b.f().i(activity, vi.b.d.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    public void c(r rVar) {
        if (this.f35195a == null) {
            return;
        }
        t0.v("logout");
        q qVarP = this.f35195a.p();
        d0 d0Var = new d0();
        d0Var.r2(2, 0);
        if (rVar != null) {
            d0Var.a().a(rVar);
        }
        d0Var.B2(new a(qVarP));
        d0Var.t2(qVarP.l1(), "dialog");
    }
}
