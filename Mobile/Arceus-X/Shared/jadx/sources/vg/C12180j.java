package vg;

import android.text.TextUtils;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeGLInterface;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import p104ei.AsyncTaskC5140r;
import p104ei.C5132j;
import p104ei.InterfaceC5135m;
import p151gk.C6107c;
import p151gk.C6110d0;
import p151gk.C6124q;
import p151gk.InterfaceC6108c0;
import sg.C11295a1;
import th.C11659h;

/* JADX INFO: renamed from: vg.j */
/* JADX INFO: loaded from: classes2.dex */
public class C12180j {

    /* JADX INFO: renamed from: a */
    public final Object f42867a = new Object();

    /* JADX INFO: renamed from: b */
    public final List<String> f42868b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public long f42869c;

    /* JADX INFO: renamed from: d */
    public final c f42870d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6108c0 f42871e;

    /* JADX INFO: renamed from: vg.j$a */
    public class a implements InterfaceC5135m {
        public a() {
        }

        @Override // p104ei.InterfaceC5135m
        /* JADX INFO: renamed from: a */
        public void mo14796a(C5132j c5132j) {
            if (c5132j.m23933b() == 200 || c5132j.m23933b() == 202) {
                return;
            }
            C6124q.m27066k("EventStreamManager", "addEvent: Failed to post events. Ignore and do nothing");
        }
    }

    /* JADX INFO: renamed from: vg.j$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C12180j f42873a = new C12180j(new d(), new C6110d0());
    }

    /* JADX INFO: renamed from: vg.j$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        AsyncTaskC5140r mo45105a(String str, String str2, InterfaceC5135m interfaceC5135m, String str3);
    }

    /* JADX INFO: renamed from: vg.j$d */
    public static class d implements c {
        @Override // vg.C12180j.c
        /* JADX INFO: renamed from: a */
        public AsyncTaskC5140r mo45105a(String str, String str2, InterfaceC5135m interfaceC5135m, String str3) {
            return new AsyncTaskC5140r(str, str2, interfaceC5135m, str3);
        }
    }

    public C12180j(c cVar, InterfaceC6108c0 interfaceC6108c0) {
        C6124q.m27063h("EventStreamManager", "[Constructor]: ENTER.");
        this.f42870d = cVar;
        this.f42871e = interfaceC6108c0;
    }

    /* JADX INFO: renamed from: b */
    public static String m45084b(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int size = list.size();
        int i10 = 0;
        for (String str : list) {
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\"");
            i10++;
            if (i10 < size) {
                sb2.append(",");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m45085p() {
        try {
            return URLEncoder.encode(C11295a1.m42433Z0(), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            C6124q.m27060e("EventStreamManager", "Failed to URL-encode the user-agent. Exception: " + e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static C12180j m45086q() {
        return b.f42873a;
    }

    /* JADX INFO: renamed from: a */
    public void m45087a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lt=");
        sb2.append(String.format("%tFT%<tT.%<tLZ", Calendar.getInstance(TimeZone.getTimeZone("Z"))));
        sb2.append("&mdid=");
        sb2.append(C11295a1.f39656t);
        sb2.append("&idfv=");
        sb2.append(C11295a1.f39656t);
        sb2.append("&idfa=");
        C6107c.m27010g();
        sb2.append(C6107c.m27009d());
        String str2 = sb2.toString() + "&" + str;
        synchronized (this.f42867a) {
            try {
                this.f42868b.add(str2);
                if (this.f42868b.size() == 1) {
                    this.f42869c = this.f42871e.mo27017b();
                }
                if (m45103t()) {
                    m45102s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m45088c(String str, long j10) {
        String str2 = "evt=appLaunch&ctx=" + str + "&appStoreSource=google";
        if (C11659h.m43403a().mo43613d4() && j10 > 0) {
            str2 = str2 + "&android_first_install_time=" + j10;
        }
        m45087a(str2);
    }

    /* JADX INFO: renamed from: d */
    public void m45089d(String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder("evt=authFormInteraction");
        if (str != null) {
            sb2.append("&ctx=");
            sb2.append(str);
        }
        if (str2 != null) {
            sb2.append("&field=");
            sb2.append(str2);
        }
        if (str3 != null) {
            sb2.append("&entered=");
            sb2.append(str3);
        }
        if (str4 != null) {
            sb2.append("&state=");
            sb2.append(str4);
        }
        m45087a(sb2.toString());
    }

    /* JADX INFO: renamed from: e */
    public void m45090e(String str, String str2) {
        m45087a("evt=buttonClick&ctx=" + str + "&btn=" + str2);
    }

    /* JADX INFO: renamed from: f */
    public void m45091f(String str, String str2, String str3) {
        m45087a("evt=buttonClick&ctx=" + str + "&btn=" + str2 + "&cstm=" + str3);
    }

    /* JADX INFO: renamed from: g */
    public void m45092g(String str, String str2, String str3) {
        m45087a("evt=clientSideError&ctx=" + str + "&error=" + str2 + "&data=" + str3);
    }

    /* JADX INFO: renamed from: h */
    public void m45093h(String str, String str2, int i10, int i11) {
        m45087a("evt=endpointFailure&ctx=" + str + "&url=" + str2 + "&errorCode=" + i10 + "&serverErrorCode=" + i11);
    }

    /* JADX INFO: renamed from: i */
    public void m45094i(String str, String str2, List<NameValuePair> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=");
        sb2.append(str);
        sb2.append("&ctx=");
        sb2.append(str2);
        if (list != null) {
            for (NameValuePair nameValuePair : list) {
                sb2.append("&");
                sb2.append(nameValuePair.getName());
                sb2.append("=");
                sb2.append(nameValuePair.getValue());
            }
        }
        m45087a(sb2.toString());
    }

    /* JADX INFO: renamed from: j */
    public void m45095j(String str, boolean z10) {
        m45087a("evt=pushNotificationOSSettingsChanged&ua=" + m45085p() + "&ctx=" + str + "&enabled=" + z10);
    }

    /* JADX INFO: renamed from: k */
    public void m45096k(String str) {
        m45087a("evt=screenLoaded&ctx=" + str);
    }

    /* JADX INFO: renamed from: l */
    public void m45097l(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=sharingAppSelected&ua=");
        sb2.append(m45085p());
        sb2.append("&ctx=");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown";
        }
        sb2.append(str);
        String string = sb2.toString();
        if (TextUtils.isEmpty(str2)) {
            str3 = string + "&status=Fail";
        } else {
            str3 = string + "&status=Success&appName=" + str2;
        }
        m45087a(str3);
    }

    /* JADX INFO: renamed from: m */
    public void m45098m(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=shareSheetLoad&ua=");
        sb2.append(m45085p());
        sb2.append("&ctx=");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append("&link=");
        sb2.append(str2);
        m45087a(sb2.toString());
    }

    /* JADX INFO: renamed from: n */
    public void m45099n(String str) {
        m45087a("evt=sharingAppSelected&appName=" + str);
    }

    /* JADX INFO: renamed from: o */
    public void m45100o() {
        m45087a("evt=switchAccount");
    }

    /* JADX INFO: renamed from: r */
    public void m45101r() {
        NativeGLInterface.nativeReleaseAllRbxEventStreams();
    }

    /* JADX INFO: renamed from: s */
    public void m45102s() {
        synchronized (this.f42867a) {
            try {
                if (this.f42868b.isEmpty()) {
                    return;
                }
                C6124q.m27057b("EventStreamManager", "sendAllNow: # of events " + this.f42868b.size());
                String strM45084b = m45084b(this.f42868b);
                C6124q.m27057b("EventStreamManager", "sendAllNow: httpPostBody: " + strM45084b);
                this.f42868b.clear();
                this.f42869c = 0L;
                this.f42870d.mo45105a(C11295a1.m42387C0(), strM45084b, new a(), C11295a1.m42418S()).m23953c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m45103t() {
        return this.f42868b.size() >= Math.min(C11659h.m43403a().mo43682n1(), 900) || this.f42871e.mo27017b() - this.f42869c >= ((long) C11659h.m43403a().mo43736v()) * 1000;
    }
}
