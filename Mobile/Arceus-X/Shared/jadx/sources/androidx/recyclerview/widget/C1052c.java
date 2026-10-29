package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1052c<T> {

    /* JADX INFO: renamed from: a */
    public final Executor f4132a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Executor f4133b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C1056g.f<T> f4134c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: d */
        public static final Object f4135d = new Object();

        /* JADX INFO: renamed from: e */
        public static Executor f4136e;

        /* JADX INFO: renamed from: a */
        public Executor f4137a;

        /* JADX INFO: renamed from: b */
        public Executor f4138b;

        /* JADX INFO: renamed from: c */
        public final C1056g.f<T> f4139c;

        public a(@NonNull C1056g.f<T> fVar) {
            this.f4139c = fVar;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C1052c<T> m5863a() {
            if (this.f4138b == null) {
                synchronized (f4135d) {
                    try {
                        if (f4136e == null) {
                            f4136e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f4138b = f4136e;
            }
            return new C1052c<>(this.f4137a, this.f4138b, this.f4139c);
        }
    }

    public C1052c(Executor executor, @NonNull Executor executor2, @NonNull C1056g.f<T> fVar) {
        this.f4132a = executor;
        this.f4133b = executor2;
        this.f4134c = fVar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Executor m5860a() {
        return this.f4133b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public C1056g.f<T> m5861b() {
        return this.f4134c;
    }

    /* JADX INFO: renamed from: c */
    public Executor m5862c() {
        return this.f4132a;
    }
}
