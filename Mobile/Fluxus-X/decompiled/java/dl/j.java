package dl;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mv.n;
import mv.o;
import mv.z;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class j extends CookieManager implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.webkit.CookieManager f12542c;

    public j(CookiePolicy cookiePolicy) {
        super(null, cookiePolicy);
        if (bi.h.a().W1()) {
            e.m();
        }
    }

    public static /* synthetic */ void c(android.webkit.CookieManager cookieManager, String str, ValueCallback valueCallback, Boolean bool) {
        if (bool.booleanValue()) {
            cookieManager.flush();
            q.h("rbx.platform", "Flushed WebViewCookieHandler with Cookies from URL " + str);
        } else {
            q.e("rbx.platform", "Failed to Flush WebViewCookieHandler with Cookies from URL " + str);
        }
        valueCallback.onReceiveValue(bool);
    }

    public static j e() {
        return k.a().getInstance();
    }

    @Override // mv.o
    public void a(z zVar, List<n> list) {
        q.b("rbx.platform", "WebViewCookieHandler.saveFromResponse() " + list.toString());
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        map.put("Set-Cookie", arrayList);
        put(zVar.u(), map);
    }

    @Override // mv.o
    public List<n> b(z zVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<String>> it = get(zVar.u(), new HashMap()).values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().split(";")) {
                    n nVarF = n.f(zVar, str);
                    if (nVarF != null) {
                        arrayList.add(nVarF);
                    }
                }
            }
        }
        q.b("rbx.platform", "WebViewCookieHandler.loadForRequest() " + arrayList.toString());
        return arrayList;
    }

    public String d(String str) {
        return bi.h.a().W1() ? e.d() : f().getCookie(str);
    }

    public final android.webkit.CookieManager f() {
        if (this.f12542c == null) {
            this.f12542c = android.webkit.CookieManager.getInstance();
        }
        return this.f12542c;
    }

    public void g(String str, String str2) {
        q.b("rbx.platform", "WebViewCookieHandler.removeSecurityCookie() url:" + str2 + " domain:" + str);
        if (bi.h.a().W1()) {
            e.t();
            return;
        }
        h(str2, ".ROBLOSECURITY=;expires=Wed, 10 May 2000 23:59:59 GMT;path=/;domain=" + str);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return null;
        }
        q.b("rbx.platform", "WebViewCookieHandler.get() " + map.toString());
        String string = uri.toString();
        HashMap map2 = new HashMap();
        String strD = d(string);
        if (!TextUtils.isEmpty(strD)) {
            map2.put("Cookie", Collections.singletonList(strD));
        }
        return map2;
    }

    public void h(String str, String str2) {
        k(str, str2, e.c.UNKNOWN);
    }

    public void i(String str, String str2, ValueCallback<Boolean> valueCallback) {
        j(str, str2, valueCallback, e.c.UNKNOWN);
    }

    public void j(final String str, String str2, final ValueCallback<Boolean> valueCallback, e.c cVar) {
        if (bi.h.a().W1()) {
            e.y(str2, cVar);
            valueCallback.onReceiveValue(Boolean.TRUE);
        } else {
            final android.webkit.CookieManager cookieManagerF = f();
            cookieManagerF.setCookie(str, str2, new ValueCallback() { // from class: dl.i
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    j.c(cookieManagerF, str, valueCallback, (Boolean) obj);
                }
            });
        }
    }

    public void k(String str, String str2, e.c cVar) {
        if (bi.h.a().W1()) {
            e.y(str2, cVar);
        } else {
            f().setCookie(str, str2);
        }
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return;
        }
        q.b("rbx.platform", "WebViewCookieHandler.put() " + map.toString());
        String host = uri.getHost();
        for (String str : map.keySet()) {
            if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                Iterator<String> it = map.get(str).iterator();
                while (it.hasNext()) {
                    k(host, it.next(), e.c.OKHTTP_RESPONSE);
                }
            }
        }
    }
}
