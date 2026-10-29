package z;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class z4 implements l3 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static List<n0.u1> f36983p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f36984q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.q3 f36985a;
    public final z0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f36986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f36987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3 f36988e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0.o3 f36990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r2 f36991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n0.o3 f36992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f36993j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f36995l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36998o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<n0.u1> f36989f = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile List<n0.l1> f36994k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f0.l f36996m = new f0.l.a().c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f0.l f36997n = new f0.l.a().c();

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.d("ProcessingCaptureSession", "open session failed ", th2);
            z4.this.close();
            z4.this.f(false);
        }
    }

    public static class b implements n0.q3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<n0.u> f37000a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n0.e0 f37001c;

        public /* synthetic */ b(int i10, List list, a aVar) {
            this(i10, list);
        }

        public b(int i10, List<n0.u> list) {
            this.f37001c = null;
            this.b = i10;
            this.f37000a = list;
        }
    }

    public enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public static class d implements n0.q3.a {
    }

    public z4(n0.q3 q3Var, z0 z0Var, b0.e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService, f0.i iVar) {
        this.f36998o = 0;
        this.f36988e = new k3(eVar, c0.e.b(CaptureSessionShouldUseMrirQuirk.class) != null, iVar);
        this.f36985a = q3Var;
        this.b = z0Var;
        this.f36986c = executor;
        this.f36987d = scheduledExecutorService;
        this.f36993j = c.UNINITIALIZED;
        this.f36995l = new d();
        int i10 = f36984q;
        f36984q = i10 + 1;
        this.f36998o = i10;
        g0.r1.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f36998o + ")");
    }

    public static /* synthetic */ Void j(z4 z4Var, Void r8) {
        z4Var.y(z4Var.f36988e);
        return null;
    }

    public static /* synthetic */ void l(z4 z4Var, n0.u1 u1Var) {
        n0.x1.c(z4Var.f36989f);
        if (u1Var != null) {
            u1Var.e();
        }
    }

    public static /* synthetic */ me.x m(final z4 z4Var, n0.o3 o3Var, CameraDevice cameraDevice, h5.a aVar, List list) {
        n0.d3 d3VarA;
        z4Var.getClass();
        g0.r1.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + z4Var.f36998o + ")");
        if (z4Var.f36993j == c.DE_INITIALIZED) {
            return r0.n.n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final n0.u1 u1VarF = null;
        if (list.contains(null)) {
            return r0.n.n(new n0.u1.a("Surface closed", o3Var.p().get(list.indexOf(null))));
        }
        n0.d3 d3VarA2 = null;
        n0.d3 d3VarA3 = null;
        n0.d3 d3VarA4 = null;
        for (int i10 = 0; i10 < o3Var.p().size(); i10++) {
            n0.u1 u1Var = o3Var.p().get(i10);
            if (t(u1Var) || u(u1Var)) {
                d3VarA2 = n0.d3.a(u1Var.j().get(), u1Var.h(), u1Var.i());
            } else if (s(u1Var)) {
                d3VarA3 = n0.d3.a(u1Var.j().get(), u1Var.h(), u1Var.i());
            } else if (r(u1Var)) {
                d3VarA4 = n0.d3.a(u1Var.j().get(), u1Var.h(), u1Var.i());
            }
        }
        if (o3Var.j() != null) {
            u1VarF = o3Var.j().f();
            d3VarA = n0.d3.a(u1VarF.j().get(), u1VarF.h(), u1VarF.i());
        } else {
            d3VarA = null;
        }
        z4Var.f36993j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(z4Var.f36989f);
            if (u1VarF != null) {
                arrayList.add(u1VarF);
            }
            n0.x1.d(arrayList);
            g0.r1.l("ProcessingCaptureSession", "== initSession (id=" + z4Var.f36998o + ")");
            try {
                n0.o3 o3VarI = z4Var.f36985a.i(z4Var.b, n0.e3.a(d3VarA2, d3VarA3, d3VarA4, d3VarA));
                z4Var.f36992i = o3VarI;
                o3VarI.p().get(0).k().a(new Runnable() { // from class: z.u4
                    @Override // java.lang.Runnable
                    public final void run() {
                        z4.l(this.f36892a, u1VarF);
                    }
                }, q0.c.b());
                for (final n0.u1 u1Var2 : z4Var.f36992i.p()) {
                    f36983p.add(u1Var2);
                    u1Var2.k().a(new Runnable() { // from class: z.v4
                        @Override // java.lang.Runnable
                        public final void run() {
                            z4.f36983p.remove(u1Var2);
                        }
                    }, z4Var.f36986c);
                }
                n0.o3.h hVar = new n0.o3.h();
                hVar.b(o3Var);
                hVar.d();
                hVar.b(z4Var.f36992i);
                x2.g.b(hVar.g(), "Cannot transform the SessionConfig");
                me.x<Void> xVarA = z4Var.f36988e.a(hVar.c(), (CameraDevice) x2.g.g(cameraDevice), aVar);
                r0.n.j(xVarA, z4Var.new a(), z4Var.f36986c);
                return xVarA;
            } catch (Throwable th2) {
                g0.r1.d("ProcessingCaptureSession", "initSession failed", th2);
                n0.x1.c(z4Var.f36989f);
                if (u1VarF != null) {
                    u1VarF.e();
                }
                throw th2;
            }
        } catch (n0.u1.a e10) {
            return r0.n.n(e10);
        }
    }

    public static /* synthetic */ void n(z4 z4Var) {
        z4Var.getClass();
        g0.r1.a("ProcessingCaptureSession", "== deInitSession (id=" + z4Var.f36998o + ")");
        z4Var.f36985a.d();
    }

    public static void o(List<n0.l1> list) {
        for (n0.l1 l1Var : list) {
            Iterator<n0.u> it = l1Var.c().iterator();
            while (it.hasNext()) {
                it.next().a(l1Var.f());
            }
        }
    }

    public static List<n0.r3> p(List<n0.u1> list) {
        ArrayList arrayList = new ArrayList();
        for (n0.u1 u1Var : list) {
            x2.g.b(u1Var instanceof n0.r3, "Surface must be SessionProcessorSurface");
            arrayList.add((n0.r3) u1Var);
        }
        return arrayList;
    }

    public static boolean q(n0.l1 l1Var) {
        for (n0.u1 u1Var : l1Var.i()) {
            if (t(u1Var) || u(u1Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), g0.u0.class);
    }

    public static boolean s(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), g0.f1.class);
    }

    public static boolean t(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), g0.a2.class);
    }

    public static boolean u(n0.u1 u1Var) {
        return Objects.equals(u1Var.g(), b1.g.class);
    }

    @Override // z.l3
    public me.x<Void> a(final n0.o3 o3Var, final CameraDevice cameraDevice, final h5.a aVar) {
        x2.g.b(this.f36993j == c.UNINITIALIZED, "Invalid state state:" + this.f36993j);
        x2.g.b(o3Var.p().isEmpty() ^ true, "SessionConfig contains no surfaces");
        g0.r1.a("ProcessingCaptureSession", "open (id=" + this.f36998o + ")");
        List<n0.u1> listP = o3Var.p();
        this.f36989f = listP;
        return r0.d.c(n0.x1.e(listP, false, 5000L, this.f36986c, this.f36987d)).g(new r0.a() { // from class: z.x4
            @Override // r0.a
            public final me.x apply(Object obj) {
                return z4.m(this.f36918a, o3Var, cameraDevice, aVar, (List) obj);
            }
        }, this.f36986c).f(new t.a() { // from class: z.y4
            @Override // t.a
            public final Object apply(Object obj) {
                return z4.j(this.f36962a, (Void) obj);
            }
        }, this.f36986c);
    }

    @Override // z.l3
    public void b(List<n0.l1> list) {
        if (list.isEmpty()) {
            return;
        }
        g0.r1.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f36998o + ") + state =" + this.f36993j);
        int iOrdinal = this.f36993j.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f36994k == null) {
                this.f36994k = list;
                return;
            } else {
                o(list);
                g0.r1.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal == 2) {
            for (n0.l1 l1Var : list) {
                if (v(l1Var.k())) {
                    w(l1Var);
                } else {
                    x(l1Var);
                }
            }
            return;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            g0.r1.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f36993j);
            o(list);
        }
    }

    @Override // z.l3
    public boolean c() {
        return this.f36988e.c();
    }

    @Override // z.l3
    public void close() {
        g0.r1.a("ProcessingCaptureSession", "close (id=" + this.f36998o + ") state=" + this.f36993j);
        if (this.f36993j == c.ON_CAPTURE_SESSION_STARTED) {
            g0.r1.a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f36998o + ")");
            this.f36985a.c();
            r2 r2Var = this.f36991h;
            if (r2Var != null) {
                r2Var.a();
            }
            this.f36993j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f36988e.close();
    }

    @Override // z.l3
    public void d(n0.o3 o3Var) {
        g0.r1.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f36998o + ")");
        this.f36990g = o3Var;
        if (o3Var == null) {
            return;
        }
        r2 r2Var = this.f36991h;
        if (r2Var != null) {
            r2Var.b(o3Var);
        }
        if (this.f36993j == c.ON_CAPTURE_SESSION_STARTED) {
            f0.l.a aVarD = f0.l.a.d(o3Var.g());
            Integer numH = k2.h(o3Var.l());
            if (numH != null) {
                aVarD.f(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numH);
            }
            f0.l lVarC = aVarD.c();
            this.f36996m = lVarC;
            z(lVarC, this.f36997n);
            if (q(o3Var.l())) {
                this.f36985a.l(o3Var.l().j(), this.f36995l);
            } else {
                this.f36985a.a();
            }
        }
    }

    @Override // z.l3
    public void e() {
        g0.r1.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f36998o + ")");
        if (this.f36994k != null) {
            for (n0.l1 l1Var : this.f36994k) {
                Iterator<n0.u> it = l1Var.c().iterator();
                while (it.hasNext()) {
                    it.next().a(l1Var.f());
                }
            }
            this.f36994k = null;
        }
    }

    @Override // z.l3
    public me.x<Void> f(boolean z10) {
        g0.r1.a("ProcessingCaptureSession", "release (id=" + this.f36998o + ") mProcessorState=" + this.f36993j);
        me.x<Void> xVarF = this.f36988e.f(z10);
        int iOrdinal = this.f36993j.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            xVarF.a(new Runnable() { // from class: z.w4
                @Override // java.lang.Runnable
                public final void run() {
                    z4.n(this.f36911a);
                }
            }, q0.c.b());
        }
        this.f36993j = c.DE_INITIALIZED;
        return xVarF;
    }

    @Override // z.l3
    public List<n0.l1> g() {
        return this.f36994k != null ? this.f36994k : Collections.EMPTY_LIST;
    }

    @Override // z.l3
    public n0.o3 h() {
        return this.f36990g;
    }

    @Override // z.l3
    public void i(Map<n0.u1, Long> map) {
    }

    public final boolean v(int i10) {
        return i10 == 2 || i10 == 4;
    }

    public void w(n0.l1 l1Var) {
        f0.l.a aVarD = f0.l.a.d(l1Var.g());
        n0.n1 n1VarG = l1Var.g();
        n0.n1.a<Integer> aVar = n0.l1.f24728i;
        if (n1VarG.a(aVar)) {
            aVarD.f(CaptureRequest.JPEG_ORIENTATION, (Integer) l1Var.g().e(aVar));
        }
        n0.n1 n1VarG2 = l1Var.g();
        n0.n1.a<Integer> aVar2 = n0.l1.f24729j;
        if (n1VarG2.a(aVar2)) {
            aVarD.f(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) l1Var.g().e(aVar2)).byteValue()));
        }
        f0.l lVarC = aVarD.c();
        this.f36997n = lVarC;
        z(this.f36996m, lVarC);
        this.f36985a.b(l1Var.m(), l1Var.j(), new b(l1Var.f(), l1Var.c(), null));
    }

    public void x(n0.l1 l1Var) {
        g0.r1.a("ProcessingCaptureSession", "issueTriggerRequest");
        f0.l lVarC = f0.l.a.d(l1Var.g()).c();
        Iterator<n0.n1.a<?>> it = lVarC.b().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f36985a.n(lVarC, l1Var.j(), new b(l1Var.f(), l1Var.c(), null));
                return;
            }
        }
        o(Arrays.asList(l1Var));
    }

    public void y(k3 k3Var) {
        if (this.f36993j != c.SESSION_INITIALIZED) {
            return;
        }
        this.f36991h = new r2(k3Var, p(this.f36992i.p()));
        g0.r1.a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f36998o + ")");
        this.f36985a.k(this.f36991h);
        this.f36993j = c.ON_CAPTURE_SESSION_STARTED;
        n0.o3 o3Var = this.f36990g;
        if (o3Var != null) {
            d(o3Var);
        }
        if (this.f36994k != null) {
            b(this.f36994k);
            this.f36994k = null;
        }
    }

    public final void z(f0.l lVar, f0.l lVar2) {
        y.a.C0647a c0647a = new y.a.C0647a();
        c0647a.c(lVar);
        c0647a.c(lVar2);
        this.f36985a.g(c0647a.b());
    }
}
