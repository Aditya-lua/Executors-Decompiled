package g0;

import n0.b4;
import n0.n3;

/* JADX INFO: loaded from: classes.dex */
public interface c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f17351a = new c2() { // from class: g0.b2
        @Override // g0.c2
        public final c2.c e(c2.b bVar) {
            return c2.c.f17354d;
        }
    };
    public static final c2 b = new n0.a1.b(c());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c2 f17352c = new n0.a1(c());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c2 f17353a;
        public long b;

        public a(c2 c2Var) {
            this.f17353a = c2Var;
            this.b = c2Var.a();
        }

        public c2 a() {
            c2 c2Var = this.f17353a;
            return c2Var instanceof n3 ? ((n3) c2Var).b(this.b) : new b4(this.b, this.f17353a);
        }
    }

    public interface b {
        int m();

        Throwable n();

        long o();
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f17354d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f17355e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f17356f = new c(true, 100);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static c f17357g = new c(false, 0, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17358a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17359c;

        public c(boolean z10) {
            this(z10, a());
        }

        public static long a() {
            return 500L;
        }

        public long b() {
            return this.f17358a;
        }

        public boolean c() {
            return this.f17359c;
        }

        public boolean d() {
            return this.b;
        }

        public c(boolean z10, long j10) {
            this(z10, j10, false);
        }

        public c(boolean z10, long j10, boolean z11) {
            this.b = z10;
            this.f17358a = j10;
            if (z11) {
                x2.g.b(!z10, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f17359c = z11;
        }
    }

    static long c() {
        return 6000L;
    }

    default long a() {
        return 0L;
    }

    c e(b bVar);
}
