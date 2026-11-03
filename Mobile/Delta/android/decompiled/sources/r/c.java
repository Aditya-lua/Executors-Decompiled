package r;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f30088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final Executor f30089d = new Executor() { // from class: r.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Executor f30090e = new Executor() { // from class: r.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public e f30091a;

    @NonNull
    public final e b;

    public c() {
        d dVar = new d();
        this.b = dVar;
        this.f30091a = dVar;
    }

    @NonNull
    public static Executor f() {
        return f30090e;
    }

    @NonNull
    public static c g() {
        if (f30088c != null) {
            return f30088c;
        }
        synchronized (c.class) {
            try {
                if (f30088c == null) {
                    f30088c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f30088c;
    }

    @Override // r.e
    public void a(@NonNull Runnable runnable) {
        this.f30091a.a(runnable);
    }

    @Override // r.e
    public boolean b() {
        return this.f30091a.b();
    }

    @Override // r.e
    public void c(@NonNull Runnable runnable) {
        this.f30091a.c(runnable);
    }
}
