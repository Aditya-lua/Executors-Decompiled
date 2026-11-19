package ok;

import android.content.Context;
import android.os.AsyncTask;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class c implements ok.a.InterfaceC0545a {
    public static String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static pe.e0<String> f28244c = pe.e0.H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28245a = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28246a = new c();
    }

    public static String d() {
        String str;
        if (!bi.h.a().D5()) {
            return b;
        }
        if (!nk.c.c().n() && (str = b) != null) {
            return str;
        }
        b = null;
        return BuildConfig.FLAVOR;
    }

    public static c g() {
        return a.f28246a;
    }

    @Override // ok.a.InterfaceC0545a
    public void a(String str) {
        b = str;
    }

    public void c() {
        b = null;
        this.f28245a = false;
    }

    public void e(Context context) {
        f(context, null);
    }

    public void f(Context context, final ok.a.InterfaceC0545a interfaceC0545a) {
        if (bi.h.a().D5() && nk.c.c().n()) {
            return;
        }
        if (!this.f28245a) {
            this.f28245a = true;
            new ok.a(context, new ok.a.InterfaceC0545a() { // from class: ok.b
                @Override // ok.a.InterfaceC0545a
                public final void a(String str) {
                    this.f28243a.h(interfaceC0545a, str);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (interfaceC0545a != null) {
            interfaceC0545a.a(b);
        }
    }

    public final /* synthetic */ void h(ok.a.InterfaceC0545a interfaceC0545a, String str) {
        a(str);
        if (interfaceC0545a != null) {
            interfaceC0545a.a(str);
        }
    }
}
