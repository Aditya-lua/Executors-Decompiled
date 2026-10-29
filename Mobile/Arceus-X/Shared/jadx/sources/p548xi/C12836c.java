package p548xi;

import android.app.Activity;
import androidx.p616lifecycle.InterfaceC0978r;
import p093e4.ActivityC4831q;
import sg.C11306d0;
import sg.C11356t0;
import sg.C11368x0;
import vi.C12211b;

/* JADX INFO: renamed from: xi.c */
/* JADX INFO: loaded from: classes2.dex */
public class C12836c {

    /* JADX INFO: renamed from: a */
    public C11368x0 f45635a;

    /* JADX INFO: renamed from: xi.c$a */
    public class a implements C11306d0.d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityC4831q f45636a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(ActivityC4831q activityC4831q) {
            this.f45636a = activityC4831q;
        }

        @Override // sg.C11306d0.d
        /* JADX INFO: renamed from: a */
        public void mo42496a() {
            C12836c.this.m47776b(this.f45636a);
        }
    }

    /* JADX INFO: renamed from: xi.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo45215a();
    }

    public C12836c(C11368x0 c11368x0) {
        this.f45635a = c11368x0;
    }

    /* JADX INFO: renamed from: b */
    public final void m47776b(Activity activity) {
        if (activity != null) {
            C12211b.m45200f().m45207i(activity, C12211b.d.LOGOUT_BY_USER_IN_NATIVE);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m47777c(InterfaceC0978r interfaceC0978r) {
        if (this.f45635a == null) {
            return;
        }
        C11356t0.m42552v("logout");
        ActivityC4831q activityC4831qM4693p = this.f45635a.m4693p();
        C11306d0 c11306d0 = new C11306d0();
        c11306d0.m23337r2(2, 0);
        if (interfaceC0978r != null) {
            c11306d0.mo4656a().mo4935a(interfaceC0978r);
        }
        c11306d0.m42495B2(new a(activityC4831qM4693p));
        c11306d0.mo23339t2(activityC4831qM4693p.m23360l1(), "dialog");
    }
}
