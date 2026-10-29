package z;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.g1 f36979a;
    public final androidx.p000lifecycle.d0<g0.w> b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36980a;

        static {
            int[] iArr = new int[n0.p0.a.values().length];
            f36980a = iArr;
            try {
                iArr[n0.p0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36980a[n0.p0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36980a[n0.p0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36980a[n0.p0.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36980a[n0.p0.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36980a[n0.p0.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36980a[n0.p0.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36980a[n0.p0.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public z2(n0.g1 g1Var) {
        this.f36979a = g1Var;
        androidx.p000lifecycle.d0<g0.w> d0Var = new androidx.p000lifecycle.d0<>();
        this.b = d0Var;
        d0Var.m(g0.w.a(g0.w.b.CLOSED));
    }

    public androidx.p000lifecycle.a0<g0.w> a() {
        return this.b;
    }

    public final g0.w b() {
        return this.f36979a.c() ? g0.w.a(g0.w.b.OPENING) : g0.w.a(g0.w.b.PENDING_OPEN);
    }

    public void c(n0.p0.a aVar, g0.w.a aVar2) {
        g0.w wVarB;
        if (aVar2 == null || aVar2.d() != 8) {
            switch (a.f36980a[aVar.ordinal()]) {
                case 1:
                    wVarB = b();
                    break;
                case 2:
                    wVarB = g0.w.b(g0.w.b.OPENING, aVar2);
                    break;
                case 3:
                case 4:
                    wVarB = g0.w.b(g0.w.b.OPEN, aVar2);
                    break;
                case 5:
                case 6:
                    wVarB = g0.w.b(g0.w.b.CLOSING, aVar2);
                    break;
                case 7:
                case 8:
                    wVarB = g0.w.b(g0.w.b.CLOSED, aVar2);
                    break;
                default:
                    throw new IllegalStateException("Unknown internal camera state: " + aVar);
            }
        } else {
            wVarB = g0.w.b(g0.w.b.CLOSED, aVar2);
        }
        g0.r1.a("CameraStateMachine", "New public camera state " + wVarB + " from " + aVar + " and " + aVar2);
        if (Objects.equals(this.b.f(), wVarB)) {
            return;
        }
        g0.r1.a("CameraStateMachine", "Publishing new public camera state " + wVarB);
        this.b.m(wVarB);
    }
}
