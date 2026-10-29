package r;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f29686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final Executor f29687d = new Executor() { // from class: r.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Executor f29688e = new Executor() { // from class: r.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public e f29689a;

    @NonNull
    public final e b;

    public c() {
        d dVar = new d();
        this.b = dVar;
        this.f29689a = dVar;
    }

    @NonNull
    public static Executor f() {
        return f29688e;
    }

    @NonNull
    public static c g() {
        if (f29686c != null) {
            return f29686c;
        }
        synchronized (c.class) {
            try {
                if (f29686c == null) {
                    f29686c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f29686c;
    }

    @Override // r.e
    public void a(@NonNull Runnable runnable) {
        this.f29689a.a(runnable);
    }

    @Override // r.e
    public boolean b() {
        return this.f29689a.b();
    }

    @Override // r.e
    public void c(@NonNull Runnable runnable) {
        this.f29689a.c(runnable);
    }
}
