package fb;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f16534e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f16535f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f16536a;
    public final j b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga.o f16537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ka.e f16538d;

    public h0(Application application, j jVar, ga.o oVar, ka.e eVar) {
        this.f16536a = application;
        this.b = jVar;
        this.f16537c = oVar;
        this.f16538d = eVar;
    }

    public static void a(@NonNull Context context) {
        n9.m.a(context != null);
        AtomicReference atomicReference = f16534e;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
                        h0 h0Var = new h0(application, j.a(application), ga.o.a(application), ka.e.b(context));
                        atomicReference.set(h0Var);
                        h0Var.f16538d.a();
                        h0Var.b.b();
                        h0Var.f16537c.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f16535f = true;
    }

    public static void b() {
        n9.m.q(f16535f, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static Application c() {
        b();
        return ((h0) f16534e.get()).f16536a;
    }
}
