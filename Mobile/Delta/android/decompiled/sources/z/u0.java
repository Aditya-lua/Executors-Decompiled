package z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import backtraceio.library.services.BacktraceMetrics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements n0.p0 {
    public boolean A;
    public boolean B;
    public t4 C;
    public final o3 D;
    public final h5.b E;
    public final Set<String> F;
    public n0.h0 G;
    public final Object H;
    public n0.q3 I;
    public boolean J;
    public final q3 K;
    public final a0.c0 L;
    public final b0.e M;
    public final g5 N;
    public final h O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.h4 f37527a;
    public final a0.p0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f37529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i f37530e = i.INITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.u2<n0.p0.a> f37531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z2 f37532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f37533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f37534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z0 f37535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraDevice f37536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l3 f37538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f37539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ne.x<Void> f37540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y1.c.a<Void> f37541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map<l3, ne.x<Void>> f37542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f37544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f37545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h0.a f37546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n0.g1 f37547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g0.g0 f37548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f37549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f37550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f37551z;

    public class a implements z.g {
        public a() {
        }

        @Override // z.g
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // z.g
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f37553a;

        public b(y1.c.a aVar) {
            this.f37553a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            u0.this.a0("openCameraConfigAndClose camera closed");
            this.f37553a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            u0.this.a0("openCameraConfigAndClose camera disconnected");
            this.f37553a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            u0.this.a0("openCameraConfigAndClose camera error " + i10);
            this.f37553a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            u0.this.a0("openCameraConfigAndClose camera opened");
            ne.x xVarX = u0.this.X(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            xVarX.a(new Runnable() { // from class: z.v0
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, u0.this.f37528c);
        }
    }

    public class c implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f37554a;

        public c(l3 l3Var) {
            this.f37554a = l3Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            u0.this.f37542q.remove(this.f37554a);
            int iOrdinal = u0.this.f37530e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 5) {
                if (iOrdinal != 6 && (iOrdinal != 7 || u0.this.f37537l == 0)) {
                    return;
                } else {
                    u0.this.a0("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (u0.this.o0()) {
                u0 u0Var = u0.this;
                if (u0Var.f37536k != null) {
                    u0Var.a0("closing camera");
                    a0.a.a(u0.this.f37536k);
                    u0.this.f37536k = null;
                }
            }
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
        }
    }

    public class d implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l3 f37555a;

        public d(l3 l3Var) {
            this.f37555a = l3Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            if (u0.this.f37546u.e() == 2 && u0.this.f37530e == i.OPENED) {
                u0.this.D0(i.CONFIGURED);
            }
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof n0.u1.a) {
                n0.o3 o3VarC0 = u0.this.c0(((n0.u1.a) th2).a());
                if (o3VarC0 != null) {
                    u0.this.x0(o3VarC0);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                u0.this.a0("Unable to configure camera cancelled");
                return;
            }
            i iVar = u0.this.f37530e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                u0.this.E0(iVar2, g0.w.a.b(4, th2));
            }
            g0.r1.d("Camera2CameraImpl", "Unable to configure camera " + u0.this, th2);
            u0 u0Var = u0.this;
            if (u0Var.f37538m == this.f37555a) {
                u0Var.B0(false);
            }
        }
    }

    public final class e extends CameraManager.AvailabilityCallback implements n0.g1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37556a;
        public boolean b = true;

        public e(String str) {
            this.f37556a = str;
        }

        @Override // n0.g1.c
        public void a() {
            if (u0.this.f37530e == i.PENDING_OPEN || u0.this.f37530e == i.OPENING_WITH_ERROR) {
                u0.this.M0(false);
            }
        }

        public boolean b() {
            return this.b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f37556a.equals(str)) {
                this.b = true;
                if (u0.this.f37530e == i.PENDING_OPEN || u0.this.f37530e == i.OPENING_WITH_ERROR) {
                    u0.this.M0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f37556a.equals(str)) {
                this.b = false;
            }
        }
    }

    public final class f implements n0.g1.b {
        public f() {
        }

        @Override // n0.g1.b
        public void a() {
            if (u0.this.f37530e == i.OPENED) {
                u0.this.v0();
            }
        }
    }

    public final class g implements n0.l0.d {
        public g() {
        }

        @Override // n0.l0.d
        public void a() {
            u0.this.N0();
        }

        @Override // n0.l0.d
        public void b(List<n0.l1> list) {
            u0.this.G0((List) x2.g.g(list));
        }
    }

    public enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    public final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f37574a;
        public final ScheduledExecutorService b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f37575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ScheduledFuture<?> f37576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f37577e;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f37579a;
            public long b = -1;

            public a(long j10) {
                this.f37579a = j10;
            }

            public boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.b == -1) {
                    this.b = jUptimeMillis;
                }
                return jUptimeMillis - this.b;
            }

            public int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= 300000 ? 2000 : 4000;
            }

            public int d() {
                if (!j.this.f()) {
                    long j10 = this.f37579a;
                    return j10 > 0 ? Math.min((int) j10, BacktraceMetrics.defaultTimeBetweenRetriesMs) : BacktraceMetrics.defaultTimeBetweenRetriesMs;
                }
                long j11 = this.f37579a;
                if (j11 > 0) {
                    return Math.min((int) j11, 1800000);
                }
                return 1800000;
            }

            public void e() {
                this.b = -1L;
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Executor f37581a;
            public boolean b = false;

            public b(Executor executor) {
                this.f37581a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.b) {
                    return;
                }
                x2.g.i(u0.this.f37530e == i.REOPENING || u0.this.f37530e == i.REOPENING_QUIRK);
                if (j.this.f()) {
                    u0.this.L0(true);
                } else {
                    u0.this.M0(true);
                }
            }

            public void b() {
                this.b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f37581a.execute(new Runnable() { // from class: z.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u0.j.b.a(this.f37653a);
                    }
                });
            }
        }

        public j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f37574a = executor;
            this.b = scheduledExecutorService;
            this.f37577e = new a(j10);
        }

        public boolean a() {
            if (this.f37576d == null) {
                return false;
            }
            u0.this.a0("Cancelling scheduled re-open: " + this.f37575c);
            this.f37575c.b();
            this.f37575c = null;
            this.f37576d.cancel(false);
            this.f37576d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i10) {
            x2.g.j(u0.this.f37530e == i.OPENING || u0.this.f37530e == i.OPENED || u0.this.f37530e == i.CONFIGURED || u0.this.f37530e == i.REOPENING || u0.this.f37530e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + u0.this.f37530e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                g0.r1.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), u0.g0(i10)));
                c(i10);
                return;
            }
            g0.r1.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + u0.g0(i10) + " closing camera.");
            u0.this.E0(i.CLOSING, g0.w.a.a(i10 == 3 ? 5 : 6));
            u0.this.V(false);
        }

        public final void c(int i10) {
            int i11 = 1;
            x2.g.j(u0.this.f37537l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            u0.this.E0(i.REOPENING, g0.w.a.a(i11));
            u0.this.V(false);
        }

        public void d() {
            this.f37577e.e();
        }

        public void e() {
            x2.g.i(this.f37575c == null);
            x2.g.i(this.f37576d == null);
            if (!this.f37577e.a()) {
                g0.r1.c("Camera2CameraImpl", "Camera reopening attempted for " + this.f37577e.d() + "ms without success.");
                u0.this.F0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f37575c = new b(this.f37574a);
            u0.this.a0("Attempting camera re-open in " + this.f37577e.c() + "ms: " + this.f37575c + " activeResuming = " + u0.this.J);
            this.f37576d = this.b.schedule(this.f37575c, (long) this.f37577e.c(), TimeUnit.MILLISECONDS);
        }

        public boolean f() {
            u0 u0Var = u0.this;
            if (!u0Var.J) {
                return false;
            }
            int i10 = u0Var.f37537l;
            return i10 == 1 || i10 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            u0.this.a0("CameraDevice.onClosed()");
            x2.g.j(u0.this.f37536k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = u0.this.f37530e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                x2.g.i(u0.this.o0());
                u0.this.Y();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + u0.this.f37530e);
            }
            u0 u0Var = u0.this;
            if (u0Var.f37537l == 0) {
                u0Var.M0(false);
                return;
            }
            u0Var.a0("Camera closed due to error: " + u0.g0(u0.this.f37537l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            u0.this.a0("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            u0 u0Var = u0.this;
            u0Var.f37536k = cameraDevice;
            u0Var.f37537l = i10;
            u0Var.O.b();
            int iOrdinal = u0.this.f37530e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        g0.r1.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), u0.g0(i10), u0.this.f37530e.name()));
                        b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + u0.this.f37530e);
                }
            }
            g0.r1.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), u0.g0(i10), u0.this.f37530e.name()));
            u0.this.V(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            u0.this.a0("CameraDevice.onOpened()");
            u0 u0Var = u0.this;
            u0Var.f37536k = cameraDevice;
            u0Var.f37537l = 0;
            d();
            int iOrdinal = u0.this.f37530e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                x2.g.i(u0.this.o0());
                u0.this.f37536k.close();
                u0.this.f37536k = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + u0.this.f37530e);
                }
                u0.this.D0(i.OPENED);
                n0.g1 g1Var = u0.this.f37547v;
                String id2 = cameraDevice.getId();
                u0 u0Var2 = u0.this;
                if (g1Var.j(id2, u0Var2.f37546u.d(u0Var2.f37536k.getId()))) {
                    u0.this.v0();
                }
            }
        }
    }

    public static abstract class k {
        public static k a(String str, Class<?> cls, n0.o3 o3Var, n0.i4<?> i4Var, Size size, n0.t3 t3Var, List<n0.j4.b> list) {
            return new z.d(str, cls, o3Var, i4Var, size, t3Var, list);
        }

        public static k b(g0.w2 w2Var, boolean z10) {
            return a(u0.j0(w2Var), w2Var.getClass(), z10 ? w2Var.z() : w2Var.x(), w2Var.l(), w2Var.h(), w2Var.g(), u0.f0(w2Var));
        }

        public abstract List<n0.j4.b> c();

        public abstract n0.o3 d();

        public abstract n0.t3 e();

        public abstract Size f();

        public abstract n0.i4<?> g();

        public abstract String h();

        public abstract Class<?> i();
    }

    @SuppressLint({"NullAnnotationGroup"})
    public u0(Context context, a0.p0 p0Var, String str, z0 z0Var, h0.a aVar, n0.g1 g1Var, Executor executor, Handler handler, q3 q3Var, long j10, g0.g0 g0Var) throws g0.x {
        n0.u2<n0.p0.a> u2Var = new n0.u2<>();
        this.f37531f = u2Var;
        this.f37537l = 0;
        this.f37539n = new AtomicInteger(0);
        this.f37542q = new LinkedHashMap();
        this.f37543r = 0;
        this.f37551z = false;
        this.A = false;
        this.B = true;
        this.F = new HashSet();
        this.G = n0.k0.a();
        this.H = new Object();
        this.J = false;
        this.O = new h(this, null);
        this.b = p0Var;
        this.f37546u = aVar;
        this.f37547v = g1Var;
        ScheduledExecutorService scheduledExecutorServiceF = q0.c.f(handler);
        this.f37529d = scheduledExecutorServiceF;
        Executor executorG = q0.c.g(executor);
        this.f37528c = executorG;
        this.f37534i = new j(executorG, scheduledExecutorServiceF, j10);
        this.f37527a = new n0.h4(str);
        u2Var.n(n0.p0.a.CLOSED);
        z2 z2Var = new z2(g1Var);
        this.f37532g = z2Var;
        o3 o3Var = new o3(executorG);
        this.D = o3Var;
        this.K = q3Var;
        this.f37548w = g0Var;
        try {
            a0.c0 c0VarC = p0Var.c(str);
            this.L = c0VarC;
            y yVar = new y(c0VarC, scheduledExecutorServiceF, executorG, new g(), z0Var.l());
            this.f37533h = yVar;
            this.f37535j = z0Var;
            z0Var.G(yVar);
            z0Var.J(z2Var.a());
            this.M = b0.e.a(c0VarC);
            this.f37538m = q0();
            this.E = new h5.b(executorG, scheduledExecutorServiceF, handler, o3Var, z0Var.l(), c0.e.c());
            this.f37549x = d0.c.a(z0Var.l());
            this.f37550y = z0Var.l().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f37544s = eVar;
            f fVar = new f();
            this.f37545t = fVar;
            g1Var.g(this, executorG, fVar, eVar);
            p0Var.g(executorG, eVar);
            this.N = new g5(context, str, p0Var, new a(), j0.a.b);
        } catch (a0.f e10) {
            throw a3.a(e10);
        }
    }

    public static /* synthetic */ ne.x A(k3 k3Var, n0.u1 u1Var, Void r8) {
        k3Var.close();
        u1Var.d();
        return k3Var.f(false);
    }

    public static /* synthetic */ void B(u0 u0Var, boolean z10) {
        u0Var.J = z10;
        if (z10) {
            if (u0Var.f37530e == i.PENDING_OPEN || u0Var.f37530e == i.OPENING_WITH_ERROR) {
                u0Var.L0(false);
            }
        }
    }

    public static /* synthetic */ void E(u0 u0Var, String str, n0.o3 o3Var, n0.i4 i4Var, n0.t3 t3Var, List list) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " ACTIVE");
        u0Var.f37527a.q(str, o3Var, i4Var, t3Var, list);
        u0Var.f37527a.u(str, o3Var, i4Var, t3Var, list);
        u0Var.N0();
    }

    public static /* synthetic */ void F(u0 u0Var, String str, n0.o3 o3Var, n0.i4 i4Var, n0.t3 t3Var, List list) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " RESET");
        u0Var.f37527a.u(str, o3Var, i4Var, t3Var, list);
        u0Var.T();
        u0Var.B0(false);
        u0Var.N0();
        if (u0Var.f37530e == i.OPENED) {
            u0Var.v0();
        }
    }

    public static /* synthetic */ Object G(final u0 u0Var, final y1.c.a aVar) {
        u0Var.f37528c.execute(new Runnable() { // from class: z.m0
            @Override // java.lang.Runnable
            public final void run() {
                r0.n.t(this.f37381a.y0(), aVar);
            }
        });
        return "Release[request=" + u0Var.f37539n.getAndIncrement() + "]";
    }

    public static /* synthetic */ void I(u0 u0Var) {
        u0Var.a0("Camera is removed. Updating state and cleaning up.");
        i iVar = u0Var.f37530e;
        i iVar2 = i.RELEASING;
        if (iVar == iVar2 || u0Var.f37530e == i.RELEASED) {
            return;
        }
        g0.w.a aVarA = g0.w.a.a(8);
        u0Var.f37532g.c(n0.p0.a.CLOSED, aVarA);
        u0Var.E0(iVar2, aVarA);
        u0Var.f37534i.a();
        u0Var.O.a();
        if (u0Var.f37536k != null) {
            u0Var.V(false);
        } else {
            u0Var.d0();
        }
    }

    public static /* synthetic */ void K(u0 u0Var, List list) {
        u0Var.getClass();
        try {
            u0Var.J0(list);
        } finally {
            u0Var.f37533h.D();
        }
    }

    public static /* synthetic */ Object L(u0 u0Var, y1.c.a aVar) {
        x2.g.j(u0Var.f37541p == null, "Camera can only be released once, so release completer should be null on creation.");
        u0Var.f37541p = aVar;
        return "Release[camera=" + u0Var + "]";
    }

    public static List<n0.j4.b> f0(g0.w2 w2Var) {
        if (w2Var.i() == null) {
            return null;
        }
        return b1.g.q0(w2Var);
    }

    public static String g0(int i10) {
        if (i10 == 0) {
            return "ERROR_NONE";
        }
        if (i10 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i10 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i10 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i10 != 4) {
            return i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String h0(t4 t4Var) {
        return t4Var.f() + t4Var.hashCode();
    }

    public static String j0(g0.w2 w2Var) {
        return w2Var.r() + w2Var.hashCode();
    }

    public static /* synthetic */ Object t(u0 u0Var, y1.c.a aVar) {
        u0Var.getClass();
        try {
            ArrayList arrayList = new ArrayList(u0Var.f37527a.g().c().c());
            arrayList.add(u0Var.D.c());
            arrayList.add(u0Var.new b(aVar));
            u0Var.b.f(u0Var.f37535j.e(), u0Var.f37528c, w2.a(arrayList));
            return "configAndCloseTask";
        } catch (a0.f | RuntimeException e10) {
            u0Var.b0("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.f(e10);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ Object u(final u0 u0Var, final y1.c.a aVar) {
        u0Var.getClass();
        try {
            u0Var.f37528c.execute(new Runnable() { // from class: z.r0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f37483a.l0()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void v(u0 u0Var) {
        if (u0Var.k0()) {
            u0Var.C0(h0(u0Var.C), u0Var.C.h(), u0Var.C.i(), null, Collections.singletonList(n0.j4.b.METERING_REPEATING));
        }
    }

    public static /* synthetic */ void w(u0 u0Var) {
        u0Var.A = false;
        u0Var.f37551z = false;
        u0Var.a0("OpenCameraConfigAndClose is done, state: " + u0Var.f37530e);
        int iOrdinal = u0Var.f37530e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            x2.g.i(u0Var.o0());
            u0Var.d0();
            return;
        }
        if (iOrdinal != 7) {
            u0Var.a0("OpenCameraConfigAndClose finished while in state: " + u0Var.f37530e);
            return;
        }
        if (u0Var.f37537l == 0) {
            u0Var.M0(false);
            return;
        }
        u0Var.a0("OpenCameraConfigAndClose in error: " + g0(u0Var.f37537l));
        u0Var.f37534i.e();
    }

    public static /* synthetic */ void x(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void y(u0 u0Var, String str) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " INACTIVE");
        u0Var.f37527a.t(str);
        u0Var.N0();
    }

    public static /* synthetic */ void z(u0 u0Var, String str, n0.o3 o3Var, n0.i4 i4Var, n0.t3 t3Var, List list) {
        u0Var.getClass();
        u0Var.a0("Use case " + str + " UPDATED");
        u0Var.f37527a.u(str, o3Var, i4Var, t3Var, list);
        u0Var.N0();
    }

    public final void A0() {
        if (this.C != null) {
            this.f37527a.s(this.C.f() + this.C.hashCode());
            this.f37527a.t(this.C.f() + this.C.hashCode());
            this.C.c();
            this.C = null;
        }
    }

    public void B0(boolean z10) {
        x2.g.i(this.f37538m != null);
        a0("Resetting Capture Session");
        l3 l3Var = this.f37538m;
        n0.o3 o3VarH = l3Var.h();
        List<n0.l1> listG = l3Var.g();
        l3 l3VarQ0 = q0();
        this.f37538m = l3VarQ0;
        l3VarQ0.d(o3VarH);
        this.f37538m.b(listG);
        if (this.f37530e.ordinal() != 9) {
            a0("Skipping Capture Session state check due to current camera state: " + this.f37530e + " and previous session status: " + l3Var.c());
        } else if (this.f37549x && l3Var.c()) {
            a0("Close camera before creating new session");
            D0(i.REOPENING_QUIRK);
        }
        if (this.f37550y && l3Var.c()) {
            a0("ConfigAndClose is required when close the camera.");
            this.f37551z = true;
        }
        z0(l3Var, z10);
    }

    public final void C0(final String str, final n0.o3 o3Var, final n0.i4<?> i4Var, final n0.t3 t3Var, final List<n0.j4.b> list) {
        this.f37528c.execute(new Runnable() { // from class: z.i0
            @Override // java.lang.Runnable
            public final void run() {
                u0.F(this.f37320a, str, o3Var, i4Var, t3Var, list);
            }
        });
    }

    public void D0(i iVar) {
        E0(iVar, null);
    }

    public void E0(i iVar, g0.w.a aVar) {
        F0(iVar, aVar, true);
    }

    public void F0(i iVar, g0.w.a aVar, boolean z10) {
        n0.p0.a aVar2;
        a0("Transitioning camera internal state: " + this.f37530e + " --> " + iVar);
        I0(iVar, aVar);
        this.f37530e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = n0.p0.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = n0.p0.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = n0.p0.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = n0.p0.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = n0.p0.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = n0.p0.a.OPENING;
                break;
            case OPENED:
                aVar2 = n0.p0.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = n0.p0.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f37547v.e(this, aVar2, z10);
        this.f37531f.n(aVar2);
        this.f37532g.c(aVar2, aVar);
    }

    public void G0(List<n0.l1> list) {
        ArrayList arrayList = new ArrayList();
        for (n0.l1 l1Var : list) {
            n0.l1.a aVarK = n0.l1.a.k(l1Var);
            if (l1Var.k() == 5 && l1Var.d() != null) {
                aVarK.p(l1Var.d());
            }
            if (!l1Var.i().isEmpty() || !l1Var.n() || U(aVarK)) {
                arrayList.add(aVarK.h());
            }
        }
        a0("Issue capture request");
        this.f37538m.b(arrayList);
    }

    public final Collection<k> H0(Collection<g0.w2> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<g0.w2> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b(it.next(), this.B));
        }
        return arrayList;
    }

    public void I0(i iVar, g0.w.a aVar) {
        if (n5.a.h()) {
            n5.a.j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f37543r++;
            }
            if (this.f37543r > 0) {
                n5.a.j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    public final void J0(Collection<k> collection) {
        Size sizeF;
        boolean zIsEmpty = this.f37527a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k kVar : collection) {
            if (!this.f37527a.o(kVar.h())) {
                this.f37527a.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == g0.a2.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f37533h.k0(true);
            this.f37533h.Y();
        }
        T();
        P0();
        O0();
        N0();
        B0(false);
        if (this.f37530e == i.OPENED) {
            v0();
        } else {
            w0();
        }
        if (rational != null) {
            this.f37533h.n0(rational);
        }
    }

    public final void K0(Collection<k> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (k kVar : collection) {
            if (this.f37527a.o(kVar.h())) {
                this.f37527a.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == g0.a2.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f37533h.n0(null);
        }
        T();
        if (this.f37527a.i().isEmpty()) {
            this.f37533h.p0(false);
            this.f37533h.m0(false);
        } else {
            P0();
            O0();
        }
        if (this.f37527a.h().isEmpty()) {
            this.f37533h.D();
            B0(false);
            this.f37533h.k0(false);
            this.f37538m = q0();
            W();
            return;
        }
        N0();
        B0(false);
        if (this.f37530e == i.OPENED) {
            v0();
        }
    }

    public void L0(boolean z10) {
        a0("Attempting to force open the camera.");
        if (this.f37547v.i(this)) {
            u0(z10);
        } else {
            a0("No cameras available. Waiting for available camera before opening camera.");
            D0(i.PENDING_OPEN);
        }
    }

    public void M0(boolean z10) {
        a0("Attempting to open the camera.");
        if (this.f37544s.b() && this.f37547v.i(this)) {
            u0(z10);
        } else {
            a0("No cameras available. Waiting for available camera before opening camera.");
            D0(i.PENDING_OPEN);
        }
    }

    public void N0() {
        n0.o3.h hVarE = this.f37527a.e();
        if (!hVarE.g()) {
            this.f37533h.j0();
            this.f37538m.d(this.f37533h.O());
            return;
        }
        this.f37533h.o0(hVarE.c().q());
        hVarE.b(this.f37533h.O());
        this.f37538m.d(hVarE.c());
    }

    public final void O0() {
        if (this.f37535j.F()) {
            n0.o3.h hVarE = this.f37527a.e();
            if (hVarE.g()) {
                if (((Integer) hVarE.c().e().getUpper()).intValue() > 30) {
                    this.f37533h.m0(true);
                } else {
                    this.f37533h.m0(false);
                }
            }
        }
    }

    public final void P0() {
        Iterator<n0.i4<?>> it = this.f37527a.i().iterator();
        boolean zT = false;
        while (it.hasNext()) {
            zT |= it.next().T(false);
        }
        this.f37533h.p0(zT);
    }

    public final void S() {
        t4 t4Var = this.C;
        if (t4Var != null) {
            String strH0 = h0(t4Var);
            n0.h4 h4Var = this.f37527a;
            n0.o3 o3VarH = this.C.h();
            n0.i4<?> i4VarI = this.C.i();
            n0.j4.b bVar = n0.j4.b.METERING_REPEATING;
            h4Var.r(strH0, o3VarH, i4VarI, null, Collections.singletonList(bVar));
            this.f37527a.q(strH0, this.C.h(), this.C.i(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final void T() {
        n0.o3 o3VarC = this.f37527a.g().c();
        int size = o3VarC.l().i().size();
        int size2 = o3VarC.p().size();
        boolean z10 = false;
        if (l0()) {
            boolean z11 = size != 1 || size2 == 1;
            if (z11 || n0(this.C)) {
                A0();
                if (z11) {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
        } else if (size != 0 || size2 <= 0) {
            z10 = true;
        } else {
            if (this.C == null) {
                this.C = new t4(this.f37535j.C(), this.K, new t4.c() { // from class: z.l0
                    @Override // z.t4.c
                    public final void a() {
                        u0.v(this.f37372a);
                    }
                });
            }
            if (!n0(this.C)) {
                S();
                z10 = true;
            }
        }
        this.f37533h.l0(z10);
        if (z10) {
            return;
        }
        g0.r1.c("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    public final boolean U(n0.l1.a aVar) {
        if (!aVar.m().isEmpty()) {
            g0.r1.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<n0.o3> it = this.f37527a.f().iterator();
        while (it.hasNext()) {
            n0.l1 l1VarL = it.next().l();
            List<n0.u1> listI = l1VarL.i();
            if (!listI.isEmpty()) {
                if (l1VarL.h() != 0) {
                    aVar.u(l1VarL.h());
                }
                if (l1VarL.l() != 0) {
                    aVar.x(l1VarL.l());
                }
                Iterator<n0.u1> it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f(it2.next());
                }
            }
        }
        if (!aVar.m().isEmpty()) {
            return true;
        }
        g0.r1.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void V(boolean z10) {
        x2.g.j(this.f37530e == i.CLOSING || this.f37530e == i.RELEASING || (this.f37530e == i.REOPENING && this.f37537l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f37530e + " (error: " + g0(this.f37537l) + ")");
        B0(z10);
        this.f37538m.e();
    }

    public final void W() {
        a0("Closing camera.");
        boolean z10 = true;
        switch (this.f37530e.ordinal()) {
            case 3:
            case 4:
                x2.g.i(this.f37536k == null);
                D0(i.INITIALIZED);
                break;
            case 5:
            default:
                a0("close() ignored due to being in state: " + this.f37530e);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.f37534i.a() && !this.O.c()) {
                    z10 = false;
                }
                this.O.a();
                D0(i.CLOSING);
                if (z10) {
                    x2.g.i(o0());
                    Y();
                }
                break;
            case 9:
            case 10:
                D0(i.CLOSING);
                V(false);
                break;
        }
    }

    public final ne.x<Void> X(CameraDevice cameraDevice) {
        final k3 k3Var = new k3(this.M);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final n0.k2 k2Var = new n0.k2(surface);
        k2Var.k().a(new Runnable() { // from class: z.p0
            @Override // java.lang.Runnable
            public final void run() {
                u0.x(surface, surfaceTexture);
            }
        }, q0.c.b());
        n0.o3.b bVar = new n0.o3.b();
        bVar.h(k2Var);
        bVar.B(1);
        a0("Start configAndClose.");
        return r0.d.c(r0.n.z(k3Var.a(bVar.p(), cameraDevice, this.E.a()))).g(new r0.a() { // from class: z.q0
            @Override // r0.a
            public final ne.x apply(Object obj) {
                return u0.A(k3Var, k2Var, (Void) obj);
            }
        }, this.f37528c);
    }

    public final void Y() {
        x2.g.i(this.f37530e == i.RELEASING || this.f37530e == i.CLOSING);
        x2.g.i(this.f37542q.isEmpty());
        if (!this.f37551z) {
            d0();
            return;
        }
        if (this.A) {
            a0("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f37544s.b()) {
            this.f37551z = false;
            d0();
            a0("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            a0("Open camera to configAndClose");
            ne.x<Void> xVarT0 = t0();
            this.A = true;
            xVarT0.a(new Runnable() { // from class: z.s0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.w(this.f37501a);
                }
            }, this.f37528c);
        }
    }

    public final CameraDevice.StateCallback Z() {
        ArrayList arrayList = new ArrayList(this.f37527a.g().c().c());
        arrayList.add(this.D.c());
        arrayList.add(this.f37534i);
        return w2.a(arrayList);
    }

    @Override // n0.p0
    public ne.x<Void> a() {
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.f0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return u0.G(this.f37195a, aVar);
            }
        });
    }

    public void a0(String str) {
        b0(str, null);
    }

    @Override // n0.p0
    public n0.a3<n0.p0.a> b() {
        return this.f37531f;
    }

    public final void b0(String str, Throwable th2) {
        g0.r1.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    public n0.o3 c0(n0.u1 u1Var) {
        for (n0.o3 o3Var : this.f37527a.h()) {
            if (o3Var.p().contains(u1Var)) {
                return o3Var;
            }
        }
        return null;
    }

    public void d0() {
        x2.g.i(this.f37530e == i.RELEASING || this.f37530e == i.CLOSING);
        x2.g.i(this.f37542q.isEmpty());
        this.f37536k = null;
        if (this.f37530e == i.CLOSING) {
            D0(i.INITIALIZED);
            return;
        }
        this.b.h(this.f37544s);
        D0(i.RELEASED);
        y1.c.a<Void> aVar = this.f37541p;
        if (aVar != null) {
            aVar.c(null);
            this.f37541p = null;
        }
    }

    @Override // n0.p0
    public n0.l0 e() {
        return this.f37533h;
    }

    public final int e0() {
        synchronized (this.H) {
            try {
                return this.f37546u.e() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.w2.c
    public void f(g0.w2 w2Var) {
        x2.g.g(w2Var);
        final String strJ0 = j0(w2Var);
        final n0.o3 o3VarZ = this.B ? w2Var.z() : w2Var.x();
        final n0.i4<?> i4VarL = w2Var.l();
        final n0.t3 t3VarG = w2Var.g();
        final List<n0.j4.b> listF0 = f0(w2Var);
        this.f37528c.execute(new Runnable() { // from class: z.c0
            @Override // java.lang.Runnable
            public final void run() {
                u0.z(this.f37147a, strJ0, o3VarZ, i4VarL, t3VarG, listF0);
            }
        });
    }

    @Override // n0.p0
    public n0.h0 g() {
        return this.G;
    }

    @Override // n0.p0
    public void h(final boolean z10) {
        this.f37528c.execute(new Runnable() { // from class: z.j0
            @Override // java.lang.Runnable
            public final void run() {
                u0.B(this.f37329a, z10);
            }
        });
    }

    @Override // n0.p0
    public void i(Collection<g0.w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f37533h.Y();
        r0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(H0(arrayList));
        try {
            this.f37528c.execute(new Runnable() { // from class: z.t0
                @Override // java.lang.Runnable
                public final void run() {
                    u0.K(this.f37513a, arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            b0("Unable to attach use cases.", e10);
            this.f37533h.D();
        }
    }

    public final ne.x<Void> i0() {
        if (this.f37540o == null) {
            if (this.f37530e != i.RELEASED) {
                this.f37540o = y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.n0
                    @Override // y1.c.InterfaceC0665c
                    public final Object a(y1.c.a aVar) {
                        return u0.L(this.f37410a, aVar);
                    }
                });
            } else {
                this.f37540o = r0.n.p(null);
            }
        }
        return this.f37540o;
    }

    @Override // n0.p0
    public void j(Collection<g0.w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(H0(arrayList));
        s0(new ArrayList(arrayList));
        this.f37528c.execute(new Runnable() { // from class: z.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f37283a.K0(arrayList2);
            }
        });
    }

    @Override // n0.p0
    public n0.o0 k() {
        return this.f37535j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean k0() {
        try {
            return ((Boolean) y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.o0
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return u0.u(this.f37431a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    public final boolean l0() {
        t4 t4Var = this.C;
        if (t4Var == null) {
            return false;
        }
        return this.f37527a.o(h0(t4Var));
    }

    @Override // g0.w2.c
    public void m(g0.w2 w2Var) {
        x2.g.g(w2Var);
        final String strJ0 = j0(w2Var);
        this.f37528c.execute(new Runnable() { // from class: z.d0
            @Override // java.lang.Runnable
            public final void run() {
                u0.y(this.f37167a, strJ0);
            }
        });
    }

    public final boolean m0() {
        g0.g0 g0Var = this.f37548w;
        return (g0Var == null || g0Var.r0()) ? false : true;
    }

    @Override // g0.w2.c
    public void n(g0.w2 w2Var) {
        x2.g.g(w2Var);
        C0(j0(w2Var), this.B ? w2Var.z() : w2Var.x(), w2Var.l(), w2Var.g(), f0(w2Var));
    }

    public final boolean n0(t4 t4Var) {
        x2.g.g(t4Var);
        return !p0(t4Var) || m0();
    }

    @Override // n0.p0
    public void o(n0.h0 h0Var) {
        if (h0Var == null) {
            h0Var = n0.k0.a();
        }
        n0.q3 q3VarW = h0Var.w(null);
        this.G = h0Var;
        synchronized (this.H) {
            this.I = q3VarW;
        }
    }

    public boolean o0() {
        return this.f37542q.isEmpty();
    }

    @Override // n0.p0
    public void p() {
        this.f37528c.execute(new Runnable() { // from class: z.k0
            @Override // java.lang.Runnable
            public final void run() {
                u0.I(this.f37337a);
            }
        });
    }

    public final boolean p0(t4 t4Var) {
        ArrayList arrayList = new ArrayList();
        int iE0 = e0();
        for (n0.h4.b bVar : this.f37527a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != n0.j4.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    g0.r1.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                n0.o3 o3VarD = bVar.d();
                n0.i4<?> i4VarF = bVar.f();
                for (n0.u1 u1Var : o3VarD.p()) {
                    arrayList.add(n0.g.a(this.N.a0(iE0, i4VarF.p(), u1Var.h(), i4VarF.W()), i4VarF.p(), u1Var.h(), bVar.e().b(), bVar.c(), bVar.e().d(), bVar.e().g(), bVar.e().c(), i4VarF.H()));
                }
            }
        }
        x2.g.g(t4Var);
        HashMap map = new HashMap();
        map.put(t4Var.i(), Collections.singletonList(t4Var.e()));
        try {
            this.N.K(iE0, arrayList, map, false, false, false, false);
            a0("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            b0("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    public final l3 q0() {
        synchronized (this.H) {
            try {
                g0.g0 g0Var = this.f37548w;
                f0.i iVarA = g0Var == null ? null : f0.j.a(g0Var);
                if (this.I == null) {
                    return new k3(this.M, this.f37535j.l(), iVarA);
                }
                return new z4(this.I, this.f37535j, this.M, this.f37528c, this.f37529d, iVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.p0
    public void r(boolean z10) {
        this.B = z10;
    }

    public final void r0(List<g0.w2> list) {
        for (g0.w2 w2Var : list) {
            String strJ0 = j0(w2Var);
            if (!this.F.contains(strJ0)) {
                this.F.add(strJ0);
                w2Var.R();
                w2Var.P();
            }
        }
    }

    @Override // g0.w2.c
    public void s(g0.w2 w2Var) {
        x2.g.g(w2Var);
        final String strJ0 = j0(w2Var);
        final n0.o3 o3VarZ = this.B ? w2Var.z() : w2Var.x();
        final n0.i4<?> i4VarL = w2Var.l();
        final n0.t3 t3VarG = w2Var.g();
        final List<n0.j4.b> listF0 = f0(w2Var);
        this.f37528c.execute(new Runnable() { // from class: z.e0
            @Override // java.lang.Runnable
            public final void run() {
                u0.E(this.f37177a, strJ0, o3VarZ, i4VarL, t3VarG, listF0);
            }
        });
    }

    public final void s0(List<g0.w2> list) {
        for (g0.w2 w2Var : list) {
            String strJ0 = j0(w2Var);
            if (this.F.contains(strJ0)) {
                w2Var.S();
                this.F.remove(strJ0);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final ne.x<Void> t0() {
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.b0
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return u0.t(this.f37136a, aVar);
            }
        });
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f37535j.e());
    }

    @SuppressLint({"MissingPermission"})
    public final void u0(boolean z10) {
        if (!z10) {
            this.f37534i.d();
        }
        this.f37534i.a();
        this.O.a();
        a0("Opening camera.");
        D0(i.OPENING);
        try {
            this.b.f(this.f37535j.e(), this.f37528c, Z());
        } catch (a0.f e10) {
            a0("Unable to open camera due to " + e10.getMessage());
            if (e10.d() != 10001) {
                this.O.d();
            } else {
                E0(i.INITIALIZED, g0.w.a.b(7, e10));
            }
        } catch (SecurityException e11) {
            a0("Unable to open camera due to " + e11.getMessage());
            D0(i.REOPENING);
            this.f37534i.e();
        } catch (RuntimeException e12) {
            b0("Unexpected error occurred when opening camera.", e12);
            E0(i.OPENING_WITH_ERROR, g0.w.a.a(6));
        }
    }

    public void v0() {
        x2.g.i(this.f37530e == i.OPENED);
        n0.o3.h hVarG = this.f37527a.g();
        if (!hVarG.g()) {
            a0("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f37547v.j(this.f37536k.getId(), this.f37546u.d(this.f37536k.getId()))) {
            a0("Unable to create capture session in camera operating mode = " + this.f37546u.e());
            return;
        }
        HashMap map = new HashMap();
        c5.m(this.f37527a.h(), this.f37527a.i(), map);
        this.f37538m.i(map);
        l3 l3Var = this.f37538m;
        r0.n.j(l3Var.a(hVarG.c(), (CameraDevice) x2.g.g(this.f37536k), this.E.a()), new d(l3Var), this.f37528c);
    }

    public final void w0() {
        int iOrdinal = this.f37530e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            L0(false);
            return;
        }
        if (iOrdinal != 5) {
            a0("open() ignored due to being in state: " + this.f37530e);
            return;
        }
        D0(i.REOPENING);
        if (o0() || this.A || this.f37537l != 0) {
            return;
        }
        x2.g.j(this.f37536k != null, "Camera Device should be open if session close is not complete");
        D0(i.OPENED);
        v0();
    }

    public void x0(final n0.o3 o3Var) {
        ScheduledExecutorService scheduledExecutorServiceE = q0.c.e();
        final n0.o3.d dVarD = o3Var.d();
        if (dVarD != null) {
            b0("Posting surface closed", new Throwable());
            scheduledExecutorServiceE.execute(new Runnable() { // from class: z.g0
                @Override // java.lang.Runnable
                public final void run() {
                    dVarD.a(o3Var, n0.o3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    public final ne.x<Void> y0() {
        ne.x<Void> xVarI0 = i0();
        boolean z10 = true;
        switch (this.f37530e.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.f37534i.a() && !this.O.c()) {
                    z10 = false;
                }
                this.O.a();
                D0(i.RELEASING);
                if (z10) {
                    x2.g.i(o0());
                    Y();
                }
                break;
            case 2:
            case 3:
            case 4:
                x2.g.i(this.f37536k == null);
                D0(i.RELEASING);
                x2.g.i(o0());
                Y();
                break;
            case 9:
            case 10:
                D0(i.RELEASING);
                V(false);
                break;
            default:
                a0("release() ignored due to being in state: " + this.f37530e);
                break;
        }
        return xVarI0;
    }

    public ne.x<Void> z0(l3 l3Var, boolean z10) {
        l3Var.close();
        ne.x<Void> xVarF = l3Var.f(z10);
        a0("Releasing session in state " + this.f37530e.name());
        this.f37542q.put(l3Var, xVarF);
        r0.n.j(xVarF, new c(l3Var), q0.c.b());
        return xVarF;
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f37560a;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ScheduledFuture<?> f37561a;
            public final AtomicBoolean b = new AtomicBoolean(false);

            public a() {
                this.f37561a = u0.this.f37529d.schedule(new Runnable() { // from class: z.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37609a.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            public void c() {
                this.b.set(true);
                this.f37561a.cancel(true);
            }

            public final void d() {
                if (this.b.getAndSet(true)) {
                    return;
                }
                u0.this.f37528c.execute(new Runnable() { // from class: z.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37601a.e();
                    }
                });
            }

            public final void e() {
                if (u0.this.f37530e == i.OPENING) {
                    u0.this.a0("Camera onError timeout, reopen it.");
                    u0.this.D0(i.REOPENING);
                    u0.this.f37534i.e();
                } else {
                    u0.this.a0("Camera skip reopen at state: " + u0.this.f37530e);
                }
            }

            public boolean f() {
                return this.b.get();
            }
        }

        public h() {
            this.f37560a = null;
        }

        public void a() {
            a aVar = this.f37560a;
            if (aVar != null) {
                aVar.c();
            }
            this.f37560a = null;
        }

        public void b() {
            u0.this.a0("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f37560a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (u0.this.f37530e != i.OPENING) {
                u0.this.a0("Don't need the onError timeout handler.");
                return;
            }
            u0.this.a0("Camera waiting for onError.");
            a();
            this.f37560a = new a();
        }

        public /* synthetic */ h(u0 u0Var, a aVar) {
            this();
        }
    }
}
