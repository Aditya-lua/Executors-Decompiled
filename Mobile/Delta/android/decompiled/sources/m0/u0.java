package m0;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.r1;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f24286a;
    public final x0.y b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraCharacteristics f24287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f24288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f24289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0.a0<b, x0.b0<androidx.camera.core.d>> f24290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0.a0<b0.a, x0.b0<byte[]>> f24291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x0.a0<k.b, x0.b0<byte[]>> f24292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x0.a0<f0.a, g0.f1.i> f24293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x0.a0<x0.b0<byte[]>, x0.b0<Bitmap>> f24294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x0.a0<x0.b0<androidx.camera.core.d>, androidx.camera.core.d> f24295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x0.a0<x0.b0<byte[]>, x0.b0<androidx.camera.core.d>> f24296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x0.a0<x0.b0<androidx.camera.core.d>, Bitmap> f24297m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x0.a0<x0.b0<Bitmap>, x0.b0<Bitmap>> f24298n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k3 f24299o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24300p;

    public static abstract class a {
        public static a e(int i10, List<Integer> list) {
            return new g(new x0.u(), new x0.u(), i10, list);
        }

        public abstract x0.u<b> a();

        public abstract int b();

        public abstract List<Integer> c();

        public abstract x0.u<b> d();
    }

    public static abstract class b {
        public static b c(v0 v0Var, androidx.camera.core.d dVar) {
            return new h(v0Var, dVar);
        }

        public abstract androidx.camera.core.d a();

        public abstract v0 b();
    }

    public u0(Executor executor, CameraCharacteristics cameraCharacteristics, x0.y yVar) {
        this(executor, cameraCharacteristics, yVar, u0.b.c());
    }

    public static /* synthetic */ void b(final u0 u0Var, final b bVar) {
        u0Var.getClass();
        if (bVar.b().l()) {
            bVar.a().close();
        } else {
            u0Var.f24286a.execute(new Runnable() { // from class: m0.p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24276a.k(bVar);
                }
            });
        }
    }

    public static /* synthetic */ void d(final u0 u0Var, final b bVar) {
        u0Var.getClass();
        if (!bVar.b().l()) {
            u0Var.f24286a.execute(new Runnable() { // from class: m0.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24274a.m(bVar);
                }
            });
        } else {
            r1.l("ProcessingNode", "The postview image is closed due to request aborted");
            bVar.a().close();
        }
    }

    public final x0.b0<byte[]> i(x0.b0<byte[]> b0Var, int i10) {
        x2.g.i(w0.b.j(b0Var.e()));
        x0.b0<Bitmap> b0VarApply = this.f24294j.apply(b0Var);
        x0.a0<x0.b0<Bitmap>, x0.b0<Bitmap>> a0Var = this.f24298n;
        if (a0Var != null) {
            b0VarApply = a0Var.apply(b0VarApply);
        }
        return this.f24292h.apply(k.b.c(b0VarApply, i10));
    }

    public androidx.camera.core.d j(b bVar) {
        v0 v0VarB = bVar.b();
        x0.b0<androidx.camera.core.d> b0VarApply = this.f24290f.apply(bVar);
        List<Integer> listC = this.f24289e.c();
        x2.g.a(!listC.isEmpty());
        int iIntValue = listC.get(0).intValue();
        if ((b0VarApply.e() == 35 || this.f24298n != null || this.f24300p) && iIntValue == 256) {
            x0.b0<byte[]> b0VarApply2 = this.f24291g.apply(b0.a.c(b0VarApply, v0VarB.c()));
            if (this.f24298n != null) {
                b0VarApply2 = i(b0VarApply2, v0VarB.c());
            }
            b0VarApply = this.f24296l.apply(b0VarApply2);
        }
        androidx.camera.core.d dVarApply = this.f24295k.apply(b0VarApply);
        if (listC.size() > 1) {
            v0VarB.k().u(dVarApply.getFormat(), true);
        }
        return dVarApply;
    }

    public void k(b bVar) {
        final v0 v0VarB = bVar.b();
        try {
            boolean z10 = true;
            if (this.f24289e.c().size() <= 1) {
                z10 = false;
            }
            if (bVar.b().m()) {
                final androidx.camera.core.d dVarJ = j(bVar);
                q0.c.e().execute(new Runnable() { // from class: m0.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v0VarB.q(dVarJ);
                    }
                });
                return;
            }
            final g0.f1.i iVarL = l(bVar);
            if (z10 && !v0VarB.k().s()) {
                return;
            }
            q0.c.e().execute(new Runnable() { // from class: m0.r0
                @Override // java.lang.Runnable
                public final void run() {
                    v0VarB.r(iVarL);
                }
            });
        } catch (g0.h1 e10) {
            q(v0VarB, e10);
        } catch (OutOfMemoryError e11) {
            q(v0VarB, new g0.h1(0, "Processing failed due to low memory.", e11));
        } catch (RuntimeException e12) {
            q(v0VarB, new g0.h1(0, "Processing failed.", e12));
        }
    }

    public g0.f1.i l(b bVar) throws g0.h1 {
        List<Integer> listC = this.f24289e.c();
        x2.g.a(!listC.isEmpty());
        boolean z10 = false;
        Integer num = listC.get(0);
        int iIntValue = num.intValue();
        x2.g.b(w0.b.j(iIntValue) || w0.b.k(iIntValue), String.format("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: %s", num));
        v0 v0VarB = bVar.b();
        x2.g.b(v0VarB.d() != null, "OutputFileOptions cannot be empty");
        x0.b0<androidx.camera.core.d> b0VarApply = this.f24290f.apply(bVar);
        if (listC.size() <= 1) {
            if (iIntValue != 32) {
                g0.f1.h hVarD = v0VarB.d();
                Objects.requireNonNull(hVarD);
                return o(b0VarApply, hVarD, v0VarB.c());
            }
            g0.f1.h hVarD2 = v0VarB.d();
            Objects.requireNonNull(hVarD2);
            return p(b0VarApply, hVarD2);
        }
        if (v0VarB.d() != null && v0VarB.g() != null) {
            z10 = true;
        }
        x2.g.b(z10, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (b0VarApply.e() != 32) {
            g0.f1.h hVarG = v0VarB.g();
            Objects.requireNonNull(hVarG);
            g0.f1.i iVarO = o(b0VarApply, hVarG, v0VarB.c());
            v0VarB.k().u(Barcode.FORMAT_QR_CODE, true);
            return iVarO;
        }
        g0.f1.h hVarD3 = v0VarB.d();
        Objects.requireNonNull(hVarD3);
        g0.f1.i iVarP = p(b0VarApply, hVarD3);
        v0VarB.k().u(32, true);
        return iVarP;
    }

    public void m(b bVar) {
        final v0 v0VarB = bVar.b();
        try {
            x0.b0<androidx.camera.core.d> b0VarApply = this.f24290f.apply(bVar);
            int iE = b0VarApply.e();
            x2.g.b(iE == 35 || iE == 256 || iE == 4101, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(iE)));
            final Bitmap bitmapApply = this.f24297m.apply(b0VarApply);
            q0.c.e().execute(new Runnable() { // from class: m0.s0
                @Override // java.lang.Runnable
                public final void run() {
                    v0VarB.t(bitmapApply);
                }
            });
        } catch (Exception e10) {
            bVar.a().close();
            r1.d("ProcessingNode", "process postview input packet failed.", e10);
        }
    }

    public void n() {
    }

    public final g0.f1.i o(x0.b0<androidx.camera.core.d> b0Var, g0.f1.h hVar, int i10) {
        x0.b0<byte[]> b0VarApply = this.f24291g.apply(b0.a.c(b0Var, i10));
        if (b0VarApply.i() || this.f24298n != null) {
            b0VarApply = i(b0VarApply, i10);
        }
        x0.a0<f0.a, g0.f1.i> a0Var = this.f24293i;
        Objects.requireNonNull(hVar);
        return a0Var.apply(f0.a.c(b0VarApply, hVar));
    }

    public final g0.f1.i p(x0.b0<androidx.camera.core.d> b0Var, g0.f1.h hVar) throws g0.h1 {
        if (this.f24288d == null) {
            if (this.f24287c == null) {
                throw new g0.h1(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (b0Var.a().e() == null) {
                throw new g0.h1(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.f24287c;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult captureResultE = b0Var.a().e();
            Objects.requireNonNull(captureResultE);
            this.f24288d = new y(cameraCharacteristics, captureResultE);
        }
        y yVar = this.f24288d;
        androidx.camera.core.d dVarC = b0Var.c();
        int iF = b0Var.f();
        Objects.requireNonNull(hVar);
        return yVar.apply(y.a.d(dVarC, iF, hVar));
    }

    public final void q(final v0 v0Var, final g0.h1 h1Var) {
        q0.c.e().execute(new Runnable() { // from class: m0.t0
            @Override // java.lang.Runnable
            public final void run() {
                v0Var.u(h1Var);
            }
        });
    }

    public Void r(a aVar) {
        this.f24289e = aVar;
        aVar.a().a(new x2.a() { // from class: m0.m0
            @Override // x2.a
            public final void accept(Object obj) {
                u0.b(this.f24270a, (u0.b) obj);
            }
        });
        aVar.d().a(new x2.a() { // from class: m0.n0
            @Override // x2.a
            public final void accept(Object obj) {
                u0.d(this.f24272a, (u0.b) obj);
            }
        });
        this.f24290f = new l0();
        this.f24291g = new b0(this.f24299o);
        this.f24294j = new e0();
        this.f24292h = new k();
        this.f24293i = new f0();
        this.f24295k = new h0();
        this.f24297m = new a0();
        if (aVar.b() == 35 || this.b != null || this.f24300p) {
            this.f24296l = new g0();
        }
        x0.y yVar = this.b;
        if (yVar == null) {
            return null;
        }
        this.f24298n = new l(yVar);
        return null;
    }

    public u0(Executor executor, CameraCharacteristics cameraCharacteristics, x0.y yVar, k3 k3Var) {
        if (u0.b.b(LowMemoryQuirk.class) != null) {
            this.f24286a = q0.c.g(executor);
        } else {
            this.f24286a = executor;
        }
        this.b = yVar;
        this.f24287c = cameraCharacteristics;
        this.f24299o = k3Var;
        this.f24300p = k3Var.a(IncorrectJpegMetadataQuirk.class);
    }
}
