package vk;

import android.content.Context;
import android.os.Build;
import okhttp3.OkHttpClient;
import wk.k;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f33276a;
    public static b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static OkHttpClient f33277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static wk.f f33278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f33279e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d f33280f;

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new i().m(el.a.c(context)).o(el.a.j(context)).g(el.a.g(context)).f(el.a.f(context)).d(el.a.b(z10)).a(Build.VERSION.RELEASE).q(str2).p(str).e(str3).b(str4).l(z10).j(z11).i(z12).k(z13).c();
    }

    public static OkHttpClient b() {
        if (f33277c == null) {
            synchronized (g.class) {
                try {
                    if (f33277c == null) {
                        if (f33278d == null) {
                            f33278d = new wk.c();
                        }
                        f33277c = f33278d.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33277c;
    }

    public static b c() {
        return b;
    }

    public static d d() {
        if (f33280f == null) {
            synchronized (g.class) {
                try {
                    if (f33280f == null) {
                        f33280f = f33279e.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33280f;
    }

    public static String e() {
        return f33276a;
    }

    public static void f(wk.a aVar) {
        k.b(aVar);
    }

    public static void g(b bVar) {
        b = bVar;
    }

    public static void h(wk.f fVar) {
        f33278d = fVar;
    }

    public static void i(f fVar) {
        f33279e = fVar;
        synchronized (g.class) {
            f33280f = null;
        }
    }

    public static void j(String str) {
        f33276a = str;
    }
}
