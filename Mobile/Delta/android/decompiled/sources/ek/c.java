package ek;

import android.content.Context;
import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public class c implements ek.a.InterfaceC0297a {
    public static String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ne.e0<String> f16131c = ne.e0.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16132a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16133a = new c();
    }

    public static String d() {
        String str;
        if (!rh.h.a().E5()) {
            return b;
        }
        if (!dk.c.c().n() && (str = b) != null) {
            return str;
        }
        b = null;
        return "";
    }

    public static c g() {
        return a.f16133a;
    }

    @Override // ek.a.InterfaceC0297a
    public void a(String str) {
        b = str;
    }

    public void c() {
        b = null;
        this.f16132a = false;
    }

    public void e(Context context) {
        f(context, null);
    }

    public void f(Context context, final ek.a.InterfaceC0297a interfaceC0297a) {
        if (rh.h.a().E5() && dk.c.c().n()) {
            return;
        }
        if (!this.f16132a) {
            this.f16132a = true;
            new ek.a(context, new ek.a.InterfaceC0297a() { // from class: ek.b
                @Override // ek.a.InterfaceC0297a
                public final void a(String str) {
                    this.f16130a.h(interfaceC0297a, str);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (interfaceC0297a != null) {
            interfaceC0297a.a(b);
        }
    }

    public final /* synthetic */ void h(ek.a.InterfaceC0297a interfaceC0297a, String str) {
        a(str);
        if (interfaceC0297a != null) {
            interfaceC0297a.a(str);
        }
    }
}
