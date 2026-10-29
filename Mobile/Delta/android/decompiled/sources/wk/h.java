package wk;

import android.webkit.CookieManager;
import com.google.mlkit.common.MlKitException;
import gk.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vk.c f34431a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<d> f34432c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f34433d = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = h.this.f34432c.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34435a;

        public b(String str) {
            this.f34435a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.h("rbx.platform", "Verifying cookies.");
            String strG = th.h.a().M1() ? h.this.g(CookieManager.getInstance().getCookie(this.f34435a)) : h.this.g(j.c().b(this.f34435a));
            if (strG == null || strG.equals(h.this.b)) {
                return;
            }
            p.h("rbx.platform", "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers.");
            h.this.b = strG;
            h.this.f34431a.a().execute(h.this.f34433d);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f34436a = new h(new vk.e(new wk.d(Executors.newSingleThreadScheduledExecutor(), MlKitException.CODE_SCANNER_UNAVAILABLE), new vk.e.a()));
    }

    public interface d {
        void a();
    }

    public h(vk.c cVar) {
        this.f34431a = cVar;
    }

    public static h h() {
        return c.f34436a;
    }

    public final String g(String str) {
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

    public void i(d dVar) {
        p.b("rbx.platform", "WebViewCookieHandler.registerCookieObserver().");
        this.f34432c.add(dVar);
    }

    public void j(d dVar) {
        p.b("rbx.platform", "WebViewCookieHandler.unregisterCookieObserver().");
        this.f34432c.remove(dVar);
    }

    public void k(String str) {
        if (this.f34432c.size() == 0) {
            return;
        }
        this.f34431a.b().execute(new b(str));
    }
}
