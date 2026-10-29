package ui;

import android.content.Context;
import android.os.Build;
import fj.a0;
import fj.m;
import gk.s;
import jj.r;
import k2.n;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class a extends eh.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f32339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f32340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f32342g;

    /* JADX INFO: renamed from: ui.a$a, reason: collision with other inner class name */
    public class C0584a implements eh.d.a {

        /* JADX INFO: renamed from: ui.a$a$a, reason: collision with other inner class name */
        public class C0585a implements dk.b.InterfaceC0273b {
            public C0585a() {
            }

            @Override // dk.b.InterfaceC0273b
            public void a(ol.a aVar) {
                a.this.d("UserSelectedTheme");
            }
        }

        public C0584a() {
        }

        @Override // eh.d.a
        public void start() {
            new dk.b().b(new C0585a());
        }
    }

    public class b implements eh.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32345a;
        public long b;

        public b(String str, long j10) {
            this.f32345a = str;
            this.b = j10;
        }

        @Override // eh.d.a
        public void start() {
            if (a.this.f32339d != null) {
                if (s.g()) {
                    if (h.a().B1()) {
                        a0.R(a.this.f32339d).K(this.b, true);
                    } else {
                        m mVarF0 = m.F0(a.this.f32339d);
                        if (mVarF0 != null) {
                            if (h.a().g3() && h.a().p()) {
                                mVarF0.m1(this.b, this.f32345a, true);
                            } else {
                                mVarF0.A0(this.b, this.f32345a, true);
                            }
                        }
                    }
                } else if (s.i()) {
                    if (h.a().C5()) {
                        ij.b.a(a.this.f32339d);
                        throw null;
                    }
                    ij.a.a(a.this.f32339d);
                }
            }
            a.this.d("GrantPendingPurchases");
        }
    }

    public class c implements eh.d.a {
        @Override // eh.d.a
        public void start() {
            if (a.this.f32339d != null) {
                if (!n.e(a.this.f32339d).a() && Build.VERSION.SDK_INT >= 33) {
                    a.this.d("PushNotificationRegistration");
                    return;
                } else if (n.e(a.this.f32339d).a()) {
                    r.k().z(a.this.f32339d, true);
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
        this.f32339d = context;
        this.f32340e = j10;
        this.f32341f = str2;
        a(new c());
        a(new C0584a());
        a(new b(this.f32341f, this.f32340e));
    }

    @Override // eh.d
    public void b() {
        d dVar = this.f32342g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void g(d dVar) {
        this.f32342g = dVar;
    }
}
