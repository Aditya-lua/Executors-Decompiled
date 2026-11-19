package dl;

import android.webkit.CookieManager;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cl.c f12533a;
    public volatile String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f12534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<d> f12535d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f12536e = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = h.this.f12535d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f12538a;

        public b(String str) {
            this.f12538a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strI;
            q.h("rbx.platform", "Verifying cookies.");
            if (bi.h.a().W1()) {
                strI = h.this.i(CookieManager.getInstance().getCookie(this.f12538a));
                if (!h.this.f12534c) {
                    h.this.b = strI;
                    h.this.f12534c = true;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("verifyCookies: recorded initial jar baseline (present=");
                    sb2.append(strI != null);
                    sb2.append("), not notifying.");
                    q.h("rbx.platform", sb2.toString());
                    return;
                }
            } else {
                strI = h.this.i(j.e().d(this.f12538a));
            }
            if (strI == null || strI.equals(h.this.b)) {
                return;
            }
            q.h("rbx.platform", "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers.");
            h.this.b = strI;
            h.this.f12533a.a().execute(h.this.f12536e);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12539a = new h(new cl.e(new dl.d(Executors.newSingleThreadScheduledExecutor(), MlKitException.CODE_SCANNER_UNAVAILABLE), new cl.e.a()));
    }

    public interface d {
        void a();
    }

    public h(cl.c cVar) {
        this.f12533a = cVar;
    }

    public static h j() {
        return c.f12539a;
    }

    public final String i(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(".ROBLOSECURITY")) == -1) {
            return null;
        }
        String strSubstring = str.substring(iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(59);
        if (iIndexOf2 == -1) {
            iIndexOf2 = strSubstring.length();
        }
        return strSubstring.substring(0, iIndexOf2);
    }

    public void k(d dVar) {
        q.b("rbx.platform", "WebViewCookieHandler.registerCookieObserver().");
        this.f12535d.add(dVar);
    }

    public void l(String str) {
        this.b = i(str);
        this.f12534c = true;
    }

    public void m(d dVar) {
        q.b("rbx.platform", "WebViewCookieHandler.unregisterCookieObserver().");
        this.f12535d.remove(dVar);
    }

    public void n(String str) {
        if (this.f12535d.size() == 0) {
            return;
        }
        this.f12533a.b().execute(new b(str));
    }
}
