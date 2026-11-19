package gb;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f17628e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f17629f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f17630a;
    public final k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ha.o f17631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final la.e f17632d;

    public i0(Application application, k kVar, ha.o oVar, la.e eVar) {
        this.f17630a = application;
        this.b = kVar;
        this.f17631c = oVar;
        this.f17632d = eVar;
    }

    public static void a(@NonNull Context context) {
        o9.s.a(context != null);
        AtomicReference atomicReference = f17628e;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
                        i0 i0Var = new i0(application, k.a(application), ha.o.a(application), la.e.b(context));
                        atomicReference.set(i0Var);
                        i0Var.f17632d.a();
                        i0Var.b.b();
                        i0Var.f17631c.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        f17629f = true;
    }

    public static void b() {
        o9.s.q(f17629f, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static Application c() {
        b();
        return ((i0) f17628e.get()).f17630a;
    }
}
