package p151gk;

import android.content.Context;
import android.os.AsyncTask;
import fk.C5654c;
import ne.C9418e0;
import th.C11659h;

/* JADX INFO: renamed from: gk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6107c implements AsyncTaskC6103a.a {

    /* JADX INFO: renamed from: b */
    public static String f23448b;

    /* JADX INFO: renamed from: c */
    public static C9418e0<String> f23449c = C9418e0.m37204H();

    /* JADX INFO: renamed from: a */
    public boolean f23450a = false;

    /* JADX INFO: renamed from: gk.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C6107c f23451a = new C6107c();
    }

    /* JADX INFO: renamed from: d */
    public static String m27009d() {
        String str;
        if (!C11659h.m43403a().mo43410A5()) {
            return f23448b;
        }
        if (!C5654c.m25669c().m25682n() && (str = f23448b) != null) {
            return str;
        }
        f23448b = null;
        return "";
    }

    /* JADX INFO: renamed from: g */
    public static C6107c m27010g() {
        return a.f23451a;
    }

    @Override // p151gk.AsyncTaskC6103a.a
    /* JADX INFO: renamed from: a */
    public void mo1253a(String str) {
        f23448b = str;
    }

    /* JADX INFO: renamed from: c */
    public void m27011c() {
        f23448b = null;
        this.f23450a = false;
    }

    /* JADX INFO: renamed from: e */
    public void m27012e(Context context) {
        m27013f(context, null);
    }

    /* JADX INFO: renamed from: f */
    public void m27013f(Context context, final AsyncTaskC6103a.a aVar) {
        if (C11659h.m43403a().mo43410A5() && C5654c.m25669c().m25682n()) {
            return;
        }
        if (!this.f23450a) {
            this.f23450a = true;
            new AsyncTaskC6103a(context, new AsyncTaskC6103a.a() { // from class: gk.b
                @Override // p151gk.AsyncTaskC6103a.a
                /* JADX INFO: renamed from: a */
                public final void mo1253a(String str) {
                    this.f23446a.m27014h(aVar, str);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else if (aVar != null) {
            aVar.mo1253a(f23448b);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m27014h(AsyncTaskC6103a.a aVar, String str) {
        mo1253a(str);
        if (aVar != null) {
            aVar.mo1253a(str);
        }
    }
}
