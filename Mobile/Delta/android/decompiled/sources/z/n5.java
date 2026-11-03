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
    public final Handler f37415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f37416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f37417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h5.c f37418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0.g f37419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ne.x<Void> f37420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y1.c.a<Void> f37421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ne.x<List<Surface>> f37422j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37414a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<n0.u1> f37423k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f37424l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37425m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37426n = false;

    public class a implements r0.c<Void> {
        public a() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
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
                synchronized (n5.this.f37414a) {
                    x2.g.h(n5.this.f37421i, "OpenCaptureSession completer should not null");
                    n5 n5Var2 = n5.this;
                    aVar = n5Var2.f37421i;
                    n5Var2.f37421i = null;
                }
            } finally {
                synchronized (n5.this.f37414a) {
                    x2.g.h(n5.this.f37421i, "OpenCaptureSession completer should not null");
                    n5 n5Var3 = n5.this;
                    aVar = n5Var3.f37421i;
                    n5Var3.f37421i = null;
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
                synchronized (n5.this.f37414a) {
                    x2.g.h(n5.this.f37421i, "OpenCaptureSession completer should not null");
                    n5 n5Var2 = n5.this;
                    aVar = n5Var2.f37421i;
                    n5Var2.f37421i = null;
                }
            } finally {
                synchronized (n5.this.f37414a) {
                    x2.g.h(n5.this.f37421i, "OpenCaptureSession completer should not null");
                    n5 n5Var3 = n5.this;
                    aVar = n5Var3.f37421i;
                    n5Var3.f37421i = null;
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
        this.f37415c = handler;
        this.f37416d = executor;
        this.f37417e = scheduledExecutorService;
    }

    public static /* synthetic */ ne.x A(n5 n5Var, List list, List list2) {
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
        if (n5Var.f37419g != null) {
            Objects.requireNonNull(n5Var.f37418f);
            n5Var.f37418f.r(h5Var);
            return;
        }
        g0.r1.l("SyncCaptureSessionBase", "[" + n5Var + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    public static /* synthetic */ Object y(n5 n5Var, List list, a0.d0 d0Var, b0.o oVar, y1.c.a aVar) {
        String str;
        synchronized (n5Var.f37414a) {
            n5Var.D(list);
            x2.g.j(n5Var.f37421i == null, "The openCaptureSessionCompleter can only set once!");
            n5Var.f37421i = aVar;
            d0Var.a(oVar);
            str = "openCaptureSession[session=" + n5Var + "]";
        }
        return str;
    }

    public static /* synthetic */ void z(n5 n5Var, h5 h5Var) {
        Objects.requireNonNull(n5Var.f37418f);
        n5Var.f37418f.B(h5Var);
    }

    public void C(CameraCaptureSession cameraCaptureSession) {
        if (this.f37419g == null) {
            this.f37419g = a0.g.e(cameraCaptureSession, this.f37415c);
        }
    }

    public void D(List<n0.u1> list) {
        synchronized (this.f37414a) {
            F();
            n0.x1.d(list);
            this.f37423k = list;
        }
    }

    public boolean E() {
        boolean z10;
        synchronized (this.f37414a) {
            z10 = this.f37420h != null;
        }
        return z10;
    }

    public void F() {
        synchronized (this.f37414a) {
            try {
                List<n0.u1> list = this.f37423k;
                if (list != null) {
                    n0.x1.c(list);
                    this.f37423k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5
    public void a() throws CameraAccessException {
        x2.g.h(this.f37419g, "Need to call openCaptureSession before using this API.");
        this.f37419g.d().stopRepeating();
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
        x2.g.h(this.f37419g, "Need to call openCaptureSession before using this API.");
        this.b.h(this);
        this.f37419g.d().close();
        getExecutor().execute(new Runnable() { // from class: z.l5
            @Override // java.lang.Runnable
            public final void run() {
                n5 n5Var = this.f37379a;
                n5Var.B(n5Var);
            }
        });
    }

    @Override // z.h5
    public void d(int i10) {
    }

    @Override // z.h5
    public void e() {
        x2.g.h(this.f37419g, "Need to call openCaptureSession before using this API.");
        this.f37419g.d().abortCaptures();
    }

    @Override // z.h5
    public CameraDevice f() {
        x2.g.g(this.f37419g);
        return this.f37419g.d().getDevice();
    }

    @Override // z.h5
    public int g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f37419g, "Need to call openCaptureSession before using this API.");
        return this.f37419g.c(captureRequest, getExecutor(), captureCallback);
    }

    @Override // z.h5.a
    public Executor getExecutor() {
        return this.f37416d;
    }

    @Override // z.h5.a
    public ne.x<Void> h(CameraDevice cameraDevice, final b0.o oVar, final List<n0.u1> list) {
        synchronized (this.f37414a) {
            try {
                if (this.f37425m) {
                    return r0.n.n(new CancellationException("Opener is disabled"));
                }
                this.b.k(this);
                final a0.d0 d0VarB = a0.d0.b(cameraDevice, this.f37415c);
                ne.x<Void> xVarA = y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.m5
                    @Override // y1.c.InterfaceC0665c
                    public final Object a(y1.c.a aVar) {
                        return n5.y(this.f37394a, list, d0VarB, oVar, aVar);
                    }
                });
                this.f37420h = xVarA;
                r0.n.j(xVarA, new a(), q0.c.b());
                return r0.n.s(this.f37420h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5
    public List<CaptureRequest> i(CaptureRequest captureRequest) {
        CameraCaptureSession cameraCaptureSessionD = ((a0.g) x2.g.g(this.f37419g)).d();
        return cameraCaptureSessionD instanceof CameraConstrainedHighSpeedCaptureSession ? c.a((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionD, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // z.h5.a
    public ne.x<List<Surface>> j(final List<n0.u1> list, long j10) {
        synchronized (this.f37414a) {
            try {
                if (this.f37425m) {
                    return r0.n.n(new CancellationException("Opener is disabled"));
                }
                r0.d dVarG = r0.d.c(n0.x1.e(list, false, j10, getExecutor(), this.f37417e)).g(new r0.a() { // from class: z.j5
                    @Override // r0.a
                    public final ne.x apply(Object obj) {
                        return n5.A(this.f37334a, list, (List) obj);
                    }
                }, getExecutor());
                this.f37422j = dVarG;
                return r0.n.s(dVarG);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z.h5.a
    public b0.o k(int i10, List<b0.i> list, h5.c cVar) {
        this.f37418f = cVar;
        return new b0.o(i10, list, getExecutor(), new b());
    }

    @Override // z.h5
    public int l(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f37419g, "Need to call openCaptureSession before using this API.");
        return this.f37419g.b(list, getExecutor(), captureCallback);
    }

    @Override // z.h5
    public int m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        x2.g.h(this.f37419g, "Need to call openCaptureSession before using this API.");
        return this.f37419g.a(list, getExecutor(), captureCallback);
    }

    @Override // z.h5
    public a0.g n() {
        x2.g.g(this.f37419g);
        return this.f37419g;
    }

    @Override // z.h5.c
    public void p(h5 h5Var) {
        Objects.requireNonNull(this.f37418f);
        this.f37418f.p(h5Var);
    }

    @Override // z.h5.c
    public void q(h5 h5Var) {
        Objects.requireNonNull(this.f37418f);
        this.f37418f.q(h5Var);
    }

    @Override // z.h5.c
    public void r(final h5 h5Var) {
        ne.x<Void> xVar;
        synchronized (this.f37414a) {
            try {
                if (this.f37424l) {
                    xVar = null;
                } else {
                    this.f37424l = true;
                    x2.g.h(this.f37420h, "Need to call openCaptureSession before using this API.");
                    xVar = this.f37420h;
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
                    n5.x(this.f37327a, h5Var);
                }
            }, q0.c.b());
        }
    }

    @Override // z.h5.c
    public void s(h5 h5Var) {
        Objects.requireNonNull(this.f37418f);
        c();
        this.b.i(this);
        this.f37418f.s(h5Var);
    }

    @Override // z.h5.a
    public boolean stop() {
        boolean z10;
        ne.x<List<Surface>> xVar = null;
        try {
            synchronized (this.f37414a) {
                try {
                    if (!this.f37425m) {
                        ne.x<List<Surface>> xVar2 = this.f37422j;
                        xVar = xVar2 != null ? xVar2 : null;
                        this.f37425m = true;
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
        Objects.requireNonNull(this.f37418f);
        this.b.j(this);
        this.f37418f.t(h5Var);
    }

    @Override // z.h5.c
    public void u(h5 h5Var) {
        Objects.requireNonNull(this.f37418f);
        this.f37418f.u(h5Var);
    }

    @Override // z.h5.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void B(final h5 h5Var) {
        ne.x<Void> xVar;
        synchronized (this.f37414a) {
            try {
                if (this.f37426n) {
                    xVar = null;
                } else {
                    this.f37426n = true;
                    x2.g.h(this.f37420h, "Need to call openCaptureSession before using this API.");
                    xVar = this.f37420h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (xVar != null) {
            xVar.a(new Runnable() { // from class: z.k5
                @Override // java.lang.Runnable
                public final void run() {
                    n5.z(this.f37370a, h5Var);
                }
            }, q0.c.b());
        }
    }

    @Override // z.h5.c
    public void w(h5 h5Var, Surface surface) {
        Objects.requireNonNull(this.f37418f);
        this.f37418f.w(h5Var, surface);
    }
}
