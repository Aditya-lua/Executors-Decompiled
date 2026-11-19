package cl;

import android.content.Context;
import android.os.Build;
import com.roblox.platform.util.DeviceUtils;
import dl.k;
import mv.d0;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f5485a;
    public static b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d0 f5486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static dl.f f5487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f5488e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d f5489f;

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        return new i().n(DeviceUtils.getDeviceTotalMegabytes(context)).p(DeviceUtils.getScreenSize(context)).g(DeviceUtils.getScreenDpi(context)).f(DeviceUtils.getScreenDpSize(context)).d(DeviceUtils.getDeviceName(z10)).a(Build.VERSION.RELEASE).r(str2).q(str).e(str3).b(str4).m(z10).j(z11).i(z12).l(z13).k(false).c();
    }

    public static d0 b() {
        if (f5486c == null) {
            synchronized (g.class) {
                try {
                    if (f5486c == null) {
                        if (f5487d == null) {
                            f5487d = new dl.c();
                        }
                        f5486c = f5487d.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f5486c;
    }

    public static b c() {
        return b;
    }

    public static d d() {
        if (f5489f == null) {
            synchronized (g.class) {
                try {
                    if (f5489f == null) {
                        f5489f = f5488e.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f5489f;
    }

    public static String e() {
        return f5485a;
    }

    public static void f(dl.a aVar) {
        k.b(aVar);
    }

    public static void g(b bVar) {
        b = bVar;
    }

    public static void h(dl.f fVar) {
        f5487d = fVar;
    }

    public static void i(f fVar) {
        f5488e = fVar;
        synchronized (g.class) {
            f5489f = null;
        }
    }

    public static void j(String str) {
        f5485a = str;
    }
}
