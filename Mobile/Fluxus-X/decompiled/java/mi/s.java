package mi;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import bh.a1;
import com.roblox.client.RobloxApplication;
import java.net.CookiePolicy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import mv.z;

/* JADX INFO: loaded from: classes2.dex */
public class s extends dl.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f23290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f23291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicBoolean f23292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicBoolean f23293g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23294a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f23294a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            xh.a.C0754a c0754aB = xh.a.b(this.f23294a);
            if (c0754aB != null) {
                s.this.f23290d.edit().putString(this.b, c0754aB.a()).apply();
                s.this.f23290d.edit().putString(this.b + "-2", c0754aB.b()).commit();
            }
        }
    }

    public s(CookiePolicy cookiePolicy) {
        super(cookiePolicy);
        this.f23291e = Executors.newSingleThreadExecutor();
        this.f23292f = new AtomicBoolean(true);
        this.f23293g = new AtomicBoolean(false);
        Context contextF = RobloxApplication.f();
        if (contextF != null) {
            this.f23290d = contextF.getSharedPreferences("webView_backup", 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static String q(String str, String str2) {
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

    @Override // dl.j, mv.o
    public void a(z zVar, List<mv.n> list) {
        super.a(zVar, list);
        dl.h.j().n(zVar.u().toString());
    }

    @Override // dl.j
    public String d(String str) {
        URL url;
        String strD = super.d(str);
        if (this.f23292f.getAndSet(false) && ((strD == null || wh.d.a(strD)) && p())) {
            ok.q.b("ShellCookieHandler", "Cookie is invalid at first check.");
            this.f23293g.set(true);
        }
        if (this.f23293g.get()) {
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                ok.q.b("ShellCookieHandler", "no cookie for " + url.getHost());
                String strO = o(str);
                if (!TextUtils.isEmpty(url.getHost()) && !TextUtils.isEmpty(strO) && ((strD == null || !strD.contains(".ROBLOSECURITY")) && strO.contains(".ROBLOSECURITY"))) {
                    ok.q.b("ShellCookieHandler", "Use back up.");
                    super.h(a1.O(), strO);
                    return strO;
                }
                ok.q.b("ShellCookieHandler", "No backup found.");
            }
        }
        return strD;
    }

    @Override // dl.j
    public void h(String str, String str2) {
        n(str, str2);
        super.h(q(str, str2), str2);
    }

    @Override // dl.j
    public void i(String str, String str2, ValueCallback<Boolean> valueCallback) {
        super.i(q(str, str2), str2, valueCallback);
    }

    public void m() {
        String str;
        String strD = super.d(a1.O());
        if (strD == null || !strD.contains(".ROBLOSECURITY")) {
            return;
        }
        String[] strArrSplit = strD.split(";");
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
        r(a1.O(), String.format("%s; domain=%s; path=/", str, a1.O()));
    }

    public final void n(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("auth." + a1.O())) {
            r(a1.O(), str2);
        }
    }

    public final String o(String str) {
        SharedPreferences sharedPreferences;
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getHost()) || !url.getHost().endsWith(a1.O()) || (sharedPreferences = this.f23290d) == null) {
                return null;
            }
            String string = sharedPreferences.getString(a1.O(), null);
            String string2 = this.f23290d.getString(a1.O() + "-2", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return xh.a.a(string, string2);
            }
            return null;
        } catch (MalformedURLException unused) {
        }
    }

    public final boolean p() {
        SharedPreferences sharedPreferences = this.f23290d;
        return (sharedPreferences == null || sharedPreferences.getString(a1.O(), null) == null) ? false : true;
    }

    public final void r(String str, String str2) {
        if (this.f23290d == null) {
            return;
        }
        this.f23291e.execute(new a(str2, str));
    }
}
