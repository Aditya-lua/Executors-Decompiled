package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3133a;

    @NonNull
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final g.f<T> f3134c;

    public static final class a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f3135d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Executor f3136e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Executor f3137a;
        public Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g.f<T> f3138c;

        public a(@NonNull g.f<T> fVar) {
            this.f3138c = fVar;
        }

        @NonNull
        public c<T> a() {
            if (this.b == null) {
                synchronized (f3135d) {
                    try {
                        if (f3136e == null) {
                            f3136e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.b = f3136e;
            }
            return new c<>(this.f3137a, this.b, this.f3138c);
        }
    }

    public c(Executor executor, @NonNull Executor executor2, @NonNull g.f<T> fVar) {
        this.f3133a = executor;
        this.b = executor2;
        this.f3134c = fVar;
    }

    @NonNull
    public Executor a() {
        return this.b;
    }

    @NonNull
    public g.f<T> b() {
        return this.f3134c;
    }

    public Executor c() {
        return this.f3133a;
    }
}
