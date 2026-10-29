package p140g0;

import android.os.Handler;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p296n0.C8734c3;
import p296n0.C8764h3;
import p296n0.C8846x2;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8789m0;
import p296n0.InterfaceC8794n0;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8841w2;
import p424s0.InterfaceC11156q;

/* JADX INFO: renamed from: g0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5886g0 implements InterfaceC11156q<C5882f0> {

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC8795n1.a<InterfaceC8794n0.a> f22489Q = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC8794n0.a.class);

    /* JADX INFO: renamed from: R */
    public static final InterfaceC8795n1.a<InterfaceC8789m0.a> f22490R = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC8789m0.a.class);

    /* JADX INFO: renamed from: S */
    public static final InterfaceC8795n1.a<InterfaceC8777j4.c> f22491S = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC8777j4.c.class);

    /* JADX INFO: renamed from: T */
    public static final InterfaceC8795n1.a<Executor> f22492T = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* JADX INFO: renamed from: U */
    public static final InterfaceC8795n1.a<Handler> f22493U = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* JADX INFO: renamed from: V */
    public static final InterfaceC8795n1.a<Integer> f22494V;

    /* JADX INFO: renamed from: W */
    public static final InterfaceC8795n1.a<C5945v> f22495W;

    /* JADX INFO: renamed from: X */
    public static final InterfaceC8795n1.a<Long> f22496X;

    /* JADX INFO: renamed from: Y */
    public static final InterfaceC8795n1.a<InterfaceC5872c2> f22497Y;

    /* JADX INFO: renamed from: Z */
    public static final InterfaceC8795n1.a<C8764h3> f22498Z;

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC8795n1.a<Integer> f22499a0;

    /* JADX INFO: renamed from: b0 */
    public static final InterfaceC8795n1.a<Boolean> f22500b0;

    /* JADX INFO: renamed from: P */
    public final C8734c3 f22501P;

    /* JADX INFO: renamed from: g0.g0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f22502a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(C8846x2.m35505k0());
        }

        /* JADX INFO: renamed from: a */
        public C5886g0 m26455a() {
            return new C5886g0(C8734c3.m35022j0(this.f22502a));
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC8841w2 m26456b() {
            return this.f22502a;
        }

        /* JADX INFO: renamed from: c */
        public a m26457c(InterfaceC8794n0.a aVar) {
            m26456b().mo35473G(C5886g0.f22489Q, aVar);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m26458d(int i10) {
            m26456b().mo35473G(C5886g0.f22499a0, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m26459e(InterfaceC8789m0.a aVar) {
            m26456b().mo35473G(C5886g0.f22490R, aVar);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m26460f(boolean z10) {
            m26456b().mo35473G(C5886g0.f22500b0, Boolean.valueOf(z10));
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m26461g(Class<C5882f0> cls) {
            m26456b().mo35473G(InterfaceC11156q.f39401N, cls);
            if (m26456b().mo35030h(InterfaceC11156q.f39400M, null) == null) {
                m26462h(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m26462h(String str) {
            m26456b().mo35473G(InterfaceC11156q.f39400M, str);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m26463i(InterfaceC8777j4.c cVar) {
            m26456b().mo35473G(C5886g0.f22491S, cVar);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(C8846x2 c8846x2) {
            this.f22502a = c8846x2;
            Class cls = (Class) c8846x2.mo35030h(InterfaceC11156q.f39401N, null);
            if (cls == null || cls.equals(C5882f0.class)) {
                m26461g(C5882f0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: g0.g0$b */
    public interface b {
        C5886g0 getCameraXConfig();
    }

    static {
        Class cls = Integer.TYPE;
        f22494V = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.minimumLoggingLevel", cls);
        f22495W = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.availableCamerasLimiter", C5945v.class);
        f22496X = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE);
        f22497Y = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.cameraProviderInitRetryPolicy", InterfaceC5872c2.class);
        f22498Z = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.quirksSettings", C8764h3.class);
        f22499a0 = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.configImplType", cls);
        f22500b0 = InterfaceC8795n1.a.m35291a("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE);
    }

    public C5886g0(C8734c3 c8734c3) {
        this.f22501P = c8734c3;
    }

    /* JADX INFO: renamed from: h0 */
    public C5945v m26444h0(C5945v c5945v) {
        return (C5945v) this.f22501P.mo35030h(f22495W, c5945v);
    }

    /* JADX INFO: renamed from: i0 */
    public Executor m26445i0(Executor executor) {
        return (Executor) this.f22501P.mo35030h(f22492T, executor);
    }

    /* JADX INFO: renamed from: j0 */
    public InterfaceC8794n0.a m26446j0(InterfaceC8794n0.a aVar) {
        return (InterfaceC8794n0.a) this.f22501P.mo35030h(f22489Q, aVar);
    }

    /* JADX INFO: renamed from: k0 */
    public long m26447k0() {
        return ((Long) this.f22501P.mo35030h(f22496X, -1L)).longValue();
    }

    /* JADX INFO: renamed from: l0 */
    public InterfaceC5872c2 m26448l0() {
        InterfaceC5872c2 interfaceC5872c2 = (InterfaceC5872c2) this.f22501P.mo35030h(f22497Y, InterfaceC5872c2.f22389b);
        Objects.requireNonNull(interfaceC5872c2);
        return interfaceC5872c2;
    }

    /* JADX INFO: renamed from: m0 */
    public int m26449m0() {
        return ((Integer) this.f22501P.mo35030h(f22499a0, -1)).intValue();
    }

    @Override // p296n0.InterfaceC8787l3
    /* JADX INFO: renamed from: n */
    public InterfaceC8795n1 mo6691n() {
        return this.f22501P;
    }

    /* JADX INFO: renamed from: n0 */
    public InterfaceC8789m0.a m26450n0(InterfaceC8789m0.a aVar) {
        return (InterfaceC8789m0.a) this.f22501P.mo35030h(f22490R, aVar);
    }

    /* JADX INFO: renamed from: o0 */
    public C8764h3 m26451o0() {
        return (C8764h3) this.f22501P.mo35030h(f22498Z, null);
    }

    /* JADX INFO: renamed from: p0 */
    public Handler m26452p0(Handler handler) {
        return (Handler) this.f22501P.mo35030h(f22493U, handler);
    }

    /* JADX INFO: renamed from: q0 */
    public InterfaceC8777j4.c m26453q0(InterfaceC8777j4.c cVar) {
        return (InterfaceC8777j4.c) this.f22501P.mo35030h(f22491S, cVar);
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m26454r0() {
        return ((Boolean) this.f22501P.mo35030h(f22500b0, Boolean.TRUE)).booleanValue();
    }
}
