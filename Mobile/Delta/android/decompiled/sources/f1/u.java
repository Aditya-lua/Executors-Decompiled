package f1;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16035a;

    public static abstract class a<T extends u, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b.a<?> f16036a;

        public a(b.a<?> aVar) {
            this.f16036a = aVar;
            aVar.b(0L);
            aVar.a(0L);
        }
    }

    public static abstract class b {

        public static abstract class a<B> {
            public abstract B a(long j10);

            public abstract B b(long j10);
        }

        public abstract long a();

        public abstract long b();

        public abstract Location c();
    }

    public u(b bVar) {
        this.f16035a = bVar;
    }

    public long a() {
        return this.f16035a.a();
    }

    public long b() {
        return this.f16035a.b();
    }

    public Location c() {
        return this.f16035a.c();
    }
}
