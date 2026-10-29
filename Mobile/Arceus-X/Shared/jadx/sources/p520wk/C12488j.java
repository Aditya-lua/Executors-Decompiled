package p520wk;

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
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: renamed from: wk.j */
/* JADX INFO: loaded from: classes2.dex */
public class C12488j extends CookieManager implements CookieJar {

    /* JADX INFO: renamed from: a */
    public android.webkit.CookieManager f44649a;

    public C12488j(CookiePolicy cookiePolicy) {
        super(null, cookiePolicy);
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46750i();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46780a(android.webkit.CookieManager cookieManager, String str, ValueCallback valueCallback, Boolean bool) {
        if (bool.booleanValue()) {
            cookieManager.flush();
            C6124q.m27063h("rbx.platform", "Flushed WebViewCookieHandler with Cookies from URL " + str);
        } else {
            C6124q.m27060e("rbx.platform", "Failed to Flush WebViewCookieHandler with Cookies from URL " + str);
        }
        valueCallback.onReceiveValue(bool);
    }

    /* JADX INFO: renamed from: c */
    public static C12488j m46781c() {
        return C12489k.m46786a().getInstance();
    }

    /* JADX INFO: renamed from: b */
    public String mo23956b(String str) {
        return C11659h.m43403a().mo43530S1() ? C12483e.m46745b() : m46782d().getCookie(str);
    }

    /* JADX INFO: renamed from: d */
    public final android.webkit.CookieManager m46782d() {
        if (this.f44649a == null) {
            this.f44649a = android.webkit.CookieManager.getInstance();
        }
        return this.f44649a;
    }

    /* JADX INFO: renamed from: e */
    public void m46783e(String str, String str2) {
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.removeSecurityCookie() url:" + str2 + " domain:" + str);
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46752m();
            return;
        }
        mo23957f(str2, ".ROBLOSECURITY=;expires=Wed, 10 May 2000 23:59:59 GMT;path=/;domain=" + str);
    }

    /* JADX INFO: renamed from: f */
    public void mo23957f(String str, String str2) {
        m46785i(str, str2, C12483e.b.UNKNOWN);
    }

    /* JADX INFO: renamed from: g */
    public void mo23958g(String str, String str2, ValueCallback<Boolean> valueCallback) {
        m46784h(str, str2, valueCallback, C12483e.b.UNKNOWN);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return null;
        }
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.get() " + map.toString());
        String string = uri.toString();
        HashMap map2 = new HashMap();
        String strMo23956b = mo23956b(string);
        if (!TextUtils.isEmpty(strMo23956b)) {
            map2.put("Cookie", Collections.singletonList(strMo23956b));
        }
        return map2;
    }

    /* JADX INFO: renamed from: h */
    public void m46784h(final String str, String str2, final ValueCallback<Boolean> valueCallback, C12483e.b bVar) {
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46754p(str2, bVar);
            valueCallback.onReceiveValue(Boolean.TRUE);
        } else {
            final android.webkit.CookieManager cookieManagerM46782d = m46782d();
            cookieManagerM46782d.setCookie(str, str2, new ValueCallback() { // from class: wk.i
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    C12488j.m46780a(cookieManagerM46782d, str, valueCallback, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public void m46785i(String str, String str2, C12483e.b bVar) {
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46754p(str2, bVar);
        } else {
            m46782d().setCookie(str, str2);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<String>> it = get(httpUrl.uri(), new HashMap()).values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                for (String str : it2.next().split(";")) {
                    Cookie cookie = Cookie.parse(httpUrl, str);
                    if (cookie != null) {
                        arrayList.add(cookie);
                    }
                }
            }
        }
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.loadForRequest() " + arrayList.toString());
        return arrayList;
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        if (uri == null || map == null) {
            return;
        }
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.put() " + map.toString());
        String host = uri.getHost();
        for (String str : map.keySet()) {
            if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                Iterator<String> it = map.get(str).iterator();
                while (it.hasNext()) {
                    m46785i(host, it.next(), C12483e.b.OKHTTP_RESPONSE);
                }
            }
        }
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        C6124q.m27057b("rbx.platform", "WebViewCookieHandler.saveFromResponse() " + list.toString());
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        map.put("Set-Cookie", arrayList);
        put(httpUrl.uri(), map);
    }
}
