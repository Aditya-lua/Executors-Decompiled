package si;

import android.content.Context;
import android.os.Build;
import dj.a0;
import dj.m;
import ek.t;
import hj.r;
import k2.n;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class a extends dh.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f31528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f31529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f31531g;

    /* JADX INFO: renamed from: si.a$a, reason: collision with other inner class name */
    public class C0556a implements dh.d.a {

        /* JADX INFO: renamed from: si.a$a$a, reason: collision with other inner class name */
        public class C0557a implements bk.b.InterfaceC0085b {
            public C0557a() {
            }

            @Override // bk.b.InterfaceC0085b
            public void a(ml.a aVar) {
                a.this.d("UserSelectedTheme");
            }
        }

        public C0556a() {
        }

        @Override // dh.d.a
        public void start() {
            new bk.b().b(new C0557a());
        }
    }

    public class b implements dh.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31534a;
        public long b;

        public b(String str, long j10) {
            this.f31534a = str;
            this.b = j10;
        }

        @Override // dh.d.a
        public void start() {
            if (a.this.f31528d != null) {
                if (t.g()) {
                    if (h.a().L1()) {
                        a0.R(a.this.f31528d).K(this.b, true);
                    } else {
                        m mVarF0 = m.F0(a.this.f31528d);
                        if (mVarF0 != null) {
                            if (h.a().q3() && h.a().q()) {
                                mVarF0.m1(this.b, this.f31534a, true);
                            } else {
                                mVarF0.A0(this.b, this.f31534a, true);
                            }
                        }
                    }
                } else if (t.i()) {
                    if (h.a().M5()) {
                        gj.b.a(a.this.f31528d);
                        throw null;
                    }
                    gj.a.a(a.this.f31528d);
                }
            }
            a.this.d("GrantPendingPurchases");
        }
    }

    public class c implements dh.d.a {
        @Override // dh.d.a
        public void start() {
            if (a.this.f31528d != null) {
                if (!n.f(a.this.f31528d).a() && Build.VERSION.SDK_INT >= 33) {
                    a.this.d("PushNotificationRegistration");
                    return;
                } else if (n.f(a.this.f31528d).a()) {
                    r.k().z(a.this.f31528d, true);
                }
            }
            a.this.d("PushNotificationRegistration");
        }

        public c() {
        }
    }

    public interface d {
        void a();
    }

    public a(Context context, String str, long j10, String str2) {
        super(str);
        this.f31528d = context;
        this.f31529e = j10;
        this.f31530f = str2;
        a(new c());
        a(new C0556a());
        a(new b(this.f31530f, this.f31529e));
    }

    @Override // dh.d
    public void b() {
        d dVar = this.f31531g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void g(d dVar) {
        this.f31531g = dVar;
    }
}
