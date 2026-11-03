package li;

import android.content.Context;
import ek.q;
import hv.d;
import hv.f;
import hv.x;
import okhttp3.ResponseBody;
import ti.h;
import tk.g;

/* JADX INFO: loaded from: classes2.dex */
public class b implements pk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f23571a;

    public class a implements f<ResponseBody> {
        public a() {
        }

        @Override // hv.f
        public void a(d<ResponseBody> dVar, x<ResponseBody> xVar) {
            q.b("rbx.jni", "sendSessionReport() success:" + xVar.g());
        }

        @Override // hv.f
        public void b(d<ResponseBody> dVar, Throwable th2) {
        }
    }

    public b(Context context) {
        f23571a = context.getFilesDir().getAbsolutePath();
    }

    @Override // pk.a
    public String a() {
        return f23571a;
    }

    @Override // pk.a
    public void b(String str, String str2) {
        long j10;
        try {
            j10 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            q.k("rbx.jni", "sendSessionReport() could not parse placeId");
            j10 = -1;
        }
        g.d().a().a(j10, str).m(new a());
    }

    @Override // pk.a
    public String c() {
        return Long.toString(h.e().g());
    }

    @Override // pk.a
    public String d() {
        return dk.c.c().k();
    }

    @Override // pk.a
    public String e() {
        return "2.745.1142";
    }

    @Override // pk.a
    public void f(String str, String str2, String str3, long j10) {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
