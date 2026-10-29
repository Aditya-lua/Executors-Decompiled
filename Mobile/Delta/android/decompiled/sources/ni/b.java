package ni;

import android.content.Context;
import gk.p;
import jv.d;
import jv.f;
import jv.x;
import okhttp3.ResponseBody;
import vi.h;
import vk.g;

/* JADX INFO: loaded from: classes2.dex */
public class b implements rk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f26282a;

    public class a implements f<ResponseBody> {
        public a() {
        }

        @Override // jv.f
        public void a(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            p.b("rbx.jni", "sendSessionReport() success:" + xVar.g());
        }

        @Override // jv.f
        public void b(d<ResponseBody> dVar, Throwable th2) {
        }
    }

    public b(Context context) {
        f26282a = context.getFilesDir().getAbsolutePath();
    }

    @Override // rk.a
    public String a() {
        return f26282a;
    }

    @Override // rk.a
    public void b(String str, String str2) {
        long j10;
        try {
            j10 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            p.k("rbx.jni", "sendSessionReport() could not parse placeId");
            j10 = -1;
        }
        g.d().a().a(j10, str).B(new a());
    }

    @Override // rk.a
    public String c() {
        return Long.toString(h.e().g());
    }

    @Override // rk.a
    public String d() {
        return fk.c.c().k();
    }

    @Override // rk.a
    public String e() {
        return "2.743.1136";
    }

    @Override // rk.a
    public void f(String str, String str2, String str3, long j10) {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
