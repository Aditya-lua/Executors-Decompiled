package vi;

import android.content.Context;
import cl.g;
import dj.h;
import mv.i0;
import ok.q;
import sw.d;
import sw.f;
import sw.x;

/* JADX INFO: loaded from: classes2.dex */
public class b implements yk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f34398a;

    public class a implements f<i0> {
        public a() {
        }

        @Override // sw.f
        public void a(d<i0> dVar, Throwable th2) {
        }

        @Override // sw.f
        public void b(d<i0> dVar, x<i0> xVar) {
            q.b("rbx.jni", "sendSessionReport() success:" + xVar.g());
        }
    }

    public b(Context context) {
        f34398a = context.getFilesDir().getAbsolutePath();
    }

    @Override // yk.a
    public String a() {
        return f34398a;
    }

    @Override // yk.a
    public void b(String str, String str2) {
        long j10;
        try {
            j10 = Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            q.k("rbx.jni", "sendSessionReport() could not parse placeId");
            j10 = -1;
        }
        g.d().a().postSessionReport(j10, str).L(new a());
    }

    @Override // yk.a
    public String c() {
        return Long.toString(h.e().g());
    }

    @Override // yk.a
    public String d() {
        return nk.c.c().k();
    }

    @Override // yk.a
    public String e() {
        return "2.747.1486";
    }

    @Override // yk.a
    public void f(String str, String str2, String str3, long j10) {
        try {
            Long.parseLong(str3);
        } catch (NumberFormatException unused) {
        }
    }
}
