package p589z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import ne.InterfaceFutureC9440x;
import p020b0.C1189o;
import p063d0.C4377h;
import p063d0.C4378i;
import p063d0.C4388s;
import p063d0.C4390u;
import p140g0.C5931r1;
import p296n0.AbstractC8830u1;
import p296n0.C8782k3;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;

/* JADX INFO: renamed from: z.r5 */
/* JADX INFO: loaded from: classes.dex */
public class C13615r5 extends C13585n5 {

    /* JADX INFO: renamed from: o */
    public final ScheduledExecutorService f47651o;

    /* JADX INFO: renamed from: p */
    public final Object f47652p;

    /* JADX INFO: renamed from: q */
    public List<AbstractC8830u1> f47653q;

    /* JADX INFO: renamed from: r */
    public InterfaceFutureC9440x<List<Void>> f47654r;

    /* JADX INFO: renamed from: s */
    public final C4378i f47655s;

    /* JADX INFO: renamed from: t */
    public final C4377h f47656t;

    /* JADX INFO: renamed from: u */
    public final C4388s f47657u;

    /* JADX INFO: renamed from: v */
    public final C4390u f47658v;

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f47659w;

    public C13615r5(C8782k3 c8782k3, C8782k3 c8782k4, C13591o3 c13591o3, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c13591o3, executor, scheduledExecutorService, handler);
        this.f47652p = new Object();
        this.f47659w = new AtomicBoolean(false);
        this.f47655s = new C4378i(c8782k3, c8782k4);
        this.f47657u = new C4388s(c8782k3.m35233a(CaptureSessionStuckQuirk.class) || c8782k3.m35233a(IncorrectCaptureStateQuirk.class));
        this.f47656t = new C4377h(c8782k4);
        this.f47658v = new C4390u(c8782k4);
        this.f47651o = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ InterfaceFutureC9440x m49601H(C13615r5 c13615r5, CameraDevice cameraDevice, C1189o c1189o, List list, List list2) {
        if (c13615r5.f47658v.m22062a()) {
            c13615r5.m49603J();
        }
        c13615r5.m49604K("start openCaptureSession");
        return super.mo49421h(cameraDevice, c1189o, list);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m49602I(C13615r5 c13615r5) {
        c13615r5.m49604K("Session call super.close()");
        super.close();
    }

    /* JADX INFO: renamed from: J */
    public final void m49603J() {
        Iterator<InterfaceC13537h5> it = this.f47559b.m49551d().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m49604K(String str) {
        C5931r1.m26561a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: c */
    public void mo49411c() {
        super.mo49411c();
        this.f47657u.m22058g();
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5
    public void close() {
        if (!this.f47659w.compareAndSet(false, true)) {
            m49604K("close() has been called. Skip this invocation.");
            return;
        }
        if (this.f47658v.m22062a()) {
            try {
                m49604K("Call abortCaptures() before closing session.");
                mo49413e();
            } catch (Exception e10) {
                m49604K("Exception when calling abortCaptures()" + e10);
            }
        }
        m49604K("Session call close()");
        this.f47657u.m22056e().mo37173a(new Runnable() { // from class: z.p5
            @Override // java.lang.Runnable
            public final void run() {
                C13615r5.m49602I(this.f47598a);
            }
        }, getExecutor());
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: d */
    public void mo49412d(int i10) {
        super.mo49412d(i10);
        if (i10 == 5) {
            synchronized (this.f47652p) {
                try {
                    if (m49544E() && this.f47653q != null) {
                        m49604K("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator<AbstractC8830u1> it = this.f47653q.iterator();
                        while (it.hasNext()) {
                            it.next().mo35430d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: g */
    public int mo49415g(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo49415g(captureRequest, this.f47657u.m22055d(captureCallback));
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5.a
    /* JADX INFO: renamed from: h */
    public InterfaceFutureC9440x<Void> mo49421h(final CameraDevice cameraDevice, final C1189o c1189o, final List<AbstractC8830u1> list) {
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM40996s;
        synchronized (this.f47652p) {
            try {
                List<InterfaceC13537h5> listM49551d = this.f47559b.m49551d();
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC13537h5> it = listM49551d.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo49420o());
                }
                InterfaceFutureC9440x<List<Void>> interfaceFutureC9440xM41000w = C10773n.m41000w(arrayList);
                this.f47654r = interfaceFutureC9440xM41000w;
                interfaceFutureC9440xM40996s = C10773n.m40996s(C10763d.m40973c(interfaceFutureC9440xM41000w).m40977g(new InterfaceC10760a() { // from class: z.q5
                    @Override // p397r0.InterfaceC10760a
                    public final InterfaceFutureC9440x apply(Object obj) {
                        return C13615r5.m49601H(this.f47632a, cameraDevice, c1189o, list, (List) obj);
                    }
                }, getExecutor()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceFutureC9440xM40996s;
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5.a
    /* JADX INFO: renamed from: j */
    public InterfaceFutureC9440x<List<Surface>> mo49422j(List<AbstractC8830u1> list, long j10) {
        InterfaceFutureC9440x<List<Surface>> interfaceFutureC9440xMo49422j;
        synchronized (this.f47652p) {
            this.f47653q = list;
            interfaceFutureC9440xMo49422j = super.mo49422j(list, j10);
        }
        return interfaceFutureC9440xMo49422j;
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: m */
    public int mo49418m(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo49418m(list, this.f47657u.m22055d(captureCallback));
    }

    @Override // p589z.InterfaceC13537h5
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC9440x<Void> mo49420o() {
        return C10773n.m40995r(1500L, this.f47651o, this.f47657u.m22056e());
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: r */
    public void mo49427r(InterfaceC13537h5 interfaceC13537h5) {
        synchronized (this.f47652p) {
            this.f47655s.m22038a(this.f47653q);
        }
        m49604K("onClosed()");
        super.mo49427r(interfaceC13537h5);
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5.a
    public boolean stop() {
        boolean zStop;
        synchronized (this.f47652p) {
            try {
                if (m49544E()) {
                    this.f47655s.m22038a(this.f47653q);
                } else {
                    InterfaceFutureC9440x<List<Void>> interfaceFutureC9440x = this.f47654r;
                    if (interfaceFutureC9440x != null) {
                        interfaceFutureC9440x.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zStop;
    }

    @Override // p589z.C13585n5, p589z.InterfaceC13537h5.c
    /* JADX INFO: renamed from: t */
    public void mo49429t(InterfaceC13537h5 interfaceC13537h5) {
        m49604K("Session onConfigured()");
        this.f47656t.m22035c(interfaceC13537h5, this.f47559b.m49552e(), this.f47559b.m49551d(), new C4377h.a() { // from class: z.o5
            @Override // p063d0.C4377h.a
            /* JADX INFO: renamed from: a */
            public final void mo22037a(InterfaceC13537h5 interfaceC13537h6) {
                super/*z.n5*/.mo49429t(interfaceC13537h6);
            }
        });
    }
}
