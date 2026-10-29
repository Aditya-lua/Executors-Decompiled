package p125fb;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import ga.C6072o;
import java.util.concurrent.atomic.AtomicReference;
import p243ka.C7519e;
import p305n9.C8953m;

/* JADX INFO: renamed from: fb.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5525h0 {

    /* JADX INFO: renamed from: e */
    public static final AtomicReference f21300e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public static boolean f21301f = false;

    /* JADX INFO: renamed from: a */
    public final Application f21302a;

    /* JADX INFO: renamed from: b */
    public final C5532j f21303b;

    /* JADX INFO: renamed from: c */
    public final C6072o f21304c;

    /* JADX INFO: renamed from: d */
    public final C7519e f21305d;

    public C5525h0(Application application, C5532j c5532j, C6072o c6072o, C7519e c7519e) {
        this.f21302a = application;
        this.f21303b = c5532j;
        this.f21304c = c6072o;
        this.f21305d = c7519e;
    }

    /* JADX INFO: renamed from: a */
    public static void m25189a(@NonNull Context context) {
        C8953m.m36036a(context != null);
        AtomicReference atomicReference = f21300e;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
                        C5525h0 c5525h0 = new C5525h0(application, C5532j.m25199a(application), C6072o.m26925a(application), C7519e.m31173b(context));
                        atomicReference.set(c5525h0);
                        c5525h0.f21305d.mo31171a();
                        c5525h0.f21303b.m25200b();
                        c5525h0.f21304c.m26926b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f21301f = true;
    }

    /* JADX INFO: renamed from: b */
    public static void m25190b() {
        C8953m.m36052q(f21301f, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    /* JADX INFO: renamed from: c */
    public static Application m25191c() {
        m25190b();
        return ((C5525h0) f21300e.get()).f21302a;
    }
}
