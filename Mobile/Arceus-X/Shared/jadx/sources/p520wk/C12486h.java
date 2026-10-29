package p520wk;

import android.webkit.CookieManager;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import p151gk.C6124q;
import p493vk.C12223e;
import p493vk.InterfaceC12221c;
import th.C11659h;

/* JADX INFO: renamed from: wk.h */
/* JADX INFO: loaded from: classes2.dex */
public class C12486h {

    /* JADX INFO: renamed from: a */
    public InterfaceC12221c f44638a;

    /* JADX INFO: renamed from: b */
    public String f44639b;

    /* JADX INFO: renamed from: c */
    public Set<d> f44640c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final Runnable f44641d = new a();

    /* JADX INFO: renamed from: wk.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = C12486h.this.f44640c.iterator();
            while (it.hasNext()) {
                ((d) it.next()).mo1254a();
            }
        }
    }

    /* JADX INFO: renamed from: wk.h$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f44643a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(String str) {
            this.f44643a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6124q.m27063h("rbx.platform", "Verifying cookies.");
            String strM46775g = C11659h.m43403a().mo43530S1() ? C12486h.this.m46775g(CookieManager.getInstance().getCookie(this.f44643a)) : C12486h.this.m46775g(C12488j.m46781c().mo23956b(this.f44643a));
            if (strM46775g == null || strM46775g.equals(C12486h.this.f44639b)) {
                return;
            }
            C6124q.m27063h("rbx.platform", "WebViewCookieHandler.verifyCookies(): Cookie changed, notifying observers.");
            C12486h.this.f44639b = strM46775g;
            C12486h.this.f44638a.mo45313a().execute(C12486h.this.f44641d);
        }
    }

    /* JADX INFO: renamed from: wk.h$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C12486h f44645a = new C12486h(new C12223e(new ExecutorC12482d(Executors.newSingleThreadScheduledExecutor(), MlKitException.CODE_SCANNER_UNAVAILABLE), new C12223e.a()));
    }

    /* JADX INFO: renamed from: wk.h$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo1254a();
    }

    public C12486h(InterfaceC12221c interfaceC12221c) {
        this.f44638a = interfaceC12221c;
    }

    /* JADX INFO: renamed from: h */
    public static C12486h m46774h() {
        return c.f44645a;
    }

    /* JADX INFO: renamed from: g */
    public final String m46775g(String str) {
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

    /* JADX INFO: renamed from: i */
    public void m46776i(d dVar) {
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.registerCookieObserver().");
        this.f44640c.add(dVar);
    }

    /* JADX INFO: renamed from: j */
    public void m46777j(d dVar) {
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.unregisterCookieObserver().");
        this.f44640c.remove(dVar);
    }

    /* JADX INFO: renamed from: k */
    public void m46778k(String str) {
        if (this.f44640c.size() == 0) {
            return;
        }
        this.f44638a.mo45314b().execute(new b(str));
    }
}
