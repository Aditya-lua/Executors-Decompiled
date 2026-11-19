package g7;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f17423a = false;
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f17424c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f17425d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static q7.f f17427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static q7.e f17428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile q7.h f17429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile q7.g f17430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static ThreadLocal<t7.g> f17431j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f17426e = a.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k7.b f17432k = new k7.c();

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
        return f17426e;
    }

    public static boolean e() {
        return f17425d;
    }

    public static k7.b f() {
        return f17432k;
    }

    public static t7.g g() {
        t7.g gVar = f17431j.get();
        if (gVar != null) {
            return gVar;
        }
        t7.g gVar2 = new t7.g();
        f17431j.set(gVar2);
        return gVar2;
    }

    public static boolean h() {
        return b;
    }

    public static q7.g i(@NonNull Context context) {
        q7.g gVar;
        if (!f17424c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        q7.g gVar2 = f17430i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (q7.g.class) {
            try {
                gVar = f17430i;
                if (gVar == null) {
                    q7.e eVar = f17428g;
                    if (eVar == null) {
                        eVar = new q7.e() { // from class: g7.d
                            @Override // q7.e
                            public final File a() {
                                return e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new q7.g(eVar);
                    f17430i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    public static q7.h j(@NonNull Context context) {
        q7.h hVar;
        q7.h hVar2 = f17429h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (q7.h.class) {
            try {
                hVar = f17429h;
                if (hVar == null) {
                    q7.g gVarI = i(context);
                    q7.f bVar = f17427f;
                    if (bVar == null) {
                        bVar = new q7.b();
                    }
                    hVar = new q7.h(gVarI, bVar);
                    f17429h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
