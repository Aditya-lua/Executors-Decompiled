package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2680a;

    @NonNull
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final g.f<T> f2681c;

    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f2682d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Executor f2683e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f2684a;
        public Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g.f<T> f2685c;

        public a(@NonNull g.f<T> fVar) {
            this.f2685c = fVar;
        }

        @NonNull
        public c<T> a() {
            if (this.b == null) {
                synchronized (f2682d) {
                    try {
                        if (f2683e == null) {
                            f2683e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.b = f2683e;
            }
            return new c<>(this.f2684a, this.b, this.f2685c);
        }
    }

    public c(Executor executor, @NonNull Executor executor2, @NonNull g.f<T> fVar) {
        this.f2680a = executor;
        this.b = executor2;
        this.f2681c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.b;
    }

    @NonNull
    public g.f<T> b() {
        return this.f2681c;
    }

    public Executor c() {
        return this.f2680a;
    }
}
