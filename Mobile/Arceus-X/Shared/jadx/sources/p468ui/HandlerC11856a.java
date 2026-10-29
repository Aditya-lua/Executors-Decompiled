package p468ui;

import android.content.Context;
import android.os.Build;
import dk.C4633b;
import fj.C5613a0;
import fj.C5636m;
import p103eh.AbstractHandlerC5116d;
import p151gk.C6127t;
import p198ij.C6813a;
import p198ij.C6814b;
import p222jj.C7193r;
import p235k2.C7422n;
import p337ol.EnumC9799a;
import th.C11659h;

/* JADX INFO: renamed from: ui.a */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC11856a extends AbstractHandlerC5116d {

    /* JADX INFO: renamed from: d */
    public Context f42038d;

    /* JADX INFO: renamed from: e */
    public long f42039e;

    /* JADX INFO: renamed from: f */
    public String f42040f;

    /* JADX INFO: renamed from: g */
    public d f42041g;

    /* JADX INFO: renamed from: ui.a$a */
    public class a implements AbstractHandlerC5116d.a {

        /* JADX INFO: renamed from: ui.a$a$a, reason: collision with other inner class name */
        public class C14267a implements C4633b.b {
            public C14267a() {
            }

            @Override // dk.C4633b.b
            /* JADX INFO: renamed from: a */
            public void mo22856a(EnumC9799a enumC9799a) {
                HandlerC11856a.this.m23875d("UserSelectedTheme");
            }
        }

        public a() {
        }

        @Override // p103eh.AbstractHandlerC5116d.a
        public void start() {
            new C4633b().m22854b(new C14267a());
        }
    }

    /* JADX INFO: renamed from: ui.a$b */
    public class b implements AbstractHandlerC5116d.a {

        /* JADX INFO: renamed from: a */
        public String f42044a;

        /* JADX INFO: renamed from: b */
        public long f42045b;

        public b(String str, long j10) {
            this.f42044a = str;
            this.f42045b = j10;
        }

        @Override // p103eh.AbstractHandlerC5116d.a
        public void start() {
            if (HandlerC11856a.this.f42038d != null) {
                if (C6127t.m27091g()) {
                    if (C11659h.m43403a().mo43455H1()) {
                        C5613a0.m25370R(HandlerC11856a.this.f42038d).m25389K(this.f42045b, true);
                    } else {
                        C5636m c5636mM25494F0 = C5636m.m25494F0(HandlerC11856a.this.f42038d);
                        if (c5636mM25494F0 != null) {
                            if (C11659h.m43403a().mo43677m3() && C11659h.m43403a().mo43708r()) {
                                c5636mM25494F0.m25608m1(this.f42045b, this.f42044a, true);
                            } else {
                                c5636mM25494F0.m25553A0(this.f42045b, this.f42044a, true);
                            }
                        }
                    }
                } else if (C6127t.m27093i()) {
                    if (C11659h.m43403a().mo43466I5()) {
                        C6814b.m29184a(HandlerC11856a.this.f42038d);
                        throw null;
                    }
                    C6813a.m29183a(HandlerC11856a.this.f42038d);
                }
            }
            HandlerC11856a.this.m23875d("GrantPendingPurchases");
        }
    }

    /* JADX INFO: renamed from: ui.a$c */
    public class c implements AbstractHandlerC5116d.a {
        @Override // p103eh.AbstractHandlerC5116d.a
        public void start() {
            if (HandlerC11856a.this.f42038d != null) {
                if (!C7422n.m30883e(HandlerC11856a.this.f42038d).m30886a() && Build.VERSION.SDK_INT >= 33) {
                    HandlerC11856a.this.m23875d("PushNotificationRegistration");
                    return;
                } else if (C7422n.m30883e(HandlerC11856a.this.f42038d).m30886a()) {
                    C7193r.m30069k().m30095z(HandlerC11856a.this.f42038d, true);
                }
            }
            HandlerC11856a.this.m23875d("PushNotificationRegistration");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: ui.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo44277a();
    }

    public HandlerC11856a(Context context, String str, long j10, String str2) {
        super(str);
        this.f42038d = context;
        this.f42039e = j10;
        this.f42040f = str2;
        m23872a(new c());
        m23872a(new a());
        m23872a(new b(this.f42040f, this.f42039e));
    }

    @Override // p103eh.AbstractHandlerC5116d
    /* JADX INFO: renamed from: b */
    public void mo23873b() {
        d dVar = this.f42041g;
        if (dVar != null) {
            dVar.mo44277a();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m44276g(d dVar) {
        this.f42041g = dVar;
    }
}
