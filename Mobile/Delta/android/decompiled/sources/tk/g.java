package tk;

import android.content.Context;
import android.os.Build;
import okhttp3.OkHttpClient;
import uk.k;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f32411a;
    public static b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static OkHttpClient f32412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static uk.f f32413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f32414e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d f32415f;

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new i().n(cl.a.c(context)).p(cl.a.j(context)).g(cl.a.g(context)).f(cl.a.f(context)).d(cl.a.b(z10)).a(Build.VERSION.RELEASE).r(str2).q(str).e(str3).b(str4).m(z10).j(z11).i(z12).l(z13).k(false).c();
    }

    public static OkHttpClient b() {
        if (f32412c == null) {
            synchronized (g.class) {
                try {
                    if (f32412c == null) {
                        if (f32413d == null) {
                            f32413d = new uk.c();
                        }
                        f32412c = f32413d.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32412c;
    }

    public static b c() {
        return b;
    }

    public static d d() {
        if (f32415f == null) {
            synchronized (g.class) {
                try {
                    if (f32415f == null) {
                        f32415f = f32414e.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32415f;
    }

    public static String e() {
        return f32411a;
    }

    public static void f(uk.a aVar) {
        k.b(aVar);
    }

    public static void g(b bVar) {
        b = bVar;
    }

    public static void h(uk.f fVar) {
        f32413d = fVar;
    }

    public static void i(f fVar) {
        f32414e = fVar;
        synchronized (g.class) {
            f32415f = null;
        }
    }

    public static void j(String str) {
        f32411a = str;
    }
}
