package p104ei;

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
import p151gk.C6124q;
import p308nh.C9478d;
import p332oh.C9734a;
import p520wk.C12486h;
import p520wk.C12488j;
import sg.C11295a1;

/* JADX INFO: renamed from: ei.s */
/* JADX INFO: loaded from: classes2.dex */
public class C5141s extends C12488j {

    /* JADX INFO: renamed from: b */
    public SharedPreferences f20035b;

    /* JADX INFO: renamed from: c */
    public final Executor f20036c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f20037d;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f20038e;

    /* JADX INFO: renamed from: ei.s$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f20039a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f20040b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(String str, String str2) {
            this.f20039a = str;
            this.f20040b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9734a.a aVarM38521b = C9734a.m38521b(this.f20039a);
            if (aVarM38521b != null) {
                C5141s.this.f20035b.edit().putString(this.f20040b, aVarM38521b.m38524a()).apply();
                C5141s.this.f20035b.edit().putString(this.f20040b + "-2", aVarM38521b.m38525b()).commit();
            }
        }
    }

    public C5141s(CookiePolicy cookiePolicy) {
        super(cookiePolicy);
        this.f20036c = Executors.newSingleThreadExecutor();
        this.f20037d = new AtomicBoolean(true);
        this.f20038e = new AtomicBoolean(false);
        Context contextM14834f = RobloxApplication.m14834f();
        if (contextM14834f != null) {
            this.f20035b = contextM14834f.getSharedPreferences("webView_backup", 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static String m23955o(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (!str.equals("auth." + C11295a1.m42410O()) || !str2.startsWith(".ROBLOSECURITY")) {
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
                if (strArrSplit.length == 2 && strArrSplit[1].equals(C11295a1.m42410O())) {
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

    @Override // p520wk.C12488j
    /* JADX INFO: renamed from: b */
    public String mo23956b(String str) {
        URL url;
        String strMo23956b = super.mo23956b(str);
        if (this.f20037d.getAndSet(false) && ((strMo23956b == null || C9478d.m37340a(strMo23956b)) && m23962n())) {
            C6124q.m27057b("ShellCookieHandler", "Cookie is invalid at first check.");
            this.f20038e.set(true);
        }
        if (this.f20038e.get()) {
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                C6124q.m27057b("ShellCookieHandler", "no cookie for " + url.getHost());
                String strM23961m = m23961m(str);
                if (!TextUtils.isEmpty(url.getHost()) && !TextUtils.isEmpty(strM23961m) && ((strMo23956b == null || !strMo23956b.contains(".ROBLOSECURITY")) && strM23961m.contains(".ROBLOSECURITY"))) {
                    C6124q.m27057b("ShellCookieHandler", "Use back up.");
                    super.mo23957f(C11295a1.m42410O(), strM23961m);
                    return strM23961m;
                }
                C6124q.m27057b("ShellCookieHandler", "No backup found.");
            }
        }
        return strMo23956b;
    }

    @Override // p520wk.C12488j
    /* JADX INFO: renamed from: f */
    public void mo23957f(String str, String str2) {
        m23960l(str, str2);
        super.mo23957f(m23955o(str, str2), str2);
    }

    @Override // p520wk.C12488j
    /* JADX INFO: renamed from: g */
    public void mo23958g(String str, String str2, ValueCallback<Boolean> valueCallback) {
        super.mo23958g(m23955o(str, str2), str2, valueCallback);
    }

    /* JADX INFO: renamed from: k */
    public void m23959k() {
        String str;
        String strMo23956b = super.mo23956b(C11295a1.m42410O());
        if (strMo23956b == null || !strMo23956b.contains(".ROBLOSECURITY")) {
            return;
        }
        String[] strArrSplit = strMo23956b.split(";");
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
        m23963p(C11295a1.m42410O(), String.format("%s; domain=%s; path=/", str, C11295a1.m42410O()));
    }

    /* JADX INFO: renamed from: l */
    public final void m23960l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("auth." + C11295a1.m42410O())) {
            m23963p(C11295a1.m42410O(), str2);
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m23961m(String str) {
        SharedPreferences sharedPreferences;
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getHost()) || !url.getHost().endsWith(C11295a1.m42410O()) || (sharedPreferences = this.f20035b) == null) {
                return null;
            }
            String string = sharedPreferences.getString(C11295a1.m42410O(), null);
            String string2 = this.f20035b.getString(C11295a1.m42410O() + "-2", null);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                return C9734a.m38520a(string, string2);
            }
            return null;
        } catch (MalformedURLException unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m23962n() {
        SharedPreferences sharedPreferences = this.f20035b;
        return (sharedPreferences == null || sharedPreferences.getString(C11295a1.m42410O(), null) == null) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m23963p(String str, String str2) {
        if (this.f20035b == null) {
            return;
        }
        this.f20036c.execute(new a(str2, str));
    }

    @Override // p520wk.C12488j, okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        super.saveFromResponse(httpUrl, list);
        C12486h.m46774h().m46778k(httpUrl.uri().toString());
    }
}
