package ei;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.roblox.client.RobloxApplication;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class s extends wk.j {
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicBoolean f15604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicBoolean f15605e;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15606a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f15606a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            oh.a.C0473a c0473aB = oh.a.b(this.f15606a);
            if (c0473aB != null) {
                s.this.b.edit().putString(this.b, c0473aB.a()).apply();
                s.this.b.edit().putString(this.b + "-2", c0473aB.b()).commit();
            }
        }
    }

    public s(CookiePolicy cookiePolicy) {
        super(cookiePolicy);
        this.f15603c = Executors.newSingleThreadExecutor();
        this.f15604d = new AtomicBoolean(true);
        this.f15605e = new AtomicBoolean(false);
        Context contextF = RobloxApplication.f();
        if (contextF != null) {
            this.b = contextF.getSharedPreferences("webView_backup", 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static String o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.equals("auth." + a1.O()) || !str2.startsWith(".ROBLOSECURITY")) {
            return str;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (String str3 : str2.split(";")) {
            String strTrim = str3.trim();
            if (z10 || !strTrim.startsWith("domain")) {
                if (z11 || !strTrim.equals("secure")) {
                    if (!z10 && z11) {
                        break;
                    }
                } else {
                    z11 = true;
                }
            } else {
                String[] strArrSplit = strTrim.split("=");
                if (strArrSplit.length == 2 && strArrSplit[1].equals(a1.O())) {
                    z10 = true;
                } else if (z11) {
                    if (!z10) {
                        continue;
                    }
                } else if (!z10) {
                    continue;
                }
            }
        }
        if (!z10 || !z11) {
            return str;
        }
        return "https://" + str;
    }

    @Override // wk.j
    public String b(String str) {
        URL url;
        String strB = super.b(str);
        if (this.f15604d.getAndSet(false) && ((strB == null || nh.d.a(strB)) && n())) {
            gk.p.b("ShellCookieHandler", "Cookie is invalid at first check.");
            this.f15605e.set(true);
        }
        if (this.f15605e.get()) {
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                gk.p.b("ShellCookieHandler", "no cookie for " + url.getHost());
                String strM = m(str);
                if (!TextUtils.isEmpty(url.getHost()) && !TextUtils.isEmpty(strM) && ((strB == null || !strB.contains(".ROBLOSECURITY")) && strM.contains(".ROBLOSECURITY"))) {
                    gk.p.b("ShellCookieHandler", "Use back up.");
                    super.f(a1.O(), strM);
                    return strM;
                }
                gk.p.b("ShellCookieHandler", "No backup found.");
            }
        }
        return strB;
    }

    @Override // wk.j
    public void f(String str, String str2) {
        l(str, str2);
        super.f(o(str, str2), str2);
    }

    @Override // wk.j
    public void g(String str, String str2, ValueCallback<Boolean> valueCallback) {
        super.g(o(str, str2), str2, valueCallback);
    }

    public void k() {
        String str;
        String strB = super.b(a1.O());
        if (strB == null || !strB.contains(".ROBLOSECURITY")) {
            return;
        }
        String[] strArrSplit = strB.split(";");
        if (strArrSplit.length == 0) {
            return;
        }
        int length = strArrSplit.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str = null;
                break;
            }
            str = strArrSplit[i10];
            if (str.contains(".ROBLOSECURITY")) {
                break;
            } else {
                i10++;
            }
        }
        if (str == null) {
            return;
        }
        p(a1.O(), String.format("%s; domain=%s; path=/", str, a1.O()));
    }

    public final void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("auth." + a1.O())) {
            p(a1.O(), str2);
        }
    }

    public final String m(String str) {
        SharedPreferences sharedPreferences;
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getHost()) || !url.getHost().endsWith(a1.O()) || (sharedPreferences = this.b) == null) {
                return null;
            }
            String string = sharedPreferences.getString(a1.O(), null);
            String string2 = this.b.getString(a1.O() + "-2", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return oh.a.a(string, string2);
            }
            return null;
        } catch (MalformedURLException unused) {
        }
    }

    public final boolean n() {
        SharedPreferences sharedPreferences = this.b;
        return (sharedPreferences == null || sharedPreferences.getString(a1.O(), null) == null) ? false : true;
    }

    public final void p(String str, String str2) {
        if (this.b == null) {
            return;
        }
        this.f15603c.execute(new a(str2, str));
    }

    @Override // wk.j, okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        super.saveFromResponse(httpUrl, list);
        wk.h.h().k(httpUrl.uri().toString());
    }
}
