package p589z;

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
import ne.InterfaceFutureC9440x;
import p001a0.C0003a;
import p001a0.C0008c0;
import p001a0.C0013f;
import p001a0.C0034p0;
import p020b0.C1179e;
import p021b1.C1196g;
import p036c0.C1500e;
import p063d0.C4372c;
import p114f0.C5231j;
import p114f0.InterfaceC5230i;
import p140g0.AbstractC5949w;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p140g0.C5886g0;
import p140g0.C5931r1;
import p140g0.C5953x;
import p155h0.InterfaceC6259a;
import p204j0.InterfaceC7011a;
import p296n0.AbstractC8754g;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.C8756g1;
import p296n0.C8765h4;
import p296n0.C8779k0;
import p296n0.C8781k2;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p296n0.C8831u2;
import p296n0.InterfaceC8722a3;
import p296n0.InterfaceC8761h0;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8812q3;
import p301n5.C8884a;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13631u0 implements InterfaceC8804p0 {

    /* JADX INFO: renamed from: A */
    public boolean f47696A;

    /* JADX INFO: renamed from: B */
    public boolean f47697B;

    /* JADX INFO: renamed from: C */
    public C13628t4 f47698C;

    /* JADX INFO: renamed from: D */
    public final C13591o3 f47699D;

    /* JADX INFO: renamed from: E */
    public final InterfaceC13537h5.b f47700E;

    /* JADX INFO: renamed from: F */
    public final Set<String> f47701F;

    /* JADX INFO: renamed from: G */
    public InterfaceC8761h0 f47702G;

    /* JADX INFO: renamed from: H */
    public final Object f47703H;

    /* JADX INFO: renamed from: I */
    public InterfaceC8812q3 f47704I;

    /* JADX INFO: renamed from: J */
    public boolean f47705J;

    /* JADX INFO: renamed from: K */
    public final C13606q3 f47706K;

    /* JADX INFO: renamed from: L */
    public final C0008c0 f47707L;

    /* JADX INFO: renamed from: M */
    public final C1179e f47708M;

    /* JADX INFO: renamed from: N */
    public final C13529g5 f47709N;

    /* JADX INFO: renamed from: O */
    public final h f47710O;

    /* JADX INFO: renamed from: a */
    public final C8765h4 f47711a;

    /* JADX INFO: renamed from: b */
    public final C0034p0 f47712b;

    /* JADX INFO: renamed from: c */
    public final Executor f47713c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f47714d;

    /* JADX INFO: renamed from: e */
    public volatile i f47715e = i.INITIALIZED;

    /* JADX INFO: renamed from: f */
    public final C8831u2<InterfaceC8804p0.a> f47716f;

    /* JADX INFO: renamed from: g */
    public final C13668z2 f47717g;

    /* JADX INFO: renamed from: h */
    public final C13658y f47718h;

    /* JADX INFO: renamed from: i */
    public final j f47719i;

    /* JADX INFO: renamed from: j */
    public final C13666z0 f47720j;

    /* JADX INFO: renamed from: k */
    public CameraDevice f47721k;

    /* JADX INFO: renamed from: l */
    public int f47722l;

    /* JADX INFO: renamed from: m */
    public InterfaceC13567l3 f47723m;

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f47724n;

    /* JADX INFO: renamed from: o */
    public InterfaceFutureC9440x<Void> f47725o;

    /* JADX INFO: renamed from: p */
    public C12997c.a<Void> f47726p;

    /* JADX INFO: renamed from: q */
    public final Map<InterfaceC13567l3, InterfaceFutureC9440x<Void>> f47727q;

    /* JADX INFO: renamed from: r */
    public int f47728r;

    /* JADX INFO: renamed from: s */
    public final e f47729s;

    /* JADX INFO: renamed from: t */
    public final f f47730t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC6259a f47731u;

    /* JADX INFO: renamed from: v */
    public final C8756g1 f47732v;

    /* JADX INFO: renamed from: w */
    public final C5886g0 f47733w;

    /* JADX INFO: renamed from: x */
    public final boolean f47734x;

    /* JADX INFO: renamed from: y */
    public final boolean f47735y;

    /* JADX INFO: renamed from: z */
    public boolean f47736z;

    /* JADX INFO: renamed from: z.u0$a */
    public class a implements InterfaceC13523g {
        public a() {
        }

        @Override // p589z.InterfaceC13523g
        /* JADX INFO: renamed from: a */
        public CamcorderProfile mo49232a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // p589z.InterfaceC13523g
        /* JADX INFO: renamed from: b */
        public boolean mo49233b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    /* JADX INFO: renamed from: z.u0$b */
    public class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12997c.a f47738a;

        public b(C12997c.a aVar) {
            this.f47738a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C13631u0.this.m49677a0("openCameraConfigAndClose camera closed");
            this.f47738a.m48314c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C13631u0.this.m49677a0("openCameraConfigAndClose camera disconnected");
            this.f47738a.m48314c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            C13631u0.this.m49677a0("openCameraConfigAndClose camera error " + i10);
            this.f47738a.m48314c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            C13631u0.this.m49677a0("openCameraConfigAndClose camera opened");
            InterfaceFutureC9440x interfaceFutureC9440xM49674X = C13631u0.this.m49674X(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            interfaceFutureC9440xM49674X.mo37173a(new Runnable() { // from class: z.v0
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, C13631u0.this.f47713c);
        }
    }

    /* JADX INFO: renamed from: z.u0$c */
    public class c implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13567l3 f47740a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(InterfaceC13567l3 interfaceC13567l3) {
            this.f47740a = interfaceC13567l3;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            C13631u0.this.f47727q.remove(this.f47740a);
            int iOrdinal = C13631u0.this.f47715e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 5) {
                if (iOrdinal != 6 && (iOrdinal != 7 || C13631u0.this.f47722l == 0)) {
                    return;
                } else {
                    C13631u0.this.m49677a0("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (C13631u0.this.m49687o0()) {
                C13631u0 c13631u0 = C13631u0.this;
                if (c13631u0.f47721k != null) {
                    c13631u0.m49677a0("closing camera");
                    C0003a.m3a(C13631u0.this.f47721k);
                    C13631u0.this.f47721k = null;
                }
            }
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
        }
    }

    /* JADX INFO: renamed from: z.u0$d */
    public class d implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC13567l3 f47742a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(InterfaceC13567l3 interfaceC13567l3) {
            this.f47742a = interfaceC13567l3;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            if (C13631u0.this.f47731u.mo23116e() == 2 && C13631u0.this.f47715e == i.OPENED) {
                C13631u0.this.m49656D0(i.CONFIGURED);
            }
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (th2 instanceof AbstractC8830u1.a) {
                C8802o3 c8802o3M49679c0 = C13631u0.this.m49679c0(((AbstractC8830u1.a) th2).m35442a());
                if (c8802o3M49679c0 != null) {
                    C13631u0.this.m49696x0(c8802o3M49679c0);
                    return;
                }
                return;
            }
            if (th2 instanceof CancellationException) {
                C13631u0.this.m49677a0("Unable to configure camera cancelled");
                return;
            }
            i iVar = C13631u0.this.f47715e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                C13631u0.this.m49657E0(iVar2, AbstractC5949w.a.m26675b(4, th2));
            }
            C5931r1.m26564d("Camera2CameraImpl", "Unable to configure camera " + C13631u0.this, th2);
            C13631u0 c13631u0 = C13631u0.this;
            if (c13631u0.f47723m == this.f47742a) {
                c13631u0.m49654B0(false);
            }
        }
    }

    /* JADX INFO: renamed from: z.u0$e */
    public final class e extends CameraManager.AvailabilityCallback implements C8756g1.c {

        /* JADX INFO: renamed from: a */
        public final String f47744a;

        /* JADX INFO: renamed from: b */
        public boolean f47745b = true;

        public e(String str) {
            this.f47744a = str;
        }

        @Override // p296n0.C8756g1.c
        /* JADX INFO: renamed from: a */
        public void mo35122a() {
            if (C13631u0.this.f47715e == i.PENDING_OPEN || C13631u0.this.f47715e == i.OPENING_WITH_ERROR) {
                C13631u0.this.m49665M0(false);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m49701b() {
            return this.f47745b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f47744a.equals(str)) {
                this.f47745b = true;
                if (C13631u0.this.f47715e == i.PENDING_OPEN || C13631u0.this.f47715e == i.OPENING_WITH_ERROR) {
                    C13631u0.this.m49665M0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f47744a.equals(str)) {
                this.f47745b = false;
            }
        }
    }

    /* JADX INFO: renamed from: z.u0$f */
    public final class f implements C8756g1.b {
        public f() {
        }

        @Override // p296n0.C8756g1.b
        /* JADX INFO: renamed from: a */
        public void mo35121a() {
            if (C13631u0.this.f47715e == i.OPENED) {
                C13631u0.this.m49694v0();
            }
        }
    }

    /* JADX INFO: renamed from: z.u0$g */
    public final class g implements InterfaceC8784l0.d {
        public g() {
        }

        @Override // p296n0.InterfaceC8784l0.d
        /* JADX INFO: renamed from: a */
        public void mo35236a() {
            C13631u0.this.m49666N0();
        }

        @Override // p296n0.InterfaceC8784l0.d
        /* JADX INFO: renamed from: b */
        public void mo35237b(List<C8785l1> list) {
            C13631u0.this.m49659G0((List) C12637g.m47075g(list));
        }
    }

    /* JADX INFO: renamed from: z.u0$i */
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

    /* JADX INFO: renamed from: z.u0$j */
    public final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final Executor f47766a;

        /* JADX INFO: renamed from: b */
        public final ScheduledExecutorService f47767b;

        /* JADX INFO: renamed from: c */
        public b f47768c;

        /* JADX INFO: renamed from: d */
        public ScheduledFuture<?> f47769d;

        /* JADX INFO: renamed from: e */
        public final a f47770e;

        /* JADX INFO: renamed from: z.u0$j$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public final long f47772a;

            /* JADX INFO: renamed from: b */
            public long f47773b = -1;

            public a(long j10) {
                this.f47772a = j10;
            }

            /* JADX INFO: renamed from: a */
            public boolean m49719a() {
                if (m49720b() < m49722d()) {
                    return true;
                }
                m49723e();
                return false;
            }

            /* JADX INFO: renamed from: b */
            public long m49720b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f47773b == -1) {
                    this.f47773b = jUptimeMillis;
                }
                return jUptimeMillis - this.f47773b;
            }

            /* JADX INFO: renamed from: c */
            public int m49721c() {
                if (!j.this.m49718f()) {
                    return 700;
                }
                long jM49720b = m49720b();
                if (jM49720b <= 120000) {
                    return 1000;
                }
                return jM49720b <= 300000 ? 2000 : 4000;
            }

            /* JADX INFO: renamed from: d */
            public int m49722d() {
                if (!j.this.m49718f()) {
                    long j10 = this.f47772a;
                    return j10 > 0 ? Math.min((int) j10, BacktraceMetrics.defaultTimeBetweenRetriesMs) : BacktraceMetrics.defaultTimeBetweenRetriesMs;
                }
                long j11 = this.f47772a;
                if (j11 > 0) {
                    return Math.min((int) j11, 1800000);
                }
                return 1800000;
            }

            /* JADX INFO: renamed from: e */
            public void m49723e() {
                this.f47773b = -1L;
            }
        }

        /* JADX INFO: renamed from: z.u0$j$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public Executor f47775a;

            /* JADX INFO: renamed from: b */
            public boolean f47776b = false;

            public b(Executor executor) {
                this.f47775a = executor;
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ void m49724a(b bVar) {
                if (bVar.f47776b) {
                    return;
                }
                C12637g.m47077i(C13631u0.this.f47715e == i.REOPENING || C13631u0.this.f47715e == i.REOPENING_QUIRK);
                if (j.this.m49718f()) {
                    C13631u0.this.m49664L0(true);
                } else {
                    C13631u0.this.m49665M0(true);
                }
            }

            /* JADX INFO: renamed from: b */
            public void m49725b() {
                this.f47776b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f47775a.execute(new Runnable() { // from class: z.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13631u0.j.b.m49724a(this.f47867a);
                    }
                });
            }
        }

        public j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j10) {
            this.f47766a = executor;
            this.f47767b = scheduledExecutorService;
            this.f47770e = new a(j10);
        }

        /* JADX INFO: renamed from: a */
        public boolean m49713a() {
            if (this.f47769d == null) {
                return false;
            }
            C13631u0.this.m49677a0("Cancelling scheduled re-open: " + this.f47768c);
            this.f47768c.m49725b();
            this.f47768c = null;
            this.f47769d.cancel(false);
            this.f47769d = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public final void m49714b(CameraDevice cameraDevice, int i10) {
            C12637g.m47078j(C13631u0.this.f47715e == i.OPENING || C13631u0.this.f47715e == i.OPENED || C13631u0.this.f47715e == i.CONFIGURED || C13631u0.this.f47715e == i.REOPENING || C13631u0.this.f47715e == i.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + C13631u0.this.f47715e);
            if (i10 == 1 || i10 == 2 || i10 == 4) {
                C5931r1.m26561a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), C13631u0.m49643g0(i10)));
                m49715c(i10);
                return;
            }
            C5931r1.m26563c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C13631u0.m49643g0(i10) + " closing camera.");
            C13631u0.this.m49657E0(i.CLOSING, AbstractC5949w.a.m26674a(i10 == 3 ? 5 : 6));
            C13631u0.this.m49672V(false);
        }

        /* JADX INFO: renamed from: c */
        public final void m49715c(int i10) {
            int i11 = 1;
            C12637g.m47078j(C13631u0.this.f47722l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 != 2) {
                i11 = 3;
            }
            C13631u0.this.m49657E0(i.REOPENING, AbstractC5949w.a.m26674a(i11));
            C13631u0.this.m49672V(false);
        }

        /* JADX INFO: renamed from: d */
        public void m49716d() {
            this.f47770e.m49723e();
        }

        /* JADX INFO: renamed from: e */
        public void m49717e() {
            C12637g.m47077i(this.f47768c == null);
            C12637g.m47077i(this.f47769d == null);
            if (!this.f47770e.m49719a()) {
                C5931r1.m26563c("Camera2CameraImpl", "Camera reopening attempted for " + this.f47770e.m49722d() + "ms without success.");
                C13631u0.this.m49658F0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f47768c = new b(this.f47766a);
            C13631u0.this.m49677a0("Attempting camera re-open in " + this.f47770e.m49721c() + "ms: " + this.f47768c + " activeResuming = " + C13631u0.this.f47705J);
            this.f47769d = this.f47767b.schedule(this.f47768c, (long) this.f47770e.m49721c(), TimeUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: f */
        public boolean m49718f() {
            C13631u0 c13631u0 = C13631u0.this;
            if (!c13631u0.f47705J) {
                return false;
            }
            int i10 = c13631u0.f47722l;
            return i10 == 1 || i10 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C13631u0.this.m49677a0("CameraDevice.onClosed()");
            C12637g.m47078j(C13631u0.this.f47721k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = C13631u0.this.f47715e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                C12637g.m47077i(C13631u0.this.m49687o0());
                C13631u0.this.m49675Y();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + C13631u0.this.f47715e);
            }
            C13631u0 c13631u0 = C13631u0.this;
            if (c13631u0.f47722l == 0) {
                c13631u0.m49665M0(false);
                return;
            }
            c13631u0.m49677a0("Camera closed due to error: " + C13631u0.m49643g0(C13631u0.this.f47722l));
            m49717e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C13631u0.this.m49677a0("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            C13631u0 c13631u0 = C13631u0.this;
            c13631u0.f47721k = cameraDevice;
            c13631u0.f47722l = i10;
            c13631u0.f47710O.m49703b();
            int iOrdinal = C13631u0.this.f47715e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        C5931r1.m26561a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), C13631u0.m49643g0(i10), C13631u0.this.f47715e.name()));
                        m49714b(cameraDevice, i10);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + C13631u0.this.f47715e);
                }
            }
            C5931r1.m26563c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), C13631u0.m49643g0(i10), C13631u0.this.f47715e.name()));
            C13631u0.this.m49672V(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C13631u0.this.m49677a0("CameraDevice.onOpened()");
            C13631u0 c13631u0 = C13631u0.this;
            c13631u0.f47721k = cameraDevice;
            c13631u0.f47722l = 0;
            m49716d();
            int iOrdinal = C13631u0.this.f47715e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                C12637g.m47077i(C13631u0.this.m49687o0());
                C13631u0.this.f47721k.close();
                C13631u0.this.f47721k = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + C13631u0.this.f47715e);
                }
                C13631u0.this.m49656D0(i.OPENED);
                C8756g1 c8756g1 = C13631u0.this.f47732v;
                String id2 = cameraDevice.getId();
                C13631u0 c13631u1 = C13631u0.this;
                if (c8756g1.m35114j(id2, c13631u1.f47731u.mo23115d(c13631u1.f47721k.getId()))) {
                    C13631u0.this.m49694v0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z.u0$k */
    public static abstract class k {
        /* JADX INFO: renamed from: a */
        public static k m49726a(String str, Class<?> cls, C8802o3 c8802o3, InterfaceC8771i4<?> interfaceC8771i4, Size size, AbstractC8827t3 abstractC8827t3, List<InterfaceC8777j4.b> list) {
            return new C13499d(str, cls, c8802o3, interfaceC8771i4, size, abstractC8827t3, list);
        }

        /* JADX INFO: renamed from: b */
        public static k m49727b(AbstractC5952w2 abstractC5952w2, boolean z10) {
            return m49726a(C13631u0.m49645j0(abstractC5952w2), abstractC5952w2.getClass(), z10 ? abstractC5952w2.m26720z() : abstractC5952w2.m26718x(), abstractC5952w2.m26707l(), abstractC5952w2.m26703h(), abstractC5952w2.m26702g(), C13631u0.m49642f0(abstractC5952w2));
        }

        /* JADX INFO: renamed from: c */
        public abstract List<InterfaceC8777j4.b> mo49205c();

        /* JADX INFO: renamed from: d */
        public abstract C8802o3 mo49206d();

        /* JADX INFO: renamed from: e */
        public abstract AbstractC8827t3 mo49207e();

        /* JADX INFO: renamed from: f */
        public abstract Size mo49208f();

        /* JADX INFO: renamed from: g */
        public abstract InterfaceC8771i4<?> mo49209g();

        /* JADX INFO: renamed from: h */
        public abstract String mo49210h();

        /* JADX INFO: renamed from: i */
        public abstract Class<?> mo49211i();
    }

    @SuppressLint({"NullAnnotationGroup"})
    public C13631u0(Context context, C0034p0 c0034p0, String str, C13666z0 c13666z0, InterfaceC6259a interfaceC6259a, C8756g1 c8756g1, Executor executor, Handler handler, C13606q3 c13606q3, long j10, C5886g0 c5886g0) throws C5953x {
        C8831u2<InterfaceC8804p0.a> c8831u2 = new C8831u2<>();
        this.f47716f = c8831u2;
        this.f47722l = 0;
        this.f47724n = new AtomicInteger(0);
        this.f47727q = new LinkedHashMap();
        this.f47728r = 0;
        this.f47736z = false;
        this.f47696A = false;
        this.f47697B = true;
        this.f47701F = new HashSet();
        this.f47702G = C8779k0.m35231a();
        this.f47703H = new Object();
        this.f47705J = false;
        this.f47710O = new h(this, null);
        this.f47712b = c0034p0;
        this.f47731u = interfaceC6259a;
        this.f47732v = c8756g1;
        ScheduledExecutorService scheduledExecutorServiceM40085f = C10417c.m40085f(handler);
        this.f47714d = scheduledExecutorServiceM40085f;
        Executor executorM40086g = C10417c.m40086g(executor);
        this.f47713c = executorM40086g;
        this.f47719i = new j(executorM40086g, scheduledExecutorServiceM40085f, j10);
        this.f47711a = new C8765h4(str);
        c8831u2.m35452n(InterfaceC8804p0.a.CLOSED);
        C13668z2 c13668z2 = new C13668z2(c8756g1);
        this.f47717g = c13668z2;
        C13591o3 c13591o3 = new C13591o3(executorM40086g);
        this.f47699D = c13591o3;
        this.f47706K = c13606q3;
        this.f47733w = c5886g0;
        try {
            C0008c0 c0008c0M64c = c0034p0.m64c(str);
            this.f47707L = c0008c0M64c;
            C13658y c13658y = new C13658y(c0008c0M64c, scheduledExecutorServiceM40085f, executorM40086g, new g(), c13666z0.mo35049l());
            this.f47718h = c13658y;
            this.f47720j = c13666z0;
            c13666z0.m49820G(c13658y);
            c13666z0.m49823J(c13668z2.m49824a());
            this.f47708M = C1179e.m6542a(c0008c0M64c);
            this.f47723m = m49689q0();
            this.f47700E = new InterfaceC13537h5.b(executorM40086g, scheduledExecutorServiceM40085f, handler, c13591o3, c13666z0.mo35049l(), C1500e.m7654c());
            this.f47734x = C4372c.m22027a(c13666z0.mo35049l());
            this.f47735y = c13666z0.mo35049l().m35233a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f47729s = eVar;
            f fVar = new f();
            this.f47730t = fVar;
            c8756g1.m35112g(this, executorM40086g, fVar, eVar);
            c0034p0.m68g(executorM40086g, eVar);
            this.f47709N = new C13529g5(context, str, c0034p0, new a(), InterfaceC7011a.f27455b);
        } catch (C0013f e10) {
            throw C13479a3.m49169a(e10);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ InterfaceFutureC9440x m49624A(C13559k3 c13559k3, AbstractC8830u1 abstractC8830u1, Void r8) {
        c13559k3.close();
        abstractC8830u1.mo35430d();
        return c13559k3.mo49483f(false);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m49625B(C13631u0 c13631u0, boolean z10) {
        c13631u0.f47705J = z10;
        if (z10) {
            if (c13631u0.f47715e == i.PENDING_OPEN || c13631u0.f47715e == i.OPENING_WITH_ERROR) {
                c13631u0.m49664L0(false);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m49628E(C13631u0 c13631u0, String str, C8802o3 c8802o3, InterfaceC8771i4 interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List list) {
        c13631u0.getClass();
        c13631u0.m49677a0("Use case " + str + " ACTIVE");
        c13631u0.f47711a.m35168q(str, c8802o3, interfaceC8771i4, abstractC8827t3, list);
        c13631u0.f47711a.m35172u(str, c8802o3, interfaceC8771i4, abstractC8827t3, list);
        c13631u0.m49666N0();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m49629F(C13631u0 c13631u0, String str, C8802o3 c8802o3, InterfaceC8771i4 interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List list) {
        c13631u0.getClass();
        c13631u0.m49677a0("Use case " + str + " RESET");
        c13631u0.f47711a.m35172u(str, c8802o3, interfaceC8771i4, abstractC8827t3, list);
        c13631u0.m49670T();
        c13631u0.m49654B0(false);
        c13631u0.m49666N0();
        if (c13631u0.f47715e == i.OPENED) {
            c13631u0.m49694v0();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ Object m49630G(final C13631u0 c13631u0, final C12997c.a aVar) {
        c13631u0.f47713c.execute(new Runnable() { // from class: z.m0
            @Override // java.lang.Runnable
            public final void run() {
                C10773n.m40997t(this.f47515a.m49697y0(), aVar);
            }
        });
        return "Release[request=" + c13631u0.f47724n.getAndIncrement() + "]";
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m49632I(C13631u0 c13631u0) {
        c13631u0.m49677a0("Camera is removed. Updating state and cleaning up.");
        i iVar = c13631u0.f47715e;
        i iVar2 = i.RELEASING;
        if (iVar == iVar2 || c13631u0.f47715e == i.RELEASED) {
            return;
        }
        AbstractC5949w.a aVarM26674a = AbstractC5949w.a.m26674a(8);
        c13631u0.f47717g.m49826c(InterfaceC8804p0.a.CLOSED, aVarM26674a);
        c13631u0.m49657E0(iVar2, aVarM26674a);
        c13631u0.f47719i.m49713a();
        c13631u0.f47710O.m49702a();
        if (c13631u0.f47721k != null) {
            c13631u0.m49672V(false);
        } else {
            c13631u0.m49680d0();
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m49634K(C13631u0 c13631u0, List list) {
        c13631u0.getClass();
        try {
            c13631u0.m49662J0(list);
        } finally {
            c13631u0.f47718h.m49764D();
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Object m49635L(C13631u0 c13631u0, C12997c.a aVar) {
        C12637g.m47078j(c13631u0.f47726p == null, "Camera can only be released once, so release completer should be null on creation.");
        c13631u0.f47726p = aVar;
        return "Release[camera=" + c13631u0 + "]";
    }

    /* JADX INFO: renamed from: f0 */
    public static List<InterfaceC8777j4.b> m49642f0(AbstractC5952w2 abstractC5952w2) {
        if (abstractC5952w2.m26704i() == null) {
            return null;
        }
        return C1196g.m6650q0(abstractC5952w2);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m49643g0(int i10) {
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

    /* JADX INFO: renamed from: h0 */
    public static String m49644h0(C13628t4 c13628t4) {
        return c13628t4.m49616f() + c13628t4.hashCode();
    }

    /* JADX INFO: renamed from: j0 */
    public static String m49645j0(AbstractC5952w2 abstractC5952w2) {
        return abstractC5952w2.m26712r() + abstractC5952w2.hashCode();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Object m49646t(C13631u0 c13631u0, C12997c.a aVar) {
        c13631u0.getClass();
        try {
            ArrayList arrayList = new ArrayList(c13631u0.f47711a.m35158g().m35359c().m35298c());
            arrayList.add(c13631u0.f47699D.m49550c());
            arrayList.add(c13631u0.new b(aVar));
            c13631u0.f47712b.m67f(c13631u0.f47720j.mo6750e(), c13631u0.f47713c, C13647w2.m49733a(arrayList));
            return "configAndCloseTask";
        } catch (C0013f | RuntimeException e10) {
            c13631u0.m49678b0("Unable to open camera for configAndClose: " + e10.getMessage(), e10);
            aVar.m48317f(e10);
            return "configAndCloseTask";
        }
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Object m49647u(final C13631u0 c13631u0, final C12997c.a aVar) {
        c13631u0.getClass();
        try {
            c13631u0.f47713c.execute(new Runnable() { // from class: z.r0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.m48314c(Boolean.valueOf(this.f47640a.m49684l0()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.m48317f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m49648v(C13631u0 c13631u0) {
        if (c13631u0.m49683k0()) {
            c13631u0.m49655C0(m49644h0(c13631u0.f47698C), c13631u0.f47698C.m49618h(), c13631u0.f47698C.m49619i(), null, Collections.singletonList(InterfaceC8777j4.b.METERING_REPEATING));
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m49649w(C13631u0 c13631u0) {
        c13631u0.f47696A = false;
        c13631u0.f47736z = false;
        c13631u0.m49677a0("OpenCameraConfigAndClose is done, state: " + c13631u0.f47715e);
        int iOrdinal = c13631u0.f47715e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            C12637g.m47077i(c13631u0.m49687o0());
            c13631u0.m49680d0();
            return;
        }
        if (iOrdinal != 7) {
            c13631u0.m49677a0("OpenCameraConfigAndClose finished while in state: " + c13631u0.f47715e);
            return;
        }
        if (c13631u0.f47722l == 0) {
            c13631u0.m49665M0(false);
            return;
        }
        c13631u0.m49677a0("OpenCameraConfigAndClose in error: " + m49643g0(c13631u0.f47722l));
        c13631u0.f47719i.m49717e();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m49650x(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m49651y(C13631u0 c13631u0, String str) {
        c13631u0.getClass();
        c13631u0.m49677a0("Use case " + str + " INACTIVE");
        c13631u0.f47711a.m35171t(str);
        c13631u0.m49666N0();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m49652z(C13631u0 c13631u0, String str, C8802o3 c8802o3, InterfaceC8771i4 interfaceC8771i4, AbstractC8827t3 abstractC8827t3, List list) {
        c13631u0.getClass();
        c13631u0.m49677a0("Use case " + str + " UPDATED");
        c13631u0.f47711a.m35172u(str, c8802o3, interfaceC8771i4, abstractC8827t3, list);
        c13631u0.m49666N0();
    }

    /* JADX INFO: renamed from: A0 */
    public final void m49653A0() {
        if (this.f47698C != null) {
            this.f47711a.m35170s(this.f47698C.m49616f() + this.f47698C.hashCode());
            this.f47711a.m35171t(this.f47698C.m49616f() + this.f47698C.hashCode());
            this.f47698C.m49613c();
            this.f47698C = null;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m49654B0(boolean z10) {
        C12637g.m47077i(this.f47723m != null);
        m49677a0("Resetting Capture Session");
        InterfaceC13567l3 interfaceC13567l3 = this.f47723m;
        C8802o3 c8802o3Mo49485h = interfaceC13567l3.mo49485h();
        List<C8785l1> listMo49484g = interfaceC13567l3.mo49484g();
        InterfaceC13567l3 interfaceC13567l3M49689q0 = m49689q0();
        this.f47723m = interfaceC13567l3M49689q0;
        interfaceC13567l3M49689q0.mo49481d(c8802o3Mo49485h);
        this.f47723m.mo49479b(listMo49484g);
        if (this.f47715e.ordinal() != 9) {
            m49677a0("Skipping Capture Session state check due to current camera state: " + this.f47715e + " and previous session status: " + interfaceC13567l3.mo49480c());
        } else if (this.f47734x && interfaceC13567l3.mo49480c()) {
            m49677a0("Close camera before creating new session");
            m49656D0(i.REOPENING_QUIRK);
        }
        if (this.f47735y && interfaceC13567l3.mo49480c()) {
            m49677a0("ConfigAndClose is required when close the camera.");
            this.f47736z = true;
        }
        m49698z0(interfaceC13567l3, z10);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m49655C0(final String str, final C8802o3 c8802o3, final InterfaceC8771i4<?> interfaceC8771i4, final AbstractC8827t3 abstractC8827t3, final List<InterfaceC8777j4.b> list) {
        this.f47713c.execute(new Runnable() { // from class: z.i0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49629F(this.f47440a, str, c8802o3, interfaceC8771i4, abstractC8827t3, list);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m49656D0(i iVar) {
        m49657E0(iVar, null);
    }

    /* JADX INFO: renamed from: E0 */
    public void m49657E0(i iVar, AbstractC5949w.a aVar) {
        m49658F0(iVar, aVar, true);
    }

    /* JADX INFO: renamed from: F0 */
    public void m49658F0(i iVar, AbstractC5949w.a aVar, boolean z10) {
        InterfaceC8804p0.a aVar2;
        m49677a0("Transitioning camera internal state: " + this.f47715e + " --> " + iVar);
        m49661I0(iVar, aVar);
        this.f47715e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = InterfaceC8804p0.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = InterfaceC8804p0.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = InterfaceC8804p0.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = InterfaceC8804p0.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                aVar2 = InterfaceC8804p0.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = InterfaceC8804p0.a.OPENING;
                break;
            case OPENED:
                aVar2 = InterfaceC8804p0.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = InterfaceC8804p0.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f47732v.m35110e(this, aVar2, z10);
        this.f47716f.m35452n(aVar2);
        this.f47717g.m49826c(aVar2, aVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m49659G0(List<C8785l1> list) {
        ArrayList arrayList = new ArrayList();
        for (C8785l1 c8785l1 : list) {
            C8785l1.a aVarM35253k = C8785l1.a.m35253k(c8785l1);
            if (c8785l1.m35248k() == 5 && c8785l1.m35241d() != null) {
                aVarM35253k.m35267p(c8785l1.m35241d());
            }
            if (!c8785l1.m35246i().isEmpty() || !c8785l1.m35251n() || m49671U(aVarM35253k)) {
                arrayList.add(aVarM35253k.m35261h());
            }
        }
        m49677a0("Issue capture request");
        this.f47723m.mo49479b(arrayList);
    }

    /* JADX INFO: renamed from: H0 */
    public final Collection<k> m49660H0(Collection<AbstractC5952w2> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC5952w2> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.m49727b(it.next(), this.f47697B));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I0 */
    public void m49661I0(i iVar, AbstractC5949w.a aVar) {
        if (C8884a.m35751h()) {
            C8884a.m35753j("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f47728r++;
            }
            if (this.f47728r > 0) {
                C8884a.m35753j("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.mo26330d() : 0);
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m49662J0(Collection<k> collection) {
        Size sizeMo49208f;
        boolean zIsEmpty = this.f47711a.m35159h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (k kVar : collection) {
            if (!this.f47711a.m35166o(kVar.mo49210h())) {
                this.f47711a.m35169r(kVar.mo49210h(), kVar.mo49206d(), kVar.mo49209g(), kVar.mo49207e(), kVar.mo49205c());
                arrayList.add(kVar.mo49210h());
                if (kVar.mo49211i() == C5864a2.class && (sizeMo49208f = kVar.mo49208f()) != null) {
                    rational = new Rational(sizeMo49208f.getWidth(), sizeMo49208f.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m49677a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f47718h.m49794k0(true);
            this.f47718h.m49784Y();
        }
        m49670T();
        m49668P0();
        m49667O0();
        m49666N0();
        m49654B0(false);
        if (this.f47715e == i.OPENED) {
            m49694v0();
        } else {
            m49695w0();
        }
        if (rational != null) {
            this.f47718h.m49797n0(rational);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m49663K0(Collection<k> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (k kVar : collection) {
            if (this.f47711a.m35166o(kVar.mo49210h())) {
                this.f47711a.m35167p(kVar.mo49210h());
                arrayList.add(kVar.mo49210h());
                if (kVar.mo49211i() == C5864a2.class) {
                    z10 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m49677a0("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z10) {
            this.f47718h.m49797n0(null);
        }
        m49670T();
        if (this.f47711a.m35160i().isEmpty()) {
            this.f47718h.m49799p0(false);
            this.f47718h.m49796m0(false);
        } else {
            m49668P0();
            m49667O0();
        }
        if (this.f47711a.m35159h().isEmpty()) {
            this.f47718h.m49764D();
            m49654B0(false);
            this.f47718h.m49794k0(false);
            this.f47723m = m49689q0();
            m49673W();
            return;
        }
        m49666N0();
        m49654B0(false);
        if (this.f47715e == i.OPENED) {
            m49694v0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m49664L0(boolean z10) {
        m49677a0("Attempting to force open the camera.");
        if (this.f47732v.m35113i(this)) {
            m49693u0(z10);
        } else {
            m49677a0("No cameras available. Waiting for available camera before opening camera.");
            m49656D0(i.PENDING_OPEN);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m49665M0(boolean z10) {
        m49677a0("Attempting to open the camera.");
        if (this.f47729s.m49701b() && this.f47732v.m35113i(this)) {
            m49693u0(z10);
        } else {
            m49677a0("No cameras available. Waiting for available camera before opening camera.");
            m49656D0(i.PENDING_OPEN);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m49666N0() {
        C8802o3.h hVarM35156e = this.f47711a.m35156e();
        if (!hVarM35156e.m35363g()) {
            this.f47718h.m49793j0();
            this.f47723m.mo49481d(this.f47718h.m49775O());
            return;
        }
        this.f47718h.m49798o0(hVarM35156e.m35359c().m35311q());
        hVarM35156e.m35358b(this.f47718h.m49775O());
        this.f47723m.mo49481d(hVarM35156e.m35359c());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m49667O0() {
        if (this.f47720j.m49819F()) {
            C8802o3.h hVarM35156e = this.f47711a.m35156e();
            if (hVarM35156e.m35363g()) {
                if (((Integer) hVarM35156e.m35359c().m35300e().getUpper()).intValue() > 30) {
                    this.f47718h.m49796m0(true);
                } else {
                    this.f47718h.m49796m0(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m49668P0() {
        Iterator<InterfaceC8771i4<?>> it = this.f47711a.m35160i().iterator();
        boolean zM35205T = false;
        while (it.hasNext()) {
            zM35205T |= it.next().m35205T(false);
        }
        this.f47718h.m49799p0(zM35205T);
    }

    /* JADX INFO: renamed from: S */
    public final void m49669S() {
        C13628t4 c13628t4 = this.f47698C;
        if (c13628t4 != null) {
            String strM49644h0 = m49644h0(c13628t4);
            C8765h4 c8765h4 = this.f47711a;
            C8802o3 c8802o3M49618h = this.f47698C.m49618h();
            InterfaceC8771i4<?> interfaceC8771i4M49619i = this.f47698C.m49619i();
            InterfaceC8777j4.b bVar = InterfaceC8777j4.b.METERING_REPEATING;
            c8765h4.m35169r(strM49644h0, c8802o3M49618h, interfaceC8771i4M49619i, null, Collections.singletonList(bVar));
            this.f47711a.m35168q(strM49644h0, this.f47698C.m49618h(), this.f47698C.m49619i(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX INFO: renamed from: T */
    public final void m49670T() {
        C8802o3 c8802o3M35359c = this.f47711a.m35158g().m35359c();
        int size = c8802o3M35359c.m35306l().m35246i().size();
        int size2 = c8802o3M35359c.m35310p().size();
        boolean z10 = false;
        if (m49684l0()) {
            boolean z11 = size != 1 || size2 == 1;
            if (z11 || m49686n0(this.f47698C)) {
                m49653A0();
                if (z11) {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
        } else if (size != 0 || size2 <= 0) {
            z10 = true;
        } else {
            if (this.f47698C == null) {
                this.f47698C = new C13628t4(this.f47720j.m49816C(), this.f47706K, new C13628t4.c() { // from class: z.l0
                    @Override // p589z.C13628t4.c
                    /* JADX INFO: renamed from: a */
                    public final void mo49498a() {
                        C13631u0.m49648v(this.f47503a);
                    }
                });
            }
            if (!m49686n0(this.f47698C)) {
                m49669S();
                z10 = true;
            }
        }
        this.f47718h.m49795l0(z10);
        if (z10) {
            return;
        }
        C5931r1.m26563c("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    /* JADX INFO: renamed from: U */
    public final boolean m49671U(C8785l1.a aVar) {
        if (!aVar.m35264m().isEmpty()) {
            C5931r1.m26572l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<C8802o3> it = this.f47711a.m35157f().iterator();
        while (it.hasNext()) {
            C8785l1 c8785l1M35306l = it.next().m35306l();
            List<AbstractC8830u1> listM35246i = c8785l1M35306l.m35246i();
            if (!listM35246i.isEmpty()) {
                if (c8785l1M35306l.m35245h() != 0) {
                    aVar.m35272u(c8785l1M35306l.m35245h());
                }
                if (c8785l1M35306l.m35249l() != 0) {
                    aVar.m35275x(c8785l1M35306l.m35249l());
                }
                Iterator<AbstractC8830u1> it2 = listM35246i.iterator();
                while (it2.hasNext()) {
                    aVar.m35259f(it2.next());
                }
            }
        }
        if (!aVar.m35264m().isEmpty()) {
            return true;
        }
        C5931r1.m26572l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    /* JADX INFO: renamed from: V */
    public void m49672V(boolean z10) {
        C12637g.m47078j(this.f47715e == i.CLOSING || this.f47715e == i.RELEASING || (this.f47715e == i.REOPENING && this.f47722l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f47715e + " (error: " + m49643g0(this.f47722l) + ")");
        m49654B0(z10);
        this.f47723m.mo49482e();
    }

    /* JADX INFO: renamed from: W */
    public final void m49673W() {
        m49677a0("Closing camera.");
        boolean z10 = true;
        switch (this.f47715e.ordinal()) {
            case 3:
            case 4:
                C12637g.m47077i(this.f47721k == null);
                m49656D0(i.INITIALIZED);
                break;
            case 5:
            default:
                m49677a0("close() ignored due to being in state: " + this.f47715e);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.f47719i.m49713a() && !this.f47710O.m49704c()) {
                    z10 = false;
                }
                this.f47710O.m49702a();
                m49656D0(i.CLOSING);
                if (z10) {
                    C12637g.m47077i(m49687o0());
                    m49675Y();
                }
                break;
            case 9:
            case 10:
                m49656D0(i.CLOSING);
                m49672V(false);
                break;
        }
    }

    /* JADX INFO: renamed from: X */
    public final InterfaceFutureC9440x<Void> m49674X(CameraDevice cameraDevice) {
        final C13559k3 c13559k3 = new C13559k3(this.f47708M);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final C8781k2 c8781k2 = new C8781k2(surface);
        c8781k2.m35437k().mo37173a(new Runnable() { // from class: z.p0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49650x(surface, surfaceTexture);
            }
        }, C10417c.m40081b());
        C8802o3.b bVar = new C8802o3.b();
        bVar.m35323h(c8781k2);
        bVar.m35314B(1);
        m49677a0("Start configAndClose.");
        return C10763d.m40973c(C10773n.m41003z(c13559k3.mo49478a(bVar.m35331p(), cameraDevice, this.f47700E.m49424a()))).m40977g(new InterfaceC10760a() { // from class: z.q0
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                return C13631u0.m49624A(c13559k3, c8781k2, (Void) obj);
            }
        }, this.f47713c);
    }

    /* JADX INFO: renamed from: Y */
    public final void m49675Y() {
        C12637g.m47077i(this.f47715e == i.RELEASING || this.f47715e == i.CLOSING);
        C12637g.m47077i(this.f47727q.isEmpty());
        if (!this.f47736z) {
            m49680d0();
            return;
        }
        if (this.f47696A) {
            m49677a0("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f47729s.m49701b()) {
            this.f47736z = false;
            m49680d0();
            m49677a0("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            m49677a0("Open camera to configAndClose");
            InterfaceFutureC9440x<Void> interfaceFutureC9440xM49692t0 = m49692t0();
            this.f47696A = true;
            interfaceFutureC9440xM49692t0.mo37173a(new Runnable() { // from class: z.s0
                @Override // java.lang.Runnable
                public final void run() {
                    C13631u0.m49649w(this.f47661a);
                }
            }, this.f47713c);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final CameraDevice.StateCallback m49676Z() {
        ArrayList arrayList = new ArrayList(this.f47711a.m35158g().m35359c().m35298c());
        arrayList.add(this.f47699D.m49550c());
        arrayList.add(this.f47719i);
        return C13647w2.m49733a(arrayList);
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> mo6692a() {
        return C12997c.m48311a(new C12997c.c() { // from class: z.f0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13631u0.m49630G(this.f47288a, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m49677a0(String str) {
        m49678b0(str, null);
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: b */
    public InterfaceC8722a3<InterfaceC8804p0.a> mo6693b() {
        return this.f47716f;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m49678b0(String str, Throwable th2) {
        C5931r1.m26562b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th2);
    }

    /* JADX INFO: renamed from: c0 */
    public C8802o3 m49679c0(AbstractC8830u1 abstractC8830u1) {
        for (C8802o3 c8802o3 : this.f47711a.m35159h()) {
            if (c8802o3.m35310p().contains(abstractC8830u1)) {
                return c8802o3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public void m49680d0() {
        C12637g.m47077i(this.f47715e == i.RELEASING || this.f47715e == i.CLOSING);
        C12637g.m47077i(this.f47727q.isEmpty());
        this.f47721k = null;
        if (this.f47715e == i.CLOSING) {
            m49656D0(i.INITIALIZED);
            return;
        }
        this.f47712b.m69h(this.f47729s);
        m49656D0(i.RELEASED);
        C12997c.a<Void> aVar = this.f47726p;
        if (aVar != null) {
            aVar.m48314c(null);
            this.f47726p = null;
        }
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: e */
    public InterfaceC8784l0 mo6694e() {
        return this.f47718h;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m49681e0() {
        synchronized (this.f47703H) {
            try {
                return this.f47731u.mo23116e() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: f */
    public InterfaceC8761h0 mo35082f() {
        return this.f47702G;
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: g */
    public void mo6695g(AbstractC5952w2 abstractC5952w2) {
        C12637g.m47075g(abstractC5952w2);
        final String strM49645j0 = m49645j0(abstractC5952w2);
        final C8802o3 c8802o3M26720z = this.f47697B ? abstractC5952w2.m26720z() : abstractC5952w2.m26718x();
        final InterfaceC8771i4<?> interfaceC8771i4M26707l = abstractC5952w2.m26707l();
        final AbstractC8827t3 abstractC8827t3M26702g = abstractC5952w2.m26702g();
        final List<InterfaceC8777j4.b> listM49642f0 = m49642f0(abstractC5952w2);
        this.f47713c.execute(new Runnable() { // from class: z.c0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49652z(this.f47225a, strM49645j0, c8802o3M26720z, interfaceC8771i4M26707l, abstractC8827t3M26702g, listM49642f0);
            }
        });
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: h */
    public void mo35083h(final boolean z10) {
        this.f47713c.execute(new Runnable() { // from class: z.j0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49625B(this.f47453a, z10);
            }
        });
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: i */
    public void mo6696i(Collection<AbstractC5952w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f47718h.m49784Y();
        m49690r0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(m49660H0(arrayList));
        try {
            this.f47713c.execute(new Runnable() { // from class: z.t0
                @Override // java.lang.Runnable
                public final void run() {
                    C13631u0.m49634K(this.f47675a, arrayList2);
                }
            });
        } catch (RejectedExecutionException e10) {
            m49678b0("Unable to attach use cases.", e10);
            this.f47718h.m49764D();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final InterfaceFutureC9440x<Void> m49682i0() {
        if (this.f47725o == null) {
            if (this.f47715e != i.RELEASED) {
                this.f47725o = C12997c.m48311a(new C12997c.c() { // from class: z.n0
                    @Override // p563y1.C12997c.c
                    /* JADX INFO: renamed from: a */
                    public final Object mo22051a(C12997c.a aVar) {
                        return C13631u0.m49635L(this.f47552a, aVar);
                    }
                });
            } else {
                this.f47725o = C10773n.m40993p(null);
            }
        }
        return this.f47725o;
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: j */
    public void mo6697j(Collection<AbstractC5952w2> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(m49660H0(arrayList));
        m49691s0(new ArrayList(arrayList));
        this.f47713c.execute(new Runnable() { // from class: z.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f47397a.m49663K0(arrayList2);
            }
        });
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: k */
    public InterfaceC8799o0 mo6698k() {
        return this.f47720j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public boolean m49683k0() {
        try {
            return ((Boolean) C12997c.m48311a(new C12997c.c() { // from class: z.o0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13631u0.m49647u(this.f47577a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m49684l0() {
        C13628t4 c13628t4 = this.f47698C;
        if (c13628t4 == null) {
            return false;
        }
        return this.f47711a.m35166o(m49644h0(c13628t4));
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: m */
    public void mo6699m(AbstractC5952w2 abstractC5952w2) {
        C12637g.m47075g(abstractC5952w2);
        final String strM49645j0 = m49645j0(abstractC5952w2);
        this.f47713c.execute(new Runnable() { // from class: z.d0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49651y(this.f47251a, strM49645j0);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m49685m0() {
        C5886g0 c5886g0 = this.f47733w;
        return (c5886g0 == null || c5886g0.m26454r0()) ? false : true;
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: n */
    public void mo6700n(AbstractC5952w2 abstractC5952w2) {
        C12637g.m47075g(abstractC5952w2);
        m49655C0(m49645j0(abstractC5952w2), this.f47697B ? abstractC5952w2.m26720z() : abstractC5952w2.m26718x(), abstractC5952w2.m26707l(), abstractC5952w2.m26702g(), m49642f0(abstractC5952w2));
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m49686n0(C13628t4 c13628t4) {
        C12637g.m47075g(c13628t4);
        return !m49688p0(c13628t4) || m49685m0();
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: o */
    public void mo35085o(InterfaceC8761h0 interfaceC8761h0) {
        if (interfaceC8761h0 == null) {
            interfaceC8761h0 = C8779k0.m35231a();
        }
        InterfaceC8812q3 interfaceC8812q3M35139w = interfaceC8761h0.m35139w(null);
        this.f47702G = interfaceC8761h0;
        synchronized (this.f47703H) {
            this.f47704I = interfaceC8812q3M35139w;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m49687o0() {
        return this.f47727q.isEmpty();
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: p */
    public void mo35367p() {
        this.f47713c.execute(new Runnable() { // from class: z.k0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49632I(this.f47464a);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m49688p0(C13628t4 c13628t4) {
        ArrayList arrayList = new ArrayList();
        int iM49681e0 = m49681e0();
        for (C8765h4.b bVar : this.f47711a.m35161j()) {
            if (bVar.m35175c() == null || bVar.m35175c().get(0) != InterfaceC8777j4.b.METERING_REPEATING) {
                if (bVar.m35177e() == null || bVar.m35175c() == null) {
                    C5931r1.m26572l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                C8802o3 c8802o3M35176d = bVar.m35176d();
                InterfaceC8771i4<?> interfaceC8771i4M35178f = bVar.m35178f();
                for (AbstractC8830u1 abstractC8830u1 : c8802o3M35176d.m35310p()) {
                    arrayList.add(AbstractC8754g.m35094a(this.f47709N.m49317a0(iM49681e0, interfaceC8771i4M35178f.mo26767p(), abstractC8830u1.m35434h(), interfaceC8771i4M35178f.m35206W()), interfaceC8771i4M35178f.mo26767p(), abstractC8830u1.m35434h(), bVar.m35177e().mo35391b(), bVar.m35175c(), bVar.m35177e().mo35393d(), bVar.m35177e().mo35396g(), bVar.m35177e().mo35392c(), interfaceC8771i4M35178f.m35202H()));
                }
            }
        }
        C12637g.m47075g(c13628t4);
        HashMap map = new HashMap();
        map.put(c13628t4.m49619i(), Collections.singletonList(c13628t4.m49615e()));
        try {
            this.f47709N.m49304K(iM49681e0, arrayList, map, false, false, false, false);
            m49677a0("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e10) {
            m49678b0("Surface combination with metering repeating  not supported!", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final InterfaceC13567l3 m49689q0() {
        synchronized (this.f47703H) {
            try {
                C5886g0 c5886g0 = this.f47733w;
                InterfaceC5230i interfaceC5230iM24212a = c5886g0 == null ? null : C5231j.m24212a(c5886g0);
                if (this.f47704I == null) {
                    return new C13559k3(this.f47708M, this.f47720j.mo35049l(), interfaceC5230iM24212a);
                }
                return new C13670z4(this.f47704I, this.f47720j, this.f47708M, this.f47713c, this.f47714d, interfaceC5230iM24212a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: r */
    public void mo35086r(boolean z10) {
        this.f47697B = z10;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m49690r0(List<AbstractC5952w2> list) {
        for (AbstractC5952w2 abstractC5952w2 : list) {
            String strM49645j0 = m49645j0(abstractC5952w2);
            if (!this.f47701F.contains(strM49645j0)) {
                this.f47701F.add(strM49645j0);
                abstractC5952w2.mo6665R();
                abstractC5952w2.mo6663P();
            }
        }
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: s */
    public void mo6702s(AbstractC5952w2 abstractC5952w2) {
        C12637g.m47075g(abstractC5952w2);
        final String strM49645j0 = m49645j0(abstractC5952w2);
        final C8802o3 c8802o3M26720z = this.f47697B ? abstractC5952w2.m26720z() : abstractC5952w2.m26718x();
        final InterfaceC8771i4<?> interfaceC8771i4M26707l = abstractC5952w2.m26707l();
        final AbstractC8827t3 abstractC8827t3M26702g = abstractC5952w2.m26702g();
        final List<InterfaceC8777j4.b> listM49642f0 = m49642f0(abstractC5952w2);
        this.f47713c.execute(new Runnable() { // from class: z.e0
            @Override // java.lang.Runnable
            public final void run() {
                C13631u0.m49628E(this.f47265a, strM49645j0, c8802o3M26720z, interfaceC8771i4M26707l, abstractC8827t3M26702g, listM49642f0);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m49691s0(List<AbstractC5952w2> list) {
        for (AbstractC5952w2 abstractC5952w2 : list) {
            String strM49645j0 = m49645j0(abstractC5952w2);
            if (this.f47701F.contains(strM49645j0)) {
                abstractC5952w2.mo6666S();
                this.f47701F.remove(strM49645j0);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: t0 */
    public final InterfaceFutureC9440x<Void> m49692t0() {
        return C12997c.m48311a(new C12997c.c() { // from class: z.b0
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13631u0.m49646t(this.f47210a, aVar);
            }
        });
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f47720j.mo6750e());
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: u0 */
    public final void m49693u0(boolean z10) {
        if (!z10) {
            this.f47719i.m49716d();
        }
        this.f47719i.m49713a();
        this.f47710O.m49702a();
        m49677a0("Opening camera.");
        m49656D0(i.OPENING);
        try {
            this.f47712b.m67f(this.f47720j.mo6750e(), this.f47713c, m49676Z());
        } catch (C0013f e10) {
            m49677a0("Unable to open camera due to " + e10.getMessage());
            if (e10.m34d() != 10001) {
                this.f47710O.m49705d();
            } else {
                m49657E0(i.INITIALIZED, AbstractC5949w.a.m26675b(7, e10));
            }
        } catch (SecurityException e11) {
            m49677a0("Unable to open camera due to " + e11.getMessage());
            m49656D0(i.REOPENING);
            this.f47719i.m49717e();
        } catch (RuntimeException e12) {
            m49678b0("Unexpected error occurred when opening camera.", e12);
            m49657E0(i.OPENING_WITH_ERROR, AbstractC5949w.a.m26674a(6));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m49694v0() {
        C12637g.m47077i(this.f47715e == i.OPENED);
        C8802o3.h hVarM35158g = this.f47711a.m35158g();
        if (!hVarM35158g.m35363g()) {
            m49677a0("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f47732v.m35114j(this.f47721k.getId(), this.f47731u.mo23115d(this.f47721k.getId()))) {
            m49677a0("Unable to create capture session in camera operating mode = " + this.f47731u.mo23116e());
            return;
        }
        HashMap map = new HashMap();
        C13497c5.m49197m(this.f47711a.m35159h(), this.f47711a.m35160i(), map);
        this.f47723m.mo49486i(map);
        InterfaceC13567l3 interfaceC13567l3 = this.f47723m;
        C10773n.m40987j(interfaceC13567l3.mo49478a(hVarM35158g.m35359c(), (CameraDevice) C12637g.m47075g(this.f47721k), this.f47700E.m49424a()), new d(interfaceC13567l3), this.f47713c);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m49695w0() {
        int iOrdinal = this.f47715e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            m49664L0(false);
            return;
        }
        if (iOrdinal != 5) {
            m49677a0("open() ignored due to being in state: " + this.f47715e);
            return;
        }
        m49656D0(i.REOPENING);
        if (m49687o0() || this.f47696A || this.f47722l != 0) {
            return;
        }
        C12637g.m47078j(this.f47721k != null, "Camera Device should be open if session close is not complete");
        m49656D0(i.OPENED);
        m49694v0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m49696x0(final C8802o3 c8802o3) {
        ScheduledExecutorService scheduledExecutorServiceM40084e = C10417c.m40084e();
        final C8802o3.d dVarM35299d = c8802o3.m35299d();
        if (dVarM35299d != null) {
            m49678b0("Posting surface closed", new Throwable());
            scheduledExecutorServiceM40084e.execute(new Runnable() { // from class: z.g0
                @Override // java.lang.Runnable
                public final void run() {
                    dVarM35299d.mo6644a(c8802o3, C8802o3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final InterfaceFutureC9440x<Void> m49697y0() {
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM49682i0 = m49682i0();
        boolean z10 = true;
        switch (this.f47715e.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.f47719i.m49713a() && !this.f47710O.m49704c()) {
                    z10 = false;
                }
                this.f47710O.m49702a();
                m49656D0(i.RELEASING);
                if (z10) {
                    C12637g.m47077i(m49687o0());
                    m49675Y();
                }
                break;
            case 2:
            case 3:
            case 4:
                C12637g.m47077i(this.f47721k == null);
                m49656D0(i.RELEASING);
                C12637g.m47077i(m49687o0());
                m49675Y();
                break;
            case 9:
            case 10:
                m49656D0(i.RELEASING);
                m49672V(false);
                break;
            default:
                m49677a0("release() ignored due to being in state: " + this.f47715e);
                break;
        }
        return interfaceFutureC9440xM49682i0;
    }

    /* JADX INFO: renamed from: z0 */
    public InterfaceFutureC9440x<Void> m49698z0(InterfaceC13567l3 interfaceC13567l3, boolean z10) {
        interfaceC13567l3.close();
        InterfaceFutureC9440x<Void> interfaceFutureC9440xMo49483f = interfaceC13567l3.mo49483f(z10);
        m49677a0("Releasing session in state " + this.f47715e.name());
        this.f47727q.put(interfaceC13567l3, interfaceFutureC9440xMo49483f);
        C10773n.m40987j(interfaceFutureC9440xMo49483f, new c(interfaceC13567l3), C10417c.m40081b());
        return interfaceFutureC9440xMo49483f;
    }

    /* JADX INFO: renamed from: z.u0$h */
    public class h {

        /* JADX INFO: renamed from: a */
        public a f47749a;

        /* JADX INFO: renamed from: z.u0$h$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public final ScheduledFuture<?> f47751a;

            /* JADX INFO: renamed from: b */
            public final AtomicBoolean f47752b = new AtomicBoolean(false);

            public a() {
                this.f47751a = C13631u0.this.f47714d.schedule(new Runnable() { // from class: z.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47814a.m49709d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            /* JADX INFO: renamed from: c */
            public void m49708c() {
                this.f47752b.set(true);
                this.f47751a.cancel(true);
            }

            /* JADX INFO: renamed from: d */
            public final void m49709d() {
                if (this.f47752b.getAndSet(true)) {
                    return;
                }
                C13631u0.this.f47713c.execute(new Runnable() { // from class: z.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47804a.m49710e();
                    }
                });
            }

            /* JADX INFO: renamed from: e */
            public final void m49710e() {
                if (C13631u0.this.f47715e == i.OPENING) {
                    C13631u0.this.m49677a0("Camera onError timeout, reopen it.");
                    C13631u0.this.m49656D0(i.REOPENING);
                    C13631u0.this.f47719i.m49717e();
                } else {
                    C13631u0.this.m49677a0("Camera skip reopen at state: " + C13631u0.this.f47715e);
                }
            }

            /* JADX INFO: renamed from: f */
            public boolean m49711f() {
                return this.f47752b.get();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public h() {
            this.f47749a = null;
        }

        /* JADX INFO: renamed from: a */
        public void m49702a() {
            a aVar = this.f47749a;
            if (aVar != null) {
                aVar.m49708c();
            }
            this.f47749a = null;
        }

        /* JADX INFO: renamed from: b */
        public void m49703b() {
            C13631u0.this.m49677a0("Camera receive onErrorCallback");
            m49702a();
        }

        /* JADX INFO: renamed from: c */
        public boolean m49704c() {
            a aVar = this.f47749a;
            return (aVar == null || aVar.m49711f()) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public void m49705d() {
            if (C13631u0.this.f47715e != i.OPENING) {
                C13631u0.this.m49677a0("Don't need the onError timeout handler.");
                return;
            }
            C13631u0.this.m49677a0("Camera waiting for onError.");
            m49702a();
            this.f47749a = new a();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 z.u0) A[MD:(z.u0):void (m)] (LINE:3) call: z.u0.h.<init>(z.u0):void type: THIS */
        public /* synthetic */ h(C13631u0 c13631u0, a aVar) {
            this();
        }
    }
}
