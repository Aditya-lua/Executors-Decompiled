package f7;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f16344a = false;
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16345c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f16346d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p7.f f16348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static p7.e f16349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile p7.h f16350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile p7.g f16351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ThreadLocal<s7.g> f16352j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f16347e = a.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static j7.b f16353k = new j7.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static a d() {
        return f16347e;
    }

    public static boolean e() {
        return f16346d;
    }

    public static j7.b f() {
        return f16353k;
    }

    public static s7.g g() {
        s7.g gVar = f16352j.get();
        if (gVar != null) {
            return gVar;
        }
        s7.g gVar2 = new s7.g();
        f16352j.set(gVar2);
        return gVar2;
    }

    public static boolean h() {
        return b;
    }

    public static p7.g i(@NonNull Context context) {
        p7.g gVar;
        if (!f16345c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        p7.g gVar2 = f16351i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (p7.g.class) {
            try {
                gVar = f16351i;
                if (gVar == null) {
                    p7.e eVar = f16349g;
                    if (eVar == null) {
                        eVar = new p7.e() { // from class: f7.d
                            @Override // p7.e
                            public final File a() {
                                return e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new p7.g(eVar);
                    f16351i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    public static p7.h j(@NonNull Context context) {
        p7.h hVar;
        p7.h hVar2 = f16350h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (p7.h.class) {
            try {
                hVar = f16350h;
                if (hVar == null) {
                    p7.g gVarI = i(context);
                    p7.f bVar = f16348f;
                    if (bVar == null) {
                        bVar = new p7.b();
                    }
                    hVar = new p7.h(gVarI, bVar);
                    f16350h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
