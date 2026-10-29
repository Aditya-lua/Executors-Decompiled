package p589z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p001a0.C0008c0;
import p140g0.C5931r1;
import p140g0.InterfaceC5909m;
import p140g0.InterfaceC5964z2;
import p397r0.C10773n;
import p424s0.AbstractC11147h;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.g6 */
/* JADX INFO: loaded from: classes.dex */
public final class C13530g6 {

    /* JADX INFO: renamed from: a */
    public final C13658y f47387a;

    /* JADX INFO: renamed from: b */
    public final Executor f47388b;

    /* JADX INFO: renamed from: c */
    public final C13538h6 f47389c;

    /* JADX INFO: renamed from: d */
    public final C0949d0<InterfaceC5964z2> f47390d;

    /* JADX INFO: renamed from: e */
    public final b f47391e;

    /* JADX INFO: renamed from: f */
    public boolean f47392f = false;

    /* JADX INFO: renamed from: g */
    public C13658y.c f47393g = new a();

    /* JADX INFO: renamed from: z.g6$a */
    public class a implements C13658y.c {
        public a() {
        }

        @Override // p589z.C13658y.c
        /* JADX INFO: renamed from: a */
        public boolean mo49266a(TotalCaptureResult totalCaptureResult) {
            C13530g6.this.f47391e.mo49181a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: renamed from: z.g6$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo49181a(TotalCaptureResult totalCaptureResult);

        /* JADX INFO: renamed from: b */
        float mo49182b();

        /* JADX INFO: renamed from: c */
        void mo49183c();

        /* JADX INFO: renamed from: d */
        float mo49184d();

        /* JADX INFO: renamed from: e */
        void mo49185e(float f10, C12997c.a<Void> aVar);

        /* JADX INFO: renamed from: f */
        Rect mo49186f();

        /* JADX INFO: renamed from: g */
        void mo49187g(C12964a.a aVar);
    }

    public C13530g6(C13658y c13658y, C0008c0 c0008c0, Executor executor) {
        this.f47387a = c13658y;
        this.f47388b = executor;
        b bVarM49352f = m49352f(c0008c0);
        this.f47391e = bVarM49352f;
        C13538h6 c13538h6 = new C13538h6(bVarM49352f.mo49184d(), bVarM49352f.mo49182b());
        this.f47389c = c13538h6;
        c13538h6.m49434f(1.0f);
        this.f47390d = new C0949d0<>(AbstractC11147h.m42004f(c13538h6));
        c13658y.m49762B(this.f47393g);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m49350c(final C13530g6 c13530g6, final InterfaceC5964z2 interfaceC5964z2, final C12997c.a aVar) {
        c13530g6.f47388b.execute(new Runnable() { // from class: z.d6
            @Override // java.lang.Runnable
            public final void run() {
                this.f47257a.m49362o(aVar, interfaceC5964z2);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m49351d(final C13530g6 c13530g6, final InterfaceC5964z2 interfaceC5964z2, final C12997c.a aVar) {
        c13530g6.f47388b.execute(new Runnable() { // from class: z.c6
            @Override // java.lang.Runnable
            public final void run() {
                this.f47241a.m49362o(aVar, interfaceC5964z2);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: renamed from: f */
    public static b m49352f(C0008c0 c0008c0) {
        return m49355k(c0008c0) ? new C13491c(c0008c0) : new C13599p3(c0008c0);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC5964z2 m49353h(C0008c0 c0008c0) {
        b bVarM49352f = m49352f(c0008c0);
        C13538h6 c13538h6 = new C13538h6(bVarM49352f.mo49184d(), bVarM49352f.mo49182b());
        c13538h6.m49434f(1.0f);
        return AbstractC11147h.m42004f(c13538h6);
    }

    /* JADX INFO: renamed from: i */
    public static Range<Float> m49354i(C0008c0 c0008c0) {
        try {
            return (Range) c0008c0.m9a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e10) {
            C5931r1.m26573m("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m49355k(C0008c0 c0008c0) {
        return Build.VERSION.SDK_INT >= 30 && m49354i(c0008c0) != null;
    }

    /* JADX INFO: renamed from: e */
    public void m49356e(C12964a.a aVar) {
        this.f47391e.mo49187g(aVar);
    }

    /* JADX INFO: renamed from: g */
    public Rect m49357g() {
        return this.f47391e.mo49186f();
    }

    /* JADX INFO: renamed from: j */
    public AbstractC0940a0<InterfaceC5964z2> m49358j() {
        return this.f47390d;
    }

    /* JADX INFO: renamed from: l */
    public void m49359l(boolean z10) {
        InterfaceC5964z2 interfaceC5964z2M42004f;
        if (this.f47392f == z10) {
            return;
        }
        this.f47392f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f47389c) {
            this.f47389c.m49434f(1.0f);
            interfaceC5964z2M42004f = AbstractC11147h.m42004f(this.f47389c);
        }
        m49363p(interfaceC5964z2M42004f);
        this.f47391e.mo49183c();
        this.f47387a.m49802s0();
    }

    /* JADX INFO: renamed from: m */
    public InterfaceFutureC9440x<Void> m49360m(float f10) {
        final InterfaceC5964z2 interfaceC5964z2M42004f;
        synchronized (this.f47389c) {
            try {
                this.f47389c.m49433e(f10);
                interfaceC5964z2M42004f = AbstractC11147h.m42004f(this.f47389c);
            } catch (IllegalArgumentException e10) {
                return C10773n.m40991n(e10);
            }
        }
        m49363p(interfaceC5964z2M42004f);
        return C12997c.m48311a(new C12997c.c() { // from class: z.f6
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13530g6.m49350c(this.f47297a, interfaceC5964z2M42004f, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public InterfaceFutureC9440x<Void> m49361n(float f10) {
        final InterfaceC5964z2 interfaceC5964z2M42004f;
        synchronized (this.f47389c) {
            try {
                this.f47389c.m49434f(f10);
                interfaceC5964z2M42004f = AbstractC11147h.m42004f(this.f47389c);
            } catch (IllegalArgumentException e10) {
                return C10773n.m40991n(e10);
            }
        }
        m49363p(interfaceC5964z2M42004f);
        return C12997c.m48311a(new C12997c.c() { // from class: z.e6
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13530g6.m49351d(this.f47276a, interfaceC5964z2M42004f, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m49362o(C12997c.a<Void> aVar, InterfaceC5964z2 interfaceC5964z2) {
        InterfaceC5964z2 interfaceC5964z2M42004f;
        if (this.f47392f) {
            this.f47391e.mo49185e(interfaceC5964z2.mo26763d(), aVar);
            this.f47387a.m49802s0();
            return;
        }
        synchronized (this.f47389c) {
            this.f47389c.m49434f(1.0f);
            interfaceC5964z2M42004f = AbstractC11147h.m42004f(this.f47389c);
        }
        m49363p(interfaceC5964z2M42004f);
        aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
    }

    /* JADX INFO: renamed from: p */
    public final void m49363p(InterfaceC5964z2 interfaceC5964z2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f47390d.mo4863o(interfaceC5964z2);
        } else {
            this.f47390d.mo4861m(interfaceC5964z2);
        }
    }
}
