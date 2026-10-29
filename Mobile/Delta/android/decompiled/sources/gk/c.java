package gk;

import android.content.Context;
import android.os.AsyncTask;
import me.e0;

/* JADX INFO: loaded from: classes2.dex */
public class c implements gk.a.InterfaceC0327a {
    public static String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e0<String> f18233c = e0.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18234a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f18235a = new c();
    }

    public static String d() {
        String str;
        if (!th.h.a().u5()) {
            return b;
        }
        if (!fk.c.c().n() && (str = b) != null) {
            return str;
        }
        b = null;
        return "";
    }

    public static c g() {
        return a.f18235a;
    }

    @Override // gk.a.InterfaceC0327a
    public void a(String str) {
        b = str;
    }

    public void c() {
        b = null;
        this.f18234a = false;
    }

    public void e(Context context) {
        f(context, null);
    }

    public void f(Context context, final gk.a.InterfaceC0327a interfaceC0327a) {
        if (th.h.a().u5() && fk.c.c().n()) {
            return;
        }
        if (!this.f18234a) {
            this.f18234a = true;
            new gk.a(context, new gk.a.InterfaceC0327a() { // from class: gk.b
                @Override // gk.a.InterfaceC0327a
                public final void a(String str) {
                    this.f18232a.h(interfaceC0327a, str);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (interfaceC0327a != null) {
            interfaceC0327a.a(b);
        }
    }

    public final /* synthetic */ void h(gk.a.InterfaceC0327a interfaceC0327a, String str) {
        a(str);
        if (interfaceC0327a != null) {
            interfaceC0327a.a(str);
        }
    }
}
