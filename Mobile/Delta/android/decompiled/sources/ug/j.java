package ug;

import android.text.TextUtils;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeGLInterface;
import ek.d0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32853a = new Object();
    public final List<String> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f32855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ek.c0 f32856e;

    public class a implements ci.m {
        public a() {
        }

        @Override // ci.m
        public void a(ci.j jVar) {
            if (jVar.b() == 200 || jVar.b() == 202) {
                return;
            }
            ek.q.k("EventStreamManager", "addEvent: Failed to post events. Ignore and do nothing");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f32858a = new j(new d(), new d0());
    }

    public interface c {
        ci.r a(String str, String str2, ci.m mVar, String str3);
    }

    public static class d implements c {
        @Override // ug.j.c
        public ci.r a(String str, String str2, ci.m mVar, String str3) {
            return new ci.r(str, str2, mVar, str3);
        }
    }

    public j(c cVar, ek.c0 c0Var) {
        ek.q.h("EventStreamManager", "[Constructor]: ENTER.");
        this.f32855d = cVar;
        this.f32856e = c0Var;
    }

    public static String b(List<String> list) {
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

    public static String p() {
        try {
            return URLEncoder.encode(a1.a1(), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            ek.q.e("EventStreamManager", "Failed to URL-encode the user-agent. Exception: " + e10);
            return null;
        }
    }

    public static j q() {
        return b.f32858a;
    }

    public void a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lt=");
        sb2.append(String.format("%tFT%<tT.%<tLZ", Calendar.getInstance(TimeZone.getTimeZone("Z"))));
        sb2.append("&mdid=");
        sb2.append(a1.f30333t);
        sb2.append("&idfv=");
        sb2.append(a1.f30333t);
        sb2.append("&idfa=");
        ek.c.g();
        sb2.append(ek.c.d());
        String str2 = sb2.toString() + "&" + str;
        synchronized (this.f32853a) {
            try {
                this.b.add(str2);
                if (this.b.size() == 1) {
                    this.f32854c = this.f32856e.b();
                }
                if (t()) {
                    s();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(String str, long j10) {
        String str2 = "evt=appLaunch&ctx=" + str + "&appStoreSource=google";
        if (rh.h.a().j4() && j10 > 0) {
            str2 = str2 + "&android_first_install_time=" + j10;
        }
        a(str2);
    }

    public void d(String str, String str2, String str3, String str4) {
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
        a(sb2.toString());
    }

    public void e(String str, String str2) {
        a("evt=buttonClick&ctx=" + str + "&btn=" + str2);
    }

    public void f(String str, String str2, String str3) {
        a("evt=buttonClick&ctx=" + str + "&btn=" + str2 + "&cstm=" + str3);
    }

    public void g(String str, String str2, String str3) {
        a("evt=clientSideError&ctx=" + str + "&error=" + str2 + "&data=" + str3);
    }

    public void h(String str, String str2, int i10, int i11) {
        a("evt=endpointFailure&ctx=" + str + "&url=" + str2 + "&errorCode=" + i10 + "&serverErrorCode=" + i11);
    }

    public void i(String str, String str2, List<NameValuePair> list) {
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
        a(sb2.toString());
    }

    public void j(String str, boolean z10) {
        a("evt=pushNotificationOSSettingsChanged&ua=" + p() + "&ctx=" + str + "&enabled=" + z10);
    }

    public void k(String str) {
        a("evt=screenLoaded&ctx=" + str);
    }

    public void l(String str, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=sharingAppSelected&ua=");
        sb2.append(p());
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
        a(str3);
    }

    public void m(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("evt=shareSheetLoad&ua=");
        sb2.append(p());
        sb2.append("&ctx=");
        if (TextUtils.isEmpty(str)) {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append("&link=");
        sb2.append(str2);
        a(sb2.toString());
    }

    public void n(String str) {
        a("evt=sharingAppSelected&appName=" + str);
    }

    public void o() {
        a("evt=switchAccount");
    }

    public void r() {
        NativeGLInterface.nativeReleaseAllRbxEventStreams();
    }

    public void s() {
        synchronized (this.f32853a) {
            try {
                if (this.b.isEmpty()) {
                    return;
                }
                ek.q.b("EventStreamManager", "sendAllNow: # of events " + this.b.size());
                String strB = b(this.b);
                ek.q.b("EventStreamManager", "sendAllNow: httpPostBody: " + strB);
                this.b.clear();
                this.f32854c = 0L;
                this.f32855d.a(a1.D0(), strB, new a(), a1.S()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t() {
        return this.b.size() >= Math.min(rh.h.a().r1(), 900) || this.f32856e.b() - this.f32854c >= ((long) rh.h.a().u()) * 1000;
    }
}
