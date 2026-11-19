package cj;

import android.content.Context;
import android.os.Build;
import bi.h;
import k2.n;
import nj.a0;
import nj.m;
import ok.t;
import rj.r;

/* JADX INFO: loaded from: classes2.dex */
public class a extends nh.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f5470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f5473g;

    /* JADX INFO: renamed from: cj.a$a, reason: collision with other inner class name */
    public class C0108a implements nh.d.a {

        /* JADX INFO: renamed from: cj.a$a$a, reason: collision with other inner class name */
        public class C0109a implements lk.b.InterfaceC0432b {
            public C0109a() {
            }

            @Override // lk.b.InterfaceC0432b
            public void a(cm.a aVar) {
                a.this.d("UserSelectedTheme");
            }
        }

        public C0108a() {
        }

        @Override // nh.d.a
        public void start() {
            new lk.b().b(new C0109a());
        }
    }

    public class b implements nh.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5476a;
        public long b;

        public b(String str, long j10) {
            this.f5476a = str;
            this.b = j10;
        }

        @Override // nh.d.a
        public void start() {
            if (a.this.f5470d != null) {
                if (t.g()) {
                    if (h.a().L1()) {
                        a0.R(a.this.f5470d).K(this.b, true);
                    } else {
                        m mVarF0 = m.F0(a.this.f5470d);
                        if (mVarF0 != null) {
                            if (h.a().t3() && h.a().q()) {
                                mVarF0.m1(this.b, this.f5476a, true);
                            } else {
                                mVarF0.A0(this.b, this.f5476a, true);
                            }
                        }
                    }
                } else if (t.i()) {
                    if (h.a().L5()) {
                        qj.b.a(a.this.f5470d);
                        throw null;
                    }
                    qj.a.a(a.this.f5470d);
                }
            }
            a.this.d("GrantPendingPurchases");
        }
    }

    public class c implements nh.d.a {
        @Override // nh.d.a
        public void start() {
            if (a.this.f5470d != null) {
                if (!n.g(a.this.f5470d).a() && Build.VERSION.SDK_INT >= 33) {
                    a.this.d("PushNotificationRegistration");
                    return;
                } else if (n.g(a.this.f5470d).a()) {
                    r.k().z(a.this.f5470d, true);
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
        this.f5470d = context;
        this.f5471e = j10;
        this.f5472f = str2;
        a(new c());
        a(new C0108a());
        a(new b(this.f5472f, this.f5471e));
    }

    @Override // nh.d
    public void b() {
        d dVar = this.f5473g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void g(d dVar) {
        this.f5473g = dVar;
    }
}
