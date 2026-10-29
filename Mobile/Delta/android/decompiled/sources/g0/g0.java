package g0;

import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c3;
import n0.h3;
import n0.j4;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements s0.q<f0> {
    public static final n0.n1.a<n0.n0.a> Q = n0.n1.a.a("camerax.core.appConfig.cameraFactoryProvider", n0.n0.a.class);
    public static final n0.n1.a<n0.m0.a> R = n0.n1.a.a("camerax.core.appConfig.deviceSurfaceManagerProvider", n0.m0.a.class);
    public static final n0.n1.a<j4.c> S = n0.n1.a.a("camerax.core.appConfig.useCaseConfigFactoryProvider", j4.c.class);
    public static final n0.n1.a<Executor> T = n0.n1.a.a("camerax.core.appConfig.cameraExecutor", Executor.class);
    public static final n0.n1.a<Handler> U = n0.n1.a.a("camerax.core.appConfig.schedulerHandler", Handler.class);
    public static final n0.n1.a<Integer> V;
    public static final n0.n1.a<v> W;
    public static final n0.n1.a<Long> X;
    public static final n0.n1.a<c2> Y;
    public static final n0.n1.a<h3> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final n0.n1.a<Integer> f17429a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final n0.n1.a<Boolean> f17430b0;
    public final c3 P;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0.x2 f17431a;

        public a() {
            this(n0.x2.k0());
        }

        public g0 a() {
            return new g0(c3.j0(this.f17431a));
        }

        public n0.w2 b() {
            return this.f17431a;
        }

        public a c(n0.n0.a aVar) {
            b().G(g0.Q, aVar);
            return this;
        }

        public a d(int i10) {
            b().G(g0.f17429a0, Integer.valueOf(i10));
            return this;
        }

        public a e(n0.m0.a aVar) {
            b().G(g0.R, aVar);
            return this;
        }

        public a f(boolean z10) {
            b().G(g0.f17430b0, Boolean.valueOf(z10));
            return this;
        }

        public a g(Class<f0> cls) {
            b().G(s0.q.N, cls);
            if (b().h(s0.q.M, null) == null) {
                h(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a h(String str) {
            b().G(s0.q.M, str);
            return this;
        }

        public a i(j4.c cVar) {
            b().G(g0.S, cVar);
            return this;
        }

        public a(n0.x2 x2Var) {
            this.f17431a = x2Var;
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls == null || cls.equals(f0.class)) {
                g(f0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public interface b {
        g0 getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        V = n0.n1.a.a("camerax.core.appConfig.minimumLoggingLevel", cls);
        W = n0.n1.a.a("camerax.core.appConfig.availableCamerasLimiter", v.class);
        X = n0.n1.a.a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        Y = n0.n1.a.a("camerax.core.appConfig.cameraProviderInitRetryPolicy", c2.class);
        Z = n0.n1.a.a("camerax.core.appConfig.quirksSettings", h3.class);
        f17429a0 = n0.n1.a.a("camerax.core.appConfig.configImplType", cls);
        f17430b0 = n0.n1.a.a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    public g0(c3 c3Var) {
        this.P = c3Var;
    }

    public v h0(v vVar) {
        return (v) this.P.h(W, vVar);
    }

    public Executor i0(Executor executor) {
        return (Executor) this.P.h(T, executor);
    }

    public n0.n0.a j0(n0.n0.a aVar) {
        return (n0.n0.a) this.P.h(Q, aVar);
    }

    public long k0() {
        return ((Long) this.P.h(X, -1L)).longValue();
    }

    public c2 l0() {
        c2 c2Var = (c2) this.P.h(Y, c2.b);
        Objects.requireNonNull(c2Var);
        return c2Var;
    }

    public int m0() {
        return ((Integer) this.P.h(f17429a0, -1)).intValue();
    }

    @Override // n0.l3
    public n0.n1 n() {
        return this.P;
    }

    public n0.m0.a n0(n0.m0.a aVar) {
        return (n0.m0.a) this.P.h(R, aVar);
    }

    public h3 o0() {
        return (h3) this.P.h(Z, null);
    }

    public Handler p0(Handler handler) {
        return (Handler) this.P.h(U, handler);
    }

    public j4.c q0(j4.c cVar) {
        return (j4.c) this.P.h(S, cVar);
    }

    public boolean r0() {
        return ((Boolean) this.P.h(f17430b0, Boolean.TRUE)).booleanValue();
    }
}
