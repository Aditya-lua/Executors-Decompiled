package p589z;

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
import ne.InterfaceFutureC9440x;
import p001a0.C0010d0;
import p001a0.C0015g;
import p020b0.C1183i;
import p020b0.C1189o;
import p140g0.C5931r1;
import p296n0.AbstractC8830u1;
import p296n0.C8845x1;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.n5 */
/* JADX INFO: loaded from: classes.dex */
public class C13585n5 extends InterfaceC13537h5.c implements InterfaceC13537h5, InterfaceC13537h5.a {

    /* JADX INFO: renamed from: b */
    public final C13591o3 f47559b;

    /* JADX INFO: renamed from: c */
    public final Handler f47560c;

    /* JADX INFO: renamed from: d */
    public final Executor f47561d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f47562e;

    /* JADX INFO: renamed from: f */
    public InterfaceC13537h5.c f47563f;

    /* JADX INFO: renamed from: g */
    public C0015g f47564g;

    /* JADX INFO: renamed from: h */
    public InterfaceFutureC9440x<Void> f47565h;

    /* JADX INFO: renamed from: i */
    public C12997c.a<Void> f47566i;

    /* JADX INFO: renamed from: j */
    public InterfaceFutureC9440x<List<Surface>> f47567j;

    /* JADX INFO: renamed from: a */
    public final Object f47558a = new Object();

    /* JADX INFO: renamed from: k */
    public List<AbstractC8830u1> f47568k = null;

    /* JADX INFO: renamed from: l */
    public boolean f47569l = false;

    /* JADX INFO: renamed from: m */
    public boolean f47570m = false;

    /* JADX INFO: renamed from: n */
    public boolean f47571n = false;

    /* JADX INFO: renamed from: z.n5$a */
    public class a implements InterfaceC10762c<Void> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C13585n5.this.mo49411c();
            C13585n5 c13585n5 = C13585n5.this;
            c13585n5.f47559b.m49556i(c13585n5);
        }
    }

    /* JADX INFO: renamed from: z.n5$b */
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
            C13585n5.this.m49542C(cameraCaptureSession);
            C13585n5 c13585n5 = C13585n5.this;
            c13585n5.mo49425p(c13585n5);
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
            C13585n5.this.m49542C(cameraCaptureSession);
            C13585n5 c13585n5 = C13585n5.this;
            c13585n5.mo49426q(c13585n5);
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
            C13585n5.this.m49542C(cameraCaptureSession);
            C13585n5 c13585n5 = C13585n5.this;
            c13585n5.mo49427r(c13585n5);
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
            C12997c.a<Void> aVar;
            try {
                C13585n5.this.m49542C(cameraCaptureSession);
                C13585n5 c13585n5 = C13585n5.this;
                c13585n5.mo49428s(c13585n5);
                synchronized (C13585n5.this.f47558a) {
                    C12637g.m47076h(C13585n5.this.f47566i, "OpenCaptureSession completer should not null");
                    C13585n5 c13585n6 = C13585n5.this;
                    aVar = c13585n6.f47566i;
                    c13585n6.f47566i = null;
                }
            } finally {
                synchronized (C13585n5.this.f47558a) {
                    C12637g.m47076h(C13585n5.this.f47566i, "OpenCaptureSession completer should not null");
                    C13585n5 c13585n7 = C13585n5.this;
                    aVar = c13585n7.f47566i;
                    c13585n7.f47566i = null;
                    aVar.m48317f(new IllegalStateException("onConfigureFailed"));
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
            C12997c.a<Void> aVar;
            try {
                C13585n5.this.m49542C(cameraCaptureSession);
                C13585n5 c13585n5 = C13585n5.this;
                c13585n5.mo49429t(c13585n5);
                synchronized (C13585n5.this.f47558a) {
                    C12637g.m47076h(C13585n5.this.f47566i, "OpenCaptureSession completer should not null");
                    C13585n5 c13585n6 = C13585n5.this;
                    aVar = c13585n6.f47566i;
                    c13585n6.f47566i = null;
                }
            } finally {
                synchronized (C13585n5.this.f47558a) {
                    C12637g.m47076h(C13585n5.this.f47566i, "OpenCaptureSession completer should not null");
                    C13585n5 c13585n7 = C13585n5.this;
                    aVar = c13585n7.f47566i;
                    c13585n7.f47566i = null;
                    aVar.m48314c(null);
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
            C13585n5.this.m49542C(cameraCaptureSession);
            C13585n5 c13585n5 = C13585n5.this;
            c13585n5.mo49430u(c13585n5);
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
            C13585n5.this.m49542C(cameraCaptureSession);
            C13585n5 c13585n5 = C13585n5.this;
            c13585n5.mo49432w(c13585n5, surface);
        }
    }

    /* JADX INFO: renamed from: z.n5$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static List<CaptureRequest> m49547a(CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CaptureRequest captureRequest) {
            return cameraConstrainedHighSpeedCaptureSession.createHighSpeedRequestList(captureRequest);
        }
    }

    public C13585n5(C13591o3 c13591o3, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f47559b = c13591o3;
        this.f47560c = handler;
        this.f47561d = executor;
        this.f47562e = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ InterfaceFutureC9440x m49537A(C13585n5 c13585n5, List list, List list2) {
        c13585n5.getClass();
        C5931r1.m26561a("SyncCaptureSessionBase", "[" + c13585n5 + "] getSurface done with results: " + list2);
        if (list2.isEmpty()) {
            return C10773n.m40991n(new IllegalArgumentException("Unable to open capture session without surfaces"));
        }
        return list2.contains(null) ? C10773n.m40991n(new AbstractC8830u1.a("Surface closed", (AbstractC8830u1) list.get(list2.indexOf(null)))) : C10773n.m40993p(list2);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m49539x(C13585n5 c13585n5, InterfaceC13537h5 interfaceC13537h5) {
        c13585n5.f47559b.m49554g(c13585n5);
        c13585n5.m49538B(interfaceC13537h5);
        if (c13585n5.f47564g != null) {
            Objects.requireNonNull(c13585n5.f47563f);
            c13585n5.f47563f.mo49427r(interfaceC13537h5);
            return;
        }
        C5931r1.m26572l("SyncCaptureSessionBase", "[" + c13585n5 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Object m49540y(C13585n5 c13585n5, List list, C0010d0 c0010d0, C1189o c1189o, C12997c.a aVar) {
        String str;
        synchronized (c13585n5.f47558a) {
            c13585n5.m49543D(list);
            C12637g.m47078j(c13585n5.f47566i == null, "The openCaptureSessionCompleter can only set once!");
            c13585n5.f47566i = aVar;
            c0010d0.m23a(c1189o);
            str = "openCaptureSession[session=" + c13585n5 + "]";
        }
        return str;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m49541z(C13585n5 c13585n5, InterfaceC13537h5 interfaceC13537h5) {
        Objects.requireNonNull(c13585n5.f47563f);
        c13585n5.f47563f.m49538B(interfaceC13537h5);
    }

    /* JADX INFO: renamed from: C */
    public void m49542C(CameraCaptureSession cameraCaptureSession) {
        if (this.f47564g == null) {
            this.f47564g = C0015g.m35e(cameraCaptureSession, this.f47560c);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m49543D(List<AbstractC8830u1> list) {
        synchronized (this.f47558a) {
            m49545F();
            C8845x1.m35502d(list);
            this.f47568k = list;
        }
    }

    /* JADX INFO: renamed from: E */
    public boolean m49544E() {
        boolean z10;
        synchronized (this.f47558a) {
            z10 = this.f47565h != null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: F */
    public void m49545F() {
        synchronized (this.f47558a) {
            try {
                List<AbstractC8830u1> list = this.f47568k;
                if (list != null) {
                    C8845x1.m35501c(list);
                    this.f47568k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: a */
    public void mo49409a() throws CameraAccessException {
        C12637g.m47076h(this.f47564g, "Need to call openCaptureSession before using this API.");
        this.f47564g.m39d().stopRepeating();
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: b */
    public InterfaceC13537h5.c mo49410b() {
        return this;
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: c */
    public void mo49411c() {
        m49545F();
    }

    @Override // p589z.InterfaceC13537h5
    public void close() {
        C12637g.m47076h(this.f47564g, "Need to call openCaptureSession before using this API.");
        this.f47559b.m49555h(this);
        this.f47564g.m39d().close();
        getExecutor().execute(new Runnable() { // from class: z.l5
            @Override // java.lang.Runnable
            public final void run() {
                C13585n5 c13585n5 = this.f47512a;
                c13585n5.m49538B(c13585n5);
            }
        });
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: d */
    public void mo49412d(int i10) {
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: e */
    public void mo49413e() {
        C12637g.m47076h(this.f47564g, "Need to call openCaptureSession before using this API.");
        this.f47564g.m39d().abortCaptures();
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: f */
    public CameraDevice mo49414f() {
        C12637g.m47075g(this.f47564g);
        return this.f47564g.m39d().getDevice();
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: g */
    public int mo49415g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C12637g.m47076h(this.f47564g, "Need to call openCaptureSession before using this API.");
        return this.f47564g.m38c(captureRequest, getExecutor(), captureCallback);
    }

    @Override // p589z.InterfaceC13537h5.a
    public Executor getExecutor() {
        return this.f47561d;
    }

    @Override // p589z.InterfaceC13537h5.a
    /* JADX INFO: renamed from: h */
    public InterfaceFutureC9440x<Void> mo49421h(CameraDevice cameraDevice, final C1189o c1189o, final List<AbstractC8830u1> list) {
        synchronized (this.f47558a) {
            try {
                if (this.f47570m) {
                    return C10773n.m40991n(new CancellationException("Opener is disabled"));
                }
                this.f47559b.m49558k(this);
                final C0010d0 c0010d0M22b = C0010d0.m22b(cameraDevice, this.f47560c);
                InterfaceFutureC9440x<Void> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: z.m5
                    @Override // p563y1.C12997c.c
                    /* JADX INFO: renamed from: a */
                    public final Object mo22051a(C12997c.a aVar) {
                        return C13585n5.m49540y(this.f47531a, list, c0010d0M22b, c1189o, aVar);
                    }
                });
                this.f47565h = interfaceFutureC9440xM48311a;
                C10773n.m40987j(interfaceFutureC9440xM48311a, new a(), C10417c.m40081b());
                return C10773n.m40996s(this.f47565h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: i */
    public List<CaptureRequest> mo49416i(CaptureRequest captureRequest) {
        CameraCaptureSession cameraCaptureSessionM39d = ((C0015g) C12637g.m47075g(this.f47564g)).m39d();
        return cameraCaptureSessionM39d instanceof CameraConstrainedHighSpeedCaptureSession ? c.m49547a((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSessionM39d, captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // p589z.InterfaceC13537h5.a
    /* JADX INFO: renamed from: j */
    public InterfaceFutureC9440x<List<Surface>> mo49422j(final List<AbstractC8830u1> list, long j10) {
        synchronized (this.f47558a) {
            try {
                if (this.f47570m) {
                    return C10773n.m40991n(new CancellationException("Opener is disabled"));
                }
                C10763d c10763dM40977g = C10763d.m40973c(C8845x1.m35503e(list, false, j10, getExecutor(), this.f47562e)).m40977g(new InterfaceC10760a() { // from class: z.j5
                    @Override // p397r0.InterfaceC10760a
                    public final InterfaceFutureC9440x apply(Object obj) {
                        return C13585n5.m49537A(this.f47460a, list, (List) obj);
                    }
                }, getExecutor());
                this.f47567j = c10763dM40977g;
                return C10773n.m40996s(c10763dM40977g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p589z.InterfaceC13537h5.a
    /* JADX INFO: renamed from: k */
    public C1189o mo49423k(int i10, List<C1183i> list, InterfaceC13537h5.c cVar) {
        this.f47563f = cVar;
        return new C1189o(i10, list, getExecutor(), new b());
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: l */
    public int mo49417l(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C12637g.m47076h(this.f47564g, "Need to call openCaptureSession before using this API.");
        return this.f47564g.m37b(list, getExecutor(), captureCallback);
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: m */
    public int mo49418m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C12637g.m47076h(this.f47564g, "Need to call openCaptureSession before using this API.");
        return this.f47564g.m36a(list, getExecutor(), captureCallback);
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: n */
    public C0015g mo49419n() {
        C12637g.m47075g(this.f47564g);
        return this.f47564g;
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: p */
    public void mo49425p(InterfaceC13537h5 interfaceC13537h5) {
        Objects.requireNonNull(this.f47563f);
        this.f47563f.mo49425p(interfaceC13537h5);
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: q */
    public void mo49426q(InterfaceC13537h5 interfaceC13537h5) {
        Objects.requireNonNull(this.f47563f);
        this.f47563f.mo49426q(interfaceC13537h5);
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: r */
    public void mo49427r(final InterfaceC13537h5 interfaceC13537h5) {
        InterfaceFutureC9440x<Void> interfaceFutureC9440x;
        synchronized (this.f47558a) {
            try {
                if (this.f47569l) {
                    interfaceFutureC9440x = null;
                } else {
                    this.f47569l = true;
                    C12637g.m47076h(this.f47565h, "Need to call openCaptureSession before using this API.");
                    interfaceFutureC9440x = this.f47565h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mo49411c();
        if (interfaceFutureC9440x != null) {
            interfaceFutureC9440x.mo37173a(new Runnable() { // from class: z.i5
                @Override // java.lang.Runnable
                public final void run() {
                    C13585n5.m49539x(this.f47449a, interfaceC13537h5);
                }
            }, C10417c.m40081b());
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: s */
    public void mo49428s(InterfaceC13537h5 interfaceC13537h5) {
        Objects.requireNonNull(this.f47563f);
        mo49411c();
        this.f47559b.m49556i(this);
        this.f47563f.mo49428s(interfaceC13537h5);
    }

    @Override // p589z.InterfaceC13537h5.a
    public boolean stop() {
        boolean z10;
        InterfaceFutureC9440x<List<Surface>> interfaceFutureC9440x = null;
        try {
            synchronized (this.f47558a) {
                try {
                    if (!this.f47570m) {
                        InterfaceFutureC9440x<List<Surface>> interfaceFutureC9440x2 = this.f47567j;
                        interfaceFutureC9440x = interfaceFutureC9440x2 != null ? interfaceFutureC9440x2 : null;
                        this.f47570m = true;
                    }
                    z10 = !m49544E();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceFutureC9440x != null) {
                interfaceFutureC9440x.cancel(true);
            }
            return z10;
        } catch (Throwable th3) {
            if (interfaceFutureC9440x != null) {
                interfaceFutureC9440x.cancel(true);
            }
            throw th3;
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: t */
    public void mo49429t(InterfaceC13537h5 interfaceC13537h5) {
        Objects.requireNonNull(this.f47563f);
        this.f47559b.m49557j(this);
        this.f47563f.mo49429t(interfaceC13537h5);
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: u */
    public void mo49430u(InterfaceC13537h5 interfaceC13537h5) {
        Objects.requireNonNull(this.f47563f);
        this.f47563f.mo49430u(interfaceC13537h5);
    }

    /* JADX DEBUG: Method merged with bridge method: B(Lz/n5;)V */
    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m49538B(final InterfaceC13537h5 interfaceC13537h5) {
        InterfaceFutureC9440x<Void> interfaceFutureC9440x;
        synchronized (this.f47558a) {
            try {
                if (this.f47571n) {
                    interfaceFutureC9440x = null;
                } else {
                    this.f47571n = true;
                    C12637g.m47076h(this.f47565h, "Need to call openCaptureSession before using this API.");
                    interfaceFutureC9440x = this.f47565h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceFutureC9440x != null) {
            interfaceFutureC9440x.mo37173a(new Runnable() { // from class: z.k5
                @Override // java.lang.Runnable
                public final void run() {
                    C13585n5.m49541z(this.f47499a, interfaceC13537h5);
                }
            }, C10417c.m40081b());
        }
    }

    @Override // p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: w */
    public void mo49432w(InterfaceC13537h5 interfaceC13537h5, Surface surface) {
        Objects.requireNonNull(this.f47563f);
        this.f47563f.mo49432w(interfaceC13537h5, surface);
    }
}
