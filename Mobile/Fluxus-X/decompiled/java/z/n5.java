package z;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class n5 extends h5.c implements h5, h5.a {
    public final o3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f38520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f38521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f38522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h5.c f38523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0.g f38524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pe.x<Void> f38525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y1.c.a<Void> f38526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pe.x<List<Surface>> f38527j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38519a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<n0.u1> f38528k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f38529l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38530m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38531n = false;

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r10) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            n5.this.c();
            n5 n5Var = n5.this;
            n5Var.b.i(n5Var);
        }
    }

    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.p(n5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.q(n5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.r(n5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            y1.c.a<Void> aVar;
            try {
                n5.this.C(cameraCaptureSession);
                n5 n5Var = n5.this;
                n5Var.s(n5Var);
                synchronized (n5.this.f38519a) {
                    x2.g.h(n5.this.f38526i, "OpenCaptureSession completer should not null");
                    n5 n5Var2 = n5.this;
                    aVar = n5Var2.f38526i;
                    n5Var2.f38526i = null;
                }
            } finally {
                synchronized (n5.this.f38519a) {
                    x2.g.h(n5.this.f38526i, "OpenCaptureSession completer should not null");
                    n5 n5Var3 = n5.this;
                    aVar = n5Var3.f38526i;
                    n5Var3.f38526i = null;
                    aVar.f(new IllegalStateException("onConfigureFailed"));
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            y1.c.a<Void> aVar;
            try {
                n5.this.C(cameraCaptureSession);
                n5 n5Var = n5.this;
                n5Var.t(n5Var);
                synchronized (n5.this.f38519a) {
                    x2.g.h(n5.this.f38526i, "OpenCaptureSession completer should not null");
                    n5 n5Var2 = n5.this;
                    aVar = n5Var2.f38526i;
                    n5Var2.f38526i = null;
                }
            } finally {
                synchronized (n5.this.f38519a) {
                    x2.g.h(n5.this.f38526i, "OpenCaptureSession completer should not null");
                    n5 n5Var3 = n5.this;
                    aVar = n5Var3.f38526i;
                    n5Var3.f38526i = null;
                    aVar.c(null);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.u(n5Var);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            n5.this.C(cameraCaptureSession);
            n5 n5Var = n5.this;
            n5Var.w(n5Var, surface);
        }
    }

    public static class c {
        public static List<CaptureRequest> a(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }
    }

    public n5(o3 o3Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = o3Var;
        this.f38520c = handler;
        this.f38521d = executor;
        this.f38522e = scheduledExecutorService;
    }

    public static /* synthetic */ pe.x A(n5 n5Var, List list, List list2) {
        n5Var.getClass();
        g0.r1.a("SyncCaptureSessionBase", "[" + n5Var + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return r0.n.n(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return list2.contains(null) ? r0.n.n(new n0.u1.a("Surface closed", (n0.u1) list.get(list2.indexOf(null)))) : r0.n.p(list2);
    }

    public static /* synthetic */ void x(n5 n5Var, h5 h5Var) {
        n5Var.b.g(n5Var);
        n5Var.B(h5Var);
        if (n5Var.f38524g != null) {
            Objects.requireNonNull(n5Var.f38523f);
            n5Var.f38523f.r(h5Var);
            return;
        }
        g0.r1.l("SyncCaptureSessionBase", "[" + n5Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object y(n5 n5Var, List list, a0.d0 d0Var, b0.o oVar, y1.c.a aVar) {
        String str;
        synchronized (n5Var.f38519a) {
            n5Var.D(list);
            x2.g.j(n5Var.f38526i == null, "The openCaptureSessionCompleter can only set once!");
            n5Var.f38526i = aVar;
            d0Var.a(oVar);
            str = "openCaptureSession[session=" + n5Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void z(n5 n5Var, h5 h5Var) {
        Objects.requireNonNull(n5Var.f38523f);
        n5Var.f38523f.B(h5Var);
    }

    public void C(CameraCaptureSession cameraCaptureSession) {
        if (this.f38524g == null) {
            this.f38524g = a0.g.e(cameraCaptureSession, this.f38520c);
        }
    }

    public void D(List<n0.u1> list) {
        synchronized (this.f38519a) {
            F();
            n0.x1.d(list);
            this.f38528k = list;
        }
    }

    public boolean E() {
        boolean z10;
        synchronized (this.f38519a) {
            z10 = this.f38525h != null;
        }
        return z10;
    }

    public void F() {
        synchronized (this.f38519a) {
            try {
                List<n0.u1> list = this.f38528k;
                if (list != null) {
                    n0.x1.c(list);
                    this.f38528k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5
    public void a() throws CameraAccessException {
        x2.g.h(this.f38524g, "Need to call openCaptureSession before using this API.");
        this.f38524g.d().stopRepeating();
    }

    @Override // z.h5
    public h5.c b() {
        return this;
    }

    @Override // z.h5
    public void c() {
        F();
    }

    @Override // z.h5
    public void close() {
        x2.g.h(this.f38524g, "Need to call openCaptureSession before using this API.");
        this.b.h(this);
        this.f38524g.d().close();
        getExecutor().execute(new Runnable() { // from class: z.l5
            @Override // java.lang.Runnable
            public final void run() {
                n5 n5Var = this.f38484a;
                n5Var.B(n5Var);
            }
        });
    }

    @Override // z.h5
    public void d(int i10) {
    }

    @Override // z.h5
    public void e() {
        x2.g.h(this.f38524g, "Need to call openCaptureSession before using this API.");
        this.f38524g.d().abortCaptures();
    }

    @Override // z.h5
    public CameraDevice f() {
        x2.g.g(this.f38524g);
        return this.f38524g.d().getDevice();
    }

    @Override // z.h5
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f38524g, "Need to call openCaptureSession before using this API.");
        return this.f38524g.c(captureRequest, getExecutor(), captureCallback);
    }

    @Override // z.h5.a
    public Executor getExecutor() {
        return this.f38521d;
    }

    @Override // z.h5.a
    public pe.x<Void> h(CameraDevice cameraDevice, final b0.o oVar, final List<n0.u1> list) {
        synchronized (this.f38519a) {
            try {
                if (this.f38530m) {
                    return r0.n.n(new CancellationException("Opener is disabled"));
                }
                this.b.k(this);
                final a0.d0 d0VarB = a0.d0.b(cameraDevice, this.f38520c);
                pe.x<Void> xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.m5
                    @Override // y1.c.InterfaceC0761c
                    public final Object a(y1.c.a aVar) {
                        return n5.y(this.f38499a, list, d0VarB, oVar, aVar);
                    }
                });
                this.f38525h = xVarA;
                r0.n.j(xVarA, new a(), q0.c.b());
                return r0.n.s(this.f38525h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5
    public List<CaptureRequest> i(CaptureRequest captureRequest) {
        CameraCaptureSession cameraCaptureSessionD = ((a0.g) x2.g.g(this.f38524g)).d();
        return cameraCaptureSessionD instanceof CameraConstrainedHighSpeedCaptureSession ? c.a((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionD, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // z.h5.a
    public pe.x<List<Surface>> j(final List<n0.u1> list, long j10) {
        synchronized (this.f38519a) {
            try {
                if (this.f38530m) {
                    return r0.n.n(new CancellationException("Opener is disabled"));
                }
                r0.d dVarG = r0.d.c(n0.x1.e(list, false, j10, getExecutor(), this.f38522e)).g(new r0.a() { // from class: z.j5
                    @Override // r0.a
                    public final pe.x apply(Object obj) {
                        return n5.A(this.f38439a, list, (List) obj);
                    }
                }, getExecutor());
                this.f38527j = dVarG;
                return r0.n.s(dVarG);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5.a
    public b0.o k(int i10, List<b0.i> list, h5.c cVar) {
        this.f38523f = cVar;
        return new b0.o(i10, list, getExecutor(), new b());
    }

    @Override // z.h5
    public int l(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f38524g, "Need to call openCaptureSession before using this API.");
        return this.f38524g.b(list, getExecutor(), captureCallback);
    }

    @Override // z.h5
    public int m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f38524g, "Need to call openCaptureSession before using this API.");
        return this.f38524g.a(list, getExecutor(), captureCallback);
    }

    @Override // z.h5
    public a0.g n() {
        x2.g.g(this.f38524g);
        return this.f38524g;
    }

    @Override // z.h5.c
    public void p(h5 h5Var) {
        Objects.requireNonNull(this.f38523f);
        this.f38523f.p(h5Var);
    }

    @Override // z.h5.c
    public void q(h5 h5Var) {
        Objects.requireNonNull(this.f38523f);
        this.f38523f.q(h5Var);
    }

    @Override // z.h5.c
    public void r(final h5 h5Var) {
        pe.x<Void> xVar;
        synchronized (this.f38519a) {
            try {
                if (this.f38529l) {
                    xVar = null;
                } else {
                    this.f38529l = true;
                    x2.g.h(this.f38525h, "Need to call openCaptureSession before using this API.");
                    xVar = this.f38525h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c();
        if (xVar != null) {
            xVar.a(new Runnable() { // from class: z.i5
                @Override // java.lang.Runnable
                public final void run() {
                    n5.x(this.f38432a, h5Var);
                }
            }, q0.c.b());
        }
    }

    @Override // z.h5.c
    public void s(h5 h5Var) {
        Objects.requireNonNull(this.f38523f);
        c();
        this.b.i(this);
        this.f38523f.s(h5Var);
    }

    @Override // z.h5.a
    public boolean stop() {
        boolean z10;
        pe.x<List<Surface>> xVar = null;
        try {
            synchronized (this.f38519a) {
                try {
                    if (!this.f38530m) {
                        pe.x<List<Surface>> xVar2 = this.f38527j;
                        xVar = xVar2 != null ? xVar2 : null;
                        this.f38530m = true;
                    }
                    z10 = !E();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (xVar != null) {
                xVar.cancel(true);
            }
            return z10;
        } catch (Throwable th3) {
            if (xVar != null) {
                xVar.cancel(true);
            }
            throw th3;
        }
    }

    @Override // z.h5.c
    public void t(h5 h5Var) {
        Objects.requireNonNull(this.f38523f);
        this.b.j(this);
        this.f38523f.t(h5Var);
    }

    @Override // z.h5.c
    public void u(h5 h5Var) {
        Objects.requireNonNull(this.f38523f);
        this.f38523f.u(h5Var);
    }

    @Override // z.h5.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void B(final h5 h5Var) {
        pe.x<Void> xVar;
        synchronized (this.f38519a) {
            try {
                if (this.f38531n) {
                    xVar = null;
                } else {
                    this.f38531n = true;
                    x2.g.h(this.f38525h, "Need to call openCaptureSession before using this API.");
                    xVar = this.f38525h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (xVar != null) {
            xVar.a(new Runnable() { // from class: z.k5
                @Override // java.lang.Runnable
                public final void run() {
                    n5.z(this.f38475a, h5Var);
                }
            }, q0.c.b());
        }
    }

    @Override // z.h5.c
    public void w(h5 h5Var, Surface surface) {
        Objects.requireNonNull(this.f38523f);
        this.f38523f.w(h5Var, surface);
    }
}
